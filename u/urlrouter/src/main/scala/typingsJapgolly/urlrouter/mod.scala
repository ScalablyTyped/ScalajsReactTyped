package typingsJapgolly.urlrouter

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(handler: js.Function1[/* app */ App, Unit]): HttpHandler = ^.asInstanceOf[js.Dynamic].apply(handler.asInstanceOf[js.Any]).asInstanceOf[HttpHandler]
  
  @JSImport("urlrouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UrlRouterfunc(handler: js.Function1[/* app */ App, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_UrlRouterfunc")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def UrlRouterfunc(handler: js.Function1[/* app */ App, Unit], options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_UrlRouterfunc")(handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait App extends StObject {
    
    def all(urlpattern: String, handler: HttpHandler): Unit
    
    def checkout(urlpattern: String, handler: HttpHandler): Unit
    
    def copy(urlpattern: String, handler: HttpHandler): Unit
    
    def delete(urlpattern: String, handler: HttpHandler): Unit
    
    // https://github.com/visionmedia/node-methods/blob/master/index.js
    def get(urlpattern: String, handler: HttpHandler): Unit
    
    def head(urlpattern: String, handler: HttpHandler): Unit
    
    def lock(urlpattern: String, handler: HttpHandler): Unit
    
    def `m-search`(urlpattern: String, handler: HttpHandler): Unit
    
    def merge(urlpattern: String, handler: HttpHandler): Unit
    
    def mkactivity(urlpattern: String, handler: HttpHandler): Unit
    
    def mkcol(urlpattern: String, handler: HttpHandler): Unit
    
    def move(urlpattern: String, handler: HttpHandler): Unit
    
    def notify(urlpattern: String, handler: HttpHandler): Unit
    
    def options(urlpattern: String, handler: HttpHandler): Unit
    
    def patch(urlpattern: String, handler: HttpHandler): Unit
    
    def post(urlpattern: String, handler: HttpHandler): Unit
    
    def propfind(urlpattern: String, handler: HttpHandler): Unit
    
    def proppatch(urlpattern: String, handler: HttpHandler): Unit
    
    def put(urlpattern: String, handler: HttpHandler): Unit
    
    def redirect(urlpattern: String, to: String): Unit
    
    def report(urlpattern: String, handler: HttpHandler): Unit
    
    def search(urlpattern: String, handler: HttpHandler): Unit
    
    def subscribe(urlpattern: String, handler: HttpHandler): Unit
    
    def trace(urlpattern: String, handler: HttpHandler): Unit
    
    def unlock(urlpattern: String, handler: HttpHandler): Unit
    
    def unsubscribe(urlpattern: String, handler: HttpHandler): Unit
  }
  object App {
    
    inline def apply(
      all: (String, HttpHandler) => Callback,
      checkout: (String, HttpHandler) => Callback,
      copy: (String, HttpHandler) => Callback,
      delete: (String, HttpHandler) => Callback,
      get: (String, HttpHandler) => Callback,
      head: (String, HttpHandler) => Callback,
      lock: (String, HttpHandler) => Callback,
      `m-search`: (String, HttpHandler) => Callback,
      merge: (String, HttpHandler) => Callback,
      mkactivity: (String, HttpHandler) => Callback,
      mkcol: (String, HttpHandler) => Callback,
      move: (String, HttpHandler) => Callback,
      notify_ : (String, HttpHandler) => Callback,
      options: (String, HttpHandler) => Callback,
      patch: (String, HttpHandler) => Callback,
      post: (String, HttpHandler) => Callback,
      propfind: (String, HttpHandler) => Callback,
      proppatch: (String, HttpHandler) => Callback,
      put: (String, HttpHandler) => Callback,
      redirect: (String, String) => Callback,
      report: (String, HttpHandler) => Callback,
      search: (String, HttpHandler) => Callback,
      subscribe: (String, HttpHandler) => Callback,
      trace: (String, HttpHandler) => Callback,
      unlock: (String, HttpHandler) => Callback,
      unsubscribe: (String, HttpHandler) => Callback
    ): App = {
      val __obj = js.Dynamic.literal(all = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (all(t0, t1)).runNow()), checkout = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (checkout(t0, t1)).runNow()), copy = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (copy(t0, t1)).runNow()), delete = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (delete(t0, t1)).runNow()), get = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (get(t0, t1)).runNow()), head = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (head(t0, t1)).runNow()), lock = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (lock(t0, t1)).runNow()), merge = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (merge(t0, t1)).runNow()), mkactivity = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (mkactivity(t0, t1)).runNow()), mkcol = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (mkcol(t0, t1)).runNow()), move = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (move(t0, t1)).runNow()), options = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (options(t0, t1)).runNow()), patch = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (patch(t0, t1)).runNow()), post = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (post(t0, t1)).runNow()), propfind = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (propfind(t0, t1)).runNow()), proppatch = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (proppatch(t0, t1)).runNow()), put = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (put(t0, t1)).runNow()), redirect = js.Any.fromFunction2((t0: String, t1: String) => (redirect(t0, t1)).runNow()), report = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (report(t0, t1)).runNow()), search = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (search(t0, t1)).runNow()), subscribe = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (subscribe(t0, t1)).runNow()), trace = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (trace(t0, t1)).runNow()), unlock = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (unlock(t0, t1)).runNow()), unsubscribe = js.Any.fromFunction2((t0: String, t1: HttpHandler) => (unsubscribe(t0, t1)).runNow()))
      __obj.updateDynamic("m-search")(js.Any.fromFunction2((t0: String, t1: HttpHandler) => (`m-search`(t0, t1)).runNow()))
      __obj.updateDynamic("notify")(js.Any.fromFunction2((t0: String, t1: HttpHandler) => (notify_(t0, t1)).runNow()))
      __obj.asInstanceOf[App]
    }
    
    extension [Self <: App](x: Self) {
      
      inline def setAll(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "all", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setCheckout(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "checkout", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setCopy(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "copy", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setDelete(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setGet(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setHead(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "head", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setLock(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "lock", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def `setM-search`(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "m-search", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setMerge(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "merge", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setMkactivity(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "mkactivity", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setMkcol(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "mkcol", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setMove(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "move", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setNotify_(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "notify", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setOptions(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "options", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setPatch(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "patch", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setPost(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "post", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setPropfind(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "propfind", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setProppatch(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "proppatch", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setPut(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "put", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setRedirect(value: (String, String) => Callback): Self = StObject.set(x, "redirect", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setReport(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "report", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setSearch(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "search", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setSubscribe(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setTrace(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setUnlock(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "unlock", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
      
      inline def setUnsubscribe(value: (String, HttpHandler) => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2((t0: String, t1: HttpHandler) => (value(t0, t1)).runNow()))
    }
  }
  
  type HttpHandler = js.Function3[
    /* req */ ServerRequest, 
    /* res */ ServerResponse, 
    /* next */ js.UndefOr[js.Function0[Unit]], 
    Unit
  ]
  
  trait Options extends StObject {
    
    var errorHandler: js.UndefOr[
        js.Function3[/* err */ js.Error, /* req */ ServerRequest, /* res */ ServerResponse, Unit]
      ] = js.undefined
    
    var pageNotFound: js.UndefOr[js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, Unit]] = js.undefined
    
    var paramsName: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setErrorHandler(value: (/* err */ js.Error, /* req */ ServerRequest, /* res */ ServerResponse) => Callback): Self = StObject.set(x, "errorHandler", js.Any.fromFunction3((t0: /* err */ js.Error, t1: /* req */ ServerRequest, t2: /* res */ ServerResponse) => (value(t0, t1, t2)).runNow()))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setPageNotFound(value: (/* req */ ServerRequest, /* res */ ServerResponse) => Callback): Self = StObject.set(x, "pageNotFound", js.Any.fromFunction2((t0: /* req */ ServerRequest, t1: /* res */ ServerResponse) => (value(t0, t1)).runNow()))
      
      inline def setPageNotFoundUndefined: Self = StObject.set(x, "pageNotFound", js.undefined)
      
      inline def setParamsName(value: String): Self = StObject.set(x, "paramsName", value.asInstanceOf[js.Any])
      
      inline def setParamsNameUndefined: Self = StObject.set(x, "paramsName", js.undefined)
    }
  }
  
  @js.native
  trait ServerRequest extends IncomingMessage {
    
    var params: Any = js.native
  }
  
  type ServerResponse = typingsJapgolly.node.httpMod.ServerResponse[IncomingMessage]
}
