package typingsJapgolly.concurrently

import typingsJapgolly.concurrently.anon.Commands
import typingsJapgolly.concurrently.anon.Delay
import typingsJapgolly.concurrently.distSrcCommandMod.Command
import typingsJapgolly.concurrently.distSrcFlowControlFlowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFlowControlRestartProcessMod {
  
  @JSImport("concurrently/dist/src/flow-control/restart-process", "RestartProcess")
  @js.native
  open class RestartProcess protected ()
    extends StObject
       with FlowController {
    def this(hasDelayTriesLoggerScheduler: Delay) = this()
    
    val delay: Double = js.native
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val logger: Any = js.native
    
    /* private */ val scheduler: Any = js.native
    
    val tries: Double = js.native
  }
}
