package typingsJapgolly.mapboxGl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanonicalCoordinate extends js.Object {
  var key: Double
  var x: Double
  var y: Double
  var z: Double
  def equals(coord: CanonicalCoordinate): Boolean
}

object CanonicalCoordinate {
  @scala.inline
  def apply(equals: CanonicalCoordinate => CallbackTo[Boolean], key: Double, x: Double, y: Double, z: Double): CanonicalCoordinate = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxGl.mod.CanonicalCoordinate) => equals(t0).runNow()))
    __obj.asInstanceOf[CanonicalCoordinate]
  }
}

