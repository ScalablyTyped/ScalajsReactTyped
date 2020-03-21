package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.BoundingBox
  * @description Create a new axis-aligned bounding box.
  * @classdesc Axis-Aligned Bounding Box.
  * @param {pc.Vec3} [center] - Center of box. The constructor takes a reference of this parameter.
  * @param {pc.Vec3} [halfExtents] - Half the distance across the box in each axis. The constructor takes a reference of this parameter.
  * @property {pc.Vec3} center Center of box.
  * @property {pc.Vec3} halfExtents Half the distance across the box in each axis.
  */
@JSImport("playcanvas", "BoundingBox")
@js.native
class BoundingBox ()
  extends typingsJapgolly.playcanvas.pc.BoundingBox {
  def this(center: typingsJapgolly.playcanvas.pc.Vec3) = this()
  def this(center: typingsJapgolly.playcanvas.pc.Vec3, halfExtents: typingsJapgolly.playcanvas.pc.Vec3) = this()
}

