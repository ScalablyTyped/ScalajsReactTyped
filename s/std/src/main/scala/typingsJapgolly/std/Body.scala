package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  /* standard dom */
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
  
  /* standard dom */
  def blob(): js.Promise[org.scalajs.dom.Blob]
  
  /* standard dom */
  val body: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array] | Null
  
  /* standard dom */
  val bodyUsed: scala.Boolean
  
  /* standard dom */
  def formData(): js.Promise[org.scalajs.dom.FormData]
  
  /* standard dom */
  def json(): js.Promise[Any]
  
  /* standard dom */
  def text(): js.Promise[java.lang.String]
}
object Body {
  
  inline def apply(
    arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
    blob: CallbackTo[js.Promise[org.scalajs.dom.Blob]],
    bodyUsed: scala.Boolean,
    formData: CallbackTo[js.Promise[org.scalajs.dom.FormData]],
    json: CallbackTo[js.Promise[Any]],
    text: CallbackTo[js.Promise[java.lang.String]]
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = formData.toJsFn, json = json.toJsFn, text = text.toJsFn, body = null)
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
    
    inline def setBlob(value: CallbackTo[js.Promise[org.scalajs.dom.Blob]]): Self = StObject.set(x, "blob", value.toJsFn)
    
    inline def setBody(value: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUsed(value: scala.Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: CallbackTo[js.Promise[org.scalajs.dom.FormData]]): Self = StObject.set(x, "formData", value.toJsFn)
    
    inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
    
    inline def setText(value: CallbackTo[js.Promise[java.lang.String]]): Self = StObject.set(x, "text", value.toJsFn)
  }
}
