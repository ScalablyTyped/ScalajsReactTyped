package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformStream[I, O] extends StObject {
  
  /* standard dom */
  val readable: org.scalajs.dom.ReadableStream[O]
  
  /* standard dom */
  val writable: WritableStream[I]
}
object TransformStream {
  
  inline def apply[I, O](readable: org.scalajs.dom.ReadableStream[O], writable: WritableStream[I]): TransformStream[I, O] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStream[I, O]]
  }
  
  extension [Self <: TransformStream[?, ?], I, O](x: Self & (TransformStream[I, O])) {
    
    inline def setReadable(value: org.scalajs.dom.ReadableStream[O]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[I]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
