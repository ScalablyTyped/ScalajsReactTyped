package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptingProvider extends DataProvider {
  def registerOnScriptingComplete(handler: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, _]): Unit
  def scriptAsOperation(
    connectionUri: String,
    operation: ScriptOperation,
    metadata: ObjectMetadata,
    paramDetails: ScriptingParamDetails
  ): Thenable[ScriptingResult]
}

object ScriptingProvider {
  @scala.inline
  def apply(
    providerId: String,
    registerOnScriptingComplete: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, js.Any] => Callback,
    scriptAsOperation: (String, ScriptOperation, ObjectMetadata, ScriptingParamDetails) => CallbackTo[Thenable[ScriptingResult]],
    handle: Int | Double = null
  ): ScriptingProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("registerOnScriptingComplete")(js.Any.fromFunction1((t0: js.Function1[
  /* scriptingCompleteResult */ typingsJapgolly.azdata.mod.ScriptingCompleteResult, 
  js.Any]) => registerOnScriptingComplete(t0).runNow()))
    __obj.updateDynamic("scriptAsOperation")(js.Any.fromFunction4((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.ScriptOperation, t2: typingsJapgolly.azdata.mod.ObjectMetadata, t3: typingsJapgolly.azdata.mod.ScriptingParamDetails) => scriptAsOperation(t0, t1, t2, t3).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingProvider]
  }
}

