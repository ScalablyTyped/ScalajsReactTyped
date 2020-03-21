package typingsJapgolly.heredatalens.H.datalens.ObjectLayer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heremaps.H.geo.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slice of data (eg Data Lens query data row) that represents a data point.
  * Each row is translated to map objects with the rowToMapObject callback. By default each row is an Object where property names correspond to data column names.
  * This representation can be changed with the dataToRows callback.
  */
trait Row extends js.Object {
  var lat: Double
  var lng: Double
  def getPosition(): Point
  def isCluster(): Boolean
}

object Row {
  @scala.inline
  def apply(getPosition: CallbackTo[Point], isCluster: CallbackTo[Boolean], lat: Double, lng: Double): Row = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.updateDynamic("getPosition")(getPosition.toJsFn)
    __obj.updateDynamic("isCluster")(isCluster.toJsFn)
    __obj.asInstanceOf[Row]
  }
}

