OkhttpClient = new OkhttpClient();

String run(url) throw IOException{
     Request = new request();
	 .url(url);
	 .build();
	 
	 Response response = client.newcall(request).excute;
	 client.newcall(request).enqueue(responseCallback);
}

//client.newcall(request)--realCall--getResponseWithInterceptorChain()--proceed()