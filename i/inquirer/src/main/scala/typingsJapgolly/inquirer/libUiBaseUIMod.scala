package typingsJapgolly.inquirer

import japgolly.scalajs.react.Callback
import typingsJapgolly.inquirer.mod.StreamOptions
import typingsJapgolly.inquirer.mod.inquirer.prompts.PromptBase
import typingsJapgolly.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUiBaseUIMod {
  
  /**
    * Represents a ui.
    */
  @JSImport("inquirer/lib/ui/baseUI", JSImport.Default)
  @js.native
  /**
    * Initializes a new instance of the {@link UI `UI`} class.
    *
    * @param options
    * The input- and output-stream of the ui.
    */
  open class default ()
    extends StObject
       with UI {
    def this(options: StreamOptions) = this()
    
    /**
      * Gets or sets the currently active prompt.
      */
    /* protected */ /* CompleteClass */
    var activePrompt: PromptBase = js.native
    
    /**
      * Releases all unmanaged resources.
      */
    /* protected */ /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Handles a forced exit of the application.
      */
    /* protected */ /* CompleteClass */
    override def onForceClose(): Unit = js.native
    
    /**
      * Gets or sets an object for performing read from and write to the console.
      */
    /* protected */ /* CompleteClass */
    var rl: Interface = js.native
  }
  
  /**
    * Represents a ui.
    */
  trait UI extends StObject {
    
    /**
      * Gets or sets the currently active prompt.
      */
    /* protected */ var activePrompt: PromptBase
    
    /**
      * Releases all unmanaged resources.
      */
    /* protected */ def close(): Unit
    
    /**
      * Handles a forced exit of the application.
      */
    /* protected */ def onForceClose(): Unit
    
    /**
      * Gets or sets an object for performing read from and write to the console.
      */
    /* protected */ var rl: Interface
  }
  object UI {
    
    inline def apply(activePrompt: PromptBase, close: Callback, onForceClose: Callback, rl: Interface): UI = {
      val __obj = js.Dynamic.literal(activePrompt = activePrompt.asInstanceOf[js.Any], close = close.toJsFn, onForceClose = onForceClose.toJsFn, rl = rl.asInstanceOf[js.Any])
      __obj.asInstanceOf[UI]
    }
    
    extension [Self <: UI](x: Self) {
      
      inline def setActivePrompt(value: PromptBase): Self = StObject.set(x, "activePrompt", value.asInstanceOf[js.Any])
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setOnForceClose(value: Callback): Self = StObject.set(x, "onForceClose", value.toJsFn)
      
      inline def setRl(value: Interface): Self = StObject.set(x, "rl", value.asInstanceOf[js.Any])
    }
  }
}
