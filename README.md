# oopYutGame
# 객체지향 학습을 위한 Java 프로젝트

---

> 객체지향을 위한 코드 작성법에 대해 고민하던 중 Okky에서 글을 보고 시작한 프로젝트

[OKKY | 초보 개발자에게 권장하는 객체지향 모델링 공부 방법](https://okky.kr/article/358197)

> 프로젝트 시작을 위한 자료수집 도중 jojoldu 님의 프로젝트 원칙에 따라 설계를 하기로 결정함

[jojoldu/oop-java](https://github.com/jojoldu/oop-java)

---

## 주제

윷놀이 게임을 구현해보려고 한다. 화면 구성은 전부 콘솔로 한다.

### 윷놀이 규칙

- 팀을 나눈 후, 말을 정한다 (프로젝트에서는 player1, player2로 나눌 예정)
- 윷을 먼저 던질 선을 정한다.
- 선이 먼저 4개의 윷을 던지고 그 이후 번갈아 가면서 한번씩 윷을 던진다.
- 도( 1칸 진행), 개( 2칸 진행), 걸( 3칸 진행), 윷( 4칸 진행), 모( 5칸 진행)
- 뒷도( 3개가 엎어졌지만 열린 1개가 색칠된 윷일때) 1칸 뒤로
- 윷, 모인 경우 윷을 한번 더 던질 수 있다.
- 말은 4개를 가지고 있고 4개가 전부 골인해야한다.

### 설계원칙 ([jojoldu님 깃허브 원칙을 따라감](https://github.com/jojoldu/oop-java))

- 클래스 우선이 아닌, 객체의 속성과 행위가 우선이다.
    - 클래스는 객체를 추상화하는 도구일 뿐이다.

- 데이터가 아닌 메세지(행위)를 중심으로 객체를 설계해라.
    - 객체는 혼자 있을 수 없다. 다른 객체와의 협력 안에서만 존재할 수 있다.
    - 메세지를 중심으로, 해당 메세지가 어떤 객체를 필요로 하는지를 생각하자.

- 하나하나 지시하지 말고 요청해라
    - 객체의 설계단계에서도 책임이 있는 객체에 요청만 하도록 설계

- 하나의 메소드는 하나의 일만 해야한다.

- 처음부터 완벽한 설계는 없다.
    - 설계를 코드로 구현해가는 과정에서 수정이 필요하다면 설계를 수정한다.

### 주요 객체

- 윷놀이판
- 규칙
- 게이머

### 주요 객체들의 속성과 역할

- 윷놀이판

    ![1](https://user-images.githubusercontent.com/45224987/127293649-77b2627a-446b-4e48-8173-4d50851191ed.png)

    - 6 x 6 사이즈 정사각형 판으로 구성됨
    - 말이 이동가능한 경로는 다음과 같다.

    ![1 1](https://user-images.githubusercontent.com/45224987/127293757-af8645c8-a0d1-4d69-a10c-975bafe28998.png)

- 규칙
    - 점수를 측정해준다(현재 말 몇개가 골인했는지)
    - 승패를 판단한다.
- 게이머
    - 윷을 던진다
    - 말을 이동시킨다

### 1. 추상화된 코드 구현

![1 2](https://user-images.githubusercontent.com/45224987/127293824-561d6500-0968-429f-bdf6-2aadda812981.png)
