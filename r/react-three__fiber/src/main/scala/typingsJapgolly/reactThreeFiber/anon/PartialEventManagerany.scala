package typingsJapgolly.reactThreeFiber.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreEventsMod.ComputeFunction
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreEventsMod.DomEvent
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreEventsMod.FilterFunction
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcCoreRaycasterMod.Intersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/events.EventManager<any>> */
trait PartialEventManagerany extends StObject {
  
  var compute: js.UndefOr[ComputeFunction] = js.undefined
  
  var connect: js.UndefOr[js.Function1[/* target */ Any, Unit]] = js.undefined
  
  var connected: js.UndefOr[Any] = js.undefined
  
  var disconnect: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[FilterFunction] = js.undefined
  
  var handlers: js.UndefOr[typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreEventsMod.Events] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
}
object PartialEventManagerany {
  
  inline def apply(): PartialEventManagerany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEventManagerany]
  }
  
  extension [Self <: PartialEventManagerany](x: Self) {
    
    inline def setCompute(
      value: (/* event */ DomEvent, /* root */ RootState, /* previous */ js.UndefOr[RootState]) => Callback
    ): Self = StObject.set(x, "compute", js.Any.fromFunction3((t0: /* event */ DomEvent, t1: /* root */ RootState, t2: /* previous */ js.UndefOr[RootState]) => (value(t0, t1, t2)).runNow()))
    
    inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
    
    inline def setConnect(value: /* target */ Any => Callback): Self = StObject.set(x, "connect", js.Any.fromFunction1((t0: /* target */ Any) => value(t0).runNow()))
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setConnected(value: Any): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
    
    inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
    
    inline def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFilter(
      value: (/* items */ js.Array[Intersection[Object3D[Event]]], /* state */ RootState) => js.Array[Intersection[Object3D[Event]]]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setHandlers(value: typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreEventsMod.Events): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
