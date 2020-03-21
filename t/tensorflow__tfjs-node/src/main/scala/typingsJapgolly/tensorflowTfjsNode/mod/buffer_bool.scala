package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsNode.tensorflowTfjsNodeStrings.bool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "buffer")
@js.native
object buffer_bool extends js.Object {
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): typingsJapgolly.tensorflowTfjsCore.tensorMod.TensorBuffer[R, bool] = js.native
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: scala.scalajs.js.typedarray.Uint8Array
  ): typingsJapgolly.tensorflowTfjsCore.tensorMod.TensorBuffer[R, bool] = js.native
}

