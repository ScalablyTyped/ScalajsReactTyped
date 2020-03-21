package typingsJapgolly.nivoScatterplot.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.nivoAxes.mod.AxisProps
import typingsJapgolly.nivoColors.mod.OrdinalColorsInstruction
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CartesianMarkerProps
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoCore.mod.MotionProps
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoLegends.mod.LegendProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterPlotSvgProps
  extends ScatterPlotProps
     with MotionProps {
  var layers: js.UndefOr[js.Array[CustomLayerId | CustomSvgLayer]] = js.undefined
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.undefined
  var renderNode: js.UndefOr[NodeComponent] = js.undefined
}

object ScatterPlotSvgProps {
  @scala.inline
  def apply(
    data: js.Array[Serie],
    animate: js.UndefOr[Boolean] = js.undefined,
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
    layers: js.Array[CustomLayerId | CustomSvgLayer] = null,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    nodeSize: Double | DerivedDatumProp[Double] | DynamicSizeSpec = null,
    onClick: (/* node */ Node, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseEnter: (/* node */ Node, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseLeave: (/* node */ Node, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseMove: (/* node */ Node, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    renderNode: /* props */ NodeProps => CallbackTo[japgolly.scalajs.react.raw.React.Node] = null,
    theme: Theme = null,
    tooltip: /* hasNode */ js.Any => CallbackTo[japgolly.scalajs.react.raw.React.Node] = null,
    useMesh: js.UndefOr[Boolean] = js.undefined,
    xFormat: String | ValueFormatter = null,
    xScale: /* value */ Value => CallbackTo[Double] = null,
    yFormat: String | ValueFormatter = null,
    yScale: /* value */ Value => CallbackTo[Double] = null
  ): ScatterPlotSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
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
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.nivoScatterplot.mod.Node, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onClick(t0, t1).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.nivoScatterplot.mod.Node, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseEnter(t0, t1).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.nivoScatterplot.mod.Node, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseLeave(t0, t1).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.nivoScatterplot.mod.Node, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseMove(t0, t1).runNow()))
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.nivoScatterplot.mod.NodeProps) => renderNode(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction1((t0: /* hasNode */ js.Any) => tooltip(t0).runNow()))
    if (!js.isUndefined(useMesh)) __obj.updateDynamic("useMesh")(useMesh.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.nivoScatterplot.mod.Value) => xScale(t0).runNow()))
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.nivoScatterplot.mod.Value) => yScale(t0).runNow()))
    __obj.asInstanceOf[ScatterPlotSvgProps]
  }
}

