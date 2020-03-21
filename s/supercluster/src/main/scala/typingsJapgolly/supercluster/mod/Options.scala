package typingsJapgolly.supercluster.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[P, C] extends js.Object {
  /**
    * (Tiles) Tile extent. Radius is calculated relative to this value.
    *
    * @default 512
    */
  var extent: js.UndefOr[Double] = js.undefined
  /**
    * Whether timing info should be logged.
    *
    * @default false
    */
  var log: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that returns cluster properties corresponding to a single point.
    *
    * @example
    * (props) => ({sum: props.myValue})
    */
  var map: js.UndefOr[js.Function1[/* props */ P, C]] = js.undefined
  /**
    * Maximum zoom level at which clusters are generated.
    *
    * @default 16
    */
  var maxZoom: js.UndefOr[Double] = js.undefined
  /**
    * Minimum zoom level at which clusters are generated.
    *
    * @default 0
    */
  var minZoom: js.UndefOr[Double] = js.undefined
  /**
    * Size of the KD-tree leaf node. Affects performance.
    *
    * @default 64
    */
  var nodeSize: js.UndefOr[Double] = js.undefined
  /**
    * Cluster radius, in pixels.
    *
    * @default 40
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * A reduce function that merges properties of two clusters into one.
    *
    * @example
    * (accumulated, props) => { accumulated.sum += props.sum; }
    */
  var reduce: js.UndefOr[js.Function2[/* accumulated */ C, /* props */ C, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply[P, C](
    extent: Int | Double = null,
    log: js.UndefOr[Boolean] = js.undefined,
    map: /* props */ P => CallbackTo[C] = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    nodeSize: Int | Double = null,
    radius: Int | Double = null,
    reduce: (/* accumulated */ C, /* props */ C) => Callback = null
  ): Options[P, C] = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1((t0: /* props */ P) => map(t0).runNow()))
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (reduce != null) __obj.updateDynamic("reduce")(js.Any.fromFunction2((t0: /* accumulated */ C, t1: /* props */ C) => reduce(t0, t1).runNow()))
    __obj.asInstanceOf[Options[P, C]]
  }
}

