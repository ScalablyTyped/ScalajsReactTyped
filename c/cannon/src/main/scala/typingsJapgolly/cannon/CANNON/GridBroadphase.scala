package typingsJapgolly.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.GridBroadphase")
@js.native
class GridBroadphase () extends BroadPhase {
  def this(aabbMin: Vec3) = this()
  def this(aabbMin: Vec3, aabbMax: Vec3) = this()
  def this(aabbMin: Vec3, aabbMax: Vec3, nx: Double) = this()
  def this(aabbMin: Vec3, aabbMax: Vec3, nx: Double, ny: Double) = this()
  def this(aabbMin: Vec3, aabbMax: Vec3, nx: Double, ny: Double, nz: Double) = this()
  var aabbMax: Vec3 = js.native
  var aabbMin: Vec3 = js.native
  var bins: js.Array[_] = js.native
  var nx: Double = js.native
  var ny: Double = js.native
  var nz: Double = js.native
}

