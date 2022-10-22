package typingsJapgolly.reactNative

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request
  extends StObject
     with Object
     with Body {
  
  val credentials: RequestCredentials
  
  val headers: Headers
  
  val method: String
  
  val mode: RequestMode
  
  val referrer: String
  
  val url: String
}
object Request {
  
  inline def apply(
    arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
    blob: CallbackTo[js.Promise[Blob]],
    bodyUsed: Boolean,
    constructor: js.Function,
    credentials: RequestCredentials,
    formData: CallbackTo[js.Promise[FormData]],
    hasOwnProperty: PropertyKey => Boolean,
    headers: Headers,
    json: CallbackTo[js.Promise[Any]],
    method: String,
    mode: RequestMode,
    propertyIsEnumerable: PropertyKey => Boolean,
    referrer: String,
    text: CallbackTo[js.Promise[String]],
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], formData = formData.toJsFn, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), headers = headers.asInstanceOf[js.Any], json = json.toJsFn, method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), referrer = referrer.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
