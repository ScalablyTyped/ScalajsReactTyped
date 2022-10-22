package typingsJapgolly.appBuilderLib

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUtilTimerMod {
  
  @JSImport("app-builder-lib/out/util/timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/util/timer", "DevTimer")
  @js.native
  open class DevTimer protected ()
    extends StObject
       with Timer {
    def this(label: String) = this()
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    def endAndGet(): String = js.native
    
    /* private */ val label: Any = js.native
    
    /* private */ var start: Any = js.native
  }
  
  inline def time(label: String): Timer = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(label.asInstanceOf[js.Any]).asInstanceOf[Timer]
  
  trait Timer extends StObject {
    
    def end(): Unit
  }
  object Timer {
    
    inline def apply(end: Callback): Timer = {
      val __obj = js.Dynamic.literal(end = end.toJsFn)
      __obj.asInstanceOf[Timer]
    }
    
    extension [Self <: Timer](x: Self) {
      
      inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
    }
  }
}
