package typingsJapgolly.griddleReact.mod.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeadingCellProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var columnId: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[js.Any] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object TableHeadingCellProps {
  @scala.inline
  def apply(
    className: String = null,
    columnId: Int | Double = null,
    icon: js.Any = null,
    onClick: ReactMouseEventFrom[Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[Element] => Callback = null,
    style: CSSProperties = null,
    title: String = null
  ): TableHeadingCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeadingCellProps]
  }
}

