package typingsJapgolly.reactNavigation.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNavigation.anon.Value
import typingsJapgolly.reactNavigation.mod.NavigationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationProvider {
  
  inline def apply(value: NavigationProp[Any]): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Value]))
  }
  
  @JSImport("react-navigation", "NavigationProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Value): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
