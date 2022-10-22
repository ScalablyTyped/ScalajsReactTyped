package typingsJapgolly.angularDevkitBuildAngular

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.error
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.info
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.warning
import typingsJapgolly.angularDevkitBuildAngular.anon.FnCall
import typingsJapgolly.angularDevkitBuildAngular.anon.FnCallLocaleHasLocalizeName
import typingsJapgolly.angularDevkitBuildAngular.anon.IncludedBasePath
import typingsJapgolly.angularDevkitBuildAngular.anon.JitMode
import typingsJapgolly.angularDevkitBuildAngular.anon.Locale
import typingsJapgolly.angularDevkitBuildAngular.anon.LooseEnums
import typingsJapgolly.angularDevkitBuildAngular.anon.Plugins
import typingsJapgolly.angularLocalize.mod.ɵParsedTranslation
import typingsJapgolly.angularLocalize.toolsSrcBabelCoreMod.PluginObj
import typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
import typingsJapgolly.angularLocalize.toolsSrcSourceFileUtilsMod.TranslatePluginOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBabelPresetsApplicationMod {
  
  @JSImport("@angular-devkit/build-angular/src/babel/presets/application", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(api: Any, options: ApplicationPresetOptions): Plugins = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Plugins]
  
  trait ApplicationPresetOptions extends StObject {
    
    var angularLinker: js.UndefOr[JitMode] = js.undefined
    
    var diagnosticReporter: js.UndefOr[DiagnosticReporter] = js.undefined
    
    var forceAsyncTransformation: js.UndefOr[Boolean] = js.undefined
    
    var forcePresetEnv: js.UndefOr[Boolean] = js.undefined
    
    var i18n: js.UndefOr[Locale] = js.undefined
    
    var instrumentCode: js.UndefOr[IncludedBasePath] = js.undefined
    
    var optimize: js.UndefOr[LooseEnums] = js.undefined
    
    var supportedBrowsers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ApplicationPresetOptions {
    
    inline def apply(): ApplicationPresetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationPresetOptions]
    }
    
    extension [Self <: ApplicationPresetOptions](x: Self) {
      
      inline def setAngularLinker(value: JitMode): Self = StObject.set(x, "angularLinker", value.asInstanceOf[js.Any])
      
      inline def setAngularLinkerUndefined: Self = StObject.set(x, "angularLinker", js.undefined)
      
      inline def setDiagnosticReporter(value: (/* type */ error | warning | info, /* message */ String) => Callback): Self = StObject.set(x, "diagnosticReporter", js.Any.fromFunction2((t0: /* type */ error | warning | info, t1: /* message */ String) => (value(t0, t1)).runNow()))
      
      inline def setDiagnosticReporterUndefined: Self = StObject.set(x, "diagnosticReporter", js.undefined)
      
      inline def setForceAsyncTransformation(value: Boolean): Self = StObject.set(x, "forceAsyncTransformation", value.asInstanceOf[js.Any])
      
      inline def setForceAsyncTransformationUndefined: Self = StObject.set(x, "forceAsyncTransformation", js.undefined)
      
      inline def setForcePresetEnv(value: Boolean): Self = StObject.set(x, "forcePresetEnv", value.asInstanceOf[js.Any])
      
      inline def setForcePresetEnvUndefined: Self = StObject.set(x, "forcePresetEnv", js.undefined)
      
      inline def setI18n(value: Locale): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setInstrumentCode(value: IncludedBasePath): Self = StObject.set(x, "instrumentCode", value.asInstanceOf[js.Any])
      
      inline def setInstrumentCodeUndefined: Self = StObject.set(x, "instrumentCode", js.undefined)
      
      inline def setOptimize(value: LooseEnums): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
      
      inline def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
      
      inline def setSupportedBrowsers(value: js.Array[String]): Self = StObject.set(x, "supportedBrowsers", value.asInstanceOf[js.Any])
      
      inline def setSupportedBrowsersUndefined: Self = StObject.set(x, "supportedBrowsers", js.undefined)
      
      inline def setSupportedBrowsersVarargs(value: String*): Self = StObject.set(x, "supportedBrowsers", js.Array(value*))
    }
  }
  
  type DiagnosticReporter = js.Function2[/* type */ error | warning | info, /* message */ String, Unit]
  
  trait I18nPluginCreators extends StObject {
    
    def makeEs2015TranslatePlugin(diagnostics: Diagnostics, translations: Record[String, ɵParsedTranslation]): PluginObj
    def makeEs2015TranslatePlugin(
      diagnostics: Diagnostics,
      translations: Record[String, ɵParsedTranslation],
      hasMissingTranslationLocalizeName: Unit,
      fs: PathManipulation
    ): PluginObj
    def makeEs2015TranslatePlugin(
      diagnostics: Diagnostics,
      translations: Record[String, ɵParsedTranslation],
      hasMissingTranslationLocalizeName: TranslatePluginOptions
    ): PluginObj
    def makeEs2015TranslatePlugin(
      diagnostics: Diagnostics,
      translations: Record[String, ɵParsedTranslation],
      hasMissingTranslationLocalizeName: TranslatePluginOptions,
      fs: PathManipulation
    ): PluginObj
    @JSName("makeEs2015TranslatePlugin")
    var makeEs2015TranslatePlugin_Original: FnCall
    
    def makeEs5TranslatePlugin(diagnostics: Diagnostics, translations: Record[String, ɵParsedTranslation]): PluginObj
    def makeEs5TranslatePlugin(
      diagnostics: Diagnostics,
      translations: Record[String, ɵParsedTranslation],
      hasMissingTranslationLocalizeName: Unit,
      fs: PathManipulation
    ): PluginObj
    def makeEs5TranslatePlugin(
      diagnostics: Diagnostics,
      translations: Record[String, ɵParsedTranslation],
      hasMissingTranslationLocalizeName: TranslatePluginOptions
    ): PluginObj
    def makeEs5TranslatePlugin(
      diagnostics: Diagnostics,
      translations: Record[String, ɵParsedTranslation],
      hasMissingTranslationLocalizeName: TranslatePluginOptions,
      fs: PathManipulation
    ): PluginObj
    @JSName("makeEs5TranslatePlugin")
    var makeEs5TranslatePlugin_Original: FnCall
    
    def makeLocalePlugin(locale: String): PluginObj
    def makeLocalePlugin(locale: String, hasLocalizeName: TranslatePluginOptions): PluginObj
    @JSName("makeLocalePlugin")
    var makeLocalePlugin_Original: FnCallLocaleHasLocalizeName
  }
  object I18nPluginCreators {
    
    inline def apply(
      makeEs2015TranslatePlugin: FnCall,
      makeEs5TranslatePlugin: FnCall,
      makeLocalePlugin: FnCallLocaleHasLocalizeName
    ): I18nPluginCreators = {
      val __obj = js.Dynamic.literal(makeEs2015TranslatePlugin = makeEs2015TranslatePlugin.asInstanceOf[js.Any], makeEs5TranslatePlugin = makeEs5TranslatePlugin.asInstanceOf[js.Any], makeLocalePlugin = makeLocalePlugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nPluginCreators]
    }
    
    extension [Self <: I18nPluginCreators](x: Self) {
      
      inline def setMakeEs2015TranslatePlugin(value: FnCall): Self = StObject.set(x, "makeEs2015TranslatePlugin", value.asInstanceOf[js.Any])
      
      inline def setMakeEs5TranslatePlugin(value: FnCall): Self = StObject.set(x, "makeEs5TranslatePlugin", value.asInstanceOf[js.Any])
      
      inline def setMakeLocalePlugin(value: FnCallLocaleHasLocalizeName): Self = StObject.set(x, "makeLocalePlugin", value.asInstanceOf[js.Any])
    }
  }
}
