package typingsJapgolly.routeRecognizer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRouteRecognizerDslMod {
  
  @JSImport("route-recognizer/dist/route-recognizer/dsl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: RouteRecognizer */](callback: MatchCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default[T /* <: RouteRecognizer */](
    callback: MatchCallback,
    addRouteCallback: js.Function2[/* routeRecognizer */ T, /* routes */ js.Array[Route], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], addRouteCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("route-recognizer/dist/route-recognizer/dsl", "Matcher")
  @js.native
  open class Matcher () extends StObject {
    def this(target: String) = this()
    
    def add(path: String, target: String): Unit = js.native
    
    def addChild(path: String, target: String, callback: MatchCallback): Unit = js.native
    def addChild(path: String, target: String, callback: MatchCallback, delegate: Delegate): Unit = js.native
    
    var children: StringDictionary[js.UndefOr[Matcher]] = js.native
    
    var routes: StringDictionary[js.UndefOr[String]] = js.native
    
    var target: js.UndefOr[String] = js.native
  }
  
  trait Delegate extends StObject {
    
    var contextEntered: js.UndefOr[js.Function2[/* context */ String, /* route */ MatchDSL, Unit]] = js.undefined
    
    var willAddRoute: js.UndefOr[js.Function2[/* context */ js.UndefOr[String], /* route */ String, String]] = js.undefined
  }
  object Delegate {
    
    inline def apply(): Delegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delegate]
    }
    
    extension [Self <: Delegate](x: Self) {
      
      inline def setContextEntered(value: (/* context */ String, /* route */ MatchDSL) => Callback): Self = StObject.set(x, "contextEntered", js.Any.fromFunction2((t0: /* context */ String, t1: /* route */ MatchDSL) => (value(t0, t1)).runNow()))
      
      inline def setContextEnteredUndefined: Self = StObject.set(x, "contextEntered", js.undefined)
      
      inline def setWillAddRoute(value: (/* context */ js.UndefOr[String], /* route */ String) => String): Self = StObject.set(x, "willAddRoute", js.Any.fromFunction2(value))
      
      inline def setWillAddRouteUndefined: Self = StObject.set(x, "willAddRoute", js.undefined)
    }
  }
  
  type MatchCallback = js.Function1[/* match */ MatchDSL, Unit]
  
  @js.native
  trait MatchDSL extends StObject {
    
    def apply(path: String): ToDSL = js.native
    def apply(path: String, callback: MatchCallback): Unit = js.native
  }
  
  type Opaque = js.UndefOr[js.Object | Unit | Null]
  
  trait Route extends StObject {
    
    var handler: Opaque
    
    var path: String
    
    var queryParams: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Route {
    
    inline def apply(path: String): Route = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    extension [Self <: Route](x: Self) {
      
      inline def setHandler(value: Opaque): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerNull: Self = StObject.set(x, "handler", null)
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQueryParams(value: js.Array[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setQueryParamsVarargs(value: String*): Self = StObject.set(x, "queryParams", js.Array(value*))
    }
  }
  
  trait RouteRecognizer extends StObject {
    
    def add(routes: js.Array[Route]): Unit
    
    var delegate: js.UndefOr[Delegate] = js.undefined
  }
  object RouteRecognizer {
    
    inline def apply(add: js.Array[Route] => Callback): RouteRecognizer = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: js.Array[Route]) => add(t0).runNow()))
      __obj.asInstanceOf[RouteRecognizer]
    }
    
    extension [Self <: RouteRecognizer](x: Self) {
      
      inline def setAdd(value: js.Array[Route] => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: js.Array[Route]) => value(t0).runNow()))
      
      inline def setDelegate(value: Delegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    }
  }
  
  @js.native
  trait ToDSL extends StObject {
    
    def to(name: String): Unit = js.native
    def to(name: String, callback: MatchCallback): Unit = js.native
  }
}
