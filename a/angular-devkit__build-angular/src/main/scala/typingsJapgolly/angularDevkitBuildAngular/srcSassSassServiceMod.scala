package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.async
import typingsJapgolly.sass.typesLegacyExceptionMod.LegacyException
import typingsJapgolly.sass.typesLegacyOptionsMod.LegacyOptions
import typingsJapgolly.sass.typesLegacyRenderMod.LegacyResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSassSassServiceMod {
  
  @JSImport("@angular-devkit/build-angular/src/sass/sass-service", "SassWorkerImplementation")
  @js.native
  open class SassWorkerImplementation () extends StObject {
    
    /* private */ val availableWorkers: Any = js.native
    
    /**
      * Shutdown the Sass render worker.
      * Executing this method will stop any pending render requests.
      */
    def close(): Unit = js.native
    
    /* private */ var createRequest: Any = js.native
    
    /* private */ var createWorker: Any = js.native
    
    /* private */ var idCounter: Any = js.native
    
    /**
      * Provides information about the Sass implementation.
      * This mimics enough of the `dart-sass` value to be used with the `sass-loader`.
      */
    def info: String = js.native
    
    /* private */ var nextWorkerIndex: Any = js.native
    
    /* private */ var processImporters: Any = js.native
    
    /**
      * The synchronous render function is not used by the `sass-loader`.
      */
    def renderSync(): scala.Nothing = js.native
    
    /**
      * Asynchronously request a Sass stylesheet to be renderered.
      *
      * @param options The `dart-sass` options to use when rendering the stylesheet.
      * @param callback The function to execute when the rendering is complete.
      */
    @JSName("render")
    def render_async(options: LegacyOptions[async], callback: RenderCallback): Unit = js.native
    
    /* private */ val requests: Any = js.native
    
    /* private */ val workers: Any = js.native
  }
  
  /**
    * The callback type for the `dart-sass` asynchronous render function.
    */
  type RenderCallback = js.Function2[/* error */ js.UndefOr[LegacyException], /* result */ js.UndefOr[LegacyResult], Unit]
}
