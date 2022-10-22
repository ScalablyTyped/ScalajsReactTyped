package typingsJapgolly.storybookRouter.components

import typingsJapgolly.storybookRouter.anon.PartialLocation
import typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod.Navigator
import typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod.RouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Router {
  
  inline def apply(location: PartialLocation | String, navigator: Navigator): SharedBuilder_RouterProps_1346793986 = {
    val __props = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any])
    new SharedBuilder_RouterProps_1346793986(js.Array(this.component, __props.asInstanceOf[/* hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp */ RouterProps]))
  }
  
  @JSImport("@storybook/router/dist/ts3.9/_modules/react-router-index", "Router")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp */ RouterProps): SharedBuilder_RouterProps_1346793986 = new SharedBuilder_RouterProps_1346793986(js.Array(this.component, p.asInstanceOf[js.Any]))
}
