package typingsJapgolly.nextServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nextServer.nextServerBooleans.`false`
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.urlMod.UrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerRouterMod {
  
  @JSImport("next-server/dist/server/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next-server/dist/server/router", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Router {
    def this(routes: js.Array[Route_]) = this()
    
    /* CompleteClass */
    override def add(route: Route_): Unit = js.native
    
    /* CompleteClass */
    override def `match`(req: IncomingMessage, res: ServerResponse[IncomingMessage], parsedUrl: UrlWithParsedQuery): js.UndefOr[js.Function0[Unit]] = js.native
    
    /* CompleteClass */
    var routes: js.Array[Route_] = js.native
  }
  
  inline def route(path: String): js.Function2[/* pathname */ js.UndefOr[String], /* params */ js.UndefOr[Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("route")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* pathname */ js.UndefOr[String], /* params */ js.UndefOr[Any], Any]]
  
  type Params = StringDictionary[Any]
  
  type RouteMatch = js.Function1[/* pathname */ js.UndefOr[String], `false` | Params]
  
  trait Route_ extends StObject {
    
    def fn(
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      params: Params,
      parsedUrl: UrlWithParsedQuery
    ): Unit
    
    var `match`: RouteMatch
  }
  object Route_ {
    
    inline def apply(
      fn: (IncomingMessage, ServerResponse[IncomingMessage], Params, UrlWithParsedQuery) => Callback,
      `match`: /* pathname */ js.UndefOr[String] => `false` | Params
    ): Route_ = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4((t0: IncomingMessage, t1: ServerResponse[IncomingMessage], t2: Params, t3: UrlWithParsedQuery) => (fn(t0, t1, t2, t3)).runNow()))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Route_]
    }
    
    extension [Self <: Route_](x: Self) {
      
      inline def setFn(value: (IncomingMessage, ServerResponse[IncomingMessage], Params, UrlWithParsedQuery) => Callback): Self = StObject.set(x, "fn", js.Any.fromFunction4((t0: IncomingMessage, t1: ServerResponse[IncomingMessage], t2: Params, t3: UrlWithParsedQuery) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setMatch(value: /* pathname */ js.UndefOr[String] => `false` | Params): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
    }
  }
  
  trait Router extends StObject {
    
    def add(route: Route_): Unit
    
    def `match`(req: IncomingMessage, res: ServerResponse[IncomingMessage], parsedUrl: UrlWithParsedQuery): js.UndefOr[js.Function0[Unit]]
    
    var routes: js.Array[Route_]
  }
  object Router {
    
    inline def apply(
      add: Route_ => Callback,
      `match`: (IncomingMessage, ServerResponse[IncomingMessage], UrlWithParsedQuery) => js.UndefOr[js.Function0[Unit]],
      routes: js.Array[Route_]
    ): Router = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: Route_) => add(t0).runNow()), routes = routes.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction3(`match`))
      __obj.asInstanceOf[Router]
    }
    
    extension [Self <: Router](x: Self) {
      
      inline def setAdd(value: Route_ => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: Route_) => value(t0).runNow()))
      
      inline def setMatch(
        value: (IncomingMessage, ServerResponse[IncomingMessage], UrlWithParsedQuery) => js.UndefOr[js.Function0[Unit]]
      ): Self = StObject.set(x, "match", js.Any.fromFunction3(value))
      
      inline def setRoutes(value: js.Array[Route_]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: Route_ *): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
}
