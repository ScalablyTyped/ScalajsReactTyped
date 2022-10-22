package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Scalar
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.ScalarLike
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstring extends StObject {
  
  def stringNGrams(
    data: Tensor1D,
    dataSplits: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = js.native
  def stringNGrams(
    data: Tensor1D,
    dataSplits: TensorLike,
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = js.native
  def stringNGrams(
    data: TensorLike,
    dataSplits: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = js.native
  def stringNGrams(
    data: TensorLike,
    dataSplits: TensorLike,
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): NamedTensorMap = js.native
  
  def stringSplit(input: Tensor1D, delimiter: Scalar): NamedTensorMap = js.native
  def stringSplit(input: Tensor1D, delimiter: Scalar, skipEmpty: Boolean): NamedTensorMap = js.native
  def stringSplit(input: Tensor1D, delimiter: ScalarLike): NamedTensorMap = js.native
  def stringSplit(input: Tensor1D, delimiter: ScalarLike, skipEmpty: Boolean): NamedTensorMap = js.native
  def stringSplit(input: TensorLike, delimiter: Scalar): NamedTensorMap = js.native
  def stringSplit(input: TensorLike, delimiter: Scalar, skipEmpty: Boolean): NamedTensorMap = js.native
  def stringSplit(input: TensorLike, delimiter: ScalarLike): NamedTensorMap = js.native
  def stringSplit(input: TensorLike, delimiter: ScalarLike, skipEmpty: Boolean): NamedTensorMap = js.native
  
  def stringToHashBucketFast(input: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank], numBuckets: Double): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stringToHashBucketFast(input: TensorLike, numBuckets: Double): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
}
