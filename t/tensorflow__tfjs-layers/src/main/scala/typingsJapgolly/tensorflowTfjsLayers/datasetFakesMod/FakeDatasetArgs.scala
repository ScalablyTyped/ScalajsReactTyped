package typingsJapgolly.tensorflowTfjsLayers.datasetFakesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeDatasetArgs extends js.Object {
  /**
    * The size of each batch generated by the iterator.
    */
  var batchSize: Double
  /**
    * The number of batches an iterator generates before declaring done to be
    * true.
    */
  var numBatches: Double
  /**
    * The shape(s) of the features of a single example.
    *
    * Use an object mapping name to shape, if more than one feature tensors
    * are required.
    */
  var xShape: Shape | StringDictionary[Shape]
  /**
    * A function that generates preset sequence of X tensors.
    *
    * This function is invoked each time a new iterator is created.
    */
  var xTensorsFunc: js.UndefOr[
    js.Function0[js.Array[Tensor_[Rank]] | StringDictionary[js.Array[Tensor_[Rank]]]]
  ] = js.undefined
  /**
    * The shape of the target(s) of a single exapmle.
    */
  var yShape: Shape | StringDictionary[Shape]
  /**
    * A function that generates preset sequence of Y tensors.
    *
    * This function is invoked each time a new iterator is created.
    */
  var yTensorsFunc: js.UndefOr[
    js.Function0[js.Array[Tensor_[Rank]] | StringDictionary[js.Array[Tensor_[Rank]]]]
  ] = js.undefined
}

object FakeDatasetArgs {
  @scala.inline
  def apply(
    batchSize: Double,
    numBatches: Double,
    xShape: Shape | StringDictionary[Shape],
    yShape: Shape | StringDictionary[Shape],
    xTensorsFunc: js.UndefOr[CallbackTo[js.Array[Tensor_[Rank]] | StringDictionary[js.Array[Tensor_[Rank]]]]] = js.undefined,
    yTensorsFunc: js.UndefOr[CallbackTo[js.Array[Tensor_[Rank]] | StringDictionary[js.Array[Tensor_[Rank]]]]] = js.undefined
  ): FakeDatasetArgs = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], numBatches = numBatches.asInstanceOf[js.Any], xShape = xShape.asInstanceOf[js.Any], yShape = yShape.asInstanceOf[js.Any])
    xTensorsFunc.foreach(p => __obj.updateDynamic("xTensorsFunc")(p.toJsFn))
    yTensorsFunc.foreach(p => __obj.updateDynamic("yTensorsFunc")(p.toJsFn))
    __obj.asInstanceOf[FakeDatasetArgs]
  }
}

