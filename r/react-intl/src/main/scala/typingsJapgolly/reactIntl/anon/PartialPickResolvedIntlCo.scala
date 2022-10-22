package typingsJapgolly.reactIntl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<react-intl.react-intl/src/types.ResolvedIntlConfig, 'fallbackOnEmptyString' | 'formats' | 'messages' | 'timeZone' | 'textComponent' | 'defaultLocale' | 'defaultFormats' | 'onError'>> */
trait PartialPickResolvedIntlCo extends StObject {
  
  var defaultFormats: js.UndefOr[Any] = js.undefined
  
  var defaultLocale: js.UndefOr[Any] = js.undefined
  
  var fallbackOnEmptyString: js.UndefOr[Any] = js.undefined
  
  var formats: js.UndefOr[Any] = js.undefined
  
  var messages: js.UndefOr[Any] = js.undefined
  
  var onError: js.UndefOr[Any] = js.undefined
  
  var textComponent: js.UndefOr[Any] = js.undefined
  
  var timeZone: js.UndefOr[Any] = js.undefined
}
object PartialPickResolvedIntlCo {
  
  inline def apply(): PartialPickResolvedIntlCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickResolvedIntlCo]
  }
  
  extension [Self <: PartialPickResolvedIntlCo](x: Self) {
    
    inline def setDefaultFormats(value: Any): Self = StObject.set(x, "defaultFormats", value.asInstanceOf[js.Any])
    
    inline def setDefaultFormatsUndefined: Self = StObject.set(x, "defaultFormats", js.undefined)
    
    inline def setDefaultLocale(value: Any): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setFallbackOnEmptyString(value: Any): Self = StObject.set(x, "fallbackOnEmptyString", value.asInstanceOf[js.Any])
    
    inline def setFallbackOnEmptyStringUndefined: Self = StObject.set(x, "fallbackOnEmptyString", js.undefined)
    
    inline def setFormats(value: Any): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setMessages(value: Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setOnError(value: Any): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setTextComponent(value: Any): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
    
    inline def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
    
    inline def setTimeZone(value: Any): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
