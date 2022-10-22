package typingsJapgolly.intlifyCoreBase.mod

import typingsJapgolly.std.stdStrings.`best fit`
import typingsJapgolly.std.stdStrings.basic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeOptions[Key, Locales]
  extends StObject
     with typingsJapgolly.std.Intl.DateTimeFormatOptions {
  
  /**
    * @remarks
    * Whether do resolve on format keys when your language lacks a formatting for a key
    */
  var fallbackWarn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @remarks
    * The target format key
    */
  var key: js.UndefOr[Key] = js.undefined
  
  /**
    * @remarks
    * The locale of localization
    */
  var locale: js.UndefOr[Locales] = js.undefined
  
  /**
    * @remarks
    * Whether suppress warnings outputted when localization fails
    */
  var missingWarn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @remarks
    * Whether to use [Intel.DateTimeFormat#formatToParts](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DateTimeFormat/formatToParts)
    */
  var part: js.UndefOr[Boolean] = js.undefined
}
object DateTimeOptions {
  
  inline def apply[Key, Locales](formatMatcher: (js.UndefOr[(`best fit`) | basic]) & (js.UndefOr[basic | (`best fit`)])): DateTimeOptions[Key, Locales] = {
    val __obj = js.Dynamic.literal(formatMatcher = formatMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeOptions[Key, Locales]]
  }
  
  extension [Self <: DateTimeOptions[?, ?], Key, Locales](x: Self & (DateTimeOptions[Key, Locales])) {
    
    inline def setFallbackWarn(value: Boolean): Self = StObject.set(x, "fallbackWarn", value.asInstanceOf[js.Any])
    
    inline def setFallbackWarnUndefined: Self = StObject.set(x, "fallbackWarn", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLocale(value: Locales): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMissingWarn(value: Boolean): Self = StObject.set(x, "missingWarn", value.asInstanceOf[js.Any])
    
    inline def setMissingWarnUndefined: Self = StObject.set(x, "missingWarn", js.undefined)
    
    inline def setPart(value: Boolean): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
  }
}
