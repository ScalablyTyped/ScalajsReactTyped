package typingsJapgolly.nivoCalendar.distTypesTypesMod

import typingsJapgolly.nivoCalendar.anon.ValueString
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.date
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.value
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DateOrString = String | js.Date

type TimeRangeTooltipProps = (Omit[TimeRangeDayData, date | value]) & ValueString
