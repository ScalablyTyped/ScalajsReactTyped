package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjs.tensorflowTfjsStrings.int32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "buffer")
@js.native
object buffer_int32 extends js.Object {
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32
  ): typingsJapgolly.tensorflowTfjsCore.tensorMod.TensorBuffer[R, int32] = js.native
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32,
    values: scala.scalajs.js.typedarray.Int32Array
  ): typingsJapgolly.tensorflowTfjsCore.tensorMod.TensorBuffer[R, int32] = js.native
}

