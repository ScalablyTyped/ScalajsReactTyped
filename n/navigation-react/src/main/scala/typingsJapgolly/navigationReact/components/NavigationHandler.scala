package typingsJapgolly.navigationReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.navigation.mod.StateNavigator
import typingsJapgolly.navigationReact.mod.NavigationHandlerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationHandler {
  
  inline def apply(stateNavigator: StateNavigator[Any, String]): Default[typingsJapgolly.navigationReact.mod.NavigationHandler] = {
    val __props = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any])
    new Default[typingsJapgolly.navigationReact.mod.NavigationHandler](js.Array(this.component, __props.asInstanceOf[NavigationHandlerProps]))
  }
  
  @JSImport("navigation-react", "NavigationHandler")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NavigationHandlerProps): Default[typingsJapgolly.navigationReact.mod.NavigationHandler] = new Default[typingsJapgolly.navigationReact.mod.NavigationHandler](js.Array(this.component, p.asInstanceOf[js.Any]))
}
