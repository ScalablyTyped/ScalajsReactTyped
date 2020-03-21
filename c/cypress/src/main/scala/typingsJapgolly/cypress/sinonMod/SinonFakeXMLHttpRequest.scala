package typingsJapgolly.cypress.sinonMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonFakeXMLHttpRequest extends js.Object {
  /**
    * Whether or not the request is asynchronous.
    */
  var async: Boolean
  /**
    * The request method as a string.
    */
  var method: String
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
  var requestHeaders: js.Any
  /**
    * When using respond, this property is populated with a parsed document if response headers indicate as much (see the spec)
    */
  var responseXML: Document
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
  def autoRespond(ms: Double): Unit
  /**
    * Simulates a network error on the request. The onerror handler will be called and the status will be 0.
    */
  def error(): Unit
  /**
    * All response headers as an object.
    */
  def getAllResponseHeaders(): js.Any
  /**
    * The value of the given response header, if the request has been responded to (see respond).
    * @param header
    */
  def getResponseHeader(header: String): String
  def onerror(): Unit
  /**
    * Calls the above three methods.
    */
  def respond(status: Double, headers: js.Any, body: String): Unit
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
  def setResponseHeaders(headers: js.Any): Unit
}

object SinonFakeXMLHttpRequest {
  @scala.inline
  def apply(
    async: Boolean,
    autoRespond: Double => Callback,
    error: Callback,
    getAllResponseHeaders: CallbackTo[js.Any],
    getResponseHeader: String => CallbackTo[String],
    method: String,
    onerror: Callback,
    password: String,
    requestBody: String,
    requestHeaders: js.Any,
    respond: (Double, js.Any, String) => Callback,
    responseXML: Document,
    setResponseBody: String => Callback,
    setResponseHeaders: js.Any => Callback,
    status: Double,
    statusText: String,
    upload: SinonFakeUploadProgress,
    url: String,
    username: String,
    withCredentials: Boolean
  ): SinonFakeXMLHttpRequest = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.updateDynamic("autoRespond")(js.Any.fromFunction1((t0: scala.Double) => autoRespond(t0).runNow()))
    __obj.updateDynamic("error")(error.toJsFn)
    __obj.updateDynamic("getAllResponseHeaders")(getAllResponseHeaders.toJsFn)
    __obj.updateDynamic("getResponseHeader")(js.Any.fromFunction1((t0: java.lang.String) => getResponseHeader(t0).runNow()))
    __obj.updateDynamic("onerror")(onerror.toJsFn)
    __obj.updateDynamic("respond")(js.Any.fromFunction3((t0: scala.Double, t1: js.Any, t2: java.lang.String) => respond(t0, t1, t2).runNow()))
    __obj.updateDynamic("setResponseBody")(js.Any.fromFunction1((t0: java.lang.String) => setResponseBody(t0).runNow()))
    __obj.updateDynamic("setResponseHeaders")(js.Any.fromFunction1((t0: js.Any) => setResponseHeaders(t0).runNow()))
    __obj.asInstanceOf[SinonFakeXMLHttpRequest]
  }
}

