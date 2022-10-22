package typingsJapgolly.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Scalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLogsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/logs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disposeTensorsInLogs(logs: UnresolvedLogs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disposeTensorsInLogs")(logs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resolveScalarsInLogs(logs: UnresolvedLogs): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveScalarsInLogs")(logs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  type Logs = StringDictionary[Double]
  
  type UnresolvedLogs = StringDictionary[Double | Scalar]
}
