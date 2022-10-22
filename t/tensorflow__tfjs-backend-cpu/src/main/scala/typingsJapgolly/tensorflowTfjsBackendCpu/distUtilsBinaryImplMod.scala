package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.SimpleBinaryKernelImpl
import typingsJapgolly.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.SimpleBinaryOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsBinaryImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/binary_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSimpleBinaryKernelImpl(op: SimpleBinaryOperation): SimpleBinaryKernelImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleBinaryKernelImpl")(op.asInstanceOf[js.Any]).asInstanceOf[SimpleBinaryKernelImpl]
}
