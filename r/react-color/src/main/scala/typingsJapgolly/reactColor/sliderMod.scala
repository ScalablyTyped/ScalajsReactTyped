package typingsJapgolly.reactColor

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.mod.ColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/slider/Slider", JSImport.Namespace)
@js.native
object sliderMod extends js.Object {
  @js.native
  trait SliderPicker
    extends Component[SliderPickerProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[SliderPickerProps, js.Object, js.Any]
  
  type SliderPickerProps = ColorPickerProps[SliderPicker]
}

