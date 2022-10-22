package typingsJapgolly.fluentuiDateTimeUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateValuesDateValuesMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "DAYS_IN_WEEK")
  @js.native
  val DAYS_IN_WEEK: /* 7 */ Double = js.native
  
  @js.native
  sealed trait DateRangeType extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DateRangeType & Double] = js.native
    
    @js.native
    sealed trait Day
      extends StObject
         with DateRangeType
    /* 0 */ val Day: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Day & Double = js.native
    
    @js.native
    sealed trait Month
      extends StObject
         with DateRangeType
    /* 2 */ val Month: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Month & Double = js.native
    
    @js.native
    sealed trait Week
      extends StObject
         with DateRangeType
    /* 1 */ val Week: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Week & Double = js.native
    
    @js.native
    sealed trait WorkWeek
      extends StObject
         with DateRangeType
    /* 3 */ val WorkWeek: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.WorkWeek & Double = js.native
  }
  
  @js.native
  sealed trait DayOfWeek extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DayOfWeek & Double] = js.native
    
    @js.native
    sealed trait Friday
      extends StObject
         with DayOfWeek
    /* 5 */ val Friday: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Friday & Double = js.native
    
    @js.native
    sealed trait Monday
      extends StObject
         with DayOfWeek
    /* 1 */ val Monday: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Monday & Double = js.native
    
    @js.native
    sealed trait Saturday
      extends StObject
         with DayOfWeek
    /* 6 */ val Saturday: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Saturday & Double = js.native
    
    @js.native
    sealed trait Sunday
      extends StObject
         with DayOfWeek
    /* 0 */ val Sunday: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Sunday & Double = js.native
    
    @js.native
    sealed trait Thursday
      extends StObject
         with DayOfWeek
    /* 4 */ val Thursday: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Thursday & Double = js.native
    
    @js.native
    sealed trait Tuesday
      extends StObject
         with DayOfWeek
    /* 2 */ val Tuesday: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Tuesday & Double = js.native
    
    @js.native
    sealed trait Wednesday
      extends StObject
         with DayOfWeek
    /* 3 */ val Wednesday: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Wednesday & Double = js.native
  }
  
  @js.native
  sealed trait FirstWeekOfYear extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "FirstWeekOfYear")
  @js.native
  object FirstWeekOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FirstWeekOfYear & Double] = js.native
    
    @js.native
    sealed trait FirstDay
      extends StObject
         with FirstWeekOfYear
    /* 0 */ val FirstDay: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstDay & Double = js.native
    
    @js.native
    sealed trait FirstFourDayWeek
      extends StObject
         with FirstWeekOfYear
    /* 2 */ val FirstFourDayWeek: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstFourDayWeek & Double = js.native
    
    @js.native
    sealed trait FirstFullWeek
      extends StObject
         with FirstWeekOfYear
    /* 1 */ val FirstFullWeek: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstFullWeek & Double = js.native
  }
  
  @js.native
  sealed trait MonthOfYear extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "MonthOfYear")
  @js.native
  object MonthOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MonthOfYear & Double] = js.native
    
    @js.native
    sealed trait April
      extends StObject
         with MonthOfYear
    /* 3 */ val April: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.April & Double = js.native
    
    @js.native
    sealed trait August
      extends StObject
         with MonthOfYear
    /* 7 */ val August: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.August & Double = js.native
    
    @js.native
    sealed trait December
      extends StObject
         with MonthOfYear
    /* 11 */ val December: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.December & Double = js.native
    
    @js.native
    sealed trait February
      extends StObject
         with MonthOfYear
    /* 1 */ val February: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.February & Double = js.native
    
    @js.native
    sealed trait January
      extends StObject
         with MonthOfYear
    /* 0 */ val January: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.January & Double = js.native
    
    @js.native
    sealed trait July
      extends StObject
         with MonthOfYear
    /* 6 */ val July: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.July & Double = js.native
    
    @js.native
    sealed trait June
      extends StObject
         with MonthOfYear
    /* 5 */ val June: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.June & Double = js.native
    
    @js.native
    sealed trait March
      extends StObject
         with MonthOfYear
    /* 2 */ val March: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.March & Double = js.native
    
    @js.native
    sealed trait May
      extends StObject
         with MonthOfYear
    /* 4 */ val May: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.May & Double = js.native
    
    @js.native
    sealed trait November
      extends StObject
         with MonthOfYear
    /* 10 */ val November: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.November & Double = js.native
    
    @js.native
    sealed trait October
      extends StObject
         with MonthOfYear
    /* 9 */ val October: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.October & Double = js.native
    
    @js.native
    sealed trait September
      extends StObject
         with MonthOfYear
    /* 8 */ val September: typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.September & Double = js.native
  }
}
