package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains types of the recurrence range.
  */
trait ASPxClientRecurrenceRange extends StObject {
  
  /**
    * A recurring appointment will end after the date specified by the ASPxClientRecurrenceInfo.SetEnd method.
    */
  var EndByDate: String
  
  /**
    * A recurring appointment will not have an end date, i.e. infinite recurrence
    */
  var NoEndDate: String
  
  /**
    * A recurring appointment will end after its recurrence count exceeds the value specified by the ASPxClientRecurrenceInfo.SetOccurrenceCount method.
    */
  var OccurrenceCount: String
}
object ASPxClientRecurrenceRange {
  
  inline def apply(EndByDate: String, NoEndDate: String, OccurrenceCount: String): ASPxClientRecurrenceRange = {
    val __obj = js.Dynamic.literal(EndByDate = EndByDate.asInstanceOf[js.Any], NoEndDate = NoEndDate.asInstanceOf[js.Any], OccurrenceCount = OccurrenceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRecurrenceRange]
  }
  
  extension [Self <: ASPxClientRecurrenceRange](x: Self) {
    
    inline def setEndByDate(value: String): Self = StObject.set(x, "EndByDate", value.asInstanceOf[js.Any])
    
    inline def setNoEndDate(value: String): Self = StObject.set(x, "NoEndDate", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceCount(value: String): Self = StObject.set(x, "OccurrenceCount", value.asInstanceOf[js.Any])
  }
}
