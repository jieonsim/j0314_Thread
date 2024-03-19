package t3_multiExam2;

/*
class SmiFile2 implements Runnable {
	// 자막
	@Override
	public void run() {
		String[] smiArray = { "하나", "둘", "셋", "넷", "다섯" };
		// 자막이 먼저 뜨는 걸 방지하기 위해 지연
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < smiArray.length; i++) {
			System.out.println(" - 자막 : " + smiArray[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ScreenFile2 implements Runnable {
	// 영상
	@Override
	public void run() {
		int[] screenArray = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < screenArray.length; i++) {
			System.out.print("영상 프레임 : " + screenArray[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
*/
public class T4_ThreadAnonymousInnerClass {
	public static void main(String[] args) {
		// 자막을 출력하는 스레드를 익명 이너 클래스로 구현한다.
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] smiArray = { "하나", "둘", "셋", "넷", "다섯" };
				// 자막이 먼저 뜨는 걸 방지하기 위해 지연
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				for (int i = 0; i < smiArray.length; i++) {
					System.out.println(" - 자막 : " + smiArray[i]);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		// 영상을 출력하는 스레드를 익명 이너 클래스로 구현한다.
		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				int[] screenArray = { 1, 2, 3, 4, 5 };

				for (int i = 0; i < screenArray.length; i++) {
					System.out.print("영상 프레임 : " + screenArray[i]);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		th1.start();
		th2.start();
	}
}
