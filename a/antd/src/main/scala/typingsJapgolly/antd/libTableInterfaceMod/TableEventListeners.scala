package typingsJapgolly.antd.libTableInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableEventListeners
  extends /* name */ StringDictionary[js.Any] {
  var onClick: js.UndefOr[js.Function1[/* arg */ ReactMouseEventFrom[Element], Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* arg */ ReactMouseEventFrom[Element], Unit]] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function1[/* arg */ ReactMouseEventFrom[Element], Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* arg */ ReactMouseEventFrom[Element], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* arg */ ReactMouseEventFrom[Element], Unit]] = js.undefined
}

object TableEventListeners {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    onClick: /* arg */ ReactMouseEventFrom[Element] => Callback = null,
    onContextMenu: /* arg */ ReactMouseEventFrom[Element] => Callback = null,
    onDoubleClick: /* arg */ ReactMouseEventFrom[Element] => Callback = null,
    onMouseEnter: /* arg */ ReactMouseEventFrom[Element] => Callback = null,
    onMouseLeave: /* arg */ ReactMouseEventFrom[Element] => Callback = null
  ): TableEventListeners = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* arg */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: /* arg */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: /* arg */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* arg */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* arg */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    __obj.asInstanceOf[TableEventListeners]
  }
}

