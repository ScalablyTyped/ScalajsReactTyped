package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AadUserNotificationRecipient
  extends StObject
     with TeamworkNotificationRecipient {
  
  // Azure AD user identifier. Use the List users method to get this ID.
  var userId: js.UndefOr[String] = js.undefined
}
object AadUserNotificationRecipient {
  
  inline def apply(): AadUserNotificationRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AadUserNotificationRecipient]
  }
  
  extension [Self <: AadUserNotificationRecipient](x: Self) {
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
