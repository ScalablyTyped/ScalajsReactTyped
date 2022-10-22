package typingsJapgolly.formatjsIntl

import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typingsJapgolly.formatjsIcuMessageformatParser.typesMod.MessageFormatElement
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.date
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.number
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.relative
import typingsJapgolly.formatjsIntl.formatjsIntlStrings.time
import typingsJapgolly.formatjsIntl.libSrcErrorMod.InvalidConfigError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MessageFormatError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MissingDataError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MissingTranslationError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.UnsupportedFormatterError
import typingsJapgolly.formatjsIntl.libSrcTypesMod.CustomFormats
import typingsJapgolly.formatjsIntl.libSrcTypesMod.Formatters
import typingsJapgolly.formatjsIntl.libSrcTypesMod.IntlCache
import typingsJapgolly.formatjsIntl.libSrcTypesMod.MessageIds
import typingsJapgolly.formatjsIntl.libSrcTypesMod.OnErrorFn
import typingsJapgolly.formatjsIntl.libSrcTypesMod.OnWarnFn
import typingsJapgolly.intlMessageformat.mod.FormatError
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.RelativeTimeFormatOptions
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcUtilsMod {
  
  @JSImport("@formatjs/intl/lib/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.ResolvedIntlConfig<any>, 'fallbackOnEmptyString' | 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError' | 'onWarn'> */
  object DEFAULT_INTL_CONFIG {
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.defaultFormats")
    @js.native
    def defaultFormats: CustomFormats = js.native
    inline def defaultFormats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    inline def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.fallbackOnEmptyString")
    @js.native
    def fallbackOnEmptyString: js.UndefOr[Boolean] = js.native
    inline def fallbackOnEmptyString_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbackOnEmptyString")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.formats")
    @js.native
    def formats: CustomFormats = js.native
    inline def formats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.messages")
    @js.native
    def messages: Record[MessageIds, js.Array[MessageFormatElement] | String] = js.native
    inline def messages_=(x: Record[MessageIds, js.Array[MessageFormatElement] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError: OnErrorFn = js.native
    inline def onError(err: InvalidConfigError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: MessageFormatError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: MissingDataError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: MissingTranslationError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: UnsupportedFormatterError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError(err: FormatError): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onError_=(x: OnErrorFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.onWarn")
    @js.native
    def onWarn: js.UndefOr[OnWarnFn] = js.native
    inline def onWarn_=(x: js.UndefOr[OnWarnFn]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onWarn")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.timeZone")
    @js.native
    def timeZone: js.UndefOr[String] = js.native
    inline def timeZone_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
  }
  
  inline def createFormatters(): Formatters = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatters")().asInstanceOf[Formatters]
  inline def createFormatters(cache: IntlCache): Formatters = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatters")(cache.asInstanceOf[js.Any]).asInstanceOf[Formatters]
  
  inline def createIntlCache(): IntlCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntlCache")().asInstanceOf[IntlCache]
  
  inline def filterProps[T /* <: Record[String, Any] */, K /* <: String */](props: T, allowlist: js.Array[K]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterProps")(props.asInstanceOf[js.Any], allowlist.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  inline def filterProps[T /* <: Record[String, Any] */, K /* <: String */](props: T, allowlist: js.Array[K], defaults: Partial[T]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterProps")(props.asInstanceOf[js.Any], allowlist.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  
  inline def getNamedFormat_date(formats: CustomFormats, `type`: date, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions]]
  
  inline def getNamedFormat_number(formats: CustomFormats, `type`: number, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions]]
  
  inline def getNamedFormat_relative(formats: CustomFormats, `type`: relative, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions]]
  
  inline def getNamedFormat_time(formats: CustomFormats, `type`: time, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedFormat")(formats.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | RelativeTimeFormatOptions]]
}
