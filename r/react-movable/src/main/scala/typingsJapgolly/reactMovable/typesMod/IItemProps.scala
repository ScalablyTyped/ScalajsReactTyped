package typingsJapgolly.reactMovable.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemProps extends js.Object {
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Double] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ ReactKeyboardEventFrom[Element], Unit]] = js.undefined
  var onWheel: js.UndefOr[js.Function1[/* e */ ReactWheelEventFrom[Element], Unit]] = js.undefined
  var ref: js.UndefOr[RefHandle[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
}

object IItemProps {
  @scala.inline
  def apply(
    `aria-roledescription`: String = null,
    key: Int | Double = null,
    onKeyDown: /* e */ ReactKeyboardEventFrom[Element] => Callback = null,
    onWheel: /* e */ ReactWheelEventFrom[Element] => Callback = null,
    ref: RefHandle[_] = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null
  ): IItemProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.Element]) => onWheel(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemProps]
  }
}

