package typingsJapgolly.baseui.inputMod

import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/input", "Input")
@js.native
class Input ()
  extends Component[InputProps, InternalState, js.Any] {
  def onBlur(e: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
  def onFocus(e: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
}

