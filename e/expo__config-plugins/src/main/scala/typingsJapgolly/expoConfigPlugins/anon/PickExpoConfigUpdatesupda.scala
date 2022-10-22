package typingsJapgolly.expoConfigPlugins.anon

import typingsJapgolly.expoConfigTypes.anon.CheckAutomatically
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-plugins.@expo/config-plugins/build/utils/Updates.ExpoConfigUpdates, 'updates'> */
trait PickExpoConfigUpdatesupda extends StObject {
  
  var updates: js.UndefOr[CheckAutomatically] = js.undefined
}
object PickExpoConfigUpdatesupda {
  
  inline def apply(): PickExpoConfigUpdatesupda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigUpdatesupda]
  }
  
  extension [Self <: PickExpoConfigUpdatesupda](x: Self) {
    
    inline def setUpdates(value: CheckAutomatically): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
  }
}
