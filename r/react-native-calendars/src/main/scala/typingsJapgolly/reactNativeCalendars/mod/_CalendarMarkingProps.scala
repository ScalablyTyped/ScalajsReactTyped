package typingsJapgolly.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.`multi-dot`
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.`multi-period`
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.custom
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.period
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CalendarMarkingProps extends js.Object

object _CalendarMarkingProps {
  @scala.inline
  def CustomMarkingProps(markedDates: StringDictionary[CustomMarking], markingType: custom): _CalendarMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_CalendarMarkingProps]
  }
  @scala.inline
  def PeriodMarkingProps(markedDates: StringDictionary[PeriodMarking], markingType: period): _CalendarMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_CalendarMarkingProps]
  }
  @scala.inline
  def MultiPeriodMarkingProps(markedDates: StringDictionary[MultiPeriodMarking], markingType: `multi-period`): _CalendarMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_CalendarMarkingProps]
  }
  @scala.inline
  def DotMarkingProps(markedDates: StringDictionary[DotMarking], markingType: simple = null): _CalendarMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any])
    if (markingType != null) __obj.updateDynamic("markingType")(markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CalendarMarkingProps]
  }
  @scala.inline
  def MultiDotMarkingProps(markedDates: StringDictionary[MultiDotMarking], markingType: `multi-dot`): _CalendarMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_CalendarMarkingProps]
  }
}

