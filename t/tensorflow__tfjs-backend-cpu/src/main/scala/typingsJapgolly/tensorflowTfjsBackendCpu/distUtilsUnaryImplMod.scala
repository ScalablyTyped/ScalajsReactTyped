package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryImpl
import typingsJapgolly.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsUnaryImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/unary_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSimpleUnaryImpl(op: SimpleUnaryOperation): SimpleUnaryImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleUnaryImpl")(op.asInstanceOf[js.Any]).asInstanceOf[SimpleUnaryImpl]
}
