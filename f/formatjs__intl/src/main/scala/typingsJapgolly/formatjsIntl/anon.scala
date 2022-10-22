package typingsJapgolly.formatjsIntl

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesData
import typingsJapgolly.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesLocaleData
import typingsJapgolly.formatjsEcma402Abstract.typesListMod.ListPatternFieldsData
import typingsJapgolly.formatjsEcma402Abstract.typesListMod.ListPatternLocaleData
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typingsJapgolly.formatjsIcuMessageformatParser.typesMod.MessageFormatElement
import typingsJapgolly.formatjsIntl.libSrcErrorMod.InvalidConfigError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MessageFormatError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MissingDataError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MissingTranslationError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.UnsupportedFormatterError
import typingsJapgolly.formatjsIntl.libSrcTypesMod.CustomFormats
import typingsJapgolly.formatjsIntl.libSrcTypesMod.FormatListOptions
import typingsJapgolly.formatjsIntl.libSrcTypesMod.OnErrorFn
import typingsJapgolly.formatjsIntlDisplaynames.anon.PickDisplayNamesOptionslo
import typingsJapgolly.formatjsIntlDisplaynames.mod.DisplayNames
import typingsJapgolly.formatjsIntlDisplaynames.mod.DisplayNamesOptions
import typingsJapgolly.formatjsIntlListformat.anon.PickIntlListFormatOptions
import typingsJapgolly.formatjsIntlListformat.mod.default
import typingsJapgolly.intlMessageformat.mod.FormatError
import typingsJapgolly.intlMessageformat.mod.IntlMessageFormat
import typingsJapgolly.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsJapgolly.std.ConstructorParameters
import typingsJapgolly.std.Intl.DateTimeFormat
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.NumberFormat
import typingsJapgolly.std.Intl.PluralRules
import typingsJapgolly.std.Intl.PluralRulesOptions
import typingsJapgolly.std.Intl.RelativeTimeFormatOptions
import typingsJapgolly.std.Intl.UnicodeBCP47LocaleIdentifier
import typingsJapgolly.std.Record
import typingsJapgolly.std.anon.LocaleMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultFormats[T] extends StObject {
    
    var defaultFormats: CustomFormats
    
    var defaultLocale: String
    
    var defaultRichTextElements: js.UndefOr[Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]] = js.undefined
    
    var fallbackOnEmptyString: js.UndefOr[Boolean] = js.undefined
    
    var formats: CustomFormats
    
    var locale: String
    
    var messages: Record[String, js.Array[MessageFormatElement] | String]
    
    def onError(err: InvalidConfigError): Unit
    def onError(err: MessageFormatError): Unit
    def onError(err: MissingDataError): Unit
    def onError(err: MissingTranslationError): Unit
    def onError(err: UnsupportedFormatterError): Unit
    def onError(err: FormatError): Unit
    @JSName("onError")
    var onError_Original: OnErrorFn
    
    var timeZone: js.UndefOr[String] = js.undefined
  }
  object DefaultFormats {
    
    inline def apply[T](
      defaultFormats: CustomFormats,
      defaultLocale: String,
      formats: CustomFormats,
      locale: String,
      messages: Record[String, js.Array[MessageFormatElement] | String],
      onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
    ): DefaultFormats[T] = {
      val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => onError(t0).runNow()))
      __obj.asInstanceOf[DefaultFormats[T]]
    }
    
    extension [Self <: DefaultFormats[?], T](x: Self & DefaultFormats[T]) {
      
      inline def setDefaultFormats(value: CustomFormats): Self = StObject.set(x, "defaultFormats", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultRichTextElements(value: Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]): Self = StObject.set(x, "defaultRichTextElements", value.asInstanceOf[js.Any])
      
      inline def setDefaultRichTextElementsUndefined: Self = StObject.set(x, "defaultRichTextElements", js.undefined)
      
      inline def setFallbackOnEmptyString(value: Boolean): Self = StObject.set(x, "fallbackOnEmptyString", value.asInstanceOf[js.Any])
      
      inline def setFallbackOnEmptyStringUndefined: Self = StObject.set(x, "fallbackOnEmptyString", js.undefined)
      
      inline def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: Record[String, js.Array[MessageFormatElement] | String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setOnError(
        value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
      ): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => value(t0).runNow()))
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(values: js.Array[String]): String = js.native
    def apply(values: js.Array[String], opts: FormatListOptions): String = js.native
  }
  
  @js.native
  trait FnCallCode extends StObject {
    
    def apply(code: String): js.UndefOr[String] = js.native
    def apply(code: Double): js.UndefOr[String] = js.native
    def apply(code: Record[String, Any]): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCallDate extends StObject {
    
    def apply(): String = js.native
    def apply(date: js.Date): String = js.native
    def apply(date: Double): String = js.native
  }
  
  @js.native
  trait FnCallStartDateEndDate extends StObject {
    
    def apply(startDate: js.Date, endDate: js.Date): String = js.native
    def apply(startDate: js.Date, endDate: Double): String = js.native
    def apply(startDate: Double, endDate: js.Date): String = js.native
    def apply(startDate: Double, endDate: Double): String = js.native
  }
  
  @js.native
  trait FnCallValue extends StObject {
    
    def apply(value: js.BigInt): String = js.native
    def apply(value: Double): String = js.native
  }
  
  trait Formats extends StObject {
    
    var formats: CustomFormats
    
    var locale: String
    
    def onError(err: InvalidConfigError): Unit
    def onError(err: MessageFormatError): Unit
    def onError(err: MissingDataError): Unit
    def onError(err: MissingTranslationError): Unit
    def onError(err: UnsupportedFormatterError): Unit
    def onError(err: FormatError): Unit
    @JSName("onError")
    var onError_Original: OnErrorFn
    
    var timeZone: js.UndefOr[String] = js.undefined
  }
  object Formats {
    
    inline def apply(
      formats: CustomFormats,
      locale: String,
      onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
    ): Formats = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onError = js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => onError(t0).runNow()))
      __obj.asInstanceOf[Formats]
    }
    
    extension [Self <: Formats](x: Self) {
      
      inline def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnError(
        value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
      ): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => value(t0).runNow()))
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    }
  }
  
  /* Inlined intl-messageformat.intl-messageformat.Formatters & std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.Formatters, 'getMessageFormat'> */
  @js.native
  trait FormattersPickFormattersg extends StObject {
    
    def getDateTimeFormat(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[typingsJapgolly.intlMessageformat.anon.TypeofDateTimeFormat]
    ): DateTimeFormat = js.native
    
    def getMessageFormat(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofIntlMessageFormat]
    ): IntlMessageFormat = js.native
    @JSName("getMessageFormat")
    var getMessageFormat_Original: js.Function1[/* args */ ConstructorParameters[TypeofIntlMessageFormat], IntlMessageFormat] = js.native
    
    def getNumberFormat(): NumberFormat = js.native
    def getNumberFormat(locals: String): NumberFormat = js.native
    def getNumberFormat(locals: String, opts: NumberFormatOptions): NumberFormat = js.native
    def getNumberFormat(locals: js.Array[String]): NumberFormat = js.native
    def getNumberFormat(locals: js.Array[String], opts: NumberFormatOptions): NumberFormat = js.native
    def getNumberFormat(locals: Unit, opts: NumberFormatOptions): NumberFormat = js.native
    
    def getPluralRules(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[typingsJapgolly.intlMessageformat.anon.TypeofPluralRules]
    ): PluralRules = js.native
  }
  
  trait Locale extends StObject {
    
    var locale: String
    
    def onError(err: InvalidConfigError): Unit
    def onError(err: MessageFormatError): Unit
    def onError(err: MissingDataError): Unit
    def onError(err: MissingTranslationError): Unit
    def onError(err: UnsupportedFormatterError): Unit
    def onError(err: FormatError): Unit
    @JSName("onError")
    var onError_Original: OnErrorFn
  }
  object Locale {
    
    inline def apply(
      locale: String,
      onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
    ): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onError = js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => onError(t0).runNow()))
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnError(
        value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
      ): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => value(t0).runNow()))
    }
  }
  
  trait OnError extends StObject {
    
    var formats: CustomFormats
    
    var locale: String
    
    def onError(err: InvalidConfigError): Unit
    def onError(err: MessageFormatError): Unit
    def onError(err: MissingDataError): Unit
    def onError(err: MissingTranslationError): Unit
    def onError(err: UnsupportedFormatterError): Unit
    def onError(err: FormatError): Unit
    @JSName("onError")
    var onError_Original: OnErrorFn
  }
  object OnError {
    
    inline def apply(
      formats: CustomFormats,
      locale: String,
      onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
    ): OnError = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onError = js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => onError(t0).runNow()))
      __obj.asInstanceOf[OnError]
    }
    
    extension [Self <: OnError](x: Self) {
      
      inline def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnError(
        value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
      ): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => value(t0).runNow()))
    }
  }
  
  trait TimeZone extends StObject {
    
    var locale: String
    
    def onError(err: InvalidConfigError): Unit
    def onError(err: MessageFormatError): Unit
    def onError(err: MissingDataError): Unit
    def onError(err: MissingTranslationError): Unit
    def onError(err: UnsupportedFormatterError): Unit
    def onError(err: FormatError): Unit
    @JSName("onError")
    var onError_Original: OnErrorFn
    
    var timeZone: js.UndefOr[String] = js.undefined
  }
  object TimeZone {
    
    inline def apply(
      locale: String,
      onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
    ): TimeZone = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onError = js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => onError(t0).runNow()))
      __obj.asInstanceOf[TimeZone]
    }
    
    extension [Self <: TimeZone](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnError(
        value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Callback
      ): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError) => value(t0).runNow()))
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    }
  }
  
  @js.native
  trait TypeofDateTimeFormat extends StObject {
    
    /* standard es5 */
    def apply(): DateTimeFormat = js.native
    def apply(locales: String): DateTimeFormat = js.native
    def apply(locales: String, options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: js.Array[String]): DateTimeFormat = js.native
    def apply(locales: js.Array[String], options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: Unit, options: DateTimeFormatOptions): DateTimeFormat = js.native
    
    /* standard es5 */
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofDisplayNames
    extends StObject
       with Instantiable2[/* locales */ String, /* options */ DisplayNamesOptions, DisplayNames] {
    
    def __addLocaleData(data: DisplayNamesLocaleData*): Unit = js.native
    
    /* private */ var __defaultLocale: Any = js.native
    
    /* private */ var availableLocales: Any = js.native
    
    /* private */ var getDefaultLocale: Any = js.native
    
    var localeData: Record[String, js.UndefOr[DisplayNamesData]] = js.native
    
    val polyfilled: /* true */ Boolean = js.native
    
    def supportedLocalesOf(): js.Array[String] = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PickDisplayNamesOptionslo): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickDisplayNamesOptionslo): js.Array[String] = js.native
    def supportedLocalesOf(locales: Unit, options: PickDisplayNamesOptionslo): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofIntlListFormat
    extends StObject
       with Instantiable0[default] {
    
    /* private */ val __INTERNAL_SLOT_MAP__ : Any = js.native
    
    def __addLocaleData(data: ListPatternLocaleData*): Unit = js.native
    
    /* private */ var __defaultLocale: Any = js.native
    
    /* private */ var availableLocales: Any = js.native
    
    /* private */ var getDefaultLocale: Any = js.native
    
    var localeData: Record[String, js.UndefOr[ListPatternFieldsData]] = js.native
    
    var polyfilled: Boolean = js.native
    
    /* private */ var relevantExtensionKeys: Any = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PickIntlListFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickIntlListFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofIntlMessageFormat
    extends StObject
       with Instantiable1[/* message */ String, IntlMessageFormat] {
    
    var __parse: js.UndefOr[typingsJapgolly.intlMessageformat.anon.FnCall] = js.native
    
    def defaultLocale: String = js.native
    
    var formats: typingsJapgolly.intlMessageformat.srcFormattersMod.Formats = js.native
    
    /* private */ var memoizedDefaultLocale: Any = js.native
    
    def resolveLocale(locales: String): js.UndefOr[typingsJapgolly.std.Intl.Locale] = js.native
    def resolveLocale(locales: js.Array[String]): js.UndefOr[typingsJapgolly.std.Intl.Locale] = js.native
  }
  
  @js.native
  trait TypeofPluralRules extends StObject {
    
    /* standard es2018.intl */
    def apply(): PluralRules = js.native
    def apply(locales: String): PluralRules = js.native
    def apply(locales: String, options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: js.Array[String]): PluralRules = js.native
    def apply(locales: js.Array[String], options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: Unit, options: PluralRulesOptions): PluralRules = js.native
    
    /* standard es2018.intl */
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: LocaleMatcher): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: LocaleMatcher): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofRelativeTimeFormat extends StObject {
    
    /**
      * Returns an array containing those of the provided locales
      * that are supported in date and time formatting
      * without having to fall back to the runtime's default locale.
      *
      * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
      *  For the general form and interpretation of the locales argument,
      *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
      *
      * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters)
      *  with some or all of options of the formatting.
      *
      * @returns An array containing those of the provided locales
      *  that are supported in date and time formatting
      *  without having to fall back to the runtime's default locale.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/supportedLocalesOf).
      */
    /* standard es2020.intl */
    def supportedLocalesOf(): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
    def supportedLocalesOf(locales: js.Array[UnicodeBCP47LocaleIdentifier]): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
    def supportedLocalesOf(locales: js.Array[UnicodeBCP47LocaleIdentifier], options: RelativeTimeFormatOptions): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
    def supportedLocalesOf(locales: Unit, options: RelativeTimeFormatOptions): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
    def supportedLocalesOf(locales: UnicodeBCP47LocaleIdentifier): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
    def supportedLocalesOf(locales: UnicodeBCP47LocaleIdentifier, options: RelativeTimeFormatOptions): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
  }
}
