package typingsJapgolly.concurrently

import typingsJapgolly.concurrently.anon.Commands
import typingsJapgolly.concurrently.anon.Conditions
import typingsJapgolly.concurrently.distSrcCommandMod.Command
import typingsJapgolly.concurrently.distSrcFlowControlFlowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFlowControlKillOthersMod {
  
  @JSImport("concurrently/dist/src/flow-control/kill-others", "KillOthers")
  @js.native
  open class KillOthers protected ()
    extends StObject
       with FlowController {
    def this(hasLoggerConditions: Conditions) = this()
    
    /* private */ val conditions: Any = js.native
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val logger: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.concurrently.concurrentlyStrings.failure
    - typingsJapgolly.concurrently.concurrentlyStrings.success
  */
  trait ProcessCloseCondition extends StObject
  object ProcessCloseCondition {
    
    inline def failure: typingsJapgolly.concurrently.concurrentlyStrings.failure = "failure".asInstanceOf[typingsJapgolly.concurrently.concurrentlyStrings.failure]
    
    inline def success: typingsJapgolly.concurrently.concurrentlyStrings.success = "success".asInstanceOf[typingsJapgolly.concurrently.concurrentlyStrings.success]
  }
}
