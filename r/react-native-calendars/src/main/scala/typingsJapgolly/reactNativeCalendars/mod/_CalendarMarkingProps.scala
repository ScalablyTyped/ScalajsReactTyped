package typingsJapgolly.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _CalendarMarkingProps extends StObject
object _CalendarMarkingProps {
  
  inline def CustomMarkingProps(markedDates: StringDictionary[CustomMarking]): typingsJapgolly.reactNativeCalendars.mod.CustomMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = "custom")
    __obj.asInstanceOf[typingsJapgolly.reactNativeCalendars.mod.CustomMarkingProps]
  }
  
  inline def DotMarkingProps(markedDates: StringDictionary[DotMarking]): typingsJapgolly.reactNativeCalendars.mod.DotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNativeCalendars.mod.DotMarkingProps]
  }
  
  inline def MultiDotMarkingProps(markedDates: StringDictionary[MultiDotMarking]): typingsJapgolly.reactNativeCalendars.mod.MultiDotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = "multi-dot")
    __obj.asInstanceOf[typingsJapgolly.reactNativeCalendars.mod.MultiDotMarkingProps]
  }
  
  inline def MultiPeriodMarkingProps(markedDates: StringDictionary[MultiPeriodMarking]): typingsJapgolly.reactNativeCalendars.mod.MultiPeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = "multi-period")
    __obj.asInstanceOf[typingsJapgolly.reactNativeCalendars.mod.MultiPeriodMarkingProps]
  }
  
  inline def PeriodMarkingProps(markedDates: StringDictionary[PeriodMarking]): typingsJapgolly.reactNativeCalendars.mod.PeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = "period")
    __obj.asInstanceOf[typingsJapgolly.reactNativeCalendars.mod.PeriodMarkingProps]
  }
}
