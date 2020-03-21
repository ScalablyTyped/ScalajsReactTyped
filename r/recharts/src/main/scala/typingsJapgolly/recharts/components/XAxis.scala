package typingsJapgolly.recharts.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.recharts.mod.AxisDomain
import typingsJapgolly.recharts.mod.AxisInterval
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.DataKey
import typingsJapgolly.recharts.mod.LabelProps
import typingsJapgolly.recharts.mod.RechartsFunction
import typingsJapgolly.recharts.mod.ScaleType
import typingsJapgolly.recharts.mod.XAxisProps
import typingsJapgolly.recharts.mod.XPadding
import typingsJapgolly.recharts.rechartsStrings.bottom
import typingsJapgolly.recharts.rechartsStrings.category
import typingsJapgolly.recharts.rechartsStrings.number
import typingsJapgolly.recharts.rechartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object XAxis {
  def apply(
    allowDataOverflow: js.UndefOr[Boolean] = js.undefined,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    allowDuplicatedCategory: js.UndefOr[Boolean] = js.undefined,
    angle: Int | Double = null,
    axisLine: Boolean | js.Object = null,
    dataKey: DataKey = null,
    domain: js.Tuple2[AxisDomain, AxisDomain] = null,
    dx: Int | Double = null,
    dy: Int | Double = null,
    height: Int | Double = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    interval: AxisInterval = null,
    label: String | Double | typingsJapgolly.recharts.mod.Label | LabelProps = null,
    minTickGap: Int | Double = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
    name: String | Double = null,
    onClick: /* repeated */ js.Any => Callback = null,
    onMouseDown: /* repeated */ js.Any => Callback = null,
    onMouseEnter: /* repeated */ js.Any => Callback = null,
    onMouseLeave: /* repeated */ js.Any => Callback = null,
    onMouseMove: /* repeated */ js.Any => Callback = null,
    onMouseOut: /* repeated */ js.Any => Callback = null,
    onMouseOver: /* repeated */ js.Any => Callback = null,
    onMouseUp: /* repeated */ js.Any => Callback = null,
    onTouchCancel: /* repeated */ js.Any => Callback = null,
    onTouchEnd: /* repeated */ js.Any => Callback = null,
    onTouchMove: /* repeated */ js.Any => Callback = null,
    onTouchStart: /* repeated */ js.Any => Callback = null,
    orientation: top | bottom = null,
    padding: XPadding = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    scale: ScaleType | RechartsFunction = null,
    stroke: String = null,
    textAnchor: String = null,
    tick: Boolean | ContentRenderer[_] | js.Object | Element = null,
    tickCount: Int | Double = null,
    tickFormatter: /* value */ js.Any => CallbackTo[js.Any] = null,
    tickLine: Boolean | js.Object = null,
    tickMargin: Int | Double = null,
    tickSize: Int | Double = null,
    ticks: js.Array[_] = null,
    `type`: number | category = null,
    unit: String | Double = null,
    width: Int | Double = null,
    xAxisId: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[XAxisProps, typingsJapgolly.recharts.mod.XAxis, Unit, XAxisProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowDataOverflow)) __obj.updateDynamic("allowDataOverflow")(allowDataOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDuplicatedCategory)) __obj.updateDynamic("allowDuplicatedCategory")(allowDuplicatedCategory.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minTickGap != null) __obj.updateDynamic("minTickGap")(minTickGap.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseUp(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTouchStart(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(js.Any.fromFunction1((t0: /* value */ js.Any) => tickFormatter(t0).runNow()))
    if (tickLine != null) __obj.updateDynamic("tickLine")(tickLine.asInstanceOf[js.Any])
    if (tickMargin != null) __obj.updateDynamic("tickMargin")(tickMargin.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.recharts.mod.XAxisProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.recharts.mod.XAxis](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.recharts.mod.XAxisProps])(children: _*)
  }
  @JSImport("recharts", "XAxis")
  @js.native
  object componentImport extends js.Object
  
}

