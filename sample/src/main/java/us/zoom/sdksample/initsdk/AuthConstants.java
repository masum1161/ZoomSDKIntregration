package us.zoom.sdksample.initsdk;

public interface AuthConstants {

	// TODO Change it to your web domain
	public final static String WEB_DOMAIN = "zoom.us";

	/**
	 * We recommend that, you can generate jwttoken on your own server instead of hardcore in the code.
	 * We hardcore it here, just to run the demo.
	 *
	 * You can generate a jwttoken on the https://jwt.io/
	 * with this payload:
	 * {
	 *     "appKey": "string", // app key
	 *     "iat": long, // access token issue timestamp
	 *     "exp": long, // access token expire time
	 *     "tokenExp": long // token expire time
	 * }
	 */


	public final static String SDK_JWTTOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOm51bGwsImlzcyI6IlM5RVZuMUQ0VHl1dE1pN2ptVTlLM1EiLCJleHAiOjE2MjgxNDA4NjAsImlhdCI6MTU5NjU5OTY3OH0.nLYYrH1riRZVqRVsPLUR1vrT5J3V-8iCFPVszcqyauA";

	// TODO Change it to your APP Key
	public final static String APP_KEY = "S9EVn1D4TyutMi7jmU9K3Q";

	// TODO Change it to your APP Secret
	public final static String APP_SECRET = "VEpjjexYJhVxjfagChU6GtCgQRjMRQYe5XoK";

}
