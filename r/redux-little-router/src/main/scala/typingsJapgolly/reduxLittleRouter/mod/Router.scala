package typingsJapgolly.reduxLittleRouter.mod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.redux.mod.MiddlewareAPI
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.StoreEnhancer
import typingsJapgolly.redux.mod.StoreEnhancerStoreCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Router extends StObject {
  
  var enhancer: StoreEnhancer[Location, js.Object]
  
  var middleware: Middleware[js.Object, Any, Dispatch[AnyAction]]
  
  var reducer: Reducer[Location, AnyAction]
}
object Router {
  
  inline def apply(
    enhancer: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => StoreEnhancerStoreCreator[Location, js.Object],
    middleware: /* api */ MiddlewareAPI[Dispatch[AnyAction], Any] => js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ Any, Any]],
    reducer: (/* state */ js.UndefOr[Location], AnyAction) => Location
  ): Router = {
    val __obj = js.Dynamic.literal(enhancer = js.Any.fromFunction1(enhancer), middleware = js.Any.fromFunction1(middleware), reducer = js.Any.fromFunction2(reducer))
    __obj.asInstanceOf[Router]
  }
  
  extension [Self <: Router](x: Self) {
    
    inline def setEnhancer(
      value: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => StoreEnhancerStoreCreator[Location, js.Object]
    ): Self = StObject.set(x, "enhancer", js.Any.fromFunction1(value))
    
    inline def setMiddleware(
      value: /* api */ MiddlewareAPI[Dispatch[AnyAction], Any] => js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ Any, Any]]
    ): Self = StObject.set(x, "middleware", js.Any.fromFunction1(value))
    
    inline def setReducer(value: (/* state */ js.UndefOr[Location], AnyAction) => Location): Self = StObject.set(x, "reducer", js.Any.fromFunction2(value))
  }
}
