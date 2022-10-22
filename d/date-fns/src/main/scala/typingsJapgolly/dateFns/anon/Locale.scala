package typingsJapgolly.dateFns.anon

import typingsJapgolly.dateFns.dateFnsInts.`2`
import typingsJapgolly.dateFns.dateFnsInts.`3`
import typingsJapgolly.dateFns.dateFnsInts.`4`
import typingsJapgolly.dateFns.dateFnsInts.`5`
import typingsJapgolly.dateFns.dateFnsInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var locale: js.UndefOr[typingsJapgolly.dateFns.mod.Locale] = js.undefined
  
  var weekStartsOn: js.UndefOr[
    typingsJapgolly.dateFns.dateFnsInts.`0` | typingsJapgolly.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6`
  ] = js.undefined
}
object Locale {
  
  inline def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  
  extension [Self <: Locale](x: Self) {
    
    inline def setLocale(value: typingsJapgolly.dateFns.mod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setWeekStartsOn(
      value: typingsJapgolly.dateFns.dateFnsInts.`0` | typingsJapgolly.dateFns.dateFnsInts.`1` | `2` | `3` | `4` | `5` | `6`
    ): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
