package typingsJapgolly.grommet.keyboardMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.grommet.grommetStrings.component
import typingsJapgolly.grommet.grommetStrings.document
import typingsJapgolly.grommet.utilsMod.KeyboardType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardProps extends js.Object {
  var onBackspace: js.UndefOr[KeyboardType] = js.undefined
  var onComma: js.UndefOr[KeyboardType] = js.undefined
  var onDown: js.UndefOr[KeyboardType] = js.undefined
  var onEnter: js.UndefOr[KeyboardType] = js.undefined
  var onEsc: js.UndefOr[KeyboardType] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardType] = js.undefined
  var onLeft: js.UndefOr[KeyboardType] = js.undefined
  var onRight: js.UndefOr[KeyboardType] = js.undefined
  var onShift: js.UndefOr[KeyboardType] = js.undefined
  var onSpace: js.UndefOr[KeyboardType] = js.undefined
  var onTab: js.UndefOr[KeyboardType] = js.undefined
  var onUp: js.UndefOr[KeyboardType] = js.undefined
  var target: js.UndefOr[component | document] = js.undefined
}

object KeyboardProps {
  @scala.inline
  def apply(
    onBackspace: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onComma: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onDown: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onEnter: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onEsc: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onKeyDown: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onLeft: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onRight: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onShift: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onSpace: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onTab: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onUp: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    target: component | document = null
  ): KeyboardProps = {
    val __obj = js.Dynamic.literal()
    if (onBackspace != null) __obj.updateDynamic("onBackspace")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBackspace(t0).runNow()))
    if (onComma != null) __obj.updateDynamic("onComma")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onComma(t0).runNow()))
    if (onDown != null) __obj.updateDynamic("onDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDown(t0).runNow()))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onEnter(t0).runNow()))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onEsc(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyDown(t0).runNow()))
    if (onLeft != null) __obj.updateDynamic("onLeft")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLeft(t0).runNow()))
    if (onRight != null) __obj.updateDynamic("onRight")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onRight(t0).runNow()))
    if (onShift != null) __obj.updateDynamic("onShift")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onShift(t0).runNow()))
    if (onSpace != null) __obj.updateDynamic("onSpace")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSpace(t0).runNow()))
    if (onTab != null) __obj.updateDynamic("onTab")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTab(t0).runNow()))
    if (onUp != null) __obj.updateDynamic("onUp")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onUp(t0).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardProps]
  }
}

