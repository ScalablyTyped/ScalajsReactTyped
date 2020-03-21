package typingsJapgolly.storybookAddonKnobs.checkboxesMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxesType
  extends Component[CheckboxesTypeProps, CheckboxesTypeState, js.Any] {
  def handleChange(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def renderCheckbox(label: String, value: String): Element = js.native
  def renderCheckboxList(hasOptions: CheckboxesTypeKnob): js.Array[Element] = js.native
}

