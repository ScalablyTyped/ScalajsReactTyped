package typingsJapgolly.phaser.phaserMod.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a vector in 3D space.
  * 
  * A three-component vector.
  */
@JSImport("phaser", "Math.Vector3")
@js.native
/**
  * 
  * @param x The x component.
  * @param y The y component.
  * @param z The z component.
  */
class Vector3 ()
  extends typingsJapgolly.phaser.Phaser.Math.Vector3 {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
}

/* static members */
@JSImport("phaser", "Math.Vector3")
@js.native
object Vector3 extends js.Object {
  /**
    * A static back Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val BACK: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
  /**
    * A static down Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val DOWN: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
  /**
    * A static forward Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val FORWARD: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
  /**
    * A static left Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val LEFT: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
  /**
    * A static one Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val ONE: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
  /**
    * A static right Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val RIGHT: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
  /**
    * A static up Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val UP: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
  /**
    * A static zero Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val ZERO: typingsJapgolly.phaser.Phaser.Math.Vector3 = js.native
}

