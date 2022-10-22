package typingsJapgolly.concurrently

import typingsJapgolly.concurrently.anon.Commands
import typingsJapgolly.concurrently.anon.Logger
import typingsJapgolly.concurrently.distSrcCommandMod.Command
import typingsJapgolly.concurrently.distSrcFlowControlFlowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFlowControlLogErrorMod {
  
  @JSImport("concurrently/dist/src/flow-control/log-error", "LogError")
  @js.native
  open class LogError protected ()
    extends StObject
       with FlowController {
    def this(hasLogger: Logger) = this()
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val logger: Any = js.native
  }
}
