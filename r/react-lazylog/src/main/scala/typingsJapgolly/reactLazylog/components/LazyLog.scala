package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.raw.Range
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.lazyLogMod.LazyLogProps
import typingsJapgolly.reactLazylog.lazyLogMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LazyLog {
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
    width: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LazyLogProps, default, Unit, LazyLogProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLazylog.lazyLogMod.LazyLogProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLazylog.lazyLogMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLazylog.lazyLogMod.LazyLogProps])(children: _*)
  }
  @JSImport("react-lazylog/build/LazyLog", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

