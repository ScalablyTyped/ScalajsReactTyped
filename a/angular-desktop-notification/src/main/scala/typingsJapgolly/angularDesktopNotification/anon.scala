package typingsJapgolly.angularDesktopNotification

import typingsJapgolly.angularDesktopNotification.angularDesktopNotificationStrings.default
import typingsJapgolly.angularDesktopNotification.angularDesktopNotificationStrings.denied
import typingsJapgolly.angularDesktopNotification.angularDesktopNotificationStrings.granted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default extends StObject {
    
    var default: typingsJapgolly.angularDesktopNotification.angularDesktopNotificationStrings.default
    
    var denied: typingsJapgolly.angularDesktopNotification.angularDesktopNotificationStrings.denied
    
    var granted: typingsJapgolly.angularDesktopNotification.angularDesktopNotificationStrings.granted
  }
  object Default {
    
    inline def apply(): Default = {
      val __obj = js.Dynamic.literal(default = "default", denied = "denied", granted = "granted")
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: default): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDenied(value: denied): Self = StObject.set(x, "denied", value.asInstanceOf[js.Any])
      
      inline def setGranted(value: granted): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
    }
  }
}
