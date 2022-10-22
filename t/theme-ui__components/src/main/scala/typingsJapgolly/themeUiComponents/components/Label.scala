package typingsJapgolly.themeUiComponents.components

import org.scalajs.dom.HTMLLabelElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcLabelMod.LabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Label {
  
  @JSImport("@theme-ui/components", "Label")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Label.type): Default[HTMLLabelElement] = new Default[HTMLLabelElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[LabelProps] & RefAttributes[HTMLLabelElement]): Default[HTMLLabelElement] = new Default[HTMLLabelElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
