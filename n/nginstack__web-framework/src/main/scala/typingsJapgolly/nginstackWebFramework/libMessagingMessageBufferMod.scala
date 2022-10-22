package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nginstackWebFramework.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessagingMessageBufferMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/messaging/MessageBuffer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MessageBuffer {
    
    /* CompleteClass */
    override def add(targetId: String, message: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var messages_ : Any = js.native
    
    /* CompleteClass */
    override def retrieve(): js.Array[Message] = js.native
  }
  @JSImport("@nginstack/web-framework/lib/messaging/MessageBuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MessageBuffer extends StObject {
    
    def add(targetId: String, message: Any): Unit
    
    /* private */ var messages_ : Any
    
    def retrieve(): js.Array[Message]
  }
  object MessageBuffer {
    
    inline def apply(add: (String, Any) => Callback, messages_ : Any, retrieve: CallbackTo[js.Array[Message]]): MessageBuffer = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: String, t1: Any) => (add(t0, t1)).runNow()), messages_ = messages_.asInstanceOf[js.Any], retrieve = retrieve.toJsFn)
      __obj.asInstanceOf[MessageBuffer]
    }
    
    extension [Self <: MessageBuffer](x: Self) {
      
      inline def setAdd(value: (String, Any) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setMessages_(value: Any): Self = StObject.set(x, "messages_", value.asInstanceOf[js.Any])
      
      inline def setRetrieve(value: CallbackTo[js.Array[Message]]): Self = StObject.set(x, "retrieve", value.toJsFn)
    }
  }
}
