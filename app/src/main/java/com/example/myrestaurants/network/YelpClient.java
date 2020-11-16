//private static Retrofit retrofit = null;
//public static YelpApi getClient () {
//        if (retrofit == null) {
//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//        .addInterceptor(new Interceptor() {
//@Override
//public Response intercept(Chain chain) throws IOException {
//        Request newRequest = chain.request().newBuilder()
//        .addHeader("Authorization", YELP_API_KEY)
//        .build();
//        return chain.proceed(newRequest);
//        }
//        })
//        .build();
//        retrofit = new Retrofit.Builder()
//        .baseUrl(YELP_BASE_URL)
//        .client(okHttpClient)
//        .addConverterFactory(GsonConverterFactory.create())
//        .build();
//        }
//        return retrofit.create(YelpApi.class);
//        }