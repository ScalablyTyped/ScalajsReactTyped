package typingsJapgolly.rcEasyui.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from scala.Any because couldn't resolve ClassTree. */
object MenuButton {
  
  def apply(p: Any): Default[typingsJapgolly.rcEasyui.mod.MenuButton] = new Default[typingsJapgolly.rcEasyui.mod.MenuButton](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("rc-easyui", "MenuButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MenuButton.type): Default[typingsJapgolly.rcEasyui.mod.MenuButton] = new Default[typingsJapgolly.rcEasyui.mod.MenuButton](js.Array(this.component, js.Dictionary.empty))()
}
