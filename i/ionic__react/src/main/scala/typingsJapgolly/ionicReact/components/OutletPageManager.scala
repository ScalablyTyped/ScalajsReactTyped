package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRouterOutletElement
import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import typingsJapgolly.ionicReact.distTypesRoutingOutletPageManagerMod.OutletPageManagerProps
import typingsJapgolly.ionicReact.distTypesRoutingOutletPageManagerMod.default
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OutletPageManager {
  
  inline def apply(StackManager: Any): Builder = {
    val __props = js.Dynamic.literal(StackManager = StackManager.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OutletPageManagerProps]))
  }
  
  @JSImport("@ionic/react/dist/types/routing/OutletPageManager", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[HTMLIonRouterOutletElement]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ HTMLIonRouterOutletElement | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ HTMLIonRouterOutletElement | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def routeInfo(value: RouteInfo[Any]): this.type = set("routeInfo", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OutletPageManagerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
