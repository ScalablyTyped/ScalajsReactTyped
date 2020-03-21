package typingsJapgolly.phaser.Phaser.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.RandomXY")
@js.native
object RandomXY extends js.Object {
  /**
    * Compute a random unit vector.
    * 
    * Computes random values for the given vector between -1 and 1 that can be used to represent a direction.
    * 
    * Optionally accepts a scale value to scale the resulting vector by.
    * @param vector The Vector to compute random values for.
    * @param scale The scale of the random values. Default 1.
    */
  def apply(vector: Vector2): Vector2 = js.native
  def apply(vector: Vector2, scale: Double): Vector2 = js.native
}

