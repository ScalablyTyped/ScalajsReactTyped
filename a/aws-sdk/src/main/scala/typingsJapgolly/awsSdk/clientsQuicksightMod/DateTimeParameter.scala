package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeParameter extends StObject {
  
  /**
    * A display name for the date-time parameter.
    */
  var Name: NonEmptyString
  
  /**
    * The values for the date-time parameter.
    */
  var Values: TimestampList
}
object DateTimeParameter {
  
  inline def apply(Name: NonEmptyString, Values: TimestampList): DateTimeParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeParameter]
  }
  
  extension [Self <: DateTimeParameter](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: TimestampList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: js.Date*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
