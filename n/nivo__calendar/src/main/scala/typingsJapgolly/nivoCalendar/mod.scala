package typingsJapgolly.nivoCalendar

import typingsJapgolly.nivoCalendar.anon.BboxBBox
import typingsJapgolly.nivoCalendar.anon.CalendarHeight
import typingsJapgolly.nivoCalendar.anon.CellHeight
import typingsJapgolly.nivoCalendar.anon.Color
import typingsJapgolly.nivoCalendar.anon.Coordinates
import typingsJapgolly.nivoCalendar.anon.Data
import typingsJapgolly.nivoCalendar.anon.Direction
import typingsJapgolly.nivoCalendar.anon.FirstWeek
import typingsJapgolly.nivoCalendar.anon.Months
import typingsJapgolly.nivoCalendar.anon.OmitCalendarCanvasPropswi
import typingsJapgolly.nivoCalendar.anon.OmitCalendarSvgPropsheigh
import typingsJapgolly.nivoCalendar.anon.OmitTimeRangeSvgPropsheig
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPr
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPrAlign
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPrColorScale
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPrData
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPrDirection
import typingsJapgolly.nivoCalendar.anon.PickRequiredCalendarSvgPrOffset
import typingsJapgolly.nivoCalendar.anon.Rotation
import typingsJapgolly.nivoCalendar.anon.Value
import typingsJapgolly.nivoCalendar.anon.Weeks
import typingsJapgolly.nivoCalendar.anon.X
import typingsJapgolly.nivoCalendar.anon.YearLegendOffset
import typingsJapgolly.nivoCalendar.distTypesComputeTimeRangeMod.ComputeCellPositions_
import typingsJapgolly.nivoCalendar.distTypesComputeTimeRangeMod.ComputeCellSize_
import typingsJapgolly.nivoCalendar.distTypesComputeTimeRangeMod.ComputeMonths
import typingsJapgolly.nivoCalendar.distTypesComputeTimeRangeMod.ComputeTotalDays_
import typingsJapgolly.nivoCalendar.distTypesComputeTimeRangeMod.ComputeWeekdays_
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarCanvasProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarDatum
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarLegendProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarSvgProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.CalendarTooltipProps
import typingsJapgolly.nivoCalendar.distTypesTypesMod.ColorScale
import typingsJapgolly.nivoCalendar.distTypesTypesMod.TimeRangeSvgProps
import typingsJapgolly.nivoCalendar.nivoCalendarBooleans.`true`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`0`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`10`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`1`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`2`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`30`
import typingsJapgolly.nivoCalendar.nivoCalendarInts.`75`
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.Numbersign000
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.Numbersignfff
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.auto
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.before
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.center
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.horizontal
import typingsJapgolly.nivoCalendar.nivoCalendarStrings.img
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/calendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Calendar(hasIsInteractiveRenderWrapperThemeProps: CalendarSvgProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Calendar")(hasIsInteractiveRenderWrapperThemeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CalendarCanvas(hasIsInteractiveRenderWrapperThemeProps: CalendarCanvasProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CalendarCanvas")(hasIsInteractiveRenderWrapperThemeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveCalendar(props: OmitCalendarSvgPropsheigh): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveCalendar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveCalendarCanvas(props: OmitCalendarCanvasPropswi): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveCalendarCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveTimeRange(props: OmitTimeRangeSvgPropsheig): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveTimeRange")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimeRange(hasIsInteractiveRenderWrapperThemeProps: TimeRangeSvgProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimeRange")(hasIsInteractiveRenderWrapperThemeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def bindDaysData(hasDaysDataColorScaleEmptyColor: PickRequiredCalendarSvgPr): js.Array[Color | Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindDaysData")(hasDaysDataColorScaleEmptyColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color | Data]]
  
  object calendarCanvasDefaultProps {
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.align")
    @js.native
    val align: center = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.colors")
    @js.native
    val colors: js.Array[String] = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.dayBorderColor")
    @js.native
    val dayBorderColor: Numbersign000 = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.dayBorderWidth")
    @js.native
    val dayBorderWidth: `1` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.daySpacing")
    @js.native
    val daySpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.direction")
    @js.native
    val direction: horizontal = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.emptyColor")
    @js.native
    val emptyColor: Numbersignfff = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.isInteractive")
    @js.native
    val isInteractive: `true` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.legends")
    @js.native
    val legends: js.Array[CalendarLegendProps] = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.maxValue")
    @js.native
    val maxValue: auto = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.minValue")
    @js.native
    val minValue: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.monthBorderColor")
    @js.native
    val monthBorderColor: Numbersign000 = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.monthBorderWidth")
    @js.native
    val monthBorderWidth: `2` = js.native
    
    inline def monthLegend(_year: Double, _month: Double, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("monthLegend")(_year.asInstanceOf[js.Any], _month.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.monthLegendOffset")
    @js.native
    val monthLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.monthLegendPosition")
    @js.native
    val monthLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.monthSpacing")
    @js.native
    val monthSpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.pixelRatio")
    @js.native
    val pixelRatio: Double = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.tooltip")
    @js.native
    val tooltip: MemoExoticComponent[js.Function1[/* hasValueDayColor */ CalendarTooltipProps, Element | Null]] = js.native
    
    inline def yearLegend(year: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("yearLegend")(year.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.yearLegendOffset")
    @js.native
    val yearLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.yearLegendPosition")
    @js.native
    val yearLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "calendarCanvasDefaultProps.yearSpacing")
    @js.native
    val yearSpacing: `30` = js.native
  }
  
  object calendarDefaultProps {
    
    @JSImport("@nivo/calendar", "calendarDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.align")
    @js.native
    val align: center = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.colors")
    @js.native
    val colors: js.Array[String] = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.dayBorderColor")
    @js.native
    val dayBorderColor: Numbersign000 = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.dayBorderWidth")
    @js.native
    val dayBorderWidth: `1` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.daySpacing")
    @js.native
    val daySpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.direction")
    @js.native
    val direction: horizontal = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.emptyColor")
    @js.native
    val emptyColor: Numbersignfff = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.isInteractive")
    @js.native
    val isInteractive: `true` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.legends")
    @js.native
    val legends: js.Array[CalendarLegendProps] = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.maxValue")
    @js.native
    val maxValue: auto = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.minValue")
    @js.native
    val minValue: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.monthBorderColor")
    @js.native
    val monthBorderColor: Numbersign000 = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.monthBorderWidth")
    @js.native
    val monthBorderWidth: `2` = js.native
    
    inline def monthLegend(_year: Double, _month: Double, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("monthLegend")(_year.asInstanceOf[js.Any], _month.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.monthLegendOffset")
    @js.native
    val monthLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.monthLegendPosition")
    @js.native
    val monthLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.monthSpacing")
    @js.native
    val monthSpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.role")
    @js.native
    val role: img = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.tooltip")
    @js.native
    val tooltip: MemoExoticComponent[js.Function1[/* hasValueDayColor */ CalendarTooltipProps, Element | Null]] = js.native
    
    inline def yearLegend(year: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("yearLegend")(year.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.yearLegendOffset")
    @js.native
    val yearLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.yearLegendPosition")
    @js.native
    val yearLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "calendarDefaultProps.yearSpacing")
    @js.native
    val yearSpacing: `30` = js.native
  }
  
  inline def computeCellPositions(
    hasDirectionColorScaleEmptyColorFromToDataCellWidthCellHeightDaySpacingOffset: ComputeCellPositions_
  ): js.Array[Coordinates | FirstWeek] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCellPositions")(hasDirectionColorScaleEmptyColorFromToDataCellWidthCellHeightDaySpacingOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[Coordinates | FirstWeek]]
  
  inline def computeCellSize(hasDirectionDaySpacingOffsetSquareTotalDaysWidthHeight: ComputeCellSize_): CellHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCellSize")(hasDirectionDaySpacingOffsetSquareTotalDaysWidthHeight.asInstanceOf[js.Any]).asInstanceOf[CellHeight]
  
  inline def computeDomain_auto(
    data: js.Array[CalendarDatum],
    minSpec: NonNullable[js.UndefOr[auto | Double]],
    maxSpec: NonNullable[js.UndefOr[auto | Double]]
  ): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDomain")(data.asInstanceOf[js.Any], minSpec.asInstanceOf[js.Any], maxSpec.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def computeLayout(
    hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign: PickRequiredCalendarSvgPrAlign
  ): CalendarHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLayout")(hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign.asInstanceOf[js.Any]).asInstanceOf[CalendarHeight]
  
  inline def computeMonthLegendPositions[Month /* <: BboxBBox */](hasMonthsDirectionPositionOffset: PickRequiredCalendarSvgPrDirection & Months[Month]): js.Array[Month & Rotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMonthLegendPositions")(hasMonthsDirectionPositionOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[Month & Rotation]]
  
  inline def computeMonthLegends(hasDirectionDaySpacingDaysCellHeightCellWidth: ComputeMonths): Weeks = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMonthLegends")(hasDirectionDaySpacingDaysCellHeightCellWidth.asInstanceOf[js.Any]).asInstanceOf[Weeks]
  
  inline def computeTotalDays(hasFromToData: ComputeTotalDays_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTotalDays")(hasFromToData.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def computeWeekdays(hasCellHeightCellWidthDirectionDaySpacingTicksArrayOfWeekdays: ComputeWeekdays_): js.Array[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeWeekdays")(hasCellHeightCellWidthDirectionDaySpacingTicksArrayOfWeekdays.asInstanceOf[js.Any]).asInstanceOf[js.Array[Value]]
  
  inline def computeYearLegendPositions(hasYearsDirectionPositionOffset: PickRequiredCalendarSvgPrOffset): js.Array[X] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeYearLegendPositions")(hasYearsDirectionPositionOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[X]]
  
  object timeRangeDefaultProps {
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.align")
    @js.native
    val align: center = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.colors")
    @js.native
    val colors: js.Array[String] = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.dayBorderColor")
    @js.native
    val dayBorderColor: Numbersignfff = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.dayBorderWidth")
    @js.native
    val dayBorderWidth: `1` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.dayRadius")
    @js.native
    val dayRadius: `0` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.daySpacing")
    @js.native
    val daySpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.direction")
    @js.native
    val direction: horizontal = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.emptyColor")
    @js.native
    val emptyColor: Numbersignfff = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.isInteractive")
    @js.native
    val isInteractive: `true` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.legends")
    @js.native
    val legends: js.Array[CalendarLegendProps] = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.maxValue")
    @js.native
    val maxValue: auto = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.minValue")
    @js.native
    val minValue: `0` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.monthBorderColor")
    @js.native
    val monthBorderColor: Numbersign000 = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.monthBorderWidth")
    @js.native
    val monthBorderWidth: `2` = js.native
    
    inline def monthLegend(_year: Double, _month: Double, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("monthLegend")(_year.asInstanceOf[js.Any], _month.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.monthLegendOffset")
    @js.native
    val monthLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.monthLegendPosition")
    @js.native
    val monthLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.monthSpacing")
    @js.native
    val monthSpacing: `0` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.role")
    @js.native
    val role: img = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.square")
    @js.native
    val square: `true` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.tooltip")
    @js.native
    val tooltip: MemoExoticComponent[js.Function1[/* hasValueDayColor */ CalendarTooltipProps, Element | Null]] = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.weekdayLegendOffset")
    @js.native
    val weekdayLegendOffset: `75` = js.native
    
    inline def yearLegend(year: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("yearLegend")(year.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.yearLegendOffset")
    @js.native
    val yearLegendOffset: `10` = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.yearLegendPosition")
    @js.native
    val yearLegendPosition: before = js.native
    
    @JSImport("@nivo/calendar", "timeRangeDefaultProps.yearSpacing")
    @js.native
    val yearSpacing: `30` = js.native
  }
  
  inline def useCalendarLayout(
    hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign: PickRequiredCalendarSvgPrAlign
  ): CalendarHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("useCalendarLayout")(hasWidthHeightFromToDirectionYearSpacingMonthSpacingDaySpacingAlign.asInstanceOf[js.Any]).asInstanceOf[CalendarHeight]
  
  inline def useColorScale(hasDataMinValueMaxValueColorsColorScale: PickRequiredCalendarSvgPrColorScale): ColorScale = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorScale")(hasDataMinValueMaxValueColorsColorScale.asInstanceOf[js.Any]).asInstanceOf[ColorScale]
  
  inline def useDays(hasDaysDataColorScaleEmptyColor: PickRequiredCalendarSvgPrData): js.Array[Color | Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDays")(hasDaysDataColorScaleEmptyColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color | Data]]
  
  inline def useMonthLegends[Month /* <: BboxBBox */](hasMonthsDirectionMonthLegendPositionMonthLegendOffset: Direction[Month]): js.Array[Month & Rotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMonthLegends")(hasMonthsDirectionMonthLegendPositionMonthLegendOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[Month & Rotation]]
  
  inline def useYearLegends(hasYearsDirectionYearLegendPositionYearLegendOffset: YearLegendOffset): js.Array[X] = ^.asInstanceOf[js.Dynamic].applyDynamic("useYearLegends")(hasYearsDirectionYearLegendPositionYearLegendOffset.asInstanceOf[js.Any]).asInstanceOf[js.Array[X]]
}
