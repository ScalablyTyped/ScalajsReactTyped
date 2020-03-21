package typingsJapgolly.baseui.selectMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.baseui.AnonClearable
import typingsJapgolly.baseui.AnonItemOption
import typingsJapgolly.baseui.AnonOptionOption
import typingsJapgolly.baseui.AnonOptionState
import typingsJapgolly.dateFns.Locale
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.Event_
import typingsJapgolly.std.KeyboardEvent
import typingsJapgolly.std.MouseEvent
import typingsJapgolly.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/select", "Select")
@js.native
class Select ()
  extends Component[SelectProps, SelectState, js.Any] {
  def addValue(item: Option): Unit = js.native
  def clearValue(event: KeyboardEvent): Unit = js.native
  def clearValue(event: MouseEvent): Unit = js.native
  def clearValue(event: TouchEvent): Unit = js.native
  def closeMenu(): Unit = js.native
  def filterOption(): Value = js.native
  def filterOption(excludeOptions: Value): Value = js.native
  def focus(): Unit = js.native
  def getOptionLabel(locale: Locale, hasOption: AnonOptionState): Node = js.native
  def getSharedProps(): AnonClearable = js.native
  def getValueArray(value: Value): js.Array[Option] = js.native
  def getValueLabel(hasOption: AnonOptionOption): Node = js.native
  def handleBlur(event: Event_): Unit = js.native
  def handleClick(event: MouseEvent): Unit = js.native
  def handleClick(event: TouchEvent): Unit = js.native
  def handleClickOutside(event: org.scalajs.dom.raw.MouseEvent): Unit = js.native
  def handleInputChange(event: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def handleInputFocus(event: ReactFocusEventFrom[HTMLElement]): Unit = js.native
  def handleKeyDown(event: org.scalajs.dom.raw.KeyboardEvent): Unit = js.native
  def handleTouchEnd(event: org.scalajs.dom.raw.TouchEvent): Unit = js.native
  def handleTouchEndClearValue(event: org.scalajs.dom.raw.TouchEvent): Unit = js.native
  def handleTouchMove(): Unit = js.native
  def handleTouchOutside(event: org.scalajs.dom.raw.TouchEvent): Unit = js.native
  def handleTouchStart(): Unit = js.native
  def popValue(): Unit = js.native
  def removeValue(item: Option): Unit = js.native
  def renderArrow(): Node = js.native
  def renderClear(): Node = js.native
  def renderInput(): Node = js.native
  def renderLoading(): Node = js.native
  def renderSearch(): Node = js.native
  def renderValue(valueArray: Value, isOpen: Boolean, locale: Locale): Node = js.native
  def selectValue(hasItem: AnonItemOption): Unit = js.native
  def setValue(value: Value, option: Option, `type`: ChangeAction): Unit = js.native
}

