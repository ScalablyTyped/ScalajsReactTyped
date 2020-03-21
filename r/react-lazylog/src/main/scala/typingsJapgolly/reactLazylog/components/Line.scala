package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.AnonText
import typingsJapgolly.reactLazylog.lineMod.LineProps
import typingsJapgolly.reactLazylog.lineMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Line {
  def apply(
    data: js.Array[AnonText],
    number: Double,
    rowHeight: Double,
    formatPart: /* text */ String => CallbackTo[Node] = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    onLineNumberClick: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onRowClick: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LineProps, default, Unit, LineProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
  
      if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => formatPart(t0).runNow()))
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (onLineNumberClick != null) __obj.updateDynamic("onLineNumberClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onLineNumberClick(t0).runNow()))
    onRowClick.foreach(p => __obj.updateDynamic("onRowClick")(p.toJsFn))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLazylog.lineMod.LineProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLazylog.lineMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLazylog.lineMod.LineProps])(children: _*)
  }
  @JSImport("react-lazylog/build/Line", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

