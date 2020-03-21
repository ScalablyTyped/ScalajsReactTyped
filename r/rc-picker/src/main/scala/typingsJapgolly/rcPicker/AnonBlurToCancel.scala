package typingsJapgolly.rcPicker

import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlurToCancel extends js.Object {
  var blurToCancel: js.UndefOr[Boolean] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var open: Boolean = js.native
  def forwardKeyDown(e: ReactKeyboardEventFrom[HTMLInputElement]): Boolean = js.native
  def isClickOutside(): Boolean = js.native
  def isClickOutside(clickElement: EventTarget): Boolean = js.native
  def onCancel(): Unit = js.native
  def onSubmit(): Unit = js.native
  def triggerOpen(open: Boolean): Unit = js.native
}

