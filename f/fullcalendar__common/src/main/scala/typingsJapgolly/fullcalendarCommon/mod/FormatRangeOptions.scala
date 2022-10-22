package typingsJapgolly.fullcalendarCommon.mod

import typingsJapgolly.std.stdStrings.`best fit`
import typingsJapgolly.std.stdStrings.basic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatRangeOptions
  extends StObject
     with FormatDateOptions {
  
  var isEndExclusive: js.UndefOr[Boolean] = js.undefined
}
object FormatRangeOptions {
  
  inline def apply(formatMatcher: (js.UndefOr[(`best fit`) | basic]) & (js.UndefOr[basic | (`best fit`)])): FormatRangeOptions = {
    val __obj = js.Dynamic.literal(formatMatcher = formatMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatRangeOptions]
  }
  
  extension [Self <: FormatRangeOptions](x: Self) {
    
    inline def setIsEndExclusive(value: Boolean): Self = StObject.set(x, "isEndExclusive", value.asInstanceOf[js.Any])
    
    inline def setIsEndExclusiveUndefined: Self = StObject.set(x, "isEndExclusive", js.undefined)
  }
}
