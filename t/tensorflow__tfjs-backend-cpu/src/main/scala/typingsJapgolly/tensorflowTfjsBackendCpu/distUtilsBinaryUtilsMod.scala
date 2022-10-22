package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.ComplexBinaryKernelImpl
import typingsJapgolly.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.ComplexBinaryOperation
import typingsJapgolly.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.SimpleBinaryKernelImpl
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsBinaryUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/binary_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def binaryKernelFunc(name: String, simpleImpl: SimpleBinaryKernelImpl): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryKernelFunc")(name.asInstanceOf[js.Any], simpleImpl.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
  inline def binaryKernelFunc(name: String, simpleImpl: SimpleBinaryKernelImpl, complexImpl: Unit, dtype: DataType): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryKernelFunc")(name.asInstanceOf[js.Any], simpleImpl.asInstanceOf[js.Any], complexImpl.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
  inline def binaryKernelFunc(name: String, simpleImpl: SimpleBinaryKernelImpl, complexImpl: ComplexBinaryKernelImpl): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryKernelFunc")(name.asInstanceOf[js.Any], simpleImpl.asInstanceOf[js.Any], complexImpl.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
  inline def binaryKernelFunc(
    name: String,
    simpleImpl: SimpleBinaryKernelImpl,
    complexImpl: ComplexBinaryKernelImpl,
    dtype: DataType
  ): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryKernelFunc")(name.asInstanceOf[js.Any], simpleImpl.asInstanceOf[js.Any], complexImpl.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
  
  inline def createComplexBinaryKernelImpl(op: ComplexBinaryOperation): ComplexBinaryKernelImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("createComplexBinaryKernelImpl")(op.asInstanceOf[js.Any]).asInstanceOf[ComplexBinaryKernelImpl]
}
