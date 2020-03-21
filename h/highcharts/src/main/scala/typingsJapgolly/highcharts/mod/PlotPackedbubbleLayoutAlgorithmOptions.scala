package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.highchartsStrings.`reingold-fruchterman`
import typingsJapgolly.highcharts.highchartsStrings.circle
import typingsJapgolly.highcharts.highchartsStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubbleLayoutAlgorithmOptions extends js.Object {
  /**
    * (Highcharts) The distance between two bubbles, when the algorithm starts
    * to treat two bubbles as overlapping. The `bubblePadding` is also the
    * expected distance between all the bubbles on simulation end.
    */
  var bubblePadding: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) In case of split series, this option allows user to drag and
    * drop points between series, for changing point related series.
    */
  var dragBetweenSeries: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Experimental. Enables live simulation of the algorithm
    * implementation. All nodes are animated as the forces applies on them.
    */
  var enableSimulation: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Friction applied on forces to prevent nodes rushing to fast
    * to the desired positions.
    */
  var friction: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Gravitational const used in the barycenter force of the
    * algorithm.
    */
  var gravitationalConstant: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) When `initialPositions` are set to 'circle',
    * `initialPositionRadius` is a distance from the center of circle, in which
    * nodes are created.
    */
  var initialPositionRadius: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
    * of the built-in options ("circle", "random") or a function where
    * positions should be set on each node (`this.nodes`) as `node.plotX` and
    * `node.plotY`.
    */
  var initialPositions: js.UndefOr[circle | random | js.Function] = js.undefined
  /**
    * (Highcharts) Integration type. Available options are `'euler'` and
    * `'verlet'`. Integration determines how forces are applied on particles.
    * In Euler integration, force is applied direct as `newPosition +=
    * velocity;`. In Verlet integration, new position is based on a previous
    * posittion without velocity: `newPosition += previousPosition -
    * newPosition`.
    *
    * Note that different integrations give different results as forces are
    * different.
    *
    * In Highcharts v7.0.x only `'euler'` integration was supported.
    */
  var integration: js.UndefOr[OptionsIntegrationValue] = js.undefined
  /**
    * (Highcharts) Ideal length (px) of the link between two nodes. When not
    * defined, length is calculated as: `Math.pow(availableWidth *
    * availableHeight / nodesLength, 0.4);`
    *
    * Note: Because of the algorithm specification, length of each link might
    * be not exactly as specified.
    */
  var linkLength: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Max number of iterations before algorithm will stop. In
    * general, algorithm should find positions sooner, but when rendering huge
    * number of nodes, it is recommended to increase this value as finding
    * perfect graph positions can require more time.
    */
  var maxIterations: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Max speed that node can get in one iteration. In terms of
    * simulation, it's a maximum translation (in pixels) that a node can move
    * (in both, x and y, dimensions). While `friction` is applied on all nodes,
    * max speed is applied only for nodes that move very fast, for example
    * small or disconnected ones.
    */
  var maxSpeed: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Whether bubbles should interact with their parentNode to
    * keep them inside.
    */
  var parentNodeLimit: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Layout algorithm options for parent nodes.
    */
  var parentNodeOptions: js.UndefOr[PlotPackedbubbleLayoutAlgorithmParentNodeOptions] = js.undefined
  /**
    * (Highcharts) Whether series should interact with each other or not. When
    * `parentNodeLimit` is set to true, thi option should be set to false to
    * avoid sticking points in wrong series parentNode.
    */
  var seriesInteraction: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Whether to split series into individual groups or to mix all
    * series together.
    */
  var splitSeries: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Type of the algorithm used when positioning nodes.
    */
  var `type`: js.UndefOr[`reingold-fruchterman`] = js.undefined
}

object PlotPackedbubbleLayoutAlgorithmOptions {
  @scala.inline
  def apply(
    bubblePadding: Int | Double = null,
    dragBetweenSeries: js.UndefOr[Boolean] = js.undefined,
    enableSimulation: js.UndefOr[Boolean] = js.undefined,
    friction: Int | Double = null,
    gravitationalConstant: Int | Double = null,
    initialPositionRadius: Int | Double = null,
    initialPositions: circle | random | js.Function = null,
    integration: OptionsIntegrationValue = null,
    linkLength: Int | Double = null,
    maxIterations: Int | Double = null,
    maxSpeed: Int | Double = null,
    parentNodeLimit: js.UndefOr[Boolean] = js.undefined,
    parentNodeOptions: PlotPackedbubbleLayoutAlgorithmParentNodeOptions = null,
    seriesInteraction: js.UndefOr[Boolean] = js.undefined,
    splitSeries: String = null,
    `type`: `reingold-fruchterman` = null
  ): PlotPackedbubbleLayoutAlgorithmOptions = {
    val __obj = js.Dynamic.literal()
    if (bubblePadding != null) __obj.updateDynamic("bubblePadding")(bubblePadding.asInstanceOf[js.Any])
    if (!js.isUndefined(dragBetweenSeries)) __obj.updateDynamic("dragBetweenSeries")(dragBetweenSeries.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSimulation)) __obj.updateDynamic("enableSimulation")(enableSimulation.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (gravitationalConstant != null) __obj.updateDynamic("gravitationalConstant")(gravitationalConstant.asInstanceOf[js.Any])
    if (initialPositionRadius != null) __obj.updateDynamic("initialPositionRadius")(initialPositionRadius.asInstanceOf[js.Any])
    if (initialPositions != null) __obj.updateDynamic("initialPositions")(initialPositions.asInstanceOf[js.Any])
    if (integration != null) __obj.updateDynamic("integration")(integration.asInstanceOf[js.Any])
    if (linkLength != null) __obj.updateDynamic("linkLength")(linkLength.asInstanceOf[js.Any])
    if (maxIterations != null) __obj.updateDynamic("maxIterations")(maxIterations.asInstanceOf[js.Any])
    if (maxSpeed != null) __obj.updateDynamic("maxSpeed")(maxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(parentNodeLimit)) __obj.updateDynamic("parentNodeLimit")(parentNodeLimit.asInstanceOf[js.Any])
    if (parentNodeOptions != null) __obj.updateDynamic("parentNodeOptions")(parentNodeOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(seriesInteraction)) __obj.updateDynamic("seriesInteraction")(seriesInteraction.asInstanceOf[js.Any])
    if (splitSeries != null) __obj.updateDynamic("splitSeries")(splitSeries.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPackedbubbleLayoutAlgorithmOptions]
  }
}

