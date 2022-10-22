package typingsJapgolly.refArray

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dicti[T]
    extends StObject
       with /* i */ NumberDictionary[T] {
    
    var buffer: Buffer
    
    def inspect(): String
    
    var length: Double
    
    def ref(): Buffer
    
    def toArray(): js.Array[T]
    
    def toJSON(): js.Array[T]
  }
  object Dicti {
    
    inline def apply[T](
      buffer: Buffer,
      inspect: CallbackTo[String],
      length: Double,
      ref: CallbackTo[Buffer],
      toArray: CallbackTo[js.Array[T]],
      toJSON: CallbackTo[js.Array[T]]
    ): Dicti[T] = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], inspect = inspect.toJsFn, length = length.asInstanceOf[js.Any], ref = ref.toJsFn, toArray = toArray.toJsFn, toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[Dicti[T]]
    }
    
    extension [Self <: Dicti[?], T](x: Self & Dicti[T]) {
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setInspect(value: CallbackTo[String]): Self = StObject.set(x, "inspect", value.toJsFn)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRef(value: CallbackTo[Buffer]): Self = StObject.set(x, "ref", value.toJsFn)
      
      inline def setToArray(value: CallbackTo[js.Array[T]]): Self = StObject.set(x, "toArray", value.toJsFn)
      
      inline def setToJSON(value: CallbackTo[js.Array[T]]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
}
