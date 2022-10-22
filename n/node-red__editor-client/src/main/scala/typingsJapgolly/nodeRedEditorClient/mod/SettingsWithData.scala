package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodeRedEditorClient.anon.ApiRootUrl
import typingsJapgolly.nodeRedRuntime.mod.LocalSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsWithData
  extends StObject
     with Settings
     with LocalSettings
object SettingsWithData {
  
  inline def apply(
    get: (String, Any) => Any,
    init: (ApiRootUrl, js.Function0[Unit]) => Callback,
    load: js.Function0[Unit] => Callback,
    loadUserSettings: js.Function0[Unit] => Callback,
    remove: String => Callback,
    set: (String, Any) => Callback,
    theme: (String, Any) => Any,
    uiHost: String,
    uiPort: Double
  ): SettingsWithData = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), init = js.Any.fromFunction2((t0: ApiRootUrl, t1: js.Function0[Unit]) => (init(t0, t1)).runNow()), load = js.Any.fromFunction1((t0: js.Function0[Unit]) => load(t0).runNow()), loadUserSettings = js.Any.fromFunction1((t0: js.Function0[Unit]) => loadUserSettings(t0).runNow()), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), set = js.Any.fromFunction2((t0: String, t1: Any) => (set(t0, t1)).runNow()), theme = js.Any.fromFunction2(theme), uiHost = uiHost.asInstanceOf[js.Any], uiPort = uiPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsWithData]
  }
}
