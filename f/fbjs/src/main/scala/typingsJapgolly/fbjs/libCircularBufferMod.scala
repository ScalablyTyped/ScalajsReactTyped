package typingsJapgolly.fbjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCircularBufferMod {
  
  @JSImport("fbjs/lib/CircularBuffer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CircularBuffer {
    
    /* CompleteClass */
    override def clear(): CircularBuffer = js.native
    
    /* CompleteClass */
    override def read(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def write(entry: Any): CircularBuffer = js.native
  }
  
  trait CircularBuffer extends StObject {
    
    def clear(): CircularBuffer
    
    def read(): js.Array[Any]
    
    def write(entry: Any): CircularBuffer
  }
  object CircularBuffer {
    
    inline def apply(clear: CallbackTo[CircularBuffer], read: CallbackTo[js.Array[Any]], write: Any => CircularBuffer): CircularBuffer = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, read = read.toJsFn, write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[CircularBuffer]
    }
    
    extension [Self <: CircularBuffer](x: Self) {
      
      inline def setClear(value: CallbackTo[CircularBuffer]): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setRead(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "read", value.toJsFn)
      
      inline def setWrite(value: Any => CircularBuffer): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
