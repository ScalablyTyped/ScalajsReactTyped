package typingsJapgolly.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.`multi-period`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiPeriodMarkingProps
  extends StObject
     with _CalendarMarkingProps {
  
  var markedDates: StringDictionary[MultiPeriodMarking]
  
  var markingType: `multi-period`
}
object MultiPeriodMarkingProps {
  
  inline def apply(markedDates: StringDictionary[MultiPeriodMarking]): MultiPeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = "multi-period")
    __obj.asInstanceOf[MultiPeriodMarkingProps]
  }
  
  extension [Self <: MultiPeriodMarkingProps](x: Self) {
    
    inline def setMarkedDates(value: StringDictionary[MultiPeriodMarking]): Self = StObject.set(x, "markedDates", value.asInstanceOf[js.Any])
    
    inline def setMarkingType(value: `multi-period`): Self = StObject.set(x, "markingType", value.asInstanceOf[js.Any])
  }
}
