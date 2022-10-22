package typingsJapgolly.i18n

import typingsJapgolly.i18n.Express.Request
import typingsJapgolly.i18n.Express.Response
import typingsJapgolly.i18n.i18n.ConfigurationOptions
import typingsJapgolly.i18n.i18n.GlobalCatalog
import typingsJapgolly.i18n.i18n.HashedList
import typingsJapgolly.i18n.i18n.LocaleCatalog
import typingsJapgolly.i18n.i18n.PluralOptions
import typingsJapgolly.i18n.i18n.Replacements
import typingsJapgolly.i18n.i18n.TranslateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object i18n {
    
    @JSGlobal("i18n")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("i18n.I18n")
    @js.native
    open class I18n ()
      extends StObject
         with typingsJapgolly.i18n.i18n.I18n {
      def this(options: ConfigurationOptions) = this()
    }
    
    //#region __()
    /**
      * Translate the given phrase using locale configuration
      * @param phraseOrOptions - The phrase to translate or options for translation
      * @returns The translated phrase
      */
    inline def __(phraseOrOptions: String, replace: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("__")(scala.List(phraseOrOptions.asInstanceOf[js.Any]).`++`(replace.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    /**
      * Translate the given phrase using locale configuration
      * @param phraseOrOptions - The phrase to translate or options for translation
      * @param replacements - An object containing replacements
      * @returns The translated phrase
      */
    inline def __(phraseOrOptions: String, replacements: Replacements): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__")(phraseOrOptions.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def __(phraseOrOptions: TranslateOptions, replace: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("__")(scala.List(phraseOrOptions.asInstanceOf[js.Any]).`++`(replace.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    inline def __(phraseOrOptions: TranslateOptions, replacements: Replacements): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__")(phraseOrOptions.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def addLocale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Configure current i18n instance
      * @param options - configuration options for i18n
      */
    inline def configure(options: ConfigurationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //#endregion
    //#region Catalog
    /**
      * Get the current global catalog
      * @returns The current global catalog
      */
    inline def getCatalog(): GlobalCatalog = ^.asInstanceOf[js.Dynamic].applyDynamic("getCatalog")().asInstanceOf[GlobalCatalog]
    /**
      * Get the catalog for the given locale
      * @param locale - The locale to get catalog for
      * @returns The specified locale catalog
      */
    inline def getCatalog(locale: String): LocaleCatalog = ^.asInstanceOf[js.Dynamic].applyDynamic("getCatalog")(locale.asInstanceOf[js.Any]).asInstanceOf[LocaleCatalog]
    /**
      * Get the current active locale catalog for specified request
      * @param request - The request to get locale catalog for
      * @param [locale] - The locale to get catalog for
      * @returns The current locale catalog for the specified request
      */
    inline def getCatalog(request: Request): LocaleCatalog = ^.asInstanceOf[js.Dynamic].applyDynamic("getCatalog")(request.asInstanceOf[js.Any]).asInstanceOf[LocaleCatalog]
    inline def getCatalog(request: Request, locale: String): LocaleCatalog = (^.asInstanceOf[js.Dynamic].applyDynamic("getCatalog")(request.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[LocaleCatalog]
    
    /**
      * Get the current active locale for specified request
      * @param [request] - The request to get locale for
      * @returns The current locale in request
      */
    inline def getLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")().asInstanceOf[String]
    inline def getLocale(request: Request): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")(request.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get a list with all configured locales
      */
    inline def getLocales(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocales")().asInstanceOf[js.Array[String]]
    
    //#endregion
    //#region __h()
    /**
      * Returns a hashed list of translations for a given phrase in each language.
      * @param phrase - The phrase to get translations in each language
      * @returns The phrase in each language
      */
    inline def h(phrase: String): js.Array[HashedList] = ^.asInstanceOf[js.Dynamic].applyDynamic("__h")(phrase.asInstanceOf[js.Any]).asInstanceOf[js.Array[HashedList]]
    
    /**
      * Initialize i18n middleware for express
      * @param request - Current express request
      * @param response - Current express response
      * @param next - Callback to continue process
      */
    inline def init(request: Request, response: Response): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(request: Request, response: Response, next: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    //#endregion
    //#region __l()
    /**
      * Returns a list of translations for a given phrase in each language.
      * @param phrase - The phrase to get translations in each language
      * @returns The phrase in each language
      */
    inline def l(phrase: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("__l")(phrase.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    //#endregion
    //#region __mf()
    /**
      * Translate the given phrase using locale configuration and MessageFormat
      * @param phraseOrOptions - The phrase to translate or options for translation
      * @returns The translated phrase
      */
    inline def mf(phraseOrOptions: String, replace: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("__mf")(scala.List(phraseOrOptions.asInstanceOf[js.Any]).`++`(replace.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    /**
      * Translate the given phrase using locale configuration and MessageFormat
      * @param phraseOrOptions - The phrase to translate or options for translation
      * @param replacements - An object containing replacements
      * @returns The translated phrase
      */
    inline def mf(phraseOrOptions: String, replacements: Replacements): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__mf")(phraseOrOptions.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def mf(phraseOrOptions: TranslateOptions, replace: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("__mf")(scala.List(phraseOrOptions.asInstanceOf[js.Any]).`++`(replace.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    inline def mf(phraseOrOptions: TranslateOptions, replacements: Replacements): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__mf")(phraseOrOptions.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Translate with plural condition the given phrase and count using locale configuration
      * @param options - Options for plural translate
      * @param [count] - The number which allow to select from plural to singular
      * @returns The translated phrase
      */
    inline def n(options: PluralOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("__n")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def n(options: PluralOptions, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__n")(options.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def n(phrase: String, count: String, replacements: Replacements): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__n")(phrase.asInstanceOf[js.Any], count.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]
    //#endregion
    //#region __n()
    /**
      * Translate with plural condition the given phrase and count using locale configuration
      * @param phrase - Short phrase to be translated. All plural options ("one", "few", other", ...) have to be provided by your translation file
      * @param count - The number which allow to select from plural to singular
      * @returns The translated phrase
      */
    inline def n(phrase: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__n")(phrase.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Translate with plural condition the given phrase and count using locale configuration
      * @param phrase - The phrase to translate or a flattened key path in locale json file
      * @param count - The number which allow to select from plural to singular
      * @param replacements - An object containing replacements
      * @returns The translated phrase
      */
    inline def n(phrase: String, count: Double, replacements: Replacements): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__n")(phrase.asInstanceOf[js.Any], count.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def n(singular: String, plural: String, count: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__n")(singular.asInstanceOf[js.Any], plural.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Translate with plural condition the given phrase and count using locale configuration
      * @param singular - The singular phrase to translate if count is <= 1
      * @param plural - The plural phrase to translate if count is > 1
      * @param count - The number which allow to select from plural to singular
      * @returns The translated phrase
      */
    inline def n(singular: String, plural: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__n")(singular.asInstanceOf[js.Any], plural.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
    
    //#endregion
    /**
      * Override the current request locale by using the query param (?locale=en)
      * @param [request] - The request to override locale for
      */
    inline def overrideLocaleFromQuery(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideLocaleFromQuery")().asInstanceOf[Unit]
    inline def overrideLocaleFromQuery(request: Request): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideLocaleFromQuery")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def removeLocale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //#endregion
    //#region Locale
    /**
      * Change the current active locale
      * @param locale - The locale to set as default
      */
    inline def setLocale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setLocale(objects: js.Array[Any], locale: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(objects.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setLocale(objects: js.Array[Any], locale: String, inheritance: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(objects.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], inheritance.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Change the current active locale for specified response
      * @param objects - The object(s) to change locale on
      * @param locale - The locale to set as default
      * @param [inheritance=false] - Disables inheritance if true
      */
    // tslint:disable-next-line:unified-signatures
    inline def setLocale(objects: Any, locale: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(objects.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setLocale(objects: Any, locale: String, inheritance: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(objects.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], inheritance.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Change the current active locale for specified response
      * @param response - The request or response to change locale on
      * @param locale - The locale to set as default
      * @param [inheritance=false] - Disables inheritance if true
      */
    inline def setLocale(requestOrResponse: Request | Response, locale: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(requestOrResponse.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setLocale(requestOrResponse: Request | Response, locale: String, inheritance: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(requestOrResponse.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], inheritance.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Get current i18n-node version
      */
    @JSGlobal("i18n.version")
    @js.native
    val version: String = js.native
  }
}
