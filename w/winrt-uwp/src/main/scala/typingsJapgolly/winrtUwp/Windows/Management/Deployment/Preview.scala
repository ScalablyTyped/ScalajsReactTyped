package typingsJapgolly.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Preview {
  
  trait ClassicAppManager extends StObject
  
  trait InstalledClassicAppInfo extends StObject {
    
    var displayName: Any
    
    /* unmapped type */
    var displayVersion: Any
  }
  object InstalledClassicAppInfo {
    
    inline def apply(displayName: Any, displayVersion: Any): InstalledClassicAppInfo = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], displayVersion = displayVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledClassicAppInfo]
    }
    
    extension [Self <: InstalledClassicAppInfo](x: Self) {
      
      inline def setDisplayName(value: Any): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayVersion(value: Any): Self = StObject.set(x, "displayVersion", value.asInstanceOf[js.Any])
    }
  }
}
