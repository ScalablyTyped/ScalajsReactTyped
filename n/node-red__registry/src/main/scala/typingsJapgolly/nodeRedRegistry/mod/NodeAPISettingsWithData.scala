package typingsJapgolly.nodeRedRegistry.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocalSettings * / any */ trait NodeAPISettingsWithData
  extends StObject
     with NodeAPISettings
object NodeAPISettingsWithData {
  
  inline def apply(
    available: CallbackTo[Boolean],
    delete: String => js.Promise[Unit],
    disableNodeSettings: js.Array[String] => Callback,
    enableNodeSettings: js.Array[String] => Callback,
    exportNodeSettings: js.Object => js.Object,
    get: String => Any,
    getUserSettings: String => Callback,
    registerNodeSettings: (String, js.Object) => Callback,
    set: (String, Any) => js.Promise[Unit],
    setUserSettings: (String, js.Object) => js.Promise[Unit]
  ): NodeAPISettingsWithData = {
    val __obj = js.Dynamic.literal(available = available.toJsFn, delete = js.Any.fromFunction1(delete), disableNodeSettings = js.Any.fromFunction1((t0: js.Array[String]) => disableNodeSettings(t0).runNow()), enableNodeSettings = js.Any.fromFunction1((t0: js.Array[String]) => enableNodeSettings(t0).runNow()), exportNodeSettings = js.Any.fromFunction1(exportNodeSettings), get = js.Any.fromFunction1(get), getUserSettings = js.Any.fromFunction1((t0: String) => getUserSettings(t0).runNow()), registerNodeSettings = js.Any.fromFunction2((t0: String, t1: js.Object) => (registerNodeSettings(t0, t1)).runNow()), set = js.Any.fromFunction2(set), setUserSettings = js.Any.fromFunction2(setUserSettings))
    __obj.asInstanceOf[NodeAPISettingsWithData]
  }
}
