package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitBuildAngular.anon.BuildOptions
import typingsJapgolly.angularDevkitBuildAngular.anon.BuildOptionsI18n
import typingsJapgolly.angularDevkitBuildAngular.anon.Error
import typingsJapgolly.angularDevkitBuildAngular.anon.Format
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.I18NTranslation
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Schema
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsLoadTranslationsMod.TranslationLoader
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typingsJapgolly.std.Record
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsI18nOptionsMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/i18n-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configureI18nBuild(context: BuilderContext, options: Schema): js.Promise[BuildOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("configureI18nBuild")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BuildOptions]]
  inline def configureI18nBuild(
    context: BuilderContext,
    options: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.Schema
  ): js.Promise[BuildOptionsI18n] = (^.asInstanceOf[js.Dynamic].applyDynamic("configureI18nBuild")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BuildOptionsI18n]]
  
  inline def createI18nOptions(metadata: JsonObject): I18nOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18nOptions")(metadata.asInstanceOf[js.Any]).asInstanceOf[I18nOptions]
  inline def createI18nOptions(metadata: JsonObject, `inline`: js.Array[String]): I18nOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18nOptions")(metadata.asInstanceOf[js.Any], `inline`.asInstanceOf[js.Any])).asInstanceOf[I18nOptions]
  inline def createI18nOptions(metadata: JsonObject, `inline`: Boolean): I18nOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18nOptions")(metadata.asInstanceOf[js.Any], `inline`.asInstanceOf[js.Any])).asInstanceOf[I18nOptions]
  
  inline def loadTranslations(
    locale: String,
    desc: LocaleDescription,
    workspaceRoot: String,
    loader: TranslationLoader,
    logger: Error
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslations")(locale.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadTranslations(
    locale: String,
    desc: LocaleDescription,
    workspaceRoot: String,
    loader: TranslationLoader,
    logger: Error,
    usedFormats: Unit,
    duplicateTranslation: I18NTranslation
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslations")(locale.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], usedFormats.asInstanceOf[js.Any], duplicateTranslation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadTranslations(
    locale: String,
    desc: LocaleDescription,
    workspaceRoot: String,
    loader: TranslationLoader,
    logger: Error,
    usedFormats: Set[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslations")(locale.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], usedFormats.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadTranslations(
    locale: String,
    desc: LocaleDescription,
    workspaceRoot: String,
    loader: TranslationLoader,
    logger: Error,
    usedFormats: Set[String],
    duplicateTranslation: I18NTranslation
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslations")(locale.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], usedFormats.asInstanceOf[js.Any], duplicateTranslation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait I18nOptions extends StObject {
    
    var flatOutput: js.UndefOr[Boolean] = js.undefined
    
    var hasDefinedSourceLocale: js.UndefOr[Boolean] = js.undefined
    
    var inlineLocales: Set[String]
    
    var locales: Record[String, LocaleDescription]
    
    val shouldInline: Boolean
    
    var sourceLocale: String
  }
  object I18nOptions {
    
    inline def apply(
      inlineLocales: Set[String],
      locales: Record[String, LocaleDescription],
      shouldInline: Boolean,
      sourceLocale: String
    ): I18nOptions = {
      val __obj = js.Dynamic.literal(inlineLocales = inlineLocales.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], shouldInline = shouldInline.asInstanceOf[js.Any], sourceLocale = sourceLocale.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nOptions]
    }
    
    extension [Self <: I18nOptions](x: Self) {
      
      inline def setFlatOutput(value: Boolean): Self = StObject.set(x, "flatOutput", value.asInstanceOf[js.Any])
      
      inline def setFlatOutputUndefined: Self = StObject.set(x, "flatOutput", js.undefined)
      
      inline def setHasDefinedSourceLocale(value: Boolean): Self = StObject.set(x, "hasDefinedSourceLocale", value.asInstanceOf[js.Any])
      
      inline def setHasDefinedSourceLocaleUndefined: Self = StObject.set(x, "hasDefinedSourceLocale", js.undefined)
      
      inline def setInlineLocales(value: Set[String]): Self = StObject.set(x, "inlineLocales", value.asInstanceOf[js.Any])
      
      inline def setLocales(value: Record[String, LocaleDescription]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setShouldInline(value: Boolean): Self = StObject.set(x, "shouldInline", value.asInstanceOf[js.Any])
      
      inline def setSourceLocale(value: String): Self = StObject.set(x, "sourceLocale", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocaleDescription extends StObject {
    
    var baseHref: js.UndefOr[String] = js.undefined
    
    var dataPath: js.UndefOr[String] = js.undefined
    
    var files: js.Array[Format]
    
    var translation: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object LocaleDescription {
    
    inline def apply(files: js.Array[Format]): LocaleDescription = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleDescription]
    }
    
    extension [Self <: LocaleDescription](x: Self) {
      
      inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
      
      inline def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
      
      inline def setDataPathUndefined: Self = StObject.set(x, "dataPath", js.undefined)
      
      inline def setFiles(value: js.Array[Format]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: Format*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setTranslation(value: Record[String, Any]): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
      
      inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
    }
  }
}
