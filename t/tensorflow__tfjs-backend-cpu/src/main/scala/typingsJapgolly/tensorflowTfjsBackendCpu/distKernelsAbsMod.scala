package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.Backend
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsAbsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abs(args: Backend): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(args.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", "absConfig")
  @js.native
  val absConfig: KernelConfig = js.native
  
  inline def simpleAbsImpl(vals: TypedArray): js.typedarray.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleAbsImpl")(vals.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array]
}
