package typingsJapgolly.nivoWaffle.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.nivoColors.mod.InheritedColorProp
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Colors
import typingsJapgolly.nivoCore.mod.Dimensions
import typingsJapgolly.nivoCore.mod.GetColor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoWaffle.mod.ValueFormatter
import typingsJapgolly.nivoWaffle.mod.WaffleDatum
import typingsJapgolly.nivoWaffle.mod.WaffleFillDirection
import typingsJapgolly.nivoWaffle.mod.WaffleHtmlProps
import typingsJapgolly.nivoWaffle.mod.WaffleTooltipData
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WaffleHtml {
  def apply(
    columns: Double,
    data: js.Array[js.Object],
    height: Double,
    rows: Double,
    total: Double,
    width: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    borderColor: InheritedColorProp[WaffleDatum] = null,
    borderWidth: Int | Double = null,
    colorBy: String | GetColor[WaffleDatum] = null,
    colors: Colors = null,
    emptyColor: String = null,
    emptyOpacity: Int | Double = null,
    enableLabels: js.UndefOr[Boolean] = js.undefined,
    fillDirection: WaffleFillDirection = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    margin: Box = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    onClick: (/* datum */ WaffleDatum, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback = null,
    padding: Int | Double = null,
    theme: Theme = null,
    tooltip: StatelessComponent[WaffleTooltipData] = null,
    tooltipFormat: String | ValueFormatter = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    WaffleHtmlProps with Dimensions, 
    typingsJapgolly.nivoWaffle.mod.WaffleHtml, 
    Unit, 
    WaffleHtmlProps with Dimensions
  ] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colorBy != null) __obj.updateDynamic("colorBy")(colorBy.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (emptyColor != null) __obj.updateDynamic("emptyColor")(emptyColor.asInstanceOf[js.Any])
    if (emptyOpacity != null) __obj.updateDynamic("emptyOpacity")(emptyOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabels)) __obj.updateDynamic("enableLabels")(enableLabels.asInstanceOf[js.Any])
    if (fillDirection != null) __obj.updateDynamic("fillDirection")(fillDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* datum */ typingsJapgolly.nivoWaffle.mod.WaffleDatum, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLCanvasElement]) => onClick(t0, t1).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoWaffle.mod.WaffleHtmlProps with typingsJapgolly.nivoCore.mod.Dimensions, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoWaffle.mod.WaffleHtml](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoWaffle.mod.WaffleHtmlProps with typingsJapgolly.nivoCore.mod.Dimensions])(children: _*)
  }
  @JSImport("@nivo/waffle", "WaffleHtml")
  @js.native
  object componentImport extends js.Object
  
}

