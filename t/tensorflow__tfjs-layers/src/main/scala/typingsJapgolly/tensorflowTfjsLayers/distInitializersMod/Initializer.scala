package typingsJapgolly.tensorflowTfjsLayers.distInitializersMod

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.serialization.Serializable
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/initializers", "Initializer")
@js.native
open class Initializer () extends Serializable {
  
  /**
    * Generate an initial value.
    * @param shape
    * @param dtype
    * @return The init value.
    */
  @JSName("apply")
  def apply(shape: Shape): Tensor[Rank] = js.native
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType): Tensor[Rank] = js.native
  
  def fromConfigUsesCustomObjects(): Boolean = js.native
}
