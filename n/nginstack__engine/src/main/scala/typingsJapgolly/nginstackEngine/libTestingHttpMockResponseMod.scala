package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestingHttpMockResponseMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/testing/http/MockResponse", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MockResponse {
    
    /* CompleteClass */
    var contentType_ : String = js.native
    
    /* CompleteClass */
    var content_ : String = js.native
    
    /* CompleteClass */
    override def getHeader(header: Any): Any = js.native
    
    /* CompleteClass */
    override def send(): Unit = js.native
    
    /* CompleteClass */
    var sent: Boolean = js.native
    
    /* CompleteClass */
    override def setHeader(header: Any, value: Any): Unit = js.native
    
    /* CompleteClass */
    var statusCode_ : Double = js.native
    
    /* CompleteClass */
    override def write(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def writeln(value: Any): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/testing/http/MockResponse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MockResponse extends StObject {
    
    var contentType_ : String
    
    var content_ : String
    
    def getHeader(header: Any): Any
    
    def send(): Unit
    
    var sent: Boolean
    
    def setHeader(header: Any, value: Any): Unit
    
    var statusCode_ : Double
    
    def write(value: Any): Unit
    
    def writeln(value: Any): Unit
  }
  object MockResponse {
    
    inline def apply(
      contentType_ : String,
      content_ : String,
      getHeader: Any => Any,
      send: Callback,
      sent: Boolean,
      setHeader: (Any, Any) => Callback,
      statusCode_ : Double,
      write: Any => Callback,
      writeln: Any => Callback
    ): MockResponse = {
      val __obj = js.Dynamic.literal(contentType_ = contentType_.asInstanceOf[js.Any], content_ = content_.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), send = send.toJsFn, sent = sent.asInstanceOf[js.Any], setHeader = js.Any.fromFunction2((t0: Any, t1: Any) => (setHeader(t0, t1)).runNow()), statusCode_ = statusCode_.asInstanceOf[js.Any], write = js.Any.fromFunction1((t0: Any) => write(t0).runNow()), writeln = js.Any.fromFunction1((t0: Any) => writeln(t0).runNow()))
      __obj.asInstanceOf[MockResponse]
    }
    
    extension [Self <: MockResponse](x: Self) {
      
      inline def setContentType_(value: String): Self = StObject.set(x, "contentType_", value.asInstanceOf[js.Any])
      
      inline def setContent_(value: String): Self = StObject.set(x, "content_", value.asInstanceOf[js.Any])
      
      inline def setGetHeader(value: Any => Any): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      inline def setSend(value: Callback): Self = StObject.set(x, "send", value.toJsFn)
      
      inline def setSent(value: Boolean): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
      
      inline def setSetHeader(value: (Any, Any) => Callback): Self = StObject.set(x, "setHeader", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setStatusCode_(value: Double): Self = StObject.set(x, "statusCode_", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Any => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setWriteln(value: Any => Callback): Self = StObject.set(x, "writeln", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
