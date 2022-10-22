package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRouterRouteSetMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_base: RouteSet): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_base.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/router/RouteSet", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RouteSet {
    def this(opt_base: RouteSet) = this()
    
    /* CompleteClass */
    override def assign(`def`: typingsJapgolly.nginstackEngine.libRouterRouteSetDefMod.^): Unit = js.native
    
    /* private */ /* CompleteClass */
    var base_ : Any = js.native
    
    /* CompleteClass */
    override def getAllRoutes(): js.Array[typingsJapgolly.nginstackEngine.libRouterRouteMod.^] = js.native
    
    /* private */ /* CompleteClass */
    var propertiesToAssign_ : Any = js.native
    
    /* CompleteClass */
    var routes: js.Array[Any] = js.native
  }
  @JSImport("@nginstack/engine/lib/router/RouteSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RouteSet extends StObject {
    
    def assign(`def`: typingsJapgolly.nginstackEngine.libRouterRouteSetDefMod.^): Unit
    
    /* private */ var base_ : Any
    
    def getAllRoutes(): js.Array[typingsJapgolly.nginstackEngine.libRouterRouteMod.^]
    
    /* private */ var propertiesToAssign_ : Any
    
    var routes: js.Array[Any]
  }
  object RouteSet {
    
    inline def apply(
      assign: typingsJapgolly.nginstackEngine.libRouterRouteSetDefMod.^ => Callback,
      base_ : Any,
      getAllRoutes: CallbackTo[js.Array[typingsJapgolly.nginstackEngine.libRouterRouteMod.^]],
      propertiesToAssign_ : Any,
      routes: js.Array[Any]
    ): RouteSet = {
      val __obj = js.Dynamic.literal(assign = js.Any.fromFunction1((t0: typingsJapgolly.nginstackEngine.libRouterRouteSetDefMod.^) => assign(t0).runNow()), base_ = base_.asInstanceOf[js.Any], getAllRoutes = getAllRoutes.toJsFn, propertiesToAssign_ = propertiesToAssign_.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteSet]
    }
    
    extension [Self <: RouteSet](x: Self) {
      
      inline def setAssign(value: typingsJapgolly.nginstackEngine.libRouterRouteSetDefMod.^ => Callback): Self = StObject.set(x, "assign", js.Any.fromFunction1((t0: typingsJapgolly.nginstackEngine.libRouterRouteSetDefMod.^) => value(t0).runNow()))
      
      inline def setBase_(value: Any): Self = StObject.set(x, "base_", value.asInstanceOf[js.Any])
      
      inline def setGetAllRoutes(value: CallbackTo[js.Array[typingsJapgolly.nginstackEngine.libRouterRouteMod.^]]): Self = StObject.set(x, "getAllRoutes", value.toJsFn)
      
      inline def setPropertiesToAssign_(value: Any): Self = StObject.set(x, "propertiesToAssign_", value.asInstanceOf[js.Any])
      
      inline def setRoutes(value: js.Array[Any]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: Any*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
}
