package typingsJapgolly.loadjs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.loadjs.loadjsBooleans.`true`
import typingsJapgolly.loadjs.mod.LoadOptions
import typingsJapgolly.loadjs.mod.LoadedFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(files: String, bundleId: String, optionsOrCallback: LoadOptions): Unit = js.native
    def apply(files: String, bundleId: String, optionsOrCallback: LoadedFn): Unit = js.native
    def apply(files: String, bundleId: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
    def apply(files: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
    def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadOptions): Unit = js.native
    def apply(files: js.Array[String], bundleId: String, optionsOrCallback: LoadedFn): Unit = js.native
    def apply(files: js.Array[String], bundleId: String, options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
    def apply(files: js.Array[String], options: LoadOptionsreturnPromiset): js.Promise[Unit] = js.native
  }
  
  /* Inlined loadjs.loadjs.LoadOptions & {  returnPromise :true} */
  trait LoadOptionsreturnPromiset extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var before: js.UndefOr[js.Function2[/* path */ String, /* scriptEl */ HTMLElement, Unit]] = js.undefined
    
    // Arguments provided are different in case of returnPromise: true / false
    var error: js.UndefOr[js.Function1[/* depsNotFound */ js.Array[String], Unit]] = js.undefined
    
    var numRetries: js.UndefOr[Double] = js.undefined
    
    var returnPromise: `true`
    
    var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object LoadOptionsreturnPromiset {
    
    inline def apply(): LoadOptionsreturnPromiset = {
      val __obj = js.Dynamic.literal(returnPromise = true)
      __obj.asInstanceOf[LoadOptionsreturnPromiset]
    }
    
    extension [Self <: LoadOptionsreturnPromiset](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setBefore(value: (/* path */ String, /* scriptEl */ HTMLElement) => Callback): Self = StObject.set(x, "before", js.Any.fromFunction2((t0: /* path */ String, t1: /* scriptEl */ HTMLElement) => (value(t0, t1)).runNow()))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setError(value: /* depsNotFound */ js.Array[String] => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* depsNotFound */ js.Array[String]) => value(t0).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNumRetries(value: Double): Self = StObject.set(x, "numRetries", value.asInstanceOf[js.Any])
      
      inline def setNumRetriesUndefined: Self = StObject.set(x, "numRetries", js.undefined)
      
      inline def setReturnPromise(value: `true`): Self = StObject.set(x, "returnPromise", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Callback): Self = StObject.set(x, "success", value.toJsFn)
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
