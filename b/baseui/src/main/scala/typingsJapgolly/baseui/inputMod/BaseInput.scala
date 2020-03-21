package typingsJapgolly.baseui.inputMod

import japgolly.scalajs.react.ReactFocusEventFrom
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/input", "BaseInput")
@js.native
class BaseInput ()
  extends Component[BaseInputProps[HTMLInputElement], InternalState, js.Any] {
  def onBlur(e: ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]): Unit = js.native
  def onFocus(e: ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]): Unit = js.native
}

