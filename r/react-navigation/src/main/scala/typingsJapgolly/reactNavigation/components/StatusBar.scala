package typingsJapgolly.reactNavigation.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.reactNavigation.anon.TypeofStatusBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatusBar {
  
  @JSImport("react-navigation", "Themed.StatusBar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: StatusBar.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ComponentProps[TypeofStatusBar]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
