package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Quat
  * @classdesc A quaternion.
  * @description Create a new Quat object.
  * @param {number|number[]} [x] - The quaternion's x component. Default value 0. If x is an array of length 4, the array will be used to populate all components.
  * @param {number} [y] - The quaternion's y component. Default value 0.
  * @param {number} [z] - The quaternion's z component. Default value 0.
  * @param {number} [w] - The quaternion's w component. Default value 1.
  */
@JSImport("playcanvas", "Quat")
@js.native
class Quat ()
  extends typingsJapgolly.playcanvas.pc.Quat {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}

/* static members */
@JSImport("playcanvas", "Quat")
@js.native
object Quat extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Quat.IDENTITY
    * @type {pc.Quat}
    * @description A constant quaternion set to [0, 0, 0, 1] (the identity).
    */
  val IDENTITY: typingsJapgolly.playcanvas.pc.Quat = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Quat.ZERO
    * @type {pc.Quat}
    * @description A constant quaternion set to [0, 0, 0, 0].
    */
  val ZERO: typingsJapgolly.playcanvas.pc.Quat = js.native
}

