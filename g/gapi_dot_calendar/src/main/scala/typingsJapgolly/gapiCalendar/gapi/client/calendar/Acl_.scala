package typingsJapgolly.gapiCalendar.gapi.client.calendar

import typingsJapgolly.gapiCalendar.anon.Type
import typingsJapgolly.gapiCalendar.gapiCalendarStrings.calendarNumbersignaclRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acl_ extends StObject {
  
  var etag: typingsJapgolly.gapiCalendar.gapi.client.calendar.etag
  
  var id: String
  
  var kind: calendarNumbersignaclRule
  
  var role: AccessRole
  
  var scope: Type
}
object Acl_ {
  
  inline def apply(etag: etag, id: String, role: AccessRole, scope: Type): Acl_ = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "calendar#aclRule", role = role.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acl_]
  }
  
  extension [Self <: Acl_](x: Self) {
    
    inline def setEtag(value: etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: calendarNumbersignaclRule): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setRole(value: AccessRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Type): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
