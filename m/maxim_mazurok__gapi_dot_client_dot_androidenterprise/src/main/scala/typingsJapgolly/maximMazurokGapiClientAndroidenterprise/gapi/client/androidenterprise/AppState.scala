package typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppState extends StObject {
  
  /** List of keyed app states. This field will always be present. */
  var keyedAppState: js.UndefOr[js.Array[KeyedAppState]] = js.undefined
  
  /** The package name of the app. This field will always be present. */
  var packageName: js.UndefOr[String] = js.undefined
}
object AppState {
  
  inline def apply(): AppState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppState]
  }
  
  extension [Self <: AppState](x: Self) {
    
    inline def setKeyedAppState(value: js.Array[KeyedAppState]): Self = StObject.set(x, "keyedAppState", value.asInstanceOf[js.Any])
    
    inline def setKeyedAppStateUndefined: Self = StObject.set(x, "keyedAppState", js.undefined)
    
    inline def setKeyedAppStateVarargs(value: KeyedAppState*): Self = StObject.set(x, "keyedAppState", js.Array(value*))
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
