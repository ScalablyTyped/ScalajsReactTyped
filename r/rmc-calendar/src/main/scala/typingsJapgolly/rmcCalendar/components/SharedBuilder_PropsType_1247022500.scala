package typingsJapgolly.rmcCalendar.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.ExtraData
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.normal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.one
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.range
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.xl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PropsType_1247022500[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def defaultDate(value: js.Date): this.type = set("defaultDate", value.asInstanceOf[js.Any])
  
  inline def endDate(value: js.Date): this.type = set("endDate", value.asInstanceOf[js.Any])
  
  inline def getDateExtra(value: /* date */ js.Date => ExtraData): this.type = set("getDateExtra", js.Any.fromFunction1(value))
  
  inline def infiniteOpt(value: Boolean): this.type = set("infiniteOpt", value.asInstanceOf[js.Any])
  
  inline def initalMonths(value: Double): this.type = set("initalMonths", value.asInstanceOf[js.Any])
  
  inline def locale(value: Locale): this.type = set("locale", value.asInstanceOf[js.Any])
  
  inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
  
  inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
  
  inline def onCellClick(value: /* date */ js.Date => Callback): this.type = set("onCellClick", js.Any.fromFunction1((t0: /* date */ js.Date) => value(t0).runNow()))
  
  inline def onLayout(value: /* clientHight */ Double => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* clientHight */ Double) => value(t0).runNow()))
  
  inline def onSelectHasDisableDate(value: /* date */ js.Array[js.Date] => Callback): this.type = set("onSelectHasDisableDate", js.Any.fromFunction1((t0: /* date */ js.Array[js.Date]) => value(t0).runNow()))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def rowSize(value: normal | xl): this.type = set("rowSize", value.asInstanceOf[js.Any])
  
  inline def startDate(value: js.Date): this.type = set("startDate", value.asInstanceOf[js.Any])
  
  inline def `type`(value: one | range): this.type = set("type", value.asInstanceOf[js.Any])
}
