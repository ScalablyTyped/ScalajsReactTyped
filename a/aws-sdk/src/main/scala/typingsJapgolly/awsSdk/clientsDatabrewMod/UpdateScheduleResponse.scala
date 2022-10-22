package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScheduleResponse extends StObject {
  
  /**
    * The name of the schedule that was updated.
    */
  var Name: ScheduleName
}
object UpdateScheduleResponse {
  
  inline def apply(Name: ScheduleName): UpdateScheduleResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScheduleResponse]
  }
  
  extension [Self <: UpdateScheduleResponse](x: Self) {
    
    inline def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
