package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.TensorBuffer
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsBufferMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): TensorBuffer[R, float32] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any]).asInstanceOf[TensorBuffer[R, float32]]
  inline def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.Array[String]
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
  inline def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  inline def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.typedarray.Int32Array
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  inline def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.typedarray.Uint8Array
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  
  inline def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  inline def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: js.typedarray.Uint8Array
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  
  inline def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): TensorBuffer[R, complex64] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, complex64]]
  inline def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, complex64] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, complex64]]
  
  inline def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  inline def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32,
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  
  inline def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  inline def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32,
    values: js.typedarray.Int32Array
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  
  inline def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
  inline def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string,
    values: js.Array[String]
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
}
