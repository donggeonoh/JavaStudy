package com.study.report4;

public class Main {

	public static void main(String[] args) {
		UserWarrior userWarrior = new UserWarrior("오동건", 500, 70, 30);
		UserWizard userWizard = new UserWizard("홍승기", 400, 30, 80, 20);
		MonsterGoblin monsterGoblin = new MonsterGoblin("고블린", 200, 50, 10);
		MonsterOrc monsterOrc = new MonsterOrc("오크", 150, 50, 20);
		
		while(true) {
			userWarrior.choose(monsterGoblin);
			if(monsterGoblin.checkHealth()) break;
			monsterGoblin.attack(userWarrior);
			if(userWarrior.checkHealth()) break;
		}
	}
}