package typingsJapgolly.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ConvexPolyhedron")
@js.native
class ConvexPolyhedron ()
  extends typingsJapgolly.cannon.CANNON.ConvexPolyhedron {
  def this(points: js.Array[typingsJapgolly.cannon.CANNON.Vec3]) = this()
  def this(points: js.Array[typingsJapgolly.cannon.CANNON.Vec3], faces: js.Array[Double]) = this()
}

/* static members */
@JSImport("cannon", "ConvexPolyhedron")
@js.native
object ConvexPolyhedron extends js.Object {
  def computeNormal(
    va: typingsJapgolly.cannon.CANNON.Vec3,
    vb: typingsJapgolly.cannon.CANNON.Vec3,
    vc: typingsJapgolly.cannon.CANNON.Vec3,
    target: typingsJapgolly.cannon.CANNON.Vec3
  ): Unit = js.native
  def project(
    hull: typingsJapgolly.cannon.CANNON.ConvexPolyhedron,
    axis: typingsJapgolly.cannon.CANNON.Vec3,
    pos: typingsJapgolly.cannon.CANNON.Vec3,
    quat: typingsJapgolly.cannon.CANNON.Quaternion,
    result: js.Array[Double]
  ): Unit = js.native
}

