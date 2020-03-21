package typingsJapgolly.reactLazylog

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-lazylog.react-lazylog/build/Line.LineProps> */
trait PartialLineProps extends js.Object {
  var data: js.UndefOr[js.Array[AnonText]] = js.undefined
  var formatPart: js.UndefOr[js.Function1[/* text */ String, Node]] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var onLineNumberClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onRowClick: js.UndefOr[js.Function0[_]] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialLineProps {
  @scala.inline
  def apply(
    data: js.Array[AnonText] = null,
    formatPart: /* text */ String => CallbackTo[Node] = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    number: Int | Double = null,
    onLineNumberClick: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onRowClick: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    rowHeight: Int | Double = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): PartialLineProps = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => formatPart(t0).runNow()))
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (onLineNumberClick != null) __obj.updateDynamic("onLineNumberClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onLineNumberClick(t0).runNow()))
    onRowClick.foreach(p => __obj.updateDynamic("onRowClick")(p.toJsFn))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLineProps]
  }
}

