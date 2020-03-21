package typingsJapgolly.heremaps.H.clustering

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heremaps.H.geo.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface represents the result item of a clustering operation.
  */
trait IResult extends js.Object {
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

object IResult {
  @scala.inline
  def apply(
    getMinZoom: CallbackTo[Double],
    getPosition: CallbackTo[Point],
    getWeight: CallbackTo[Double],
    isCluster: CallbackTo[Boolean]
  ): IResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMinZoom")(getMinZoom.toJsFn)
    __obj.updateDynamic("getPosition")(getPosition.toJsFn)
    __obj.updateDynamic("getWeight")(getWeight.toJsFn)
    __obj.updateDynamic("isCluster")(isCluster.toJsFn)
    __obj.asInstanceOf[IResult]
  }
}

