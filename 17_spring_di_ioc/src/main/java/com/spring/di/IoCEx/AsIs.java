package com.spring.di.IoCEx;




class AsIsDao{
	
}


class AsIsService{
	
	AsIsDao asIsDao = new AsIsDao();
	
}


class AsIscontroller{
	AsIsService asIsService = new AsIsService();
	
}


public class AsIs {
	//객체의 생성 순서 Controller > Service > Dao
	AsIscontroller asIsController= new AsIscontroller();
	
	
}
