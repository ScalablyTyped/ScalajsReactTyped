package typingsJapgolly.recharts.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.recharts.mod.AllowEscapeViewBox
import typingsJapgolly.recharts.mod.AnimationEasingType
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.Coordinate
import typingsJapgolly.recharts.mod.TooltipPayload
import typingsJapgolly.recharts.mod.TooltipProps
import typingsJapgolly.recharts.mod.ViewBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    allowEscapeViewBox: AllowEscapeViewBox = null,
    animationBegin: Int | Double = null,
    animationDuration: Int | Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: Int | Double = null,
    content: Element | StatelessComponent[_] | ContentRenderer[TooltipProps] = null,
    contentStyle: js.Object = null,
    coordinate: Coordinate = null,
    cursor: Boolean | js.Object | Element | StatelessComponent[_] = null,
    filterNull: js.UndefOr[Boolean] = js.undefined,
    formatter: (/* value */ String | Double | (js.Array[String | Double]), /* name */ String, /* entry */ TooltipPayload, /* index */ Double) => CallbackTo[Node] = null,
    isAnimationActive: js.UndefOr[Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined,
    itemSorter: (TooltipPayload, TooltipPayload) => CallbackTo[Double] = null,
    itemStyle: js.Object = null,
    label: String | Double = null,
    labelFormatter: /* label */ String | Double => CallbackTo[Node] = null,
    labelStyle: js.Object = null,
    offset: Int | Double = null,
    onAnimationEnd: /* repeated */ js.Any => Callback = null,
    onAnimationStart: /* repeated */ js.Any => Callback = null,
    payload: js.Array[TooltipPayload] = null,
    position: Coordinate = null,
    separator: String = null,
    useTranslate3d: js.UndefOr[Boolean] = js.undefined,
    viewBox: ViewBox = null,
    wrapperStyle: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TooltipProps, typingsJapgolly.recharts.mod.Tooltip, Unit, TooltipProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (allowEscapeViewBox != null) __obj.updateDynamic("allowEscapeViewBox")(allowEscapeViewBox.asInstanceOf[js.Any])
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (coordinate != null) __obj.updateDynamic("coordinate")(coordinate.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(filterNull)) __obj.updateDynamic("filterNull")(filterNull.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction4((t0: /* value */ java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]), t1: /* name */ java.lang.String, t2: /* entry */ typingsJapgolly.recharts.mod.TooltipPayload, t3: /* index */ scala.Double) => formatter(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive.asInstanceOf[js.Any])
    if (itemSorter != null) __obj.updateDynamic("itemSorter")(js.Any.fromFunction2((t0: typingsJapgolly.recharts.mod.TooltipPayload, t1: typingsJapgolly.recharts.mod.TooltipPayload) => itemSorter(t0, t1).runNow()))
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(js.Any.fromFunction1((t0: /* label */ java.lang.String | scala.Double) => labelFormatter(t0).runNow()))
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onAnimationEnd(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onAnimationStart(t0).runNow()))
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(useTranslate3d)) __obj.updateDynamic("useTranslate3d")(useTranslate3d.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.recharts.mod.TooltipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.recharts.mod.Tooltip](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.recharts.mod.TooltipProps])(children: _*)
  }
  @JSImport("recharts", "Tooltip")
  @js.native
  object componentImport extends js.Object
  
}

