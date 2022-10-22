package typingsJapgolly.victoryCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryPortalPortalContextMod {
  
  @JSImport("victory-core/es/victory-portal/portal-context", "PortalContext")
  @js.native
  val PortalContext: Context[PortalContextValue] = js.native
  
  trait PortalContextValue extends StObject {
    
    def portalDeregister(key: Double): Unit
    
    def portalRegister(): Double
    
    def portalUpdate(key: Double, element: Element): Unit
  }
  object PortalContextValue {
    
    inline def apply(
      portalDeregister: Double => Callback,
      portalRegister: CallbackTo[Double],
      portalUpdate: (Double, Element) => Callback
    ): PortalContextValue = {
      val __obj = js.Dynamic.literal(portalDeregister = js.Any.fromFunction1((t0: Double) => portalDeregister(t0).runNow()), portalRegister = portalRegister.toJsFn, portalUpdate = js.Any.fromFunction2((t0: Double, t1: Element) => (portalUpdate(t0, t1)).runNow()))
      __obj.asInstanceOf[PortalContextValue]
    }
    
    extension [Self <: PortalContextValue](x: Self) {
      
      inline def setPortalDeregister(value: Double => Callback): Self = StObject.set(x, "portalDeregister", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setPortalRegister(value: CallbackTo[Double]): Self = StObject.set(x, "portalRegister", value.toJsFn)
      
      inline def setPortalUpdate(value: (Double, Element) => Callback): Self = StObject.set(x, "portalUpdate", js.Any.fromFunction2((t0: Double, t1: Element) => (value(t0, t1)).runNow()))
    }
  }
}
