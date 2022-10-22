package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularInts.`2015`
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularInts.`2016`
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularInts.`2017`
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularInts.`2018`
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularInts.`2019`
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularInts.`2020`
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularInts.`5`
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.next
import typingsJapgolly.angularDevkitBuildAngular.anon.Code
import typingsJapgolly.angularDevkitBuildAngular.anon.Name
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsJavascriptOptimizerWorkerMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/javascript-optimizer-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasAssetOptions: OptimizeRequest): js.Promise[Name] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasAssetOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Name]]
  
  /**
    * A request to optimize JavaScript using the supplied options.
    */
  trait OptimizeRequest extends StObject {
    
    /**
      * The JavaScript asset to optimize.
      */
    var asset: Code
    
    /**
      * The options to use when optimizing.
      */
    var options: OptimizeRequestOptions
  }
  object OptimizeRequest {
    
    inline def apply(asset: Code, options: OptimizeRequestOptions): OptimizeRequest = {
      val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimizeRequest]
    }
    
    extension [Self <: OptimizeRequest](x: Self) {
      
      inline def setAsset(value: Code): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: OptimizeRequestOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptimizeRequestOptions extends StObject {
    
    /**
      * Controls advanced optimizations.
      * Currently these are only terser related:
      * * terser compress passes are set to 2
      * * terser pure_getters option is enabled
      */
    var advanced: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls whether esbuild should only use the WASM-variant instead of trying to
      * use the native variant. Some platforms may not support the native-variant and
      * this option allows one support test to be conducted prior to all the workers starting.
      */
    var alwaysUseWasm: Boolean
    
    /**
      * Specifies the string tokens that should be replaced with a defined value.
      */
    var define: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * Controls whether class, function, and variable names should be left intact
      * throughout the output code.
      */
    var keepIdentifierNames: Boolean
    
    /**
      * Controls whether to retain the original name of classes and functions.
      */
    var keepNames: Boolean
    
    /**
      * Controls whether license text is removed from the output code.
      * Within the CLI, this option is linked to the license extraction functionality.
      */
    var removeLicenses: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls whether source maps should be generated.
      */
    var sourcemap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the target ECMAScript version for the output code.
      */
    var target: `5` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020` | next
  }
  object OptimizeRequestOptions {
    
    inline def apply(
      alwaysUseWasm: Boolean,
      keepIdentifierNames: Boolean,
      keepNames: Boolean,
      target: `5` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020` | next
    ): OptimizeRequestOptions = {
      val __obj = js.Dynamic.literal(alwaysUseWasm = alwaysUseWasm.asInstanceOf[js.Any], keepIdentifierNames = keepIdentifierNames.asInstanceOf[js.Any], keepNames = keepNames.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimizeRequestOptions]
    }
    
    extension [Self <: OptimizeRequestOptions](x: Self) {
      
      inline def setAdvanced(value: Boolean): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
      
      inline def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
      
      inline def setAlwaysUseWasm(value: Boolean): Self = StObject.set(x, "alwaysUseWasm", value.asInstanceOf[js.Any])
      
      inline def setDefine(value: Record[String, String]): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
      
      inline def setDefineUndefined: Self = StObject.set(x, "define", js.undefined)
      
      inline def setKeepIdentifierNames(value: Boolean): Self = StObject.set(x, "keepIdentifierNames", value.asInstanceOf[js.Any])
      
      inline def setKeepNames(value: Boolean): Self = StObject.set(x, "keepNames", value.asInstanceOf[js.Any])
      
      inline def setRemoveLicenses(value: Boolean): Self = StObject.set(x, "removeLicenses", value.asInstanceOf[js.Any])
      
      inline def setRemoveLicensesUndefined: Self = StObject.set(x, "removeLicenses", js.undefined)
      
      inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
      
      inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
      
      inline def setTarget(value: `5` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020` | next): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
