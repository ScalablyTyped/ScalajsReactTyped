package typingsJapgolly.antdMobile.inputMod

import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Component[InputProps, js.Any, js.Any] {
  var inputRef: HTMLInputElement | Null = js.native
  def focus(): Unit = js.native
  def onInputBlur(e: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
  def onInputFocus(e: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
}

