package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.distTypesMod.Kwargs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "SymbolicTensor")
@js.native
open class SymbolicTensor protected ()
  extends typingsJapgolly.tensorflowTfjsLayers.mod.SymbolicTensor {
  /**
    *
    * @param dtype
    * @param shape
    * @param sourceLayer The Layer that produced this symbolic tensor.
    * @param inputs The inputs passed to sourceLayer's __call__() method.
    * @param nodeIndex
    * @param tensorIndex
    * @param callArgs The keyword arguments passed to the __call__() method.
    * @param name
    * @param outputTensorIndex The index of this tensor in the list of outputs
    *   returned by apply().
    */
  def this(
    dtype: DataType,
    shape: Shape,
    sourceLayer: Layer,
    inputs: js.Array[typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor],
    callArgs: Kwargs
  ) = this()
  def this(
    dtype: DataType,
    shape: Shape,
    sourceLayer: Layer,
    inputs: js.Array[typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor],
    callArgs: Kwargs,
    name: String
  ) = this()
  def this(
    dtype: DataType,
    shape: Shape,
    sourceLayer: Layer,
    inputs: js.Array[typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor],
    callArgs: Kwargs,
    name: String,
    outputTensorIndex: Double
  ) = this()
  def this(
    dtype: DataType,
    shape: Shape,
    sourceLayer: Layer,
    inputs: js.Array[typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor],
    callArgs: Kwargs,
    name: Unit,
    outputTensorIndex: Double
  ) = this()
}
