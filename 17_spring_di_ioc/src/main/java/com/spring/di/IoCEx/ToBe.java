package com.spring.di.IoCEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// IoC컨테이너(=spring컨테이너)에 의해서 ToBeDao, ToBeService, ToBeController 객체가 생성 및 관리되여
// Dao > Service > Controller의 순서로 객체가 조립된다.
// 작은 부품부터 큰 것들을 조립하는것이
// IoC컨테이너이다.
// 이유 : 유지보수와 확장성에 메리트가 있기 때문이
@Component
class ToBeDao {	
}

@Component
class ToBeService {
	
	@Autowired   // @Autowired : 객체를 주입한다는 뜻
	ToBeDao toBeDao;
	
}

@Component
class ToBeController {
	
	@Autowired
	ToBeService toBeService;
	
}

@Component
public class ToBe {

	@Autowired
	ToBeController toBeController;
	
}
