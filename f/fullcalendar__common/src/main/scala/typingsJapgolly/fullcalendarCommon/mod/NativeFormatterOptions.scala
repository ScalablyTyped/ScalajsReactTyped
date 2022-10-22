package typingsJapgolly.fullcalendarCommon.mod

import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.long
import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.lowercase
import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.narrow
import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.numeric
import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.short
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.stdStrings.`best fit`
import typingsJapgolly.std.stdStrings.basic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeFormatterOptions
  extends StObject
     with DateTimeFormatOptions {
  
  var meridiem: js.UndefOr[lowercase | short | narrow | Boolean] = js.undefined
  
  var omitCommas: js.UndefOr[Boolean] = js.undefined
  
  var omitZeroMinute: js.UndefOr[Boolean] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var week: js.UndefOr[long | short | narrow | numeric] = js.undefined
}
object NativeFormatterOptions {
  
  inline def apply(formatMatcher: (js.UndefOr[(`best fit`) | basic]) & (js.UndefOr[basic | (`best fit`)])): NativeFormatterOptions = {
    val __obj = js.Dynamic.literal(formatMatcher = formatMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeFormatterOptions]
  }
  
  extension [Self <: NativeFormatterOptions](x: Self) {
    
    inline def setMeridiem(value: lowercase | short | narrow | Boolean): Self = StObject.set(x, "meridiem", value.asInstanceOf[js.Any])
    
    inline def setMeridiemUndefined: Self = StObject.set(x, "meridiem", js.undefined)
    
    inline def setOmitCommas(value: Boolean): Self = StObject.set(x, "omitCommas", value.asInstanceOf[js.Any])
    
    inline def setOmitCommasUndefined: Self = StObject.set(x, "omitCommas", js.undefined)
    
    inline def setOmitZeroMinute(value: Boolean): Self = StObject.set(x, "omitZeroMinute", value.asInstanceOf[js.Any])
    
    inline def setOmitZeroMinuteUndefined: Self = StObject.set(x, "omitZeroMinute", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setWeek(value: long | short | narrow | numeric): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
  }
}
