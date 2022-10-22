package typingsJapgolly.formatjsIntl.libSrcTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.formatjsIcuMessageformatParser.typesMod.MessageFormatElement
import typingsJapgolly.formatjsIntl.libSrcErrorMod.InvalidConfigError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MessageFormatError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MissingDataError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MissingTranslationError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.UnsupportedFormatterError
import typingsJapgolly.intlMessageformat.mod.FormatError
import typingsJapgolly.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@formatjs/intl.@formatjs/intl/lib/src/types.ResolvedIntlConfig<T>, keyof std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.ResolvedIntlConfig<any>, 'fallbackOnEmptyString' | 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError' | 'onWarn'>> & std.Partial<std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.ResolvedIntlConfig<any>, 'fallbackOnEmptyString' | 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError' | 'onWarn'>> */
trait IntlConfig[T] extends StObject {
  
  var defaultFormats: js.UndefOr[CustomFormats] = js.undefined
  
  var defaultLocale: js.UndefOr[String] = js.undefined
  
  var defaultRichTextElements: js.UndefOr[Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]] = js.undefined
  
  var fallbackOnEmptyString: js.UndefOr[Boolean] = js.undefined
  
  var formats: js.UndefOr[CustomFormats] = js.undefined
  
  var locale: Locale
  
  var messages: js.UndefOr[Record[MessageIds, js.Array[MessageFormatElement] | String]] = js.undefined
  
  var onError: js.UndefOr[OnErrorFn] = js.undefined
  
  var onWarn: js.UndefOr[OnWarnFn] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object IntlConfig {
  
  inline def apply[T](locale: Locale): IntlConfig[T] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlConfig[T]]
  }
  
  extension [Self <: IntlConfig[?], T](x: Self & IntlConfig[T]) {
    
    inline def setDefaultFormats(value: CustomFormats): Self = StObject.set(x, "defaultFormats", value.asInstanceOf[js.Any])
    
    inline def setDefaultFormatsUndefined: Self = StObject.set(x, "defaultFormats", js.undefined)
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setDefaultRichTextElements(value: Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]): Self = StObject.set(x, "defaultRichTextElements", value.asInstanceOf[js.Any])
    
    inline def setDefaultRichTextElementsUndefined: Self = StObject.set(x, "defaultRichTextElements", js.undefined)
    
    inline def setFallbackOnEmptyString(value: Boolean): Self = StObject.set(x, "fallbackOnEmptyString", value.asInstanceOf[js.Any])
    
    inline def setFallbackOnEmptyStringUndefined: Self = StObject.set(x, "fallbackOnEmptyString", js.undefined)
    
    inline def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: Record[MessageIds, js.Array[MessageFormatElement] | String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setOnError(
      value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnWarn(value: /* warning */ String => Callback): Self = StObject.set(x, "onWarn", js.Any.fromFunction1((t0: /* warning */ String) => value(t0).runNow()))
    
    inline def setOnWarnUndefined: Self = StObject.set(x, "onWarn", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
