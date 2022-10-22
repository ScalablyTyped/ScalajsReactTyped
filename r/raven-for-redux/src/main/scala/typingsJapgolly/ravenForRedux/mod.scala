package typingsJapgolly.ravenForRedux

import typingsJapgolly.ravenJs.mod.RavenStatic
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(raven: RavenStatic): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].apply(raven.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def apply(raven: RavenStatic, options: RavenMiddlewareOptions[Any]): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].apply(raven.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  
  @JSImport("raven-for-redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RavenMiddlewareOptions[T] extends StObject {
    
    var actionTransformer: js.UndefOr[js.Function1[/* action */ Action[Any], Action[Any]]] = js.undefined
    
    var breadcrumbCategory: js.UndefOr[String] = js.undefined
    
    var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ Action[Any], Any]] = js.undefined
    
    var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ Action[Any], Boolean]] = js.undefined
    
    var getUserContext: js.UndefOr[js.Function1[/* state */ T, RavenUserContext]] = js.undefined
    
    var stateTransformer: js.UndefOr[js.Function1[/* state */ T, T]] = js.undefined
  }
  object RavenMiddlewareOptions {
    
    inline def apply[T](): RavenMiddlewareOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RavenMiddlewareOptions[T]]
    }
    
    extension [Self <: RavenMiddlewareOptions[?], T](x: Self & RavenMiddlewareOptions[T]) {
      
      inline def setActionTransformer(value: /* action */ Action[Any] => Action[Any]): Self = StObject.set(x, "actionTransformer", js.Any.fromFunction1(value))
      
      inline def setActionTransformerUndefined: Self = StObject.set(x, "actionTransformer", js.undefined)
      
      inline def setBreadcrumbCategory(value: String): Self = StObject.set(x, "breadcrumbCategory", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbCategoryUndefined: Self = StObject.set(x, "breadcrumbCategory", js.undefined)
      
      inline def setBreadcrumbDataFromAction(value: /* action */ Action[Any] => Any): Self = StObject.set(x, "breadcrumbDataFromAction", js.Any.fromFunction1(value))
      
      inline def setBreadcrumbDataFromActionUndefined: Self = StObject.set(x, "breadcrumbDataFromAction", js.undefined)
      
      inline def setFilterBreadcrumbActions(value: /* action */ Action[Any] => Boolean): Self = StObject.set(x, "filterBreadcrumbActions", js.Any.fromFunction1(value))
      
      inline def setFilterBreadcrumbActionsUndefined: Self = StObject.set(x, "filterBreadcrumbActions", js.undefined)
      
      inline def setGetUserContext(value: /* state */ T => RavenUserContext): Self = StObject.set(x, "getUserContext", js.Any.fromFunction1(value))
      
      inline def setGetUserContextUndefined: Self = StObject.set(x, "getUserContext", js.undefined)
      
      inline def setStateTransformer(value: /* state */ T => T): Self = StObject.set(x, "stateTransformer", js.Any.fromFunction1(value))
      
      inline def setStateTransformerUndefined: Self = StObject.set(x, "stateTransformer", js.undefined)
    }
  }
  
  trait RavenUserContext extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object RavenUserContext {
    
    inline def apply(): RavenUserContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RavenUserContext]
    }
    
    extension [Self <: RavenUserContext](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
