package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessInteractionMod {
  
  inline def apply(process: Any, name: Any, functionOfInteraction: Any, onExitFunction: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(process.asInstanceOf[js.Any], name.asInstanceOf[js.Any], functionOfInteraction.asInstanceOf[js.Any], onExitFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/process/Interaction", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Interaction {
    def this(process: Any, name: Any, functionOfInteraction: Any, onExitFunction: Any) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var functions: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var isInteractive: Any = js.native
    
    /* private */ /* CompleteClass */
    var lastExecuteOk: Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var onExit: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var permissionKeyWord: Any = js.native
    
    /* CompleteClass */
    var process: Process = js.native
    
    /* private */ /* CompleteClass */
    var run: Any = js.native
    
    /* private */ /* CompleteClass */
    var running: Any = js.native
    
    /* private */ /* CompleteClass */
    var withUserInteraction: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/process/Interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Interaction extends StObject {
    
    def close(): Unit
    
    var functions: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^
    
    /* private */ var isInteractive: Any
    
    /* private */ var lastExecuteOk: Any
    
    /* private */ var logger_ : Any
    
    var name: String
    
    var onExit: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^
    
    /* private */ var permissionKeyWord: Any
    
    var process: Process
    
    /* private */ var run: Any
    
    /* private */ var running: Any
    
    /* private */ var withUserInteraction: Any
  }
  object Interaction {
    
    inline def apply(
      close: Callback,
      functions: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^,
      isInteractive: Any,
      lastExecuteOk: Any,
      logger_ : Any,
      name: String,
      onExit: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^,
      permissionKeyWord: Any,
      process: Process,
      run: Any,
      running: Any,
      withUserInteraction: Any
    ): Interaction = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, functions = functions.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], lastExecuteOk = lastExecuteOk.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any], permissionKeyWord = permissionKeyWord.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], withUserInteraction = withUserInteraction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interaction]
    }
    
    extension [Self <: Interaction](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setFunctions(value: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setIsInteractive(value: Any): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setLastExecuteOk(value: Any): Self = StObject.set(x, "lastExecuteOk", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnExit(value: typingsJapgolly.nginstackEngine.libEventLegacyEventMod.^): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setPermissionKeyWord(value: Any): Self = StObject.set(x, "permissionKeyWord", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: Process): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setRun(value: Any): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      inline def setRunning(value: Any): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setWithUserInteraction(value: Any): Self = StObject.set(x, "withUserInteraction", value.asInstanceOf[js.Any])
    }
  }
  
  type Process = typingsJapgolly.nginstackWebFramework.libProcessProcessMod.^
}
