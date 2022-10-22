package typingsJapgolly.nivoCalendar

import typingsJapgolly.nivoCalendar.anon.BboxBBox
import typingsJapgolly.nivoCalendar.anon.CalendarHeight
import typingsJapgolly.nivoCalendar.anon.Color
import typingsJapgolly.nivoCalendar.anon.Data
import typingsJapgolly.nivoCalendar.anon.Direction
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPrAlign
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPrColorScale
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPrData
import typingsJapgolly.nivoCalendar.anon.Rotation
import typingsJapgolly.nivoCalendar.anon.X
import typingsJapgolly.nivoCalendar.anon.YearLegendOffset
import typingsJapgolly.nivoCalendar.distTypesTypesMod.ColorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/calendar/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCalendarLayout(
    hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign: PickRequiredCalendarSvgPrAlign
  ): CalendarHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("useCalendarLayout")(hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign.asInstanceOf[js.Any]).asInstanceOf[CalendarHeight]
  
  inline def useColorScale(hasDataMinValueMaxValueColorsColorScale: PickRequiredCalendarSvgPrColorScale): ColorScale = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorScale")(hasDataMinValueMaxValueColorsColorScale.asInstanceOf[js.Any]).asInstanceOf[ColorScale]
  
  inline def useDays(hasDaysDataColorScaleEmptyColor: PickRequiredCalendarSvgPrData): js.Array[Color | Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDays")(hasDaysDataColorScaleEmptyColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color | Data]]
  
  inline def useMonthLegends[Month /* <: BboxBBox */](hasMonthsDirectionMonthLegendPositionMonthLegendOffset: Direction[Month]): js.Array[Month & Rotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMonthLegends")(hasMonthsDirectionMonthLegendPositionMonthLegendOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[Month & Rotation]]
  
  inline def useYearLegends(hasYearsDirectionYearLegendPositionYearLegendOffset: YearLegendOffset): js.Array[X] = ^.asInstanceOf[js.Dynamic].applyDynamic("useYearLegends")(hasYearsDirectionYearLegendPositionYearLegendOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[X]]
}
