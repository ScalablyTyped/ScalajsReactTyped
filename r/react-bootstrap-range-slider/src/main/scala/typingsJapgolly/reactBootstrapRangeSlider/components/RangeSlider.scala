package typingsJapgolly.reactBootstrapRangeSlider.components

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactBootstrapRangeSlider.mod.RangeSliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RangeSlider {
  
  @JSImport("react-bootstrap-range-slider", "RangeSlider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RangeSlider.type): SharedBuilder_PropsWithoutRefRefAttributes867626992[HTMLInputElement] = new SharedBuilder_PropsWithoutRefRefAttributes867626992[HTMLInputElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[RangeSliderProps] & RefAttributes[HTMLInputElement]): SharedBuilder_PropsWithoutRefRefAttributes867626992[HTMLInputElement] = new SharedBuilder_PropsWithoutRefRefAttributes867626992[HTMLInputElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
