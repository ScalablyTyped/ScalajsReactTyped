package typingsJapgolly.makeupFloatingLabel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("makeup-floating-label", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FloatingLabel {
    def this(el: Any) = this()
    def this(el: Any, userOptions: Any) = this()
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  trait FloatingLabel extends StObject {
    
    def refresh(): Unit
  }
  object FloatingLabel {
    
    inline def apply(refresh: Callback): FloatingLabel = {
      val __obj = js.Dynamic.literal(refresh = refresh.toJsFn)
      __obj.asInstanceOf[FloatingLabel]
    }
    
    extension [Self <: FloatingLabel](x: Self) {
      
      inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    }
  }
}
