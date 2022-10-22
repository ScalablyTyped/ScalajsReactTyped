package typingsJapgolly.themeUi.components

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcMenuButtonMod.MenuButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuButton {
  
  @JSImport("theme-ui", "MenuButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MenuButton.type): Default[HTMLButtonElement] = new Default[HTMLButtonElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[MenuButtonProps] & RefAttributes[HTMLButtonElement]): Default[HTMLButtonElement] = new Default[HTMLButtonElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
