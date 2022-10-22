package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.error
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.ignore
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.warning
import typingsJapgolly.angularDevkitBuildAngular.anon.DiagnosticsFile
import typingsJapgolly.angularDevkitBuildAngular.anon.DiagnosticsPlugins
import typingsJapgolly.angularDevkitBuildAngular.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsProcessBundleMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/process-bundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createI18nPlugins(
    locale: String,
    translation: Any,
    missingTranslation: error | warning | ignore,
    shouldInline: Boolean
  ): js.Promise[DiagnosticsPlugins] = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18nPlugins")(locale.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], missingTranslation.asInstanceOf[js.Any], shouldInline.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagnosticsPlugins]]
  inline def createI18nPlugins(
    locale: String,
    translation: Any,
    missingTranslation: error | warning | ignore,
    shouldInline: Boolean,
    localeDataContent: String
  ): js.Promise[DiagnosticsPlugins] = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18nPlugins")(locale.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], missingTranslation.asInstanceOf[js.Any], shouldInline.asInstanceOf[js.Any], localeDataContent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagnosticsPlugins]]
  inline def createI18nPlugins(
    locale: String,
    translation: Unit,
    missingTranslation: error | warning | ignore,
    shouldInline: Boolean
  ): js.Promise[DiagnosticsPlugins] = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18nPlugins")(locale.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], missingTranslation.asInstanceOf[js.Any], shouldInline.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagnosticsPlugins]]
  inline def createI18nPlugins(
    locale: String,
    translation: Unit,
    missingTranslation: error | warning | ignore,
    shouldInline: Boolean,
    localeDataContent: String
  ): js.Promise[DiagnosticsPlugins] = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18nPlugins")(locale.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], missingTranslation.asInstanceOf[js.Any], shouldInline.asInstanceOf[js.Any], localeDataContent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagnosticsPlugins]]
  
  inline def inlineLocales(options: InlineOptions): js.Promise[File | DiagnosticsFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineLocales")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[File | DiagnosticsFile]]
  
  trait InlineOptions extends StObject {
    
    var code: String
    
    var es5: Boolean
    
    var filename: String
    
    var map: js.UndefOr[String] = js.undefined
    
    var missingTranslation: js.UndefOr[warning | error | ignore] = js.undefined
    
    var outputPath: String
    
    var setLocale: js.UndefOr[Boolean] = js.undefined
  }
  object InlineOptions {
    
    inline def apply(code: String, es5: Boolean, filename: String, outputPath: String): InlineOptions = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], es5 = es5.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineOptions]
    }
    
    extension [Self <: InlineOptions](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setEs5(value: Boolean): Self = StObject.set(x, "es5", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMissingTranslation(value: warning | error | ignore): Self = StObject.set(x, "missingTranslation", value.asInstanceOf[js.Any])
      
      inline def setMissingTranslationUndefined: Self = StObject.set(x, "missingTranslation", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setSetLocale(value: Boolean): Self = StObject.set(x, "setLocale", value.asInstanceOf[js.Any])
      
      inline def setSetLocaleUndefined: Self = StObject.set(x, "setLocale", js.undefined)
    }
  }
}
