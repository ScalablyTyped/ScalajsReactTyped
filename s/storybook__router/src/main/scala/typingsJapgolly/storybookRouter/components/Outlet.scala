package typingsJapgolly.storybookRouter.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod.OutletProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Outlet {
  
  @JSImport("@storybook/router/dist/ts3.9/_modules/react-router-index", "Outlet")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Outlet.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OutletProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
