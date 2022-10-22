package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.Count
import typingsJapgolly.angularDevkitBuildAngular.anon.I18n
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsProcessBundleMod.InlineOptions
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsActionExecutorMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/action-executor", "BundleActionExecutor")
  @js.native
  open class BundleActionExecutor protected () extends StObject {
    def this(workerOptions: I18n) = this()
    
    /* private */ var ensureWorkerPool: Any = js.native
    
    def `inline`(action: InlineOptions): js.Promise[Count] = js.native
    
    def inlineAll(actions: js.Iterable[InlineOptions]): AsyncIterable[Count] = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var workerOptions: Any = js.native
    
    /* private */ var workerPool: Any = js.native
  }
  /* static members */
  object BundleActionExecutor {
    
    @JSImport("@angular-devkit/build-angular/src/utils/action-executor", "BundleActionExecutor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/build-angular/src/utils/action-executor", "BundleActionExecutor.executeAll")
    @js.native
    def executeAll: Any = js.native
    inline def executeAll_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executeAll")(x.asInstanceOf[js.Any])
  }
}
