package typingsJapgolly.recharts.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.recharts.AnonWidth
import typingsJapgolly.recharts.PartialMargin
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.IconType
import typingsJapgolly.recharts.mod.LayoutType
import typingsJapgolly.recharts.mod.LegendPayload
import typingsJapgolly.recharts.mod.LegendProps
import typingsJapgolly.recharts.rechartsStrings.bottom
import typingsJapgolly.recharts.rechartsStrings.center
import typingsJapgolly.recharts.rechartsStrings.left
import typingsJapgolly.recharts.rechartsStrings.middle
import typingsJapgolly.recharts.rechartsStrings.right
import typingsJapgolly.recharts.rechartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Legend {
  def apply(
    align: left | center | right = null,
    chartHeight: Int | Double = null,
    chartWidth: Int | Double = null,
    content: Element | ContentRenderer[LegendProps] = null,
    formatter: (/* value */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
    ], /* entry */ js.UndefOr[LegendPayload], /* i */ js.UndefOr[Double]) => CallbackTo[js.Any] = null,
    height: Int | Double = null,
    iconSize: Int | Double = null,
    iconType: IconType = null,
    layout: LayoutType = null,
    margin: PartialMargin = null,
    onBBoxUpdate: /* box */ AnonWidth => Callback = null,
    onClick: /* repeated */ js.Any => Callback = null,
    onMouseEnter: /* repeated */ js.Any => Callback = null,
    onMouseLeave: /* repeated */ js.Any => Callback = null,
    payload: js.Array[LegendPayload] = null,
    verticalAlign: top | middle | bottom = null,
    width: Int | Double = null,
    wrapperStyle: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LegendProps, typingsJapgolly.recharts.mod.Legend, Unit, LegendProps] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (chartHeight != null) __obj.updateDynamic("chartHeight")(chartHeight.asInstanceOf[js.Any])
    if (chartWidth != null) __obj.updateDynamic("chartWidth")(chartWidth.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction3((t0: /* value */ js.UndefOr[
  /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any], t1: /* entry */ js.UndefOr[typingsJapgolly.recharts.mod.LegendPayload], t2: /* i */ js.UndefOr[scala.Double]) => formatter(t0, t1, t2).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onBBoxUpdate != null) __obj.updateDynamic("onBBoxUpdate")(js.Any.fromFunction1((t0: /* box */ typingsJapgolly.recharts.AnonWidth) => onBBoxUpdate(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseLeave(t0).runNow()))
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.recharts.mod.LegendProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.recharts.mod.Legend](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.recharts.mod.LegendProps])(children: _*)
  }
  @JSImport("recharts", "Legend")
  @js.native
  object componentImport extends js.Object
  
}

