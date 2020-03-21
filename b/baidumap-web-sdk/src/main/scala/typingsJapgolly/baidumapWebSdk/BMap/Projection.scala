package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  def lngLatToPoint(lngLat: Point): Pixel
  def pointToLngLat(point: Pixel): Point
}

object Projection {
  @scala.inline
  def apply(lngLatToPoint: Point => CallbackTo[Pixel], pointToLngLat: Pixel => CallbackTo[Point]): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lngLatToPoint")(js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.BMap.Point) => lngLatToPoint(t0).runNow()))
    __obj.updateDynamic("pointToLngLat")(js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.BMap.Pixel) => pointToLngLat(t0).runNow()))
    __obj.asInstanceOf[Projection]
  }
}

