package typingsJapgolly.nivoChord.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.nivoChord.mod.ArcData
import typingsJapgolly.nivoChord.mod.ChordProps
import typingsJapgolly.nivoChord.mod.LabelAccessor
import typingsJapgolly.nivoChord.mod.RibbonData
import typingsJapgolly.nivoChord.mod.ValueFormatter
import typingsJapgolly.nivoColors.mod.InheritedColorProp
import typingsJapgolly.nivoColors.mod.OrdinalColorsInstruction
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveChord {
  def apply(
    keys: js.Array[String],
    layers: js.Array[_],
    matrix: js.Array[js.Array[Double]],
    BorderColor: InheritedColorProp[_] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    arcBorderColor: InheritedColorProp[_] = null,
    arcBorderWidth: Int | Double = null,
    arcHoverOpacity: Int | Double = null,
    arcHoverOthersOpacity: Int | Double = null,
    arcOpacity: Int | Double = null,
    arcTooltip: js.Any = null,
    colors: OrdinalColorsInstruction[_] = null,
    enableLabel: js.UndefOr[Boolean] = js.undefined,
    innerRadiusOffset: Int | Double = null,
    innerRadiusRatio: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    label: String | LabelAccessor = null,
    labelOffset: Int | Double = null,
    labelRotation: Int | Double = null,
    labelTextColor: InheritedColorProp[_] = null,
    margin: Box = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    onArcClick: (/* arc */ ArcData, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onArcMouseEnter: (/* arc */ ArcData, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onArcMouseLeave: (/* arc */ ArcData, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onArcMouseMove: (/* arc */ ArcData, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onRibbonClick: (/* ribbon */ RibbonData, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onRibbonMouseEnter: (/* ribbon */ RibbonData, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onRibbonMouseLeave: (/* ribbon */ RibbonData, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onRibbonMouseMove: (/* ribbon */ RibbonData, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    padAngle: Int | Double = null,
    ribbonBorderWidth: Int | Double = null,
    ribbonHoverOpacity: Int | Double = null,
    ribbonHoverOthersOpacity: Int | Double = null,
    ribbonOpacity: Int | Double = null,
    ribbonTooltip: js.Any = null,
    theme: Theme = null,
    valueFormat: String | ValueFormatter = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ChordProps, typingsJapgolly.nivoChord.mod.ResponsiveChord, Unit, ChordProps] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
  
      if (BorderColor != null) __obj.updateDynamic("BorderColor")(BorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (arcBorderColor != null) __obj.updateDynamic("arcBorderColor")(arcBorderColor.asInstanceOf[js.Any])
    if (arcBorderWidth != null) __obj.updateDynamic("arcBorderWidth")(arcBorderWidth.asInstanceOf[js.Any])
    if (arcHoverOpacity != null) __obj.updateDynamic("arcHoverOpacity")(arcHoverOpacity.asInstanceOf[js.Any])
    if (arcHoverOthersOpacity != null) __obj.updateDynamic("arcHoverOthersOpacity")(arcHoverOthersOpacity.asInstanceOf[js.Any])
    if (arcOpacity != null) __obj.updateDynamic("arcOpacity")(arcOpacity.asInstanceOf[js.Any])
    if (arcTooltip != null) __obj.updateDynamic("arcTooltip")(arcTooltip.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabel)) __obj.updateDynamic("enableLabel")(enableLabel.asInstanceOf[js.Any])
    if (innerRadiusOffset != null) __obj.updateDynamic("innerRadiusOffset")(innerRadiusOffset.asInstanceOf[js.Any])
    if (innerRadiusRatio != null) __obj.updateDynamic("innerRadiusRatio")(innerRadiusRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (labelRotation != null) __obj.updateDynamic("labelRotation")(labelRotation.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (onArcClick != null) __obj.updateDynamic("onArcClick")(js.Any.fromFunction2((t0: /* arc */ typingsJapgolly.nivoChord.mod.ArcData, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onArcClick(t0, t1).runNow()))
    if (onArcMouseEnter != null) __obj.updateDynamic("onArcMouseEnter")(js.Any.fromFunction2((t0: /* arc */ typingsJapgolly.nivoChord.mod.ArcData, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onArcMouseEnter(t0, t1).runNow()))
    if (onArcMouseLeave != null) __obj.updateDynamic("onArcMouseLeave")(js.Any.fromFunction2((t0: /* arc */ typingsJapgolly.nivoChord.mod.ArcData, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onArcMouseLeave(t0, t1).runNow()))
    if (onArcMouseMove != null) __obj.updateDynamic("onArcMouseMove")(js.Any.fromFunction2((t0: /* arc */ typingsJapgolly.nivoChord.mod.ArcData, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onArcMouseMove(t0, t1).runNow()))
    if (onRibbonClick != null) __obj.updateDynamic("onRibbonClick")(js.Any.fromFunction2((t0: /* ribbon */ typingsJapgolly.nivoChord.mod.RibbonData, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onRibbonClick(t0, t1).runNow()))
    if (onRibbonMouseEnter != null) __obj.updateDynamic("onRibbonMouseEnter")(js.Any.fromFunction2((t0: /* ribbon */ typingsJapgolly.nivoChord.mod.RibbonData, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onRibbonMouseEnter(t0, t1).runNow()))
    if (onRibbonMouseLeave != null) __obj.updateDynamic("onRibbonMouseLeave")(js.Any.fromFunction2((t0: /* ribbon */ typingsJapgolly.nivoChord.mod.RibbonData, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onRibbonMouseLeave(t0, t1).runNow()))
    if (onRibbonMouseMove != null) __obj.updateDynamic("onRibbonMouseMove")(js.Any.fromFunction2((t0: /* ribbon */ typingsJapgolly.nivoChord.mod.RibbonData, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onRibbonMouseMove(t0, t1).runNow()))
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (ribbonBorderWidth != null) __obj.updateDynamic("ribbonBorderWidth")(ribbonBorderWidth.asInstanceOf[js.Any])
    if (ribbonHoverOpacity != null) __obj.updateDynamic("ribbonHoverOpacity")(ribbonHoverOpacity.asInstanceOf[js.Any])
    if (ribbonHoverOthersOpacity != null) __obj.updateDynamic("ribbonHoverOthersOpacity")(ribbonHoverOthersOpacity.asInstanceOf[js.Any])
    if (ribbonOpacity != null) __obj.updateDynamic("ribbonOpacity")(ribbonOpacity.asInstanceOf[js.Any])
    if (ribbonTooltip != null) __obj.updateDynamic("ribbonTooltip")(ribbonTooltip.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoChord.mod.ChordProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoChord.mod.ResponsiveChord](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoChord.mod.ChordProps])(children: _*)
  }
  @JSImport("@nivo/chord", "ResponsiveChord")
  @js.native
  object componentImport extends js.Object
  
}

