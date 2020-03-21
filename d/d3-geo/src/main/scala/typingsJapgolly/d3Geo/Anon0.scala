package typingsJapgolly.d3Geo

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.d3Geo.mod.GeoStream_
import typingsJapgolly.d3Geo.mod.GeoTransformPrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[T /* <: GeoTransformPrototype */] extends js.Object {
  def stream(s: GeoStream_): T with GeoStream_
}

object Anon0 {
  @scala.inline
  def apply[T /* <: GeoTransformPrototype */](stream: GeoStream_ => CallbackTo[T with GeoStream_]): Anon0[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stream")(js.Any.fromFunction1((t0: typingsJapgolly.d3Geo.mod.GeoStream_) => stream(t0).runNow()))
    __obj.asInstanceOf[Anon0[T]]
  }
}

