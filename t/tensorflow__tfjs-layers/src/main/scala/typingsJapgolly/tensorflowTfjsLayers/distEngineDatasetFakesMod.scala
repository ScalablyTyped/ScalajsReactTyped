package typingsJapgolly.tensorflowTfjsLayers

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsLayers.distEngineDatasetStubMod.Dataset
import typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingDatasetMod.FitDatasetElement
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.distTypesMod.TensorOrArrayOrMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineDatasetFakesMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_fakes", "FakeNumericDataset")
  @js.native
  open class FakeNumericDataset protected () extends Dataset[FitDatasetElement] {
    def this(args: FakeDatasetArgs) = this()
    
    val args: FakeDatasetArgs = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_fakes", "FakeNumericDatasetLegacyArrayForm")
  @js.native
  open class FakeNumericDatasetLegacyArrayForm protected ()
    extends Dataset[js.Tuple2[TensorOrArrayOrMap, TensorOrArrayOrMap]] {
    def this(args: FakeDatasetArgs) = this()
    
    val args: FakeDatasetArgs = js.native
    
    var ds: FakeNumericDataset = js.native
  }
  
  trait FakeDatasetArgs extends StObject {
    
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
    var xTensorsFunc: js.UndefOr[js.Function0[js.Array[Tensor[Rank]] | StringDictionary[js.Array[Tensor[Rank]]]]] = js.undefined
    
    /**
      * The shape of the target(s) of a single exapmle.
      */
    var yShape: Shape | StringDictionary[Shape]
    
    /**
      * A function that generates preset sequence of Y tensors.
      *
      * This function is invoked each time a new iterator is created.
      */
    var yTensorsFunc: js.UndefOr[js.Function0[js.Array[Tensor[Rank]] | StringDictionary[js.Array[Tensor[Rank]]]]] = js.undefined
  }
  object FakeDatasetArgs {
    
    inline def apply(
      batchSize: Double,
      numBatches: Double,
      xShape: Shape | StringDictionary[Shape],
      yShape: Shape | StringDictionary[Shape]
    ): FakeDatasetArgs = {
      val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], numBatches = numBatches.asInstanceOf[js.Any], xShape = xShape.asInstanceOf[js.Any], yShape = yShape.asInstanceOf[js.Any])
      __obj.asInstanceOf[FakeDatasetArgs]
    }
    
    extension [Self <: FakeDatasetArgs](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setNumBatches(value: Double): Self = StObject.set(x, "numBatches", value.asInstanceOf[js.Any])
      
      inline def setXShape(value: Shape | StringDictionary[Shape]): Self = StObject.set(x, "xShape", value.asInstanceOf[js.Any])
      
      inline def setXShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "xShape", js.Array(value*))
      
      inline def setXTensorsFunc(value: CallbackTo[js.Array[Tensor[Rank]] | StringDictionary[js.Array[Tensor[Rank]]]]): Self = StObject.set(x, "xTensorsFunc", value.toJsFn)
      
      inline def setXTensorsFuncUndefined: Self = StObject.set(x, "xTensorsFunc", js.undefined)
      
      inline def setYShape(value: Shape | StringDictionary[Shape]): Self = StObject.set(x, "yShape", value.asInstanceOf[js.Any])
      
      inline def setYShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "yShape", js.Array(value*))
      
      inline def setYTensorsFunc(value: CallbackTo[js.Array[Tensor[Rank]] | StringDictionary[js.Array[Tensor[Rank]]]]): Self = StObject.set(x, "yTensorsFunc", value.toJsFn)
      
      inline def setYTensorsFuncUndefined: Self = StObject.set(x, "yTensorsFunc", js.undefined)
    }
  }
}
