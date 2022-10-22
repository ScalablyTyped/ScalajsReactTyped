package typingsJapgolly.jpm

import japgolly.scalajs.react.Callback
import typingsJapgolly.jpm.FFAddonSDK.Port
import typingsJapgolly.jpm.anon.Allow
import typingsJapgolly.jpm.anon.Script
import typingsJapgolly.jpm.jpmStrings.error
import typingsJapgolly.jpm.jpmStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a permanent, invisible page and access its DOM
  */
object sdkPageWorkerMod {
  
  @JSImport("sdk/page-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Page(options: Allow): PageWorker = ^.asInstanceOf[js.Dynamic].applyDynamic("Page")(options.asInstanceOf[js.Any]).asInstanceOf[PageWorker]
  
  trait PageWorker extends StObject {
    
    var allow: js.UndefOr[Script] = js.undefined
    
    var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var contentURL: js.UndefOr[String] = js.undefined
    
    def destroy(): Unit
    
    var include: js.UndefOr[String | (js.Array[js.RegExp | String]) | js.RegExp] = js.undefined
    
    def on(event: message | error, handler: js.Function1[/* arg */ js.UndefOr[message | js.Error], Any]): Unit
    
    var port: Port
    
    def postMessage(message: String): Unit
    
    def removeListener(event: String, listener: js.Function): Unit
  }
  object PageWorker {
    
    inline def apply(
      destroy: Callback,
      on: (message | error, js.Function1[/* arg */ js.UndefOr[message | js.Error], Any]) => Callback,
      port: Port,
      postMessage: String => Callback,
      removeListener: (String, js.Function) => Callback
    ): PageWorker = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, on = js.Any.fromFunction2((t0: message | error, t1: js.Function1[/* arg */ js.UndefOr[message | js.Error], Any]) => (on(t0, t1)).runNow()), port = port.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1((t0: String) => postMessage(t0).runNow()), removeListener = js.Any.fromFunction2((t0: String, t1: js.Function) => (removeListener(t0, t1)).runNow()))
      __obj.asInstanceOf[PageWorker]
    }
    
    extension [Self <: PageWorker](x: Self) {
      
      inline def setAllow(value: Script): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
      
      inline def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
      
      inline def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
      
      inline def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value*))
      
      inline def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
      
      inline def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value*))
      
      inline def setContentURL(value: String): Self = StObject.set(x, "contentURL", value.asInstanceOf[js.Any])
      
      inline def setContentURLUndefined: Self = StObject.set(x, "contentURL", js.undefined)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setInclude(value: String | (js.Array[js.RegExp | String]) | js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setOn(value: (message | error, js.Function1[/* arg */ js.UndefOr[message | js.Error], Any]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: message | error, t1: js.Function1[/* arg */ js.UndefOr[message | js.Error], Any]) => (value(t0, t1)).runNow()))
      
      inline def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPostMessage(value: String => Callback): Self = StObject.set(x, "postMessage", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveListener(value: (String, js.Function) => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
    }
  }
}
