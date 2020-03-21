package typingsJapgolly.heremaps.H.clustering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heremaps.H.geo.Point
import typingsJapgolly.heremaps.H.geo.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface describes a cluster of data points, which fulfill the clustering specification (i.e. data points are within the epsilon and there are enough points to form a cluster).
  */
trait ICluster extends js.Object {
  /**
    * Invokes the specified callback for each data point which is part of this cluster, even indirectly.
    * @param callback {function(H.clustering.INoisePoint)} - The callback gets the currently traversed noise point as argument.
    */
  def forEachDataPoint(callback: js.Function1[/* noise */ INoisePoint, Unit]): Unit
  /**
    * Invokes the specified callback for each "entry" of the cluster.
    * That "entry" can be either a cluster which implements H.clustering.ICluster interface or a noise point which implements H.clustering.INoisePoint interface.
    * @param callback {function(H.clustering.IResult)} - The callback gets the currently traversed entry as an argument, which is cluster or noise point.
    */
  def forEachEntry(callback: js.Function1[/* result */ IResult, Unit]): Unit
  /**
    * Returns the bounding rectangle of this cluster.
    * @returns {H.geo.Rect}
    */
  def getBounds(): Rect
  /**
    * Returns the maximum zoom level where this cluster doesn't fall apart into sub clusters and/or noise poinst
    * @returns {number}
    */
  def getMaxZoom(): Double
  /**
    * Returns the minimum zoom level where this item is not part of another cluster
    * @returns {number}
    */
  def getMinZoom(): Double
  /**
    * Returns the geographical position of this cluster result.
    * @returns {H.geo.Point}
    */
  def getPosition(): Point
  /**
    * Returns the weight of this cluster result.
    * @returns {number}
    */
  def getWeight(): Double
  /**
    * To indicate whether this cluster result is a cluster or noise point
    * @returns {boolean}
    */
  def isCluster(): Boolean
}

object ICluster {
  @scala.inline
  def apply(
    forEachDataPoint: js.Function1[/* noise */ INoisePoint, Unit] => Callback,
    forEachEntry: js.Function1[/* result */ IResult, Unit] => Callback,
    getBounds: CallbackTo[Rect],
    getMaxZoom: CallbackTo[Double],
    getMinZoom: CallbackTo[Double],
    getPosition: CallbackTo[Point],
    getWeight: CallbackTo[Double],
    isCluster: CallbackTo[Boolean]
  ): ICluster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEachDataPoint")(js.Any.fromFunction1((t0: js.Function1[/* noise */ typingsJapgolly.heremaps.H.clustering.INoisePoint, scala.Unit]) => forEachDataPoint(t0).runNow()))
    __obj.updateDynamic("forEachEntry")(js.Any.fromFunction1((t0: js.Function1[/* result */ typingsJapgolly.heremaps.H.clustering.IResult, scala.Unit]) => forEachEntry(t0).runNow()))
    __obj.updateDynamic("getBounds")(getBounds.toJsFn)
    __obj.updateDynamic("getMaxZoom")(getMaxZoom.toJsFn)
    __obj.updateDynamic("getMinZoom")(getMinZoom.toJsFn)
    __obj.updateDynamic("getPosition")(getPosition.toJsFn)
    __obj.updateDynamic("getWeight")(getWeight.toJsFn)
    __obj.updateDynamic("isCluster")(isCluster.toJsFn)
    __obj.asInstanceOf[ICluster]
  }
}

