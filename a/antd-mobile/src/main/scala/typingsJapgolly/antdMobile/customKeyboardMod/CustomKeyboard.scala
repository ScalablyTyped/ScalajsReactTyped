package typingsJapgolly.antdMobile.customKeyboardMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antdMobile.AnonArialabel
import typingsJapgolly.antdMobile.AnonIconOnly
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomKeyboard
  extends Component[js.Any, js.Any, js.Any] {
  var antmKeyboard: HTMLDivElement | Null = js.native
  var confirmDisabled: Boolean = js.native
  var confirmKeyboardItem: HTMLTableDataCellElement | Null = js.native
  var linkedInput: js.Any = js.native
  def getAriaAttr(label: String): AnonArialabel | AnonIconOnly = js.native
  def onKeyboardClick(e: ReactMouseEventFrom[HTMLTableDataCellElement with Element]): js.UndefOr[Null] = js.native
  def onKeyboardClick(e: ReactMouseEventFrom[HTMLTableDataCellElement with Element], value: String): js.UndefOr[Null] = js.native
  def renderKeyboardItem(item: String, index: Double): japgolly.scalajs.react.raw.React.Element = js.native
}

