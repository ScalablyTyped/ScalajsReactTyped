package typingsJapgolly.reactNativeWindows

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response
  extends StObject
     with Object
     with Body {
  
  val headers: Headers
  
  val ok: Boolean
  
  val redirected: Boolean
  
  val status: Double
  
  val statusText: String
  
  val `type`: ResponseType
  
  val url: String
}
object Response {
  
  inline def apply(
    arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
    blob: CallbackTo[js.Promise[Blob]],
    bodyUsed: Boolean,
    constructor: js.Function,
    formData: CallbackTo[js.Promise[FormData]],
    hasOwnProperty: PropertyKey => Boolean,
    headers: Headers,
    json: CallbackTo[js.Promise[Any]],
    ok: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    redirected: Boolean,
    status: Double,
    statusText: String,
    text: CallbackTo[js.Promise[String]],
    `type`: ResponseType,
    url: String
  ): Response = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], formData = formData.toJsFn, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), headers = headers.asInstanceOf[js.Any], json = json.toJsFn, ok = ok.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setType(value: ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
