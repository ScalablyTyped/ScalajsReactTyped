package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cytoscape.AnonDegree
import typingsJapgolly.cytoscape.AnonMaxDegree
import typingsJapgolly.cytoscape.cytoscapeBooleans.`false`
import typingsJapgolly.cytoscape.cytoscapeNumbers.`10`
import typingsJapgolly.cytoscape.cytoscapeStrings.concentric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/concentric
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.cytoscape.mod.LayoutOptions because Already inherited */ trait ConcentricLayoutOptions extends ShapedLayoutOptions {
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[Boolean] = js.undefined
  // whether levels have an equal radial distance betwen them, may cause bounding box overflow
  var equidistant: `false`
   // min spacing between outside of nodes (used for radius adjustment)
  // height of layout area (overrides container height)
  var height: js.UndefOr[scala.Nothing] = js.undefined
  var minNodeSpacing: `10`
  @JSName("name")
  var name_ConcentricLayoutOptions: concentric
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  @JSName("spacingFactor")
  var spacingFactor_ConcentricLayoutOptions: js.UndefOr[scala.Nothing] = js.undefined
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: Double
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[Double] = js.undefined
  // width of layout area (overrides container width)
  var width: js.UndefOr[scala.Nothing] = js.undefined
  // returns numeric value for each node, placing higher nodes in levels towards the centre
  def concentric(node: AnonDegree): Double
  // the variation of concentric values in each level
  def levelWidth(node: AnonMaxDegree): Double
}

object ConcentricLayoutOptions {
  @scala.inline
  def apply(
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
  ): ConcentricLayoutOptions = {
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
    __obj.asInstanceOf[ConcentricLayoutOptions]
  }
}

