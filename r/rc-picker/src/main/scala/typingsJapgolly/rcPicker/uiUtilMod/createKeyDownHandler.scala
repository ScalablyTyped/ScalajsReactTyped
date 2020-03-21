package typingsJapgolly.rcPicker.uiUtilMod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/utils/uiUtil", "createKeyDownHandler")
@js.native
object createKeyDownHandler extends js.Object {
  def apply(
    event: ReactKeyboardEventFrom[HTMLElement],
    hasOnLeftRightOnCtrlLeftRightOnUpDownOnPageUpDownOnEnter: KeyboardConfig
  ): Boolean = js.native
}

