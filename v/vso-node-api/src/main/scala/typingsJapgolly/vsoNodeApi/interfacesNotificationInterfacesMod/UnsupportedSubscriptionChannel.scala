package typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsupportedSubscriptionChannel extends StObject {
  
  var `type`: String
}
object UnsupportedSubscriptionChannel {
  
  inline def apply(`type`: String): UnsupportedSubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedSubscriptionChannel]
  }
  
  extension [Self <: UnsupportedSubscriptionChannel](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
