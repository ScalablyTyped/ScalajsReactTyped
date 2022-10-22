package typingsJapgolly.qwest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Qwest {
  
  trait Options extends StObject {
    
    /** true (default) or false; used to make asynchronous or synchronous requests */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /** the total number of times to attempt the request through timeouts; 1 by default; if you want to remove the limit set it to null */
    var attempts: js.UndefOr[Double] = js.undefined
    
    /** browser caching; default is false for GET requests and true for POST requests */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /** post (by default), json, text, arraybuffer, blob, document or formdata */
    var dataType: js.UndefOr[String] = js.undefined
    
    /** javascript object containing headers to be sent */
    var headers: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /** the password to access to the URL, if needed */
    var password: js.UndefOr[String] = js.undefined
    
    /** the response type; either auto (default), json, xml, text, arraybuffer, blob or document */
    var responseType: js.UndefOr[String] = js.undefined
    
    /** the timeout for the request in ms; 30000 by default */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** the user to access to the URL, if needed */
    var user: js.UndefOr[String] = js.undefined
    
    /** false by default; sends credentials with your XHR2 request */
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait Promise extends StObject {
    
    /** Request has failed */
    def `catch`(
      callback: js.Function3[/* e */ Any, /* xhr */ js.UndefOr[Any], /* response */ js.UndefOr[Any], Any]
    ): Promise
    
    /** Always run */
    def complete(callback: js.Function0[Any]): Promise
    
    /** Request is successful */
    def `then`(callback: js.Function2[/* xhr */ Any, /* response */ js.UndefOr[Any], Any]): Promise
  }
  object Promise {
    
    inline def apply(
      `catch`: js.Function3[/* e */ Any, /* xhr */ js.UndefOr[Any], /* response */ js.UndefOr[Any], Any] => Promise,
      complete: js.Function0[Any] => Promise,
      `then`: js.Function2[/* xhr */ Any, /* response */ js.UndefOr[Any], Any] => Promise
    ): Promise = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
      __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[Promise]
    }
    
    extension [Self <: Promise](x: Self) {
      
      inline def setCatch(
        value: js.Function3[/* e */ Any, /* xhr */ js.UndefOr[Any], /* response */ js.UndefOr[Any], Any] => Promise
      ): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
      
      inline def setComplete(value: js.Function0[Any] => Promise): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setThen(value: js.Function2[/* xhr */ Any, /* response */ js.UndefOr[Any], Any] => Promise): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    /** Base URI for requests. Prepended to request URIs */
    var base: String = js.native
    
    /** Set XHR options before request */
    def before(callback: js.Function0[Any]): Static = js.native
    
    /**
      * Perfoms an AJAX DELETE request
      * @param url URL that the request is sent to
      * @param data Data to send to the server
      * @param options Configuration options for the AJAX request
      * */
    def delete(url: String): Promise = js.native
    def delete(url: String, data: Any): Promise = js.native
    def delete(url: String, data: Any, options: Options): Promise = js.native
    def delete(url: String, data: Unit, options: Options): Promise = js.native
    
    /**
      * Perfoms an AJAX GET request
      * @param url URL that the request is sent to
      * @param data Data to send to the server
      * @param options Configuration options for the AJAX request
      * */
    def get(url: String): Promise = js.native
    def get(url: String, data: Any): Promise = js.native
    def get(url: String, data: Any, options: Options): Promise = js.native
    def get(url: String, data: Unit, options: Options): Promise = js.native
    
    /** Sets the request limit */
    def limit(by: Double): Unit = js.native
    
    /**
      * Perfoms an AJAX POST request
      * @param url URL that the request is sent to
      * @param data Data to send to the server
      * @param options Configuration options for the AJAX request
      * */
    def post(url: String): Promise = js.native
    def post(url: String, data: Any): Promise = js.native
    def post(url: String, data: Any, options: Options): Promise = js.native
    def post(url: String, data: Unit, options: Options): Promise = js.native
    
    /**
      * Perfoms an AJAX PUT request
      * @param url URL that the request is sent to
      * @param data Data to send to the server
      * @param options Configuration options for the AJAX request
      * */
    def put(url: String): Promise = js.native
    def put(url: String, data: Any): Promise = js.native
    def put(url: String, data: Any, options: Options): Promise = js.native
    def put(url: String, data: Unit, options: Options): Promise = js.native
    
    /** Set default cross-domain response type for IE8/9 (defaults to 'json') */
    def setDefaultXdrResponseType(`type`: String): Unit = js.native
    
    /** Is XHR2 supported by the browser? */
    var xhr2: Boolean = js.native
  }
}
