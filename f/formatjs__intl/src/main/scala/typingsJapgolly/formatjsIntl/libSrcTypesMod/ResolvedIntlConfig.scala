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

trait ResolvedIntlConfig[T] extends StObject {
  
  var defaultFormats: CustomFormats
  
  var defaultLocale: String
  
  var defaultRichTextElements: js.UndefOr[Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]] = js.undefined
  
  var fallbackOnEmptyString: js.UndefOr[Boolean] = js.undefined
  
  var formats: CustomFormats
  
  var locale: Locale
  
  var messages: Record[MessageIds, js.Array[MessageFormatElement] | String]
  
  def onError(err: InvalidConfigError): Unit
  def onError(err: MessageFormatError): Unit
  def onError(err: MissingDataError): Unit
  def onError(err: MissingTranslationError): Unit
  def onError(err: UnsupportedFormatterError): Unit
  def onError(err: FormatError): Unit
  @JSName("onError")
  var onError_Original: OnErrorFn
  
  var onWarn: js.UndefOr[OnWarnFn] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object ResolvedIntlConfig {
  
  inline def apply[T](
    defaultFormats: CustomFormats,
    defaultLocale: String,
    formats: CustomFormats,
    locale: Locale,
    messages: Record[MessageIds, js.Array[MessageFormatElement] | String],
    onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
  ): ResolvedIntlConfig[T] = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => onError(t0).runNow()))
    __obj.asInstanceOf[ResolvedIntlConfig[T]]
  }
  
  extension [Self <: ResolvedIntlConfig[?], T](x: Self & ResolvedIntlConfig[T]) {
    
    inline def setDefaultFormats(value: CustomFormats): Self = StObject.set(x, "defaultFormats", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultRichTextElements(value: Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]): Self = StObject.set(x, "defaultRichTextElements", value.asInstanceOf[js.Any])
    
    inline def setDefaultRichTextElementsUndefined: Self = StObject.set(x, "defaultRichTextElements", js.undefined)
    
    inline def setFallbackOnEmptyString(value: Boolean): Self = StObject.set(x, "fallbackOnEmptyString", value.asInstanceOf[js.Any])
    
    inline def setFallbackOnEmptyStringUndefined: Self = StObject.set(x, "fallbackOnEmptyString", js.undefined)
    
    inline def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: Record[MessageIds, js.Array[MessageFormatElement] | String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setOnError(
      value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => value(t0).runNow()))
    
    inline def setOnWarn(value: /* warning */ String => Callback): Self = StObject.set(x, "onWarn", js.Any.fromFunction1((t0: /* warning */ String) => value(t0).runNow()))
    
    inline def setOnWarnUndefined: Self = StObject.set(x, "onWarn", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
