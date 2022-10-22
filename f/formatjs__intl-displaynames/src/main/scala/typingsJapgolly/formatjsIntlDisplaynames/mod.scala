package typingsJapgolly.formatjsIntlDisplaynames

import typingsJapgolly.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesData
import typingsJapgolly.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesLocaleData
import typingsJapgolly.formatjsIntlDisplaynames.anon.PickDisplayNamesOptionslo
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.`best fit`
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.code
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.currency
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.language
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.long
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.lookup
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.narrow
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.none
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.region
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.script
import typingsJapgolly.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.short
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@formatjs/intl-displaynames", "DisplayNames")
  @js.native
  open class DisplayNames protected () extends StObject {
    def this(locales: String, options: DisplayNamesOptions) = this()
    def this(locales: js.Array[String], options: DisplayNamesOptions) = this()
    def this(locales: Unit, options: DisplayNamesOptions) = this()
    
    def of(code: String): js.UndefOr[String] = js.native
    def of(code: Double): js.UndefOr[String] = js.native
    def of(code: Record[String, Any]): js.UndefOr[String] = js.native
    
    def resolvedOptions(): DisplayNamesResolvedOptions = js.native
  }
  /* static members */
  object DisplayNames {
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames")
    @js.native
    val ^ : js.Any = js.native
    
    inline def __addLocaleData(data: DisplayNamesLocaleData*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__addLocaleData")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.__defaultLocale")
    @js.native
    def __defaultLocale: Any = js.native
    inline def __defaultLocale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.availableLocales")
    @js.native
    def availableLocales: Any = js.native
    inline def availableLocales_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableLocales")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.getDefaultLocale")
    @js.native
    def getDefaultLocale: Any = js.native
    inline def getDefaultLocale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.localeData")
    @js.native
    def localeData: Record[String, js.UndefOr[DisplayNamesData]] = js.native
    inline def localeData_=(x: Record[String, js.UndefOr[DisplayNamesData]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localeData")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.polyfilled")
    @js.native
    val polyfilled: /* true */ Boolean = js.native
    
    inline def supportedLocalesOf(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")().asInstanceOf[js.Array[String]]
    inline def supportedLocalesOf(locales: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def supportedLocalesOf(locales: String, options: PickDisplayNamesOptionslo): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def supportedLocalesOf(locales: js.Array[String], options: PickDisplayNamesOptionslo): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def supportedLocalesOf(locales: Unit, options: PickDisplayNamesOptionslo): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
  
  trait DisplayNamesOptions extends StObject {
    
    var fallback: js.UndefOr[code | none] = js.undefined
    
    var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
    
    var style: js.UndefOr[narrow | short | long] = js.undefined
    
    var `type`: language | region | script | currency
  }
  object DisplayNamesOptions {
    
    inline def apply(`type`: language | region | script | currency): DisplayNamesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayNamesOptions]
    }
    
    extension [Self <: DisplayNamesOptions](x: Self) {
      
      inline def setFallback(value: code | none): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      inline def setStyle(value: narrow | short | long): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: language | region | script | currency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisplayNamesResolvedOptions extends StObject {
    
    var fallback: NonNullable[js.UndefOr[code | none]]
    
    var locale: String
    
    var style: NonNullable[js.UndefOr[narrow | short | long]]
    
    var `type`: NonNullable[language | region | script | currency]
  }
  object DisplayNamesResolvedOptions {
    
    inline def apply(
      fallback: NonNullable[js.UndefOr[code | none]],
      locale: String,
      style: NonNullable[js.UndefOr[narrow | short | long]],
      `type`: NonNullable[language | region | script | currency]
    ): DisplayNamesResolvedOptions = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayNamesResolvedOptions]
    }
    
    extension [Self <: DisplayNamesResolvedOptions](x: Self) {
      
      inline def setFallback(value: NonNullable[js.UndefOr[code | none]]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: NonNullable[js.UndefOr[narrow | short | long]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setType(value: NonNullable[language | region | script | currency]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
