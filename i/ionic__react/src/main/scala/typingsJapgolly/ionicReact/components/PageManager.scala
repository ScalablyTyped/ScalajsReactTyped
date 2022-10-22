package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import typingsJapgolly.ionicReact.distTypesRoutingPageManagerMod.PageManagerProps
import typingsJapgolly.ionicReact.distTypesRoutingPageManagerMod.default
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageManager {
  
  @JSImport("@ionic/react/dist/types/routing/PageManager", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[HTMLDivElement]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ HTMLDivElement | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def routeInfo(value: RouteInfo[Any]): this.type = set("routeInfo", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PageManager.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PageManagerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
