package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRoutingStackContextMod {
  
  @JSImport("@ionic/react/dist/types/routing/StackContext", "StackContext")
  @js.native
  val StackContext: Context[StackContextState] = js.native
  
  trait StackContextState extends StObject {
    
    def isInOutlet(): Boolean
    
    def registerIonPage(page: HTMLElement, routeInfo: RouteInfo[Any]): Unit
  }
  object StackContextState {
    
    inline def apply(isInOutlet: CallbackTo[Boolean], registerIonPage: (HTMLElement, RouteInfo[Any]) => Callback): StackContextState = {
      val __obj = js.Dynamic.literal(isInOutlet = isInOutlet.toJsFn, registerIonPage = js.Any.fromFunction2((t0: HTMLElement, t1: RouteInfo[Any]) => (registerIonPage(t0, t1)).runNow()))
      __obj.asInstanceOf[StackContextState]
    }
    
    extension [Self <: StackContextState](x: Self) {
      
      inline def setIsInOutlet(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInOutlet", value.toJsFn)
      
      inline def setRegisterIonPage(value: (HTMLElement, RouteInfo[Any]) => Callback): Self = StObject.set(x, "registerIonPage", js.Any.fromFunction2((t0: HTMLElement, t1: RouteInfo[Any]) => (value(t0, t1)).runNow()))
    }
  }
}
