package com.study.report4;

public class Main {

	public static void main(String[] args) {
		UserWarrior userWarrior = new UserWarrior("������", 500, 70, 30);
		UserWizard userWizard = new UserWizard("ȫ�±�", 400, 30, 80, 20);
		MonsterGoblin monsterGoblin = new MonsterGoblin("���", 200, 50, 10);
		MonsterOrc monsterOrc = new MonsterOrc("��ũ", 150, 50, 20);
		
		while(true) {
			userWarrior.choose(monsterGoblin);
			if(monsterGoblin.checkHealth()) break;
			monsterGoblin.attack(userWarrior);
			if(userWarrior.checkHealth()) break;
		}
	}
}