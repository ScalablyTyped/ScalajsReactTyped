package typingsJapgolly.zipJsZipJs.mod

import org.scalajs.dom.ReadableStream
import typingsJapgolly.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a generic `TransformStream` class.
  * 
  * @see {@link https://streams.spec.whatwg.org/#generictransformstream|specification}
  */
trait GenericTransformStream extends StObject {
  
  var readable: ReadableStream[Any]
  
  var writable: WritableStream[Any]
}
object GenericTransformStream {
  
  inline def apply(readable: ReadableStream[Any], writable: WritableStream[Any]): GenericTransformStream = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTransformStream]
  }
  
  extension [Self <: GenericTransformStream](x: Self) {
    
    inline def setReadable(value: ReadableStream[Any]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[Any]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
