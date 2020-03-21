package typingsJapgolly.phaser.Phaser.Math

import typingsJapgolly.phaser.Phaser.Types.Math.SinCosTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.SinCosTableGenerator")
@js.native
object SinCosTableGenerator extends js.Object {
  /**
    * Generate a series of sine and cosine values.
    * @param length The number of values to generate.
    * @param sinAmp The sine value amplitude. Default 1.
    * @param cosAmp The cosine value amplitude. Default 1.
    * @param frequency The frequency of the values. Default 1.
    */
  def apply(length: Double): SinCosTable = js.native
  def apply(length: Double, sinAmp: Double): SinCosTable = js.native
  def apply(length: Double, sinAmp: Double, cosAmp: Double): SinCosTable = js.native
  def apply(length: Double, sinAmp: Double, cosAmp: Double, frequency: Double): SinCosTable = js.native
}

