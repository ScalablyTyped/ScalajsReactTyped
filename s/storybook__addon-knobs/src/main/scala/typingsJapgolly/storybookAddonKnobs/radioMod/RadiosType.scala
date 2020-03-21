package typingsJapgolly.storybookAddonKnobs.radioMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadiosType
  extends Component[RadiosTypeProps, js.Object, js.Any] {
  def renderRadioButton(label: String, value: RadiosTypeKnobValue): Element = js.native
  def renderRadioButtonList(hasOptions: RadiosTypeKnob): js.Array[Element] = js.native
}

