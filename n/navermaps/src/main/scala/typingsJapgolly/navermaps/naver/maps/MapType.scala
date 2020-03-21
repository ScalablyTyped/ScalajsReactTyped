package typingsJapgolly.navermaps.naver.maps

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapType extends js.Object {
  var maxZoom: Double
  var minZoom: Double
  var name: String
  var projection: Projection
  var tileSize: Size
  def getTile(x: Double, y: Double, z: Double): HTMLElement | Tile
}

object MapType {
  @scala.inline
  def apply(
    getTile: (Double, Double, Double) => CallbackTo[HTMLElement | Tile],
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    tileSize: Size
  ): MapType = {
    val __obj = js.Dynamic.literal(maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any])
    __obj.updateDynamic("getTile")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => getTile(t0, t1, t2).runNow()))
    __obj.asInstanceOf[MapType]
  }
}

