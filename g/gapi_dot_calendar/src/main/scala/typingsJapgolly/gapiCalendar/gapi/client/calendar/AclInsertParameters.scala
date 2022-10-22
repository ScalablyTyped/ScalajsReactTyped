package typingsJapgolly.gapiCalendar.gapi.client.calendar

import typingsJapgolly.gapiCalendar.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AclInsertParameters extends StObject {
  
  var calendarId: String
  
  // Acl resource
  var role: AccessRole
  
  var scope: Value
}
object AclInsertParameters {
  
  inline def apply(calendarId: String, role: AccessRole, scope: Value): AclInsertParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclInsertParameters]
  }
  
  extension [Self <: AclInsertParameters](x: Self) {
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setRole(value: AccessRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Value): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
