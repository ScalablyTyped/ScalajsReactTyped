package typingsJapgolly.linguiConf

import typingsJapgolly.babelGenerator.mod.GeneratorOptions
import typingsJapgolly.linguiConf.linguiConfStrings.cjs
import typingsJapgolly.linguiConf.linguiConfStrings.es
import typingsJapgolly.linguiConf.linguiConfStrings.ts
import typingsJapgolly.linguiConf.mod.CatalogConfig
import typingsJapgolly.linguiConf.mod.CatalogFormat
import typingsJapgolly.linguiConf.mod.CatalogFormatOptions
import typingsJapgolly.linguiConf.mod.CatalogService
import typingsJapgolly.linguiConf.mod.DeprecatedFallbackLanguage
import typingsJapgolly.linguiConf.mod.DeprecatedLocaleDir
import typingsJapgolly.linguiConf.mod.FallbackLocales
import typingsJapgolly.linguiConf.mod.LinguiConfig
import typingsJapgolly.linguiConf.mod.OrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Catalogs extends StObject {
    
    var catalogs: js.Array[CatalogConfig]
    
    var compileNamespace: es | ts | cjs | String
    
    var compilerBabelOptions: GeneratorOptions
    
    var extractBabelOptions: Extends
    
    var fallbackLocales: FallbackLocales
    
    var format: CatalogFormat
    
    var formatOptions: CatalogFormatOptions
    
    var locales: js.Array[String]
    
    var orderBy: OrderBy
    
    var pseudoLocale: String
    
    var rootDir: String
    
    var runtimeConfigModule: js.Tuple2[String, js.UndefOr[String]]
    
    var service: CatalogService
    
    var sourceLocale: String
  }
  object Catalogs {
    
    inline def apply(
      catalogs: js.Array[CatalogConfig],
      compileNamespace: es | ts | cjs | String,
      compilerBabelOptions: GeneratorOptions,
      extractBabelOptions: Extends,
      fallbackLocales: FallbackLocales,
      format: CatalogFormat,
      formatOptions: CatalogFormatOptions,
      locales: js.Array[String],
      orderBy: OrderBy,
      pseudoLocale: String,
      rootDir: String,
      runtimeConfigModule: js.Tuple2[String, js.UndefOr[String]],
      service: CatalogService,
      sourceLocale: String
    ): Catalogs = {
      val __obj = js.Dynamic.literal(catalogs = catalogs.asInstanceOf[js.Any], compileNamespace = compileNamespace.asInstanceOf[js.Any], compilerBabelOptions = compilerBabelOptions.asInstanceOf[js.Any], extractBabelOptions = extractBabelOptions.asInstanceOf[js.Any], fallbackLocales = fallbackLocales.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], formatOptions = formatOptions.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], pseudoLocale = pseudoLocale.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], runtimeConfigModule = runtimeConfigModule.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], sourceLocale = sourceLocale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Catalogs]
    }
    
    extension [Self <: Catalogs](x: Self) {
      
      inline def setCatalogs(value: js.Array[CatalogConfig]): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
      
      inline def setCatalogsVarargs(value: CatalogConfig*): Self = StObject.set(x, "catalogs", js.Array(value*))
      
      inline def setCompileNamespace(value: es | ts | cjs | String): Self = StObject.set(x, "compileNamespace", value.asInstanceOf[js.Any])
      
      inline def setCompilerBabelOptions(value: GeneratorOptions): Self = StObject.set(x, "compilerBabelOptions", value.asInstanceOf[js.Any])
      
      inline def setExtractBabelOptions(value: Extends): Self = StObject.set(x, "extractBabelOptions", value.asInstanceOf[js.Any])
      
      inline def setFallbackLocales(value: FallbackLocales): Self = StObject.set(x, "fallbackLocales", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: CatalogFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatOptions(value: CatalogFormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setPseudoLocale(value: String): Self = StObject.set(x, "pseudoLocale", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfigModule(value: js.Tuple2[String, js.UndefOr[String]]): Self = StObject.set(x, "runtimeConfigModule", value.asInstanceOf[js.Any])
      
      inline def setService(value: CatalogService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setSourceLocale(value: String): Self = StObject.set(x, "sourceLocale", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigPath extends StObject {
    
    var configPath: js.UndefOr[String] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var skipValidation: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigPath {
    
    inline def apply(): ConfigPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigPath]
    }
    
    extension [Self <: ConfigPath](x: Self) {
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setSkipValidation(value: Boolean): Self = StObject.set(x, "skipValidation", value.asInstanceOf[js.Any])
      
      inline def setSkipValidationUndefined: Self = StObject.set(x, "skipValidation", js.undefined)
    }
  }
  
  trait Extends extends StObject {
    
    var `extends`: String
    
    var plugins: js.Array[String]
    
    var presets: js.Array[String]
    
    var rootMode: String
  }
  object Extends {
    
    inline def apply(`extends`: String, plugins: js.Array[String], presets: js.Array[String], rootMode: String): Extends = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any], presets = presets.asInstanceOf[js.Any], rootMode = rootMode.asInstanceOf[js.Any])
      __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extends]
    }
    
    extension [Self <: Extends](x: Self) {
      
      inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPresets(value: js.Array[String]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsVarargs(value: String*): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setRootMode(value: String): Self = StObject.set(x, "rootMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait FallbackLocale extends StObject {
    
    def fallbackLocale(config: LinguiConfig & DeprecatedFallbackLanguage): String
    
    def localeDir(config: LinguiConfig & DeprecatedLocaleDir): String
    
    def srcPathDirs(config: LinguiConfig & DeprecatedLocaleDir): String
    
    def srcPathIgnorePatterns(config: LinguiConfig & DeprecatedLocaleDir): String
  }
  object FallbackLocale {
    
    inline def apply(
      fallbackLocale: LinguiConfig & DeprecatedFallbackLanguage => String,
      localeDir: LinguiConfig & DeprecatedLocaleDir => String,
      srcPathDirs: LinguiConfig & DeprecatedLocaleDir => String,
      srcPathIgnorePatterns: LinguiConfig & DeprecatedLocaleDir => String
    ): FallbackLocale = {
      val __obj = js.Dynamic.literal(fallbackLocale = js.Any.fromFunction1(fallbackLocale), localeDir = js.Any.fromFunction1(localeDir), srcPathDirs = js.Any.fromFunction1(srcPathDirs), srcPathIgnorePatterns = js.Any.fromFunction1(srcPathIgnorePatterns))
      __obj.asInstanceOf[FallbackLocale]
    }
    
    extension [Self <: FallbackLocale](x: Self) {
      
      inline def setFallbackLocale(value: LinguiConfig & DeprecatedFallbackLanguage => String): Self = StObject.set(x, "fallbackLocale", js.Any.fromFunction1(value))
      
      inline def setLocaleDir(value: LinguiConfig & DeprecatedLocaleDir => String): Self = StObject.set(x, "localeDir", js.Any.fromFunction1(value))
      
      inline def setSrcPathDirs(value: LinguiConfig & DeprecatedLocaleDir => String): Self = StObject.set(x, "srcPathDirs", js.Any.fromFunction1(value))
      
      inline def setSrcPathIgnorePatterns(value: LinguiConfig & DeprecatedLocaleDir => String): Self = StObject.set(x, "srcPathIgnorePatterns", js.Any.fromFunction1(value))
    }
  }
}
