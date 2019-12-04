package typingsJapgolly.rcDashMentions.libMentionsContextMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcDashMentions.libOptionMod.OptionProps
import typingsJapgolly.react.reactMod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsContextProps extends js.Object {
  var activeIndex: Double
  var notFoundContent: Node
  var onBlur: FocusEventHandler[HTMLElement]
  var onFocus: FocusEventHandler[HTMLElement]
  def selectOption(option: OptionProps): Unit
  def setActiveIndex(index: Double): Unit
}

object MentionsContextProps {
  @scala.inline
  def apply(
    activeIndex: Double,
    onBlur: ReactFocusEventFrom[HTMLElement] => Callback,
    onFocus: ReactFocusEventFrom[HTMLElement] => Callback,
    selectOption: OptionProps => Callback,
    setActiveIndex: Double => Callback,
    notFoundContent: VdomNode = null
  ): MentionsContextProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBlur(t0).runNow()))
    __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onFocus(t0).runNow()))
    __obj.updateDynamic("selectOption")(js.Any.fromFunction1((t0: typingsJapgolly.rcDashMentions.libOptionMod.OptionProps) => selectOption(t0).runNow()))
    __obj.updateDynamic("setActiveIndex")(js.Any.fromFunction1((t0: scala.Double) => setActiveIndex(t0).runNow()))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionsContextProps]
  }
}

