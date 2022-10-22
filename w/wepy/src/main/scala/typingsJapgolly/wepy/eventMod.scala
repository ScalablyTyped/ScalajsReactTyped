package typingsJapgolly.wepy

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("wepy/event", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with event {
    def this(name: String, source: Any, `type`: Any) = this()
    
    /* CompleteClass */
    @JSName("$destroy")
    override def $destroy(): Unit = js.native
    
    /* CompleteClass */
    @JSName("$transfor")
    override def $transfor(wxevent: js.Array[Any]): Unit = js.native
    
    /* CompleteClass */
    var active: Boolean = js.native
  }
  
  trait event extends StObject {
    
    @JSName("$destroy")
    def $destroy(): Unit
    
    @JSName("$transfor")
    def $transfor(wxevent: js.Array[Any]): Unit
    
    var active: Boolean
  }
  object event {
    
    inline def apply($destroy: Callback, $transfor: js.Array[Any] => Callback, active: Boolean): event = {
      val __obj = js.Dynamic.literal($destroy = $destroy.toJsFn, $transfor = js.Any.fromFunction1((t0: js.Array[Any]) => $transfor(t0).runNow()), active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[event]
    }
    
    extension [Self <: event](x: Self) {
      
      inline def set$destroy(value: Callback): Self = StObject.set(x, "$destroy", value.toJsFn)
      
      inline def set$transfor(value: js.Array[Any] => Callback): Self = StObject.set(x, "$transfor", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
}
