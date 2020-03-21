package typingsJapgolly.antd.editableMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.antd.AnonCurrentString
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editable
  extends Component[EditableProps, EditableState, js.Any] {
  var inComposition: js.UndefOr[Boolean] = js.native
  var lastKeyCode: js.UndefOr[Double] = js.native
  var onBlur: FocusEventHandler[HTMLTextAreaElement] = js.native
  var onChange: ChangeEventHandler[HTMLTextAreaElement] = js.native
  var onKeyDown: KeyboardEventHandler[HTMLTextAreaElement] = js.native
  var onKeyUp: KeyboardEventHandler[HTMLTextAreaElement] = js.native
  @JSName("state")
  var state_Editable: AnonCurrentString = js.native
  var textarea: js.UndefOr[typingsJapgolly.antd.textAreaMod.default] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MEditable(): Unit = js.native
  def confirmChange(): Unit = js.native
  def onCompositionEnd(): Unit = js.native
  def onCompositionStart(): Unit = js.native
  def setTextarea(textarea: typingsJapgolly.antd.textAreaMod.default): Unit = js.native
}

