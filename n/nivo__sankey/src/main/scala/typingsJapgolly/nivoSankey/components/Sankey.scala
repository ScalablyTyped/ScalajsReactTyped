package typingsJapgolly.nivoSankey.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.nivoColors.mod.InheritedColorProp
import typingsJapgolly.nivoColors.mod.OrdinalColorsInstruction
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoLegends.mod.LegendProps
import typingsJapgolly.nivoSankey.AnonLinks
import typingsJapgolly.nivoSankey.mod.AccessorFunc
import typingsJapgolly.nivoSankey.mod.Data
import typingsJapgolly.nivoSankey.mod.Dimensions
import typingsJapgolly.nivoSankey.mod.LabelFormatter
import typingsJapgolly.nivoSankey.mod.SankeyLinkDatum
import typingsJapgolly.nivoSankey.mod.SankeyLinkProps
import typingsJapgolly.nivoSankey.mod.SankeyNodeDatum
import typingsJapgolly.nivoSankey.mod.SankeyNodeProps
import typingsJapgolly.nivoSankey.mod.SankeyProps
import typingsJapgolly.nivoSankey.mod.SankeySortFunction
import typingsJapgolly.nivoSankey.nivoSankeyStrings.ascending
import typingsJapgolly.nivoSankey.nivoSankeyStrings.auto
import typingsJapgolly.nivoSankey.nivoSankeyStrings.center
import typingsJapgolly.nivoSankey.nivoSankeyStrings.descending
import typingsJapgolly.nivoSankey.nivoSankeyStrings.end
import typingsJapgolly.nivoSankey.nivoSankeyStrings.horizontal
import typingsJapgolly.nivoSankey.nivoSankeyStrings.input
import typingsJapgolly.nivoSankey.nivoSankeyStrings.inside
import typingsJapgolly.nivoSankey.nivoSankeyStrings.justify
import typingsJapgolly.nivoSankey.nivoSankeyStrings.outside
import typingsJapgolly.nivoSankey.nivoSankeyStrings.start
import typingsJapgolly.nivoSankey.nivoSankeyStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sankey {
  def apply(
    data: AnonLinks,
    height: Double,
    width: Double,
    align: center | justify | start | end = null,
    colors: OrdinalColorsInstruction[_] = null,
    enableLabels: js.UndefOr[Boolean] = js.undefined,
    enableLinkGradient: js.UndefOr[Boolean] = js.undefined,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    label: String | AccessorFunc = null,
    labelFormat: String | LabelFormatter = null,
    labelOrientation: horizontal | vertical = null,
    labelPadding: Int | Double = null,
    labelPosition: inside | outside = null,
    labelTextColor: InheritedColorProp[SankeyNodeDatum] = null,
    legends: js.Array[LegendProps] = null,
    linkBlendMode: CssMixBlendMode = null,
    linkContract: Int | Double = null,
    linkHoverOpacity: Int | Double = null,
    linkHoverOthersOpacity: Int | Double = null,
    linkOpacity: Int | Double = null,
    linkTooltip: SankeyLinkProps => CallbackTo[Node] = null,
    margin: Box = null,
    nodeBorderColor: InheritedColorProp[SankeyNodeDatum] = null,
    nodeBorderWidth: Int | Double = null,
    nodeHoverOpacity: Int | Double = null,
    nodeHoverOthersOpacity: Int | Double = null,
    nodeInnerPadding: Int | Double = null,
    nodeOpacity: Int | Double = null,
    nodeSpacing: Int | Double = null,
    nodeThickness: Int | Double = null,
    nodeTooltip: SankeyNodeProps => CallbackTo[Node] = null,
    onClick: (/* data */ SankeyNodeDatum | SankeyLinkDatum, /* event */ ReactMouseEventFrom[Element]) => Callback = null,
    sort: auto | input | ascending | descending | SankeySortFunction = null,
    theme: Theme = null,
    tooltipFormat: /* value */ Double => CallbackTo[Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    Data with SankeyProps with Dimensions, 
    typingsJapgolly.nivoSankey.mod.Sankey, 
    Unit, 
    Data with SankeyProps with Dimensions
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabels)) __obj.updateDynamic("enableLabels")(enableLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLinkGradient)) __obj.updateDynamic("enableLinkGradient")(enableLinkGradient.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (labelOrientation != null) __obj.updateDynamic("labelOrientation")(labelOrientation.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (linkBlendMode != null) __obj.updateDynamic("linkBlendMode")(linkBlendMode.asInstanceOf[js.Any])
    if (linkContract != null) __obj.updateDynamic("linkContract")(linkContract.asInstanceOf[js.Any])
    if (linkHoverOpacity != null) __obj.updateDynamic("linkHoverOpacity")(linkHoverOpacity.asInstanceOf[js.Any])
    if (linkHoverOthersOpacity != null) __obj.updateDynamic("linkHoverOthersOpacity")(linkHoverOthersOpacity.asInstanceOf[js.Any])
    if (linkOpacity != null) __obj.updateDynamic("linkOpacity")(linkOpacity.asInstanceOf[js.Any])
    if (linkTooltip != null) __obj.updateDynamic("linkTooltip")(js.Any.fromFunction1((t0: typingsJapgolly.nivoSankey.mod.SankeyLinkProps) => linkTooltip(t0).runNow()))
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (nodeBorderColor != null) __obj.updateDynamic("nodeBorderColor")(nodeBorderColor.asInstanceOf[js.Any])
    if (nodeBorderWidth != null) __obj.updateDynamic("nodeBorderWidth")(nodeBorderWidth.asInstanceOf[js.Any])
    if (nodeHoverOpacity != null) __obj.updateDynamic("nodeHoverOpacity")(nodeHoverOpacity.asInstanceOf[js.Any])
    if (nodeHoverOthersOpacity != null) __obj.updateDynamic("nodeHoverOthersOpacity")(nodeHoverOthersOpacity.asInstanceOf[js.Any])
    if (nodeInnerPadding != null) __obj.updateDynamic("nodeInnerPadding")(nodeInnerPadding.asInstanceOf[js.Any])
    if (nodeOpacity != null) __obj.updateDynamic("nodeOpacity")(nodeOpacity.asInstanceOf[js.Any])
    if (nodeSpacing != null) __obj.updateDynamic("nodeSpacing")(nodeSpacing.asInstanceOf[js.Any])
    if (nodeThickness != null) __obj.updateDynamic("nodeThickness")(nodeThickness.asInstanceOf[js.Any])
    if (nodeTooltip != null) __obj.updateDynamic("nodeTooltip")(js.Any.fromFunction1((t0: typingsJapgolly.nivoSankey.mod.SankeyNodeProps) => nodeTooltip(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.nivoSankey.mod.SankeyNodeDatum | typingsJapgolly.nivoSankey.mod.SankeyLinkDatum, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0, t1).runNow()))
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(js.Any.fromFunction1((t0: /* value */ scala.Double) => tooltipFormat(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoSankey.mod.Data with typingsJapgolly.nivoSankey.mod.SankeyProps with typingsJapgolly.nivoSankey.mod.Dimensions, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoSankey.mod.Sankey](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoSankey.mod.Data with typingsJapgolly.nivoSankey.mod.SankeyProps with typingsJapgolly.nivoSankey.mod.Dimensions])(children: _*)
  }
  @JSImport("@nivo/sankey", "Sankey")
  @js.native
  object componentImport extends js.Object
  
}

