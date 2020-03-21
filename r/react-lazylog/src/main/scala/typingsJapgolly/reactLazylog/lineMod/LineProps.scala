package typingsJapgolly.reactLazylog.lineMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactLazylog.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps extends js.Object {
  var data: js.Array[AnonText]
  var formatPart: js.UndefOr[js.Function1[/* text */ String, Node]] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var number: Double
  var onLineNumberClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  /**
    * This is never called
    * https://github.com/mozilla-frontend-infra/react-lazylog/issues/18
    */
  var onRowClick: js.UndefOr[js.Function0[_]] = js.undefined
  var rowHeight: Double
  var selectable: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    data: js.Array[AnonText],
    number: Double,
    rowHeight: Double,
    formatPart: /* text */ String => CallbackTo[Node] = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    onLineNumberClick: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onRowClick: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): LineProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => formatPart(t0).runNow()))
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (onLineNumberClick != null) __obj.updateDynamic("onLineNumberClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onLineNumberClick(t0).runNow()))
    onRowClick.foreach(p => __obj.updateDynamic("onRowClick")(p.toJsFn))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
}

