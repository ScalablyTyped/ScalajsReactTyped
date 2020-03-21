package typingsJapgolly.famous.physicsMod

import typingsJapgolly.famous.mathMod.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/physics", "Wall")
@js.native
class Wall protected () extends Particle {
  def this(options: IWallOptions) = this()
  var invNormal: Vec3 = js.native
  var normal: Vec3 = js.native
}

