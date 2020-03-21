package typingsJapgolly.navermaps.naver.maps

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  def fromCoordToPoint(coord: Coord): Point
  def fromPointToCoord(point: Point): Coord
}

object Projection {
  @scala.inline
  def apply(fromCoordToPoint: Coord => CallbackTo[Point], fromPointToCoord: Point => CallbackTo[Coord]): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromCoordToPoint")(js.Any.fromFunction1((t0: typingsJapgolly.navermaps.naver.maps.Coord) => fromCoordToPoint(t0).runNow()))
    __obj.updateDynamic("fromPointToCoord")(js.Any.fromFunction1((t0: typingsJapgolly.navermaps.naver.maps.Point) => fromPointToCoord(t0).runNow()))
    __obj.asInstanceOf[Projection]
  }
}

