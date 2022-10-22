package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpFakeResponseMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/http/FakeResponse", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FakeResponse {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var close: Any = js.native
    
    /* CompleteClass */
    var data: String = js.native
    
    /* CompleteClass */
    override def getBuffer(): String = js.native
    
    /* private */ /* CompleteClass */
    var stop: Any = js.native
    
    /* CompleteClass */
    override def write(value: String): Unit = js.native
    
    /* CompleteClass */
    override def writeln(value: String): Unit = js.native
  }
  @JSImport("@nginstack/web-framework/lib/http/FakeResponse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FakeResponse extends StObject {
    
    def clear(): Unit
    
    /* private */ var close: Any
    
    var data: String
    
    def getBuffer(): String
    
    /* private */ var stop: Any
    
    def write(value: String): Unit
    
    def writeln(value: String): Unit
  }
  object FakeResponse {
    
    inline def apply(
      clear: Callback,
      close: Any,
      data: String,
      getBuffer: CallbackTo[String],
      stop: Any,
      write: String => Callback,
      writeln: String => Callback
    ): FakeResponse = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, close = close.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getBuffer = getBuffer.toJsFn, stop = stop.asInstanceOf[js.Any], write = js.Any.fromFunction1((t0: String) => write(t0).runNow()), writeln = js.Any.fromFunction1((t0: String) => writeln(t0).runNow()))
      __obj.asInstanceOf[FakeResponse]
    }
    
    extension [Self <: FakeResponse](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setClose(value: Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGetBuffer(value: CallbackTo[String]): Self = StObject.set(x, "getBuffer", value.toJsFn)
      
      inline def setStop(value: Any): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setWriteln(value: String => Callback): Self = StObject.set(x, "writeln", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
