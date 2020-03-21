package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.OrientedBox
  * @description Create a new oriented box.
  * @classdesc Oriented Box.
  * @property {pc.Mat4} [worldTransform] The world transform of the OBB.
  * @param {pc.Mat4} [worldTransform] - Transform that has the orientation and position of the box. Scale is assumed to be one.
  * @param {pc.Vec3} [halfExtents] - Half the distance across the box in each local axis. The constructor takes a reference of this parameter.
  */
@JSImport("playcanvas", "OrientedBox")
@js.native
class OrientedBox ()
  extends typingsJapgolly.playcanvas.pc.OrientedBox {
  def this(worldTransform: typingsJapgolly.playcanvas.pc.Mat4) = this()
  def this(
    worldTransform: typingsJapgolly.playcanvas.pc.Mat4,
    halfExtents: typingsJapgolly.playcanvas.pc.Vec3
  ) = this()
}

