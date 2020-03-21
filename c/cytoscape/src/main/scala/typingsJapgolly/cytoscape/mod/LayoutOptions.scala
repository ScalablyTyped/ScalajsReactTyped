package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cytoscape.AnonCol
import typingsJapgolly.cytoscape.AnonDegree
import typingsJapgolly.cytoscape.AnonMaxDegree
import typingsJapgolly.cytoscape.cytoscapeBooleans.`false`
import typingsJapgolly.cytoscape.cytoscapeNumbers.`10`
import typingsJapgolly.cytoscape.cytoscapeStrings.`null`
import typingsJapgolly.cytoscape.cytoscapeStrings.breadthfirst
import typingsJapgolly.cytoscape.cytoscapeStrings.circle
import typingsJapgolly.cytoscape.cytoscapeStrings.concentric
import typingsJapgolly.cytoscape.cytoscapeStrings.cose
import typingsJapgolly.cytoscape.cytoscapeStrings.grid
import typingsJapgolly.cytoscape.cytoscapeStrings.preset
import typingsJapgolly.cytoscape.cytoscapeStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cytoscape.mod.NullLayoutOptions
  - typingsJapgolly.cytoscape.mod.RandomLayoutOptions
  - typingsJapgolly.cytoscape.mod.PresetLayoutOptions
  - typingsJapgolly.cytoscape.mod.GridLayoutOptions
  - typingsJapgolly.cytoscape.mod.CircleLayoutOptions
  - typingsJapgolly.cytoscape.mod.ConcentricLayoutOptions
  - typingsJapgolly.cytoscape.mod.BreadthFirstLayoutOptions
  - typingsJapgolly.cytoscape.mod.CoseLayoutOptions
  - typingsJapgolly.cytoscape.mod.BaseLayoutOptions
*/
trait LayoutOptions extends js.Object

object LayoutOptions {
  @scala.inline
  def BreadthFirstLayoutOptions(
    circle: Boolean,
    directed: Boolean,
    fit: Boolean,
    maximalAdjustments: Double,
    name: breadthfirst,
    nodeDimensionsIncludeLabels: Boolean,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Callback = null,
    roots: String = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => CallbackTo[Double] = null,
    spacingFactor: Int | Double = null,
    stop: /* e */ LayoutEventObject => Callback = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], directed = directed.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], maximalAdjustments = maximalAdjustments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => ready(t0).runNow()))
    if (roots != null) __obj.updateDynamic("roots")(roots.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* a */ typingsJapgolly.cytoscape.mod.SortableNode, t1: /* b */ typingsJapgolly.cytoscape.mod.SortableNode) => sort(t0, t1).runNow()))
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => stop(t0).runNow()))
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def CircleLayoutOptions(
    fit: Boolean,
    name: circle,
    nodeDimensionsIncludeLabels: Boolean,
    startAngle: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    clockwise: js.UndefOr[Boolean] = js.undefined,
    padding: Int | Double = null,
    radius: Int | Double = null,
    ready: /* e */ LayoutEventObject => Callback = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => CallbackTo[Double] = null,
    spacingFactor: Int | Double = null,
    stop: /* e */ LayoutEventObject => Callback = null,
    sweep: Int | Double = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => ready(t0).runNow()))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* a */ typingsJapgolly.cytoscape.mod.SortableNode, t1: /* b */ typingsJapgolly.cytoscape.mod.SortableNode) => sort(t0, t1).runNow()))
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => stop(t0).runNow()))
    if (sweep != null) __obj.updateDynamic("sweep")(sweep.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def GridLayoutOptions(
    condense: Boolean,
    fit: Boolean,
    name: grid,
    nodeDimensionsIncludeLabels: Boolean,
    position: NodeSingular => CallbackTo[AnonCol],
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    avoidOverlapPadding: Int | Double = null,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    cols: Int | Double = null,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Callback = null,
    rows: Int | Double = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => CallbackTo[Double] = null,
    spacingFactor: Int | Double = null,
    stop: /* e */ LayoutEventObject => Callback = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(condense = condense.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    __obj.updateDynamic("position")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.NodeSingular) => position(t0).runNow()))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.asInstanceOf[js.Any])
    if (avoidOverlapPadding != null) __obj.updateDynamic("avoidOverlapPadding")(avoidOverlapPadding.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => ready(t0).runNow()))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* a */ typingsJapgolly.cytoscape.mod.SortableNode, t1: /* b */ typingsJapgolly.cytoscape.mod.SortableNode) => sort(t0, t1).runNow()))
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => stop(t0).runNow()))
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def BaseLayoutOptions(
    name: String,
    ready: /* e */ LayoutEventObject => Callback = null,
    stop: /* e */ LayoutEventObject => Callback = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => ready(t0).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => stop(t0).runNow()))
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def PresetLayoutOptions(
    name: preset,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    fit: js.UndefOr[Boolean] = js.undefined,
    padding: Int | Double = null,
    pan: Int | Double = null,
    positions: NodePositionMap | NodePositionFunction = null,
    ready: /* e */ LayoutEventObject => Callback = null,
    stop: /* e */ LayoutEventObject => Callback = null,
    zoom: Int | Double = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => ready(t0).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => stop(t0).runNow()))
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def RandomLayoutOptions(
    fit: Boolean,
    name: random,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Callback = null,
    stop: /* e */ LayoutEventObject => Callback = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => ready(t0).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => stop(t0).runNow()))
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def CoseLayoutOptions(
    componentSpacing: Double,
    coolingFactor: Double,
    edgeElasticity: js.Any => CallbackTo[Double],
    fit: Boolean,
    gravity: Double,
    idealEdgeLength: js.Any => CallbackTo[Double],
    initialTemp: Double,
    minTemp: Double,
    name: cose,
    nestingFactor: Double,
    nodeDimensionsIncludeLabels: Boolean,
    nodeOverlap: Double,
    nodeRepulsion: js.Any => CallbackTo[Double],
    numIter: Double,
    randomize: Boolean,
    refresh: Double,
    weaver: Boolean,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Callback = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => CallbackTo[Double] = null,
    spacingFactor: Int | Double = null,
    stop: /* e */ LayoutEventObject => Callback = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(componentSpacing = componentSpacing.asInstanceOf[js.Any], coolingFactor = coolingFactor.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], initialTemp = initialTemp.asInstanceOf[js.Any], minTemp = minTemp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nestingFactor = nestingFactor.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], nodeOverlap = nodeOverlap.asInstanceOf[js.Any], numIter = numIter.asInstanceOf[js.Any], randomize = randomize.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], weaver = weaver.asInstanceOf[js.Any])
    __obj.updateDynamic("edgeElasticity")(js.Any.fromFunction1((t0: js.Any) => edgeElasticity(t0).runNow()))
    __obj.updateDynamic("idealEdgeLength")(js.Any.fromFunction1((t0: js.Any) => idealEdgeLength(t0).runNow()))
    __obj.updateDynamic("nodeRepulsion")(js.Any.fromFunction1((t0: js.Any) => nodeRepulsion(t0).runNow()))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => ready(t0).runNow()))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* a */ typingsJapgolly.cytoscape.mod.SortableNode, t1: /* b */ typingsJapgolly.cytoscape.mod.SortableNode) => sort(t0, t1).runNow()))
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => stop(t0).runNow()))
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def NullLayoutOptions(name: `null`): LayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def ConcentricLayoutOptions(
    concentric: AnonDegree => CallbackTo[Double],
    equidistant: `false`,
    fit: Boolean,
    levelWidth: AnonMaxDegree => CallbackTo[Double],
    minNodeSpacing: `10`,
    name: concentric,
    nodeDimensionsIncludeLabels: Boolean,
    startAngle: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    clockwise: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[scala.Nothing] = js.undefined,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Callback = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => CallbackTo[Double] = null,
    spacingFactor: js.UndefOr[scala.Nothing] = js.undefined,
    stop: /* e */ LayoutEventObject => Callback = null,
    sweep: Int | Double = null,
    width: js.UndefOr[scala.Nothing] = js.undefined
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(equidistant = equidistant.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], minNodeSpacing = minNodeSpacing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.updateDynamic("concentric")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.AnonDegree) => concentric(t0).runNow()))
    __obj.updateDynamic("levelWidth")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.AnonMaxDegree) => levelWidth(t0).runNow()))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => ready(t0).runNow()))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* a */ typingsJapgolly.cytoscape.mod.SortableNode, t1: /* b */ typingsJapgolly.cytoscape.mod.SortableNode) => sort(t0, t1).runNow()))
    if (!js.isUndefined(spacingFactor)) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => stop(t0).runNow()))
    if (sweep != null) __obj.updateDynamic("sweep")(sweep.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
}

