package typingsJapgolly.themeUiComponents.components

import org.scalajs.dom.HTMLSelectElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcSelectMod.SelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  @JSImport("@theme-ui/components", "Select")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Select.type): Default[HTMLSelectElement] = new Default[HTMLSelectElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[SelectProps] & RefAttributes[HTMLSelectElement]): Default[HTMLSelectElement] = new Default[HTMLSelectElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
