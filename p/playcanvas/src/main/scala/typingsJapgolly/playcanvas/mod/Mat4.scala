package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Mat4
  * @classdesc A 4x4 matrix.
  * @description Creates a new identity Mat4 object.
  * @property {Float32Array} data Matrix elements in the form of a flat array.
  */
@JSImport("playcanvas", "Mat4")
@js.native
class Mat4 ()
  extends typingsJapgolly.playcanvas.pc.Mat4

/* static members */
@JSImport("playcanvas", "Mat4")
@js.native
object Mat4 extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Mat4.IDENTITY
    * @type {pc.Mat4}
    * @description A constant matrix set to the identity.
    */
  val IDENTITY: typingsJapgolly.playcanvas.pc.Mat4 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Mat4.ZERO
    * @type {pc.Mat4}
    * @description A constant matrix with all elements set to 0.
    */
  val ZERO: typingsJapgolly.playcanvas.pc.Mat4 = js.native
}

