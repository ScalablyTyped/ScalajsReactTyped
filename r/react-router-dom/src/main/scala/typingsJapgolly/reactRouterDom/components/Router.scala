package typingsJapgolly.reactRouterDom.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouter.anon.PartialLocation
import typingsJapgolly.reactRouter.distLibComponentsMod.RouterProps
import typingsJapgolly.reactRouter.distLibContextMod.Navigator
import typingsJapgolly.remixRunRouter.distHistoryMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Router {
  
  inline def apply(location: PartialLocation | String, navigator: Navigator): Builder = {
    val __props = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RouterProps]))
  }
  
  @JSImport("react-router-dom", "Router")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
    
    inline def navigationType(value: Action): this.type = set("navigationType", value.asInstanceOf[js.Any])
    
    inline def static(value: Boolean): this.type = set("static", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
