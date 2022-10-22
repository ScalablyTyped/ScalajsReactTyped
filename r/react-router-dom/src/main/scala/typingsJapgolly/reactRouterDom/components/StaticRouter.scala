package typingsJapgolly.reactRouterDom.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouterDom.anon.PartialLocation
import typingsJapgolly.reactRouterDom.distServerMod.StaticRouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StaticRouter {
  
  inline def apply(location: PartialLocation | String): Builder = {
    val __props = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StaticRouterProps]))
  }
  
  @JSImport("react-router-dom/dist/server", "StaticRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StaticRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
