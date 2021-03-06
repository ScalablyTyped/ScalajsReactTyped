package typingsJapgolly.nivoScatterplot.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.Element
import typingsJapgolly.nivoAxes.mod.AxisProps
import typingsJapgolly.nivoColors.mod.OrdinalColorsInstruction
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoLegends.mod.LegendProps
import typingsJapgolly.nivoScatterplot.mod.CustomCanvasLayer
import typingsJapgolly.nivoScatterplot.mod.CustomLayerId
import typingsJapgolly.nivoScatterplot.mod.DerivedDatumProp
import typingsJapgolly.nivoScatterplot.mod.DynamicSizeSpec
import typingsJapgolly.nivoScatterplot.mod.Node
import typingsJapgolly.nivoScatterplot.mod.NodeProps
import typingsJapgolly.nivoScatterplot.mod.ScatterPlotCanvasProps
import typingsJapgolly.nivoScatterplot.mod.Serie
import typingsJapgolly.nivoScatterplot.mod.Value
import typingsJapgolly.nivoScatterplot.mod.ValueFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveScatterPlotCanvas {
  def apply(
    data: js.Array[Serie],
    axisBottom: AxisProps = null,
    axisLeft: AxisProps = null,
    axisRight: AxisProps = null,
    axisTop: AxisProps = null,
    blendMode: CssMixBlendMode = null,
    colors: OrdinalColorsInstruction[_] = null,
    debugMesh: js.UndefOr[Boolean] = js.undefined,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[CustomLayerId | CustomCanvasLayer] = null,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    nodeSize: Double | DerivedDatumProp[Double] | DynamicSizeSpec = null,
    onClick: (/* node */ Node, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseEnter: (/* node */ Node, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseLeave: (/* node */ Node, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseMove: (/* node */ Node, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    pixelRatio: Int | Double = null,
    renderNode: (/* ctx */ CanvasRenderingContext2D, /* props */ NodeProps) => Callback = null,
    theme: Theme = null,
    tooltip: /* hasNode */ js.Any => CallbackTo[japgolly.scalajs.react.raw.React.Node] = null,
    useMesh: js.UndefOr[Boolean] = js.undefined,
    xFormat: String | ValueFormatter = null,
    xScale: /* value */ Value => CallbackTo[Double] = null,
    yFormat: String | ValueFormatter = null,
    yScale: /* value */ Value => CallbackTo[Double] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ScatterPlotCanvasProps, 
    typingsJapgolly.nivoScatterplot.mod.ResponsiveScatterPlotCanvas, 
    Unit, 
    ScatterPlotCanvasProps
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.nivoScatterplot.mod.Node, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onClick(t0, t1).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.nivoScatterplot.mod.Node, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseEnter(t0, t1).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.nivoScatterplot.mod.Node, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseLeave(t0, t1).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.nivoScatterplot.mod.Node, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseMove(t0, t1).runNow()))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction2((t0: /* ctx */ org.scalajs.dom.raw.CanvasRenderingContext2D, t1: /* props */ typingsJapgolly.nivoScatterplot.mod.NodeProps) => renderNode(t0, t1).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction1((t0: /* hasNode */ js.Any) => tooltip(t0).runNow()))
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.nivoScatterplot.mod.Value) => xScale(t0).runNow()))
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.nivoScatterplot.mod.Value) => yScale(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoScatterplot.mod.ScatterPlotCanvasProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoScatterplot.mod.ResponsiveScatterPlotCanvas](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoScatterplot.mod.ScatterPlotCanvasProps])(children: _*)
  }
  @JSImport("@nivo/scatterplot", "ResponsiveScatterPlotCanvas")
  @js.native
  object componentImport extends js.Object
  
}

