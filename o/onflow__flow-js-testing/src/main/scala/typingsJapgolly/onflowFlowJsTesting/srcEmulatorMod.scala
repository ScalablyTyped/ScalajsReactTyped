package typingsJapgolly.onflowFlowJsTesting

import typingsJapgolly.onflowFlowJsTesting.anon.AdminPort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEmulatorMod {
  
  @JSImport("@onflow/flow-js-testing/src/emulator", "Emulator")
  @js.native
  open class Emulator_ () extends StObject {
    
    def setLogging(logging: Boolean): Unit = js.native
    
    def start(): js.Promise[Boolean] = js.native
    def start(options: AdminPort): js.Promise[Boolean] = js.native
    
    def stop(): js.Promise[Boolean] = js.native
  }
  
  @JSImport("@onflow/flow-js-testing/src/emulator", "emulator")
  @js.native
  val emulator: Emulator_ = js.native
}
