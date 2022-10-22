package typingsJapgolly.storybookRouter.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookRouter.mod.RouteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Route {
  
  inline def apply(path: String): Builder = {
    val __props = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RouteProps]))
  }
  
  @JSImport("@storybook/router", "Route")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def hideOnly(value: Boolean): this.type = set("hideOnly", value.asInstanceOf[js.Any])
    
    inline def startsWith(value: Boolean): this.type = set("startsWith", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RouteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
