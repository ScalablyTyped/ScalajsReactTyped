package typingsJapgolly.cypress.typesSinonMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonFakeXMLHttpRequest extends StObject {
  
  /**
    * Whether or not the request is asynchronous.
    */
  var async: Boolean
  
  def autoRespond(ms: Double): Unit
  
  /**
    * Simulates a network error on the request. The onerror handler will be called and the status will be 0.
    */
  def error(): Unit
  
  /**
    * All response headers as an object.
    */
  def getAllResponseHeaders(): Any
  
  /**
    * The value of the given response header, if the request has been responded to (see respond).
    * @param header
    */
  def getResponseHeader(header: String): String
  
  /**
    * The request method as a string.
    */
  var method: String
  
  def onerror(): Unit
  
  /**
    * Password, if any.
    */
  var password: String
  
  /**
    * The request body
    */
  var requestBody: String
  
  /**
    * An object of all request headers, i.e.:
    */
  var requestHeaders: Any
  
  /**
    * Calls the above three methods.
    */
  def respond(status: Double, headers: Any, body: String): Unit
  
  /**
    * When using respond, this property is populated with a parsed document if response headers indicate as much (see the spec)
    */
  var responseXML: Document
  
  /**
    * Sets the respond body, updates the readyState property and fires onreadystatechange.
    * Additionally, populates responseXML with a parsed document if response headers indicate as much.
    */
  def setResponseBody(body: String): Unit
  
  // Methods
  /**
    * Sets response headers (e.g. { "Content-Type": "text/html", ... }, updates the readyState property and fires onreadystatechange.
    * @param headers
    */
  def setResponseHeaders(headers: Any): Unit
  
  /**
    * The request’s status code.
    * undefined if the request has not been handled (see respond below)
    */
  var status: Double
  
  /**
    * Only populated if the respond method is called (see below).
    */
  var statusText: String
  
  var upload: SinonFakeUploadProgress
  
  // Properties
  /**
    * The URL set on the request object.
    */
  var url: String
  
  /**
    * Username, if any.
    */
  var username: String
  
  var withCredentials: Boolean
}
object SinonFakeXMLHttpRequest {
  
  inline def apply(
    async: Boolean,
    autoRespond: Double => Callback,
    error: Callback,
    getAllResponseHeaders: CallbackTo[Any],
    getResponseHeader: String => String,
    method: String,
    onerror: Callback,
    password: String,
    requestBody: String,
    requestHeaders: Any,
    respond: (Double, Any, String) => Callback,
    responseXML: Document,
    setResponseBody: String => Callback,
    setResponseHeaders: Any => Callback,
    status: Double,
    statusText: String,
    upload: SinonFakeUploadProgress,
    url: String,
    username: String,
    withCredentials: Boolean
  ): SinonFakeXMLHttpRequest = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], autoRespond = js.Any.fromFunction1((t0: Double) => autoRespond(t0).runNow()), error = error.toJsFn, getAllResponseHeaders = getAllResponseHeaders.toJsFn, getResponseHeader = js.Any.fromFunction1(getResponseHeader), method = method.asInstanceOf[js.Any], onerror = onerror.toJsFn, password = password.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], respond = js.Any.fromFunction3((t0: Double, t1: Any, t2: String) => (respond(t0, t1, t2)).runNow()), responseXML = responseXML.asInstanceOf[js.Any], setResponseBody = js.Any.fromFunction1((t0: String) => setResponseBody(t0).runNow()), setResponseHeaders = js.Any.fromFunction1((t0: Any) => setResponseHeaders(t0).runNow()), status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonFakeXMLHttpRequest]
  }
  
  extension [Self <: SinonFakeXMLHttpRequest](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAutoRespond(value: Double => Callback): Self = StObject.set(x, "autoRespond", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setError(value: Callback): Self = StObject.set(x, "error", value.toJsFn)
    
    inline def setGetAllResponseHeaders(value: CallbackTo[Any]): Self = StObject.set(x, "getAllResponseHeaders", value.toJsFn)
    
    inline def setGetResponseHeader(value: String => String): Self = StObject.set(x, "getResponseHeader", js.Any.fromFunction1(value))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOnerror(value: Callback): Self = StObject.set(x, "onerror", value.toJsFn)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: String): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestHeaders(value: Any): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRespond(value: (Double, Any, String) => Callback): Self = StObject.set(x, "respond", js.Any.fromFunction3((t0: Double, t1: Any, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setResponseXML(value: Document): Self = StObject.set(x, "responseXML", value.asInstanceOf[js.Any])
    
    inline def setSetResponseBody(value: String => Callback): Self = StObject.set(x, "setResponseBody", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetResponseHeaders(value: Any => Callback): Self = StObject.set(x, "setResponseHeaders", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setUpload(value: SinonFakeUploadProgress): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
  }
}
