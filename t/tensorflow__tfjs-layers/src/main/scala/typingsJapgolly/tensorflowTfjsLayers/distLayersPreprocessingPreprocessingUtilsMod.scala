package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersPreprocessingPreprocessingUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/preprocessing_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeCategoricalInputs(inputs: js.Array[Tensor[Rank]], outputMode: OutputMode, depth: Double): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  inline def encodeCategoricalInputs(
    inputs: js.Array[Tensor[Rank]],
    outputMode: OutputMode,
    depth: Double,
    weights: Tensor1D | Tensor2D
  ): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  inline def encodeCategoricalInputs(inputs: js.Array[Tensor[Rank]], outputMode: OutputMode, depth: Double, weights: TensorLike): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  inline def encodeCategoricalInputs(inputs: Tensor[Rank], outputMode: OutputMode, depth: Double): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  inline def encodeCategoricalInputs(inputs: Tensor[Rank], outputMode: OutputMode, depth: Double, weights: Tensor1D | Tensor2D): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  inline def encodeCategoricalInputs(inputs: Tensor[Rank], outputMode: OutputMode, depth: Double, weights: TensorLike): Tensor[Rank] | js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCategoricalInputs")(inputs.asInstanceOf[js.Any], outputMode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.oneHot
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.multiHot
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.count
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tfIdf
  */
  trait OutputMode extends StObject
  object OutputMode {
    
    inline def count: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.count = "count".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.count]
    
    inline def int: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int = "int".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int]
    
    inline def multiHot: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.multiHot = "multiHot".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.multiHot]
    
    inline def oneHot: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.oneHot = "oneHot".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.oneHot]
    
    inline def tfIdf: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tfIdf = "tfIdf".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tfIdf]
  }
}
