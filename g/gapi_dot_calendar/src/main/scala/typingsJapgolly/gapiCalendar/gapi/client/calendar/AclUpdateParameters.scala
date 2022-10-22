package typingsJapgolly.gapiCalendar.gapi.client.calendar

import typingsJapgolly.gapiCalendar.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AclUpdateParameters
  extends StObject
     with AclInsertParameters {
  
  var ruleId: String
}
object AclUpdateParameters {
  
  inline def apply(calendarId: String, role: AccessRole, ruleId: String, scope: Value): AclUpdateParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclUpdateParameters]
  }
  
  extension [Self <: AclUpdateParameters](x: Self) {
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
  }
}
