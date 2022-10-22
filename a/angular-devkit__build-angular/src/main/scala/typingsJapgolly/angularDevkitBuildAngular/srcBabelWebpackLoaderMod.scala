package typingsJapgolly.angularDevkitBuildAngular

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.error
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.info
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.warning
import typingsJapgolly.angularDevkitBuildAngular.anon.ExcludedPaths
import typingsJapgolly.angularDevkitBuildAngular.anon.JitMode
import typingsJapgolly.angularDevkitBuildAngular.anon.Locale
import typingsJapgolly.angularDevkitBuildAngular.anon.LooseEnums
import typingsJapgolly.angularDevkitBuildAngular.srcBabelPresetsApplicationMod.DiagnosticReporter
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBabelWebpackLoaderMod {
  
  @JSImport("@angular-devkit/build-angular/src/babel/webpack-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/babel/webpack-loader", JSImport.Default)
  @js.native
  val default: Any = js.native
  
  inline def requiresLinking(path: String, source: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("requiresLinking")(path.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  type AngularBabelLoaderOptions = AngularCustomOptions & (Record[String, Any])
  
  /* Inlined parent std.Omit<@angular-devkit/build-angular.@angular-devkit/build-angular/src/babel/presets/application.ApplicationPresetOptions, 'instrumentCode'> */
  trait AngularCustomOptions extends StObject {
    
    var angularLinker: js.UndefOr[JitMode] = js.undefined
    
    var diagnosticReporter: js.UndefOr[DiagnosticReporter] = js.undefined
    
    var forceAsyncTransformation: js.UndefOr[Boolean] = js.undefined
    
    var forcePresetEnv: js.UndefOr[Boolean] = js.undefined
    
    var i18n: js.UndefOr[Locale] = js.undefined
    
    var instrumentCode: js.UndefOr[ExcludedPaths] = js.undefined
    
    var optimize: js.UndefOr[LooseEnums] = js.undefined
    
    var supportedBrowsers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AngularCustomOptions {
    
    inline def apply(): AngularCustomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AngularCustomOptions]
    }
    
    extension [Self <: AngularCustomOptions](x: Self) {
      
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
      
      inline def setInstrumentCode(value: ExcludedPaths): Self = StObject.set(x, "instrumentCode", value.asInstanceOf[js.Any])
      
      inline def setInstrumentCodeUndefined: Self = StObject.set(x, "instrumentCode", js.undefined)
      
      inline def setOptimize(value: LooseEnums): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
      
      inline def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
      
      inline def setSupportedBrowsers(value: js.Array[String]): Self = StObject.set(x, "supportedBrowsers", value.asInstanceOf[js.Any])
      
      inline def setSupportedBrowsersUndefined: Self = StObject.set(x, "supportedBrowsers", js.undefined)
      
      inline def setSupportedBrowsersVarargs(value: String*): Self = StObject.set(x, "supportedBrowsers", js.Array(value*))
    }
  }
}
