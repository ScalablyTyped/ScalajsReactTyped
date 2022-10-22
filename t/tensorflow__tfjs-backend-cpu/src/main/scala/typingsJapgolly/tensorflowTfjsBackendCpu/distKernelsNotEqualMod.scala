package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.SimpleBinaryKernelImpl
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsNotEqualMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NotEqual", "notEqual")
  @js.native
  val notEqual: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NotEqual", "notEqualConfig")
  @js.native
  val notEqualConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NotEqual", "notEqualImpl")
  @js.native
  val notEqualImpl: SimpleBinaryKernelImpl = js.native
}
