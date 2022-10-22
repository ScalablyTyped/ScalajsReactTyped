package typingsJapgolly.themeUiComponents.components

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcSliderMod.SliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("@theme-ui/components", "Slider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Slider.type): Default[HTMLInputElement] = new Default[HTMLInputElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[SliderProps] & RefAttributes[HTMLInputElement]): Default[HTMLInputElement] = new Default[HTMLInputElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
