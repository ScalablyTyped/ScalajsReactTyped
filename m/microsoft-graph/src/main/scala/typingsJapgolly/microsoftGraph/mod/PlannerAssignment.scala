package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerAssignment extends StObject {
  
  // The identity of the user that performed the assignment of the task, i.e. the assignor.
  var assignedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * The time at which the task was assigned. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var assignedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Hint used to order assignees in a task. The format is defined as outlined here.
  var orderHint: js.UndefOr[NullableOption[String]] = js.undefined
}
object PlannerAssignment {
  
  inline def apply(): PlannerAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerAssignment]
  }
  
  extension [Self <: PlannerAssignment](x: Self) {
    
    inline def setAssignedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "assignedBy", value.asInstanceOf[js.Any])
    
    inline def setAssignedByNull: Self = StObject.set(x, "assignedBy", null)
    
    inline def setAssignedByUndefined: Self = StObject.set(x, "assignedBy", js.undefined)
    
    inline def setAssignedDateTime(value: NullableOption[String]): Self = StObject.set(x, "assignedDateTime", value.asInstanceOf[js.Any])
    
    inline def setAssignedDateTimeNull: Self = StObject.set(x, "assignedDateTime", null)
    
    inline def setAssignedDateTimeUndefined: Self = StObject.set(x, "assignedDateTime", js.undefined)
    
    inline def setOrderHint(value: NullableOption[String]): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    inline def setOrderHintNull: Self = StObject.set(x, "orderHint", null)
    
    inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
  }
}
