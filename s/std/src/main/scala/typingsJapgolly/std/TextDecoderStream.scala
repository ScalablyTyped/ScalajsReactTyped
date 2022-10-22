package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecoderStream
  extends StObject
     with GenericTransformStream
     with TextDecoderCommon {
  
  /* standard dom */
  @JSName("readable")
  val readable_TextDecoderStream: org.scalajs.dom.ReadableStream[java.lang.String]
  
  /* standard dom */
  @JSName("writable")
  val writable_TextDecoderStream: WritableStream[BufferSource]
}
object TextDecoderStream {
  
  inline def apply(
    encoding: java.lang.String,
    fatal: scala.Boolean,
    ignoreBOM: scala.Boolean,
    readable: org.scalajs.dom.ReadableStream[java.lang.String],
    writable: WritableStream[BufferSource]
  ): TextDecoderStream = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderStream]
  }
  
  extension [Self <: TextDecoderStream](x: Self) {
    
    inline def setReadable(value: org.scalajs.dom.ReadableStream[java.lang.String]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[BufferSource]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
