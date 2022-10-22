package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.SimpleBinaryKernelImpl
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsFloorDivMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FloorDiv", "floorDiv")
  @js.native
  val floorDiv: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FloorDiv", "floorDivConfig")
  @js.native
  val floorDivConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FloorDiv", "floorDivImpl")
  @js.native
  val floorDivImpl: SimpleBinaryKernelImpl = js.native
}
