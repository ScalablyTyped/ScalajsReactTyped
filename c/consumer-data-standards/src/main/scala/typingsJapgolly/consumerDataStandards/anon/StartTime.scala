package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.FRI
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MON
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PUBLIC_HOLIDAYS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SAT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SUN
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.THU
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TUE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.WED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTime
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The days that the rate applies to
    */
  var days: js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS]
  
  /**
    * End of the period
    */
  var endTime: String
  
  /**
    * Start of the period
    */
  var startTime: String
}
object StartTime {
  
  inline def apply(
    days: js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS],
    endTime: String,
    startTime: String
  ): StartTime = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTime]
  }
  
  extension [Self <: StartTime](x: Self) {
    
    inline def setDays(value: js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysVarargs(value: (SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS)*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
