package typingsJapgolly.asana.mod.auth

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupFlow
  extends StObject
     with BaseBrowserFlow {
  
  /**
    * @param popupWidth
    * @param popupHeight
    */
  def _popupParams(popupWidth: Double, popupHeight: Double): Unit
  
  def runReceiver(): Unit
}
object PopupFlow {
  
  @JSImport("asana", "auth.PopupFlow")
  @js.native
  val ^ : PopupFlowStatic = js.native
  
  extension [Self <: PopupFlow](x: Self) {
    
    inline def setRunReceiver(value: Callback): Self = StObject.set(x, "runReceiver", value.toJsFn)
    
    inline def set_popupParams(value: (Double, Double) => Callback): Self = StObject.set(x, "_popupParams", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
