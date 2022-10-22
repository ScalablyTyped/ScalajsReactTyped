package typingsJapgolly.tensorflowTfjsBackendWasm

import typingsJapgolly.tensorflowTfjsBackendWasm.anon.AttrsRotateWithOffsetAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsRotateWithOffsetMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/RotateWithOffset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rotateWithOffset(args: AttrsRotateWithOffsetAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/RotateWithOffset", "rotateWithOffsetConfig")
  @js.native
  val rotateWithOffsetConfig: KernelConfig = js.native
}
