package typingsJapgolly.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector3 extends js.Object {
  var x: Double
  var y: Double
  var z: Double
}

object Vector3 {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): Vector3 = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Vector3]
  }
}

