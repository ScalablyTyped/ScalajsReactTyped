package typingsJapgolly.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.`multi-dot`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiDotMarkingProps
  extends StObject
     with _CalendarMarkingProps {
  
  var markedDates: StringDictionary[MultiDotMarking]
  
  var markingType: `multi-dot`
}
object MultiDotMarkingProps {
  
  inline def apply(markedDates: StringDictionary[MultiDotMarking]): MultiDotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = "multi-dot")
    __obj.asInstanceOf[MultiDotMarkingProps]
  }
  
  extension [Self <: MultiDotMarkingProps](x: Self) {
    
    inline def setMarkedDates(value: StringDictionary[MultiDotMarking]): Self = StObject.set(x, "markedDates", value.asInstanceOf[js.Any])
    
    inline def setMarkingType(value: `multi-dot`): Self = StObject.set(x, "markingType", value.asInstanceOf[js.Any])
  }
}
