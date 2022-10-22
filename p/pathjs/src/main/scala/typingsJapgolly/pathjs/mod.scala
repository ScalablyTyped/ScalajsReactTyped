package typingsJapgolly.pathjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pathjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pathjs", "Path")
  @js.native
  def Path: IPath = js.native
  inline def Path_=(x: IPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  type IDictionary[T] = StringDictionary[T]
  
  trait IPath extends StObject {
    
    var core: IPathCore
    
    def dispatch(passed_route: String): Unit
    
    var history: IPathHistory
    
    def listen(): Unit
    
    def map(path: String): IPathRoute
    
    def `match`(path: String, parameterize: Boolean): IPathRoute | Null
    
    def rescue(fn: js.Function): Unit
    
    def root(path: String): Unit
    
    var routes: IPathRoutes
  }
  object IPath {
    
    inline def apply(
      core: IPathCore,
      dispatch: String => Callback,
      history: IPathHistory,
      listen: Callback,
      map: String => IPathRoute,
      `match`: (String, Boolean) => IPathRoute | Null,
      rescue: js.Function => Callback,
      root: String => Callback,
      routes: IPathRoutes
    ): IPath = {
      val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1((t0: String) => dispatch(t0).runNow()), history = history.asInstanceOf[js.Any], listen = listen.toJsFn, map = js.Any.fromFunction1(map), rescue = js.Any.fromFunction1((t0: js.Function) => rescue(t0).runNow()), root = js.Any.fromFunction1((t0: String) => root(t0).runNow()), routes = routes.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
      __obj.asInstanceOf[IPath]
    }
    
    extension [Self <: IPath](x: Self) {
      
      inline def setCore(value: IPathCore): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      inline def setDispatch(value: String => Callback): Self = StObject.set(x, "dispatch", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setHistory(value: IPathHistory): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setListen(value: Callback): Self = StObject.set(x, "listen", value.toJsFn)
      
      inline def setMap(value: String => IPathRoute): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMatch(value: (String, Boolean) => IPathRoute | Null): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      inline def setRescue(value: js.Function => Callback): Self = StObject.set(x, "rescue", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setRoot(value: String => Callback): Self = StObject.set(x, "root", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRoutes(value: IPathRoutes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPathCore extends StObject {
    
    var route: IPathRouteConstructor
  }
  object IPathCore {
    
    inline def apply(route: IPathRouteConstructor): IPathCore = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPathCore]
    }
    
    extension [Self <: IPathCore](x: Self) {
      
      inline def setRoute(value: IPathRouteConstructor): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPathHistory extends StObject {
    
    var initial: Any
    
    def listen(fallback: Any): Unit
    
    def popState(event: Any): Unit
    
    def pushState(state: Any, title: String, path: String): Unit
  }
  object IPathHistory {
    
    inline def apply(
      initial: Any,
      listen: Any => Callback,
      popState: Any => Callback,
      pushState: (Any, String, String) => Callback
    ): IPathHistory = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], listen = js.Any.fromFunction1((t0: Any) => listen(t0).runNow()), popState = js.Any.fromFunction1((t0: Any) => popState(t0).runNow()), pushState = js.Any.fromFunction3((t0: Any, t1: String, t2: String) => (pushState(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[IPathHistory]
    }
    
    extension [Self <: IPathHistory](x: Self) {
      
      inline def setInitial(value: Any): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setListen(value: Any => Callback): Self = StObject.set(x, "listen", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setPopState(value: Any => Callback): Self = StObject.set(x, "popState", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setPushState(value: (Any, String, String) => Callback): Self = StObject.set(x, "pushState", js.Any.fromFunction3((t0: Any, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  @js.native
  trait IPathRoute extends StObject {
    
    def enter(fns: js.Array[js.Function]): IPathRoute = js.native
    def enter(fns: js.Function): IPathRoute = js.native
    
    def exit(fn: js.Function0[Unit]): IPathRoute = js.native
    
    def partition(): js.Array[String] = js.native
    
    def run(): Unit = js.native
    
    def to(fn: js.Function0[Unit]): IPathRoute = js.native
  }
  
  @js.native
  trait IPathRouteConstructor
    extends StObject
       with Instantiable1[/* path */ String, IPathRoute]
  
  trait IPathRoutes extends StObject {
    
    var current: js.UndefOr[String] = js.undefined
    
    var defined: IDictionary[IPathRoute]
    
    var previous: js.UndefOr[String] = js.undefined
    
    var rescue: js.UndefOr[js.Function] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
  }
  object IPathRoutes {
    
    inline def apply(defined: IDictionary[IPathRoute]): IPathRoutes = {
      val __obj = js.Dynamic.literal(defined = defined.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPathRoutes]
    }
    
    extension [Self <: IPathRoutes](x: Self) {
      
      inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDefined(value: IDictionary[IPathRoute]): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setRescue(value: js.Function): Self = StObject.set(x, "rescue", value.asInstanceOf[js.Any])
      
      inline def setRescueUndefined: Self = StObject.set(x, "rescue", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
