package typingsJapgolly.esfxCanceltoken

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Blob
import org.scalajs.dom.FormData
import org.scalajs.dom.Headers
import org.scalajs.dom.ReferrerPolicy
import org.scalajs.dom.Request
import org.scalajs.dom.RequestCache
import org.scalajs.dom.RequestCredentials
import org.scalajs.dom.RequestDestination
import org.scalajs.dom.RequestMode
import org.scalajs.dom.RequestRedirect
import typingsJapgolly.esfxCanceltoken.mod.CancelToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<std.Request, 'signal'> */
trait RequestWithCancelToken extends StObject {
  
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
  @JSName("arrayBuffer")
  var arrayBuffer_Original: js.Function0[js.Promise[js.typedarray.ArrayBuffer]]
  
  def blob(): js.Promise[Blob]
  @JSName("blob")
  var blob_Original: js.Function0[js.Promise[Blob]]
  
  var body: js.UndefOr[org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array] | Null] = js.undefined
  
  var bodyUsed: Boolean
  
  var cache: RequestCache
  
  @JSName("clone")
  var clone_Original: js.Function0[Request]
  
  var credentials: RequestCredentials
  
  var destination: RequestDestination
  
  def formData(): js.Promise[FormData]
  @JSName("formData")
  var formData_Original: js.Function0[js.Promise[FormData]]
  
  var headers: Headers
  
  var integrity: String
  
  def json(): js.Promise[Any]
  @JSName("json")
  var json_Original: js.Function0[js.Promise[Any]]
  
  var keepalive: Boolean
  
  var method: String
  
  var mode: RequestMode
  
  var redirect: RequestRedirect
  
  var referrer: String
  
  var referrerPolicy: ReferrerPolicy
  
  val signal: CancelToken
  
  def text(): js.Promise[String]
  @JSName("text")
  var text_Original: js.Function0[js.Promise[String]]
  
  var url: String
}
object RequestWithCancelToken {
  
  inline def apply(
    arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
    blob: CallbackTo[js.Promise[Blob]],
    bodyUsed: Boolean,
    cache: RequestCache,
    clone_ : CallbackTo[Request],
    credentials: RequestCredentials,
    destination: RequestDestination,
    formData: CallbackTo[js.Promise[FormData]],
    headers: Headers,
    integrity: String,
    json: CallbackTo[js.Promise[Any]],
    keepalive: Boolean,
    method: String,
    mode: RequestMode,
    redirect: RequestRedirect,
    referrer: String,
    referrerPolicy: ReferrerPolicy,
    signal: CancelToken,
    text: CallbackTo[js.Promise[String]],
    url: String
  ): RequestWithCancelToken = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], formData = formData.toJsFn, headers = headers.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], json = json.toJsFn, keepalive = keepalive.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(clone_.toJsFn)
    __obj.asInstanceOf[RequestWithCancelToken]
  }
  
  extension [Self <: RequestWithCancelToken](x: Self) {
    
    inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
    
    inline def setBlob(value: CallbackTo[js.Promise[Blob]]): Self = StObject.set(x, "blob", value.toJsFn)
    
    inline def setBody(value: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setClone_(value: CallbackTo[Request]): Self = StObject.set(x, "clone", value.toJsFn)
    
    inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: RequestDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: CallbackTo[js.Promise[FormData]]): Self = StObject.set(x, "formData", value.toJsFn)
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
    
    inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: CancelToken): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
