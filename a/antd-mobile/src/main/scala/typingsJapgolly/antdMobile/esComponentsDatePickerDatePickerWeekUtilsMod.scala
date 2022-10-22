package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antdMobile.esComponentsDatePickerDatePickerUtilsMod.DatePickerFilter
import typingsJapgolly.antdMobile.esComponentsPickerViewPickerViewMod.PickerColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsDatePickerDatePickerWeekUtilsMod {
  
  @JSImport("antd-mobile/es/components/date-picker/date-picker-week-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertDateToStringArray(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToStringArray")().asInstanceOf[js.Array[String]]
  inline def convertDateToStringArray(date: js.Date): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToStringArray")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def convertStringArrayToDate(value: js.Array[js.UndefOr[String | Null]]): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("convertStringArrayToDate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def defaultRenderLabel(`type`: WeekPrecision, data: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultRenderLabel")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: WeekPrecision,
    renderLabel: js.Function2[/* type */ WeekPrecision, /* data */ Double, Node]
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  inline def generateDatePickerColumns(
    selected: js.Array[String],
    min: js.Date,
    max: js.Date,
    precision: WeekPrecision,
    renderLabel: js.Function2[/* type */ WeekPrecision, /* data */ Double, Node],
    filter: DatePickerFilter
  ): js.Array[PickerColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDatePickerColumns")(selected.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], renderLabel.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[PickerColumn]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antdMobile.antdMobileStrings.year
    - typingsJapgolly.antdMobile.antdMobileStrings.week
    - typingsJapgolly.antdMobile.antdMobileStrings.`week-day`
  */
  trait WeekPrecision extends StObject
  object WeekPrecision {
    
    inline def week: typingsJapgolly.antdMobile.antdMobileStrings.week = "week".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.week]
    
    inline def `week-day`: typingsJapgolly.antdMobile.antdMobileStrings.`week-day` = "week-day".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.`week-day`]
    
    inline def year: typingsJapgolly.antdMobile.antdMobileStrings.year = "year".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.year]
  }
}
