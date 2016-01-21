package com.tpns;

import java.util.List;

import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.access.vote.AffirmativeBased;

public class TpnsAccessDecisionManager extends AffirmativeBased{

	public TpnsAccessDecisionManager(List<AccessDecisionVoter<? extends Object>> decisionVoters) {
		super(decisionVoters);
		
	}

}
