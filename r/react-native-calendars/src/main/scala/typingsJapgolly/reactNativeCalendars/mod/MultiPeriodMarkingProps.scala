package typingsJapgolly.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.`multi-period`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPeriodMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[MultiPeriodMarking]
  var markingType: `multi-period`
}

object MultiPeriodMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[MultiPeriodMarking], markingType: `multi-period`): MultiPeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiPeriodMarkingProps]
  }
}

