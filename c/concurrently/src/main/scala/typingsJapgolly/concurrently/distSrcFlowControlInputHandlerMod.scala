package typingsJapgolly.concurrently

import typingsJapgolly.concurrently.anon.Commands
import typingsJapgolly.concurrently.anon.DefaultInputTarget
import typingsJapgolly.concurrently.distSrcCommandMod.Command
import typingsJapgolly.concurrently.distSrcFlowControlFlowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFlowControlInputHandlerMod {
  
  @JSImport("concurrently/dist/src/flow-control/input-handler", "InputHandler")
  @js.native
  open class InputHandler protected ()
    extends StObject
       with FlowController {
    def this(hasDefaultInputTargetInputStreamPauseInputStreamOnFinishLogger: DefaultInputTarget) = this()
    
    /* private */ val defaultInputTarget: Any = js.native
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val inputStream: Any = js.native
    
    /* private */ val logger: Any = js.native
    
    /* private */ val pauseInputStreamOnFinish: Any = js.native
  }
}
