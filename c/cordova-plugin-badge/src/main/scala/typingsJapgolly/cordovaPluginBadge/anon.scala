package typingsJapgolly.cordovaPluginBadge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Badge extends StObject {
    
    var badge: CordovaPluginBadge
  }
  object Badge {
    
    inline def apply(badge: CordovaPluginBadge): Badge = {
      val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any])
      __obj.asInstanceOf[Badge]
    }
    
    extension [Self <: Badge](x: Self) {
      
      inline def setBadge(value: CordovaPluginBadge): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    }
  }
}
