package typingsJapgolly.dva.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouter.distLibComponentsMod.RouterProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RouterProvider {
  
  inline def apply(router: typingsJapgolly.remixRunRouter.distRouterMod.Router): Builder = {
    val __props = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RouterProviderProps]))
  }
  
  @JSImport("dva/router", "RouterProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def fallbackElement(value: VdomNode): this.type = set("fallbackElement", value.rawNode.asInstanceOf[js.Any])
    
    inline def fallbackElementNull: this.type = set("fallbackElement", null)
    
    inline def fallbackElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fallbackElement", js.Array(value*))
    
    inline def fallbackElementVdomElement(value: VdomElement): this.type = set("fallbackElement", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: RouterProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
