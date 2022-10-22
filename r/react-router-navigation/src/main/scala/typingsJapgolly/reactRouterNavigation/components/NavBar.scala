package typingsJapgolly.reactRouterNavigation.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps because couldn't resolve ClassTree. */
object NavBar {
  
  def apply(p: CardSubViewProps): Default[typingsJapgolly.reactRouterNavigation.mod.NavBar] = new Default[typingsJapgolly.reactRouterNavigation.mod.NavBar](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-router-navigation", "NavBar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NavBar.type): Default[typingsJapgolly.reactRouterNavigation.mod.NavBar] = new Default[typingsJapgolly.reactRouterNavigation.mod.NavBar](js.Array(this.component, js.Dictionary.empty))()
}
