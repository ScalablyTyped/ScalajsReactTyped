package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsJapgolly.tensorflowTfjsLayers.constraintsMod.MaxNormArgs
import typingsJapgolly.tensorflowTfjsLayers.constraintsMod.MinMaxNormArgs
import typingsJapgolly.tensorflowTfjsLayers.constraintsMod.UnitNormArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "constraints")
@js.native
object constraints extends js.Object {
  def maxNorm(args: MaxNormArgs): Constraint = js.native
  def minMaxNorm(config: MinMaxNormArgs): Constraint = js.native
  def nonNeg(): Constraint = js.native
  def unitNorm(args: UnitNormArgs): Constraint = js.native
}

