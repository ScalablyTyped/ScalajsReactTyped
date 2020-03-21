package typingsJapgolly.aframe.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry[T] extends js.Object {
  var data: T
  var geometry: typingsJapgolly.three.mod.Geometry
  var name: String
  var schema: Schema_[_]
  def init(data: js.Any): Unit
}

object Geometry {
  @scala.inline
  def apply[T](
    data: T,
    geometry: typingsJapgolly.three.mod.Geometry,
    init: js.Any => Callback,
    name: String,
    schema: Schema_[_]
  ): Geometry[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: js.Any) => init(t0).runNow()))
    __obj.asInstanceOf[Geometry[T]]
  }
}

