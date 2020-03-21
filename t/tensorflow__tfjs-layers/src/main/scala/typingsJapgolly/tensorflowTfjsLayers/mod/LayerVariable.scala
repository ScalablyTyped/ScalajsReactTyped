package typingsJapgolly.tensorflowTfjsLayers.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.constraintsMod.Constraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "LayerVariable")
@js.native
class LayerVariable protected ()
  extends typingsJapgolly.tensorflowTfjsLayers.variablesMod.LayerVariable {
  /**
    * Construct Variable from a `tf.Tensor`.
    *
    * If not explicitly named, the Variable will be given a name with the
    * prefix 'Variable'. Variable names are unique. In the case of name
    * collision, suffixies '_<num>' will be added to the name.
    *
    * @param val Initial value of the Variable.
    * @param name Name of the variable. If `null` or `undefined` is provided, it
    *   will default a name with the prefix 'Variable'.
    * @param constraint Optional, projection function to be applied to the
    * variable after optimize updates
    * @throws ValueError if `name` is `null` or `undefined`.
    */
  def this(`val`: Tensor_[Rank]) = this()
  def this(`val`: Tensor_[Rank], dtype: DataType) = this()
  def this(`val`: Tensor_[Rank], dtype: DataType, name: String) = this()
  def this(`val`: Tensor_[Rank], dtype: DataType, name: String, trainable: Boolean) = this()
  def this(`val`: Tensor_[Rank], dtype: DataType, name: String, trainable: Boolean, constraint: Constraint) = this()
}

