package typingsJapgolly.rcDashMentions.libMentionsMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.rcDashMentions.libOptionMod.OptionProps
import typingsJapgolly.react.reactMod.ChangeEventHandler
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.FocusEvent
import typingsJapgolly.react.reactMod.FocusEventHandler
import typingsJapgolly.react.reactMod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mentions
  extends Component[MentionsProps, MentionsState, js.Any] {
  var focusId: js.UndefOr[Double] = js.native
  var measure: js.UndefOr[HTMLDivElement] = js.native
  var onChange: ChangeEventHandler[HTMLTextAreaElement] = js.native
  var onInputBlur: FocusEventHandler[HTMLTextAreaElement] = js.native
  var onInputFocus: FocusEventHandler[HTMLTextAreaElement] = js.native
  var onKeyDown: KeyboardEventHandler[HTMLTextAreaElement] = js.native
  /**
    * When to start measure:
    * 1. When user press `prefix`
    * 2. When measureText !== prevMeasureText
    *  - If measure hit
    *  - If measuring
    *
    * When to stop measure:
    * 1. Selection is out of range
    * 2. Contains `space`
    * 3. ESC or select one
    */
  var onKeyUp: KeyboardEventHandler[HTMLTextAreaElement] = js.native
  var textarea: js.UndefOr[HTMLTextAreaElement] = js.native
  def blur(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMentions(): Unit = js.native
  def focus(): Unit = js.native
  def getOptions(): js.Array[OptionProps] = js.native
  def getOptions(measureText: String): js.Array[OptionProps] = js.native
  def onBlur(): Unit = js.native
  def onBlur(event: FocusEvent[typingsJapgolly.std.HTMLTextAreaElement]): Unit = js.native
  def onDropdownBlur(): Unit = js.native
  def onDropdownFocus(): Unit = js.native
  def onFocus(): Unit = js.native
  def onFocus(event: FocusEvent[typingsJapgolly.std.HTMLTextAreaElement]): Unit = js.native
  def selectOption(option: OptionProps): Unit = js.native
  def setActiveIndex(activeIndex: Double): Unit = js.native
  def setMeasureRef(element: HTMLDivElement): Unit = js.native
  def setTextAreaRef(element: HTMLTextAreaElement): Unit = js.native
  def startMeasure(measureText: String, measurePrefix: String, measureLocation: Double): Unit = js.native
  def stopMeasure(): Unit = js.native
  def stopMeasure(callback: js.Function0[Unit]): Unit = js.native
  def triggerChange(value: String): Unit = js.native
}

