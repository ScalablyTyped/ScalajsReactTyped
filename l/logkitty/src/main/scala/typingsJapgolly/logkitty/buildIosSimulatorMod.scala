package typingsJapgolly.logkitty

import typingsJapgolly.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosSimulatorMod {
  
  @JSImport("logkitty/build/ios/simulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runSimulatorLoggingProcess(): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("runSimulatorLoggingProcess")().asInstanceOf[ChildProcess]
}
