package com.jstarcraft.rns.recommender.benchmark.rating;

import com.jstarcraft.ai.data.DataInstance;
import com.jstarcraft.ai.data.DataModule;
import com.jstarcraft.ai.data.DataSpace;
import com.jstarcraft.ai.modem.ModemDefinition;
import com.jstarcraft.rns.configurator.Configuration;
import com.jstarcraft.rns.recommender.AbstractRecommender;

/**
 * 
 * Constant Guess推荐器
 * 
 * <pre>
 * 参考LibRec团队
 * </pre>
 * 
 * @author Birdy
 *
 */
@ModemDefinition(value = { "constant" })
public class ConstantGuessRecommender extends AbstractRecommender {

	private float constant;

	@Override
	public void prepare(Configuration configuration, DataModule model, DataSpace space) {
		super.prepare(configuration, model, space);
		// 默认使用最高最低分的平均值
		constant = (minimumOfScore + maximumOfScore) / 2F;
		// TODO 支持配置分数
		constant = configuration.getFloat("recommend.constant-guess.score", constant);
	}

	@Override
	protected void doPractice() {
	}

	@Override
	public float predict(DataInstance instance) {
		return constant;
	}

}