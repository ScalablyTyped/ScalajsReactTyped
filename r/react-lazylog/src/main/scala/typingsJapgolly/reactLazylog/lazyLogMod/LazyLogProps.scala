package typingsJapgolly.reactLazylog.lazyLogMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.raw.Range
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyLogProps extends js.Object {
  var caseInsensitive: js.UndefOr[Boolean] = js.undefined
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  var extraLines: js.UndefOr[Double] = js.undefined
  var fetchOptions: js.UndefOr[RequestInit] = js.undefined
  var follow: js.UndefOr[Boolean] = js.undefined
  var formatPart: js.UndefOr[js.Function1[/* text */ String, Node]] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var highlight: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var highlightLineClassName: js.UndefOr[String] = js.undefined
  var lineClassName: js.UndefOr[String] = js.undefined
  var loadingComponent: js.UndefOr[js.Any] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var onHighlight: js.UndefOr[js.Function1[/* range */ Range, _]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[_]] = js.undefined
  var overscanRowCount: js.UndefOr[Double] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var scrollToLine: js.UndefOr[Double] = js.undefined
  var selectableLines: js.UndefOr[Boolean] = js.undefined
  var stream: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var url: String
  var width: js.UndefOr[String | Double] = js.undefined
}

object LazyLogProps {
  @scala.inline
  def apply(
    url: String,
    caseInsensitive: js.UndefOr[Boolean] = js.undefined,
    containerStyle: CSSProperties = null,
    extraLines: Int | Double = null,
    fetchOptions: RequestInit = null,
    follow: js.UndefOr[Boolean] = js.undefined,
    formatPart: /* text */ String => CallbackTo[Node] = null,
    height: String | Double = null,
    highlight: Double | js.Array[Double] = null,
    highlightLineClassName: String = null,
    lineClassName: String = null,
    loadingComponent: js.Any = null,
    onError: /* error */ js.Any => CallbackTo[js.Any] = null,
    onHighlight: /* range */ Range => CallbackTo[js.Any] = null,
    onLoad: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    overscanRowCount: Int | Double = null,
    rowHeight: Int | Double = null,
    scrollToLine: Int | Double = null,
    selectableLines: js.UndefOr[Boolean] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    text: String = null,
    width: String | Double = null
  ): LazyLogProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (extraLines != null) __obj.updateDynamic("extraLines")(extraLines.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => formatPart(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (highlightLineClassName != null) __obj.updateDynamic("highlightLineClassName")(highlightLineClassName.asInstanceOf[js.Any])
    if (lineClassName != null) __obj.updateDynamic("lineClassName")(lineClassName.asInstanceOf[js.Any])
    if (loadingComponent != null) __obj.updateDynamic("loadingComponent")(loadingComponent.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Any) => onError(t0).runNow()))
    if (onHighlight != null) __obj.updateDynamic("onHighlight")(js.Any.fromFunction1((t0: /* range */ org.scalajs.dom.raw.Range) => onHighlight(t0).runNow()))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scrollToLine != null) __obj.updateDynamic("scrollToLine")(scrollToLine.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableLines)) __obj.updateDynamic("selectableLines")(selectableLines.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyLogProps]
  }
}

