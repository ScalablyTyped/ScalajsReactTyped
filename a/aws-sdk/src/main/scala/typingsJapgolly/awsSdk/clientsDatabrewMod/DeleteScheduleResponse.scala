package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScheduleResponse extends StObject {
  
  /**
    * The name of the schedule that was deleted.
    */
  var Name: ScheduleName
}
object DeleteScheduleResponse {
  
  inline def apply(Name: ScheduleName): DeleteScheduleResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduleResponse]
  }
  
  extension [Self <: DeleteScheduleResponse](x: Self) {
    
    inline def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
