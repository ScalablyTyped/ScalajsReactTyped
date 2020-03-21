package typingsJapgolly.baseui.checkboxMod

import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/checkbox", "Checkbox")
@js.native
class Checkbox ()
  extends Component[CheckboxProps, CheckboxState, js.Any] {
  def onBlur(event: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
  def onFocus(event: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
  def onMouseDown(event: ReactMouseEventFrom[HTMLInputElement]): Unit = js.native
  def onMouseEnter(event: ReactMouseEventFrom[HTMLInputElement]): Unit = js.native
  def onMouseLeave(event: ReactMouseEventFrom[HTMLInputElement]): Unit = js.native
  def onMouseUp(event: ReactMouseEventFrom[HTMLInputElement]): Unit = js.native
}

