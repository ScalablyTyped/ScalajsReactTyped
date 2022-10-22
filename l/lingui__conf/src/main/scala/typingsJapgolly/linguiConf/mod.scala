package typingsJapgolly.linguiConf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babelGenerator.mod.GeneratorOptions
import typingsJapgolly.linguiConf.anon.Catalogs
import typingsJapgolly.linguiConf.anon.ConfigPath
import typingsJapgolly.linguiConf.anon.FallbackLocale
import typingsJapgolly.linguiConf.linguiConfStrings.cjs
import typingsJapgolly.linguiConf.linguiConfStrings.es
import typingsJapgolly.linguiConf.linguiConfStrings.ts
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lingui/conf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def catalogMigration(config: LinguiConfig & DeprecatedLocaleDir): LinguiConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("catalogMigration")(config.asInstanceOf[js.Any]).asInstanceOf[LinguiConfig]
  
  object configValidation {
    
    @JSImport("@lingui/conf", "configValidation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@lingui/conf", "configValidation.comment")
    @js.native
    def comment: String = js.native
    inline def comment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comment")(x.asInstanceOf[js.Any])
    
    @JSImport("@lingui/conf", "configValidation.deprecatedConfig")
    @js.native
    def deprecatedConfig: FallbackLocale = js.native
    inline def deprecatedConfig_=(x: FallbackLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@lingui/conf", "configValidation.exampleConfig")
    @js.native
    def exampleConfig: Catalogs = js.native
    inline def exampleConfig_=(x: Catalogs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exampleConfig")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lingui/conf", "defaultConfig")
  @js.native
  val defaultConfig: LinguiConfig = js.native
  
  inline def fallbackLanguageMigration(config: LinguiConfig & DeprecatedFallbackLanguage): LinguiConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fallbackLanguageMigration")(config.asInstanceOf[js.Any]).asInstanceOf[LinguiConfig]
  
  inline def getConfig(): LinguiConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")().asInstanceOf[LinguiConfig]
  inline def getConfig(hasCwdConfigPathSkipValidation: ConfigPath): LinguiConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(hasCwdConfigPathSkipValidation.asInstanceOf[js.Any]).asInstanceOf[LinguiConfig]
  
  inline def replaceRootDir(config: LinguiConfig, rootDir: String): LinguiConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceRootDir")(config.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[LinguiConfig]
  
  trait CatalogConfig extends StObject {
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var include: js.Array[String]
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: String
  }
  object CatalogConfig {
    
    inline def apply(include: js.Array[String], path: String): CatalogConfig = {
      val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CatalogConfig]
    }
    
    extension [Self <: CatalogConfig](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.linguiConf.linguiConfStrings.lingui
    - typingsJapgolly.linguiConf.linguiConfStrings.minimal
    - typingsJapgolly.linguiConf.linguiConfStrings.po
    - typingsJapgolly.linguiConf.linguiConfStrings.csv
    - typingsJapgolly.linguiConf.linguiConfStrings.`po-gettext`
  */
  trait CatalogFormat extends StObject
  object CatalogFormat {
    
    inline def csv: typingsJapgolly.linguiConf.linguiConfStrings.csv = "csv".asInstanceOf[typingsJapgolly.linguiConf.linguiConfStrings.csv]
    
    inline def lingui: typingsJapgolly.linguiConf.linguiConfStrings.lingui = "lingui".asInstanceOf[typingsJapgolly.linguiConf.linguiConfStrings.lingui]
    
    inline def minimal: typingsJapgolly.linguiConf.linguiConfStrings.minimal = "minimal".asInstanceOf[typingsJapgolly.linguiConf.linguiConfStrings.minimal]
    
    inline def po: typingsJapgolly.linguiConf.linguiConfStrings.po = "po".asInstanceOf[typingsJapgolly.linguiConf.linguiConfStrings.po]
    
    inline def `po-gettext`: typingsJapgolly.linguiConf.linguiConfStrings.`po-gettext` = "po-gettext".asInstanceOf[typingsJapgolly.linguiConf.linguiConfStrings.`po-gettext`]
  }
  
  trait CatalogFormatOptions extends StObject {
    
    var lineNumbers: js.UndefOr[Boolean] = js.undefined
    
    var origins: js.UndefOr[Boolean] = js.undefined
  }
  object CatalogFormatOptions {
    
    inline def apply(): CatalogFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CatalogFormatOptions]
    }
    
    extension [Self <: CatalogFormatOptions](x: Self) {
      
      inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
      
      inline def setOrigins(value: Boolean): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
    }
  }
  
  trait CatalogService extends StObject {
    
    var apiKey: String
    
    var name: String
  }
  object CatalogService {
    
    inline def apply(apiKey: String, name: String): CatalogService = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CatalogService]
    }
    
    extension [Self <: CatalogService](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultLocaleObject extends StObject {
    
    var default: String
  }
  object DefaultLocaleObject {
    
    inline def apply(default: String): DefaultLocaleObject = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultLocaleObject]
    }
    
    extension [Self <: DefaultLocaleObject](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Replace fallbackLocale with fallbackLocales
    *
    * Released in lingui-conf 0.9
    * Remove anytime after 4.x
    */
  trait DeprecatedFallbackLanguage extends StObject {
    
    var fallbackLocale: String | Null
  }
  object DeprecatedFallbackLanguage {
    
    inline def apply(): DeprecatedFallbackLanguage = {
      val __obj = js.Dynamic.literal(fallbackLocale = null)
      __obj.asInstanceOf[DeprecatedFallbackLanguage]
    }
    
    extension [Self <: DeprecatedFallbackLanguage](x: Self) {
      
      inline def setFallbackLocale(value: String): Self = StObject.set(x, "fallbackLocale", value.asInstanceOf[js.Any])
      
      inline def setFallbackLocaleNull: Self = StObject.set(x, "fallbackLocale", null)
    }
  }
  
  /**
    * Replace localeDir, srcPathDirs and srcPathIgnorePatterns with catalogs
    *
    * Released in @lingui/conf 3.0
    * Remove anytime after 4.x
    */
  trait DeprecatedLocaleDir extends StObject {
    
    var localeDir: String
    
    var srcPathDirs: js.Array[String]
    
    var srcPathIgnorePatterns: js.Array[String]
  }
  object DeprecatedLocaleDir {
    
    inline def apply(localeDir: String, srcPathDirs: js.Array[String], srcPathIgnorePatterns: js.Array[String]): DeprecatedLocaleDir = {
      val __obj = js.Dynamic.literal(localeDir = localeDir.asInstanceOf[js.Any], srcPathDirs = srcPathDirs.asInstanceOf[js.Any], srcPathIgnorePatterns = srcPathIgnorePatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecatedLocaleDir]
    }
    
    extension [Self <: DeprecatedLocaleDir](x: Self) {
      
      inline def setLocaleDir(value: String): Self = StObject.set(x, "localeDir", value.asInstanceOf[js.Any])
      
      inline def setSrcPathDirs(value: js.Array[String]): Self = StObject.set(x, "srcPathDirs", value.asInstanceOf[js.Any])
      
      inline def setSrcPathDirsVarargs(value: String*): Self = StObject.set(x, "srcPathDirs", js.Array(value*))
      
      inline def setSrcPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "srcPathIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setSrcPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "srcPathIgnorePatterns", js.Array(value*))
    }
  }
  
  @js.native
  trait ExtractorType extends StObject {
    
    def extract(filename: String, targetDir: String): Unit = js.native
    def extract(filename: String, targetDir: String, options: Any): Unit = js.native
    
    def `match`(filename: String): Boolean = js.native
  }
  
  type FallbackLocales = LocaleObject | DefaultLocaleObject
  
  trait LinguiConfig extends StObject {
    
    var catalogs: js.Array[CatalogConfig]
    
    var catalogsMergePath: String
    
    var compileNamespace: es | cjs | ts | String
    
    var compilerBabelOptions: GeneratorOptions
    
    var extractBabelOptions: Record[String, Any]
    
    var extractors: js.UndefOr[js.Array[ExtractorType]] = js.undefined
    
    var fallbackLocales: FallbackLocales
    
    var format: CatalogFormat
    
    var formatOptions: CatalogFormatOptions
    
    var localeDir: String
    
    var locales: js.Array[String]
    
    var orderBy: OrderBy
    
    var prevFormat: CatalogFormat
    
    var pseudoLocale: String
    
    var rootDir: String
    
    var runtimeConfigModule: js.Tuple2[String, js.UndefOr[String]]
    
    var service: CatalogService
    
    var sourceLocale: String
  }
  object LinguiConfig {
    
    inline def apply(
      catalogs: js.Array[CatalogConfig],
      catalogsMergePath: String,
      compileNamespace: es | cjs | ts | String,
      compilerBabelOptions: GeneratorOptions,
      extractBabelOptions: Record[String, Any],
      fallbackLocales: FallbackLocales,
      format: CatalogFormat,
      formatOptions: CatalogFormatOptions,
      localeDir: String,
      locales: js.Array[String],
      orderBy: OrderBy,
      prevFormat: CatalogFormat,
      pseudoLocale: String,
      rootDir: String,
      runtimeConfigModule: js.Tuple2[String, js.UndefOr[String]],
      service: CatalogService,
      sourceLocale: String
    ): LinguiConfig = {
      val __obj = js.Dynamic.literal(catalogs = catalogs.asInstanceOf[js.Any], catalogsMergePath = catalogsMergePath.asInstanceOf[js.Any], compileNamespace = compileNamespace.asInstanceOf[js.Any], compilerBabelOptions = compilerBabelOptions.asInstanceOf[js.Any], extractBabelOptions = extractBabelOptions.asInstanceOf[js.Any], fallbackLocales = fallbackLocales.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], formatOptions = formatOptions.asInstanceOf[js.Any], localeDir = localeDir.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], prevFormat = prevFormat.asInstanceOf[js.Any], pseudoLocale = pseudoLocale.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], runtimeConfigModule = runtimeConfigModule.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], sourceLocale = sourceLocale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinguiConfig]
    }
    
    extension [Self <: LinguiConfig](x: Self) {
      
      inline def setCatalogs(value: js.Array[CatalogConfig]): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
      
      inline def setCatalogsMergePath(value: String): Self = StObject.set(x, "catalogsMergePath", value.asInstanceOf[js.Any])
      
      inline def setCatalogsVarargs(value: CatalogConfig*): Self = StObject.set(x, "catalogs", js.Array(value*))
      
      inline def setCompileNamespace(value: es | cjs | ts | String): Self = StObject.set(x, "compileNamespace", value.asInstanceOf[js.Any])
      
      inline def setCompilerBabelOptions(value: GeneratorOptions): Self = StObject.set(x, "compilerBabelOptions", value.asInstanceOf[js.Any])
      
      inline def setExtractBabelOptions(value: Record[String, Any]): Self = StObject.set(x, "extractBabelOptions", value.asInstanceOf[js.Any])
      
      inline def setExtractors(value: js.Array[ExtractorType]): Self = StObject.set(x, "extractors", value.asInstanceOf[js.Any])
      
      inline def setExtractorsUndefined: Self = StObject.set(x, "extractors", js.undefined)
      
      inline def setExtractorsVarargs(value: ExtractorType*): Self = StObject.set(x, "extractors", js.Array(value*))
      
      inline def setFallbackLocales(value: FallbackLocales): Self = StObject.set(x, "fallbackLocales", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: CatalogFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatOptions(value: CatalogFormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setLocaleDir(value: String): Self = StObject.set(x, "localeDir", value.asInstanceOf[js.Any])
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setPrevFormat(value: CatalogFormat): Self = StObject.set(x, "prevFormat", value.asInstanceOf[js.Any])
      
      inline def setPseudoLocale(value: String): Self = StObject.set(x, "pseudoLocale", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfigModule(value: js.Tuple2[String, js.UndefOr[String]]): Self = StObject.set(x, "runtimeConfigModule", value.asInstanceOf[js.Any])
      
      inline def setService(value: CatalogService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setSourceLocale(value: String): Self = StObject.set(x, "sourceLocale", value.asInstanceOf[js.Any])
    }
  }
  
  type LocaleObject = StringDictionary[js.Array[String] | String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.linguiConf.linguiConfStrings.messageId
    - typingsJapgolly.linguiConf.linguiConfStrings.origin
  */
  trait OrderBy extends StObject
  object OrderBy {
    
    inline def messageId: typingsJapgolly.linguiConf.linguiConfStrings.messageId = "messageId".asInstanceOf[typingsJapgolly.linguiConf.linguiConfStrings.messageId]
    
    inline def origin: typingsJapgolly.linguiConf.linguiConfStrings.origin = "origin".asInstanceOf[typingsJapgolly.linguiConf.linguiConfStrings.origin]
  }
}
