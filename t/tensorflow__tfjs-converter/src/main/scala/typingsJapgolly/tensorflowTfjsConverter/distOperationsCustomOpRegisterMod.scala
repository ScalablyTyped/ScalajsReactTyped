package typingsJapgolly.tensorflowTfjsConverter

import typingsJapgolly.tensorflowTfjsConverter.distOperationsTypesMod.OpExecutor
import typingsJapgolly.tensorflowTfjsConverter.distOperationsTypesMod.OpMapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsCustomOpRegisterMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/custom_op/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deregisterOp(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterOp")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getRegisteredOp(name: String): OpMapper = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredOp")(name.asInstanceOf[js.Any]).asInstanceOf[OpMapper]
  
  inline def registerOp(name: String, opFunc: OpExecutor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerOp")(name.asInstanceOf[js.Any], opFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
