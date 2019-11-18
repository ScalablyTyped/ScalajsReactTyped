package typingsJapgolly.d3DashGeo

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoStream
import typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoTransformPrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S[T /* <: GeoTransformPrototype */] extends js.Object {
  def stream(s: GeoStream): T with GeoStream
}

object Anon_S {
  @scala.inline
  def apply[T /* <: GeoTransformPrototype */](stream: GeoStream => CallbackTo[T with GeoStream]): Anon_S[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stream")(js.Any.fromFunction1((t0: typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoStream) => stream(t0).runNow()))
    __obj.asInstanceOf[Anon_S[T]]
  }
}

