package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptingProvider
  extends StObject
     with DataProvider {
  
  /**
    * Registers a handler for ScriptingComplete events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnScriptingComplete(handler: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, Any]): Unit
  
  def scriptAsOperation(
    connectionUri: String,
    operation: ScriptOperation,
    metadata: ObjectMetadata,
    paramDetails: ScriptingParamDetails
  ): Thenable[ScriptingResult]
}
object ScriptingProvider {
  
  inline def apply(
    providerId: String,
    registerOnScriptingComplete: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, Any] => Callback,
    scriptAsOperation: (String, ScriptOperation, ObjectMetadata, ScriptingParamDetails) => Thenable[ScriptingResult]
  ): ScriptingProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], registerOnScriptingComplete = js.Any.fromFunction1((t0: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, Any]) => registerOnScriptingComplete(t0).runNow()), scriptAsOperation = js.Any.fromFunction4(scriptAsOperation))
    __obj.asInstanceOf[ScriptingProvider]
  }
  
  extension [Self <: ScriptingProvider](x: Self) {
    
    inline def setRegisterOnScriptingComplete(value: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, Any] => Callback): Self = StObject.set(x, "registerOnScriptingComplete", js.Any.fromFunction1((t0: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, Any]) => value(t0).runNow()))
    
    inline def setScriptAsOperation(
      value: (String, ScriptOperation, ObjectMetadata, ScriptingParamDetails) => Thenable[ScriptingResult]
    ): Self = StObject.set(x, "scriptAsOperation", js.Any.fromFunction4(value))
  }
}
