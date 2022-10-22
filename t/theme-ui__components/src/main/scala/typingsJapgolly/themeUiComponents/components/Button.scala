package typingsJapgolly.themeUiComponents.components

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcButtonMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  @JSImport("@theme-ui/components", "Button")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Button.type): Default[HTMLButtonElement] = new Default[HTMLButtonElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[ButtonProps] & RefAttributes[HTMLButtonElement]): Default[HTMLButtonElement] = new Default[HTMLButtonElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
