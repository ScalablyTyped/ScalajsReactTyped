package typingsJapgolly.storybookRouter.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookRouter.anon.PartialLocation
import typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod.RoutesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Routes {
  
  @JSImport("@storybook/router/dist/ts3.9/_modules/react-router-index", "Routes")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def location(value: PartialLocation | String): this.type = set("location", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Routes.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RoutesProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
