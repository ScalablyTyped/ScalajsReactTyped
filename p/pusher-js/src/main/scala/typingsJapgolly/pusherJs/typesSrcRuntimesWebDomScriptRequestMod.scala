package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.pusherJs.typesSrcRuntimesWebDomScriptReceiverMod.ScriptReceiver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcRuntimesWebDomScriptRequestMod {
  
  @JSImport("pusher-js/types/src/runtimes/web/dom/script_request", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ScriptRequest {
    def this(src: String) = this()
    
    /* CompleteClass */
    override def cleanup(): Unit = js.native
    
    /* CompleteClass */
    var errorScript: Any = js.native
    
    /* CompleteClass */
    var script: Any = js.native
    
    /* CompleteClass */
    override def send(receiver: ScriptReceiver): Unit = js.native
    
    /* CompleteClass */
    var src: String = js.native
  }
  
  trait ScriptRequest extends StObject {
    
    def cleanup(): Unit
    
    var errorScript: Any
    
    var script: Any
    
    def send(receiver: ScriptReceiver): Unit
    
    var src: String
  }
  object ScriptRequest {
    
    inline def apply(cleanup: Callback, errorScript: Any, script: Any, send: ScriptReceiver => Callback, src: String): ScriptRequest = {
      val __obj = js.Dynamic.literal(cleanup = cleanup.toJsFn, errorScript = errorScript.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], send = js.Any.fromFunction1((t0: ScriptReceiver) => send(t0).runNow()), src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptRequest]
    }
    
    extension [Self <: ScriptRequest](x: Self) {
      
      inline def setCleanup(value: Callback): Self = StObject.set(x, "cleanup", value.toJsFn)
      
      inline def setErrorScript(value: Any): Self = StObject.set(x, "errorScript", value.asInstanceOf[js.Any])
      
      inline def setScript(value: Any): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setSend(value: ScriptReceiver => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: ScriptReceiver) => value(t0).runNow()))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
