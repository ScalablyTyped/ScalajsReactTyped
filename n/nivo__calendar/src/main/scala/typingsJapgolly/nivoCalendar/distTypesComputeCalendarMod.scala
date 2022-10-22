package typingsJapgolly.nivoCalendar

import typingsJapgolly.nivoCalendar.anon.BboxBBox
import typingsJapgolly.nivoCalendar.anon.CalendarHeight
import typingsJapgolly.nivoCalendar.anon.Color
import typingsJapgolly.nivoCalendar.anon.Data
import typingsJapgolly.nivoCalendar.anon.Months
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPr
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPrAlign
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPrDirection
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPrOffset
import typingsJapgolly.nivoCalendar.anon.Rotation
import typingsJapgolly.nivoCalendar.anon.X
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarDatum
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.auto
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeCalendarMod {
  
  @JSImport("@nivo/calendar/dist/types/compute/calendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindDaysData(hasDaysDataColorScaleEmptyColor: PickRequiredCalendarSvgPr): js.Array[Color | Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindDaysData")(hasDaysDataColorScaleEmptyColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color | Data]]
  
  inline def computeDomain_auto(
    data: js.Array[CalendarDatum],
    minSpec: NonNullable[js.UndefOr[auto | Double]],
    maxSpec: NonNullable[js.UndefOr[auto | Double]]
  ): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDomain")(data.asInstanceOf[js.Any], minSpec.asInstanceOf[js.Any], maxSpec.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def computeLayout(
    hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign: PickRequiredCalendarSvgPrAlign
  ): CalendarHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLayout")(hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign.asInstanceOf[js.Any]).asInstanceOf[CalendarHeight]
  
  inline def computeMonthLegendPositions[Month /* <: BboxBBox */](hasMonthsDirectionPositionOffset: PickRequiredCalendarSvgPrDirection & Months[Month]): js.Array[Month & Rotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMonthLegendPositions")(hasMonthsDirectionPositionOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[Month & Rotation]]
  
  inline def computeYearLegendPositions(hasYearsDirectionPositionOffset: PickRequiredCalendarSvgPrOffset): js.Array[X] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeYearLegendPositions")(hasYearsDirectionPositionOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[X]]
}
