package 게임캐릭터;

public abstract class Charac {
	
	// 전진 : run()
	public abstract void run();
	// 점프 : jump()
	public abstract void jump();
	
	// 공격 : atk()
	public abstract void atk();
	
	//추상 메서드로 만들어주는 이유
	//--->모든 캐릭터(마법사,전사..궁수)
	//---> {}의 형태가 다 다를 예정(각각 오버라이딩)
	//게임캐릭터들은 무조건 전진, 점프, 공격 무조건 가지고 있어야한다.
	//--->부모를 물려받는 자식클래스에 구현을 강제화
	//추상클래스를 상속받으면 추상클래스 안에 있는 추상메서드를 반드시 구현해야한다.
	
}
