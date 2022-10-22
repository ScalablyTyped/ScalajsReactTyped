package typingsJapgolly.reactNativeWindows

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
  
  def blob(): js.Promise[Blob]
  
  val bodyUsed: Boolean
  
  def formData(): js.Promise[FormData]
  
  def json(): js.Promise[Any]
  
  def text(): js.Promise[String]
}
object Body {
  
  inline def apply(
    arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
    blob: CallbackTo[js.Promise[Blob]],
    bodyUsed: Boolean,
    formData: CallbackTo[js.Promise[FormData]],
    json: CallbackTo[js.Promise[Any]],
    text: CallbackTo[js.Promise[String]]
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = formData.toJsFn, json = json.toJsFn, text = text.toJsFn)
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
    
    inline def setBlob(value: CallbackTo[js.Promise[Blob]]): Self = StObject.set(x, "blob", value.toJsFn)
    
    inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: CallbackTo[js.Promise[FormData]]): Self = StObject.set(x, "formData", value.toJsFn)
    
    inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
    
    inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
  }
}
