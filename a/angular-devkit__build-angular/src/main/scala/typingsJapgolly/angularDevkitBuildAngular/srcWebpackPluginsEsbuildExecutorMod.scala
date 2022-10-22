package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.esbuild.mod.FormatMessagesOptions
import typingsJapgolly.esbuild.mod.PartialMessage
import typingsJapgolly.esbuild.mod.TransformOptions
import typingsJapgolly.esbuild.mod.TransformResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsEsbuildExecutorMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in 'transform' | 'formatMessages' ]: @angular-devkit/build-angular.anon.Typeofimported_esbuild[P]} */ @JSImport("@angular-devkit/build-angular/src/webpack/plugins/esbuild-executor", "EsbuildExecutor")
  @js.native
  /**
    * Constructs an instance of the `EsbuildExecutor` class.
    *
    * @param alwaysUseWasm If true, the WASM-variant will be preferred and no support test will be
    * performed; if false (default), the native variant will be preferred.
    */
  open class EsbuildExecutor () extends StObject {
    def this(alwaysUseWasm: Boolean) = this()
    
    /* private */ var alwaysUseWasm: Any = js.native
    
    /**
      * Initializes the esbuild transform and format messages functions.
      *
      * @returns A promise that fulfills when esbuild has been loaded and available for use.
      */
    /* private */ var ensureEsbuild: Any = js.native
    
    /* private */ var esbuildFormatMessages: Any = js.native
    
    /* private */ var esbuildTransform: Any = js.native
    
    def formatMessages(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Promise[js.Array[String]] = js.native
    
    /* private */ var initialized: Any = js.native
    
    def transform(input: String): js.Promise[TransformResult] = js.native
    def transform(input: String, options: TransformOptions): js.Promise[TransformResult] = js.native
    def transform(input: js.typedarray.Uint8Array): js.Promise[TransformResult] = js.native
    def transform(input: js.typedarray.Uint8Array, options: TransformOptions): js.Promise[TransformResult] = js.native
    
    /**
      * Transitions an executor instance to use the WASM-variant of esbuild.
      */
    /* private */ var useWasm: Any = js.native
  }
  /* static members */
  object EsbuildExecutor {
    
    @JSImport("@angular-devkit/build-angular/src/webpack/plugins/esbuild-executor", "EsbuildExecutor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines whether the native variant of esbuild can be used on the current platform.
      *
      * @returns A promise which resolves to `true`, if the native variant of esbuild is support or `false`, if the WASM variant is required.
      */
    inline def hasNativeSupport(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasNativeSupport")().asInstanceOf[js.Promise[Boolean]]
  }
}
