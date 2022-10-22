package typingsJapgolly.reactThreeFiber

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.reactThreeFiber.anon.HandlePointer
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typingsJapgolly.reactThreeFiber.reactThreeFiberInts.`16`
import typingsJapgolly.reactThreeFiber.reactThreeFiberInts.`1`
import typingsJapgolly.reactThreeFiber.reactThreeFiberInts.`4`
import typingsJapgolly.std.EventListener
import typingsJapgolly.three.mod.Object3D
import typingsJapgolly.three.mod.OrthographicCamera
import typingsJapgolly.three.mod.PerspectiveCamera
import typingsJapgolly.three.mod.Ray
import typingsJapgolly.three.mod.Vector2
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcMathVector3Mod.Vector3
import typingsJapgolly.zustand.reactMod.UseBoundStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCoreEventsMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEvents(store: UseBoundStore[RootState]): HandlePointer = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvents")(store.asInstanceOf[js.Any]).asInstanceOf[HandlePointer]
  
  inline def getEventPriority(): `1` | `16` | `4` = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventPriority")().asInstanceOf[`1` | `16` | `4`]
  
  inline def removeInteractivity(store: UseBoundStore[RootState], `object`: Object3D[Event]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeInteractivity")(store.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Camera = OrthographicCamera | PerspectiveCamera
  
  type ComputeFunction = js.Function3[/* event */ DomEvent, /* root */ RootState, /* previous */ js.UndefOr[RootState], Unit]
  
  type DomEvent = PointerEvent | MouseEvent | WheelEvent
  
  trait EventHandlers extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* event */ ThreeEvent[MouseEvent], Unit]] = js.undefined
    
    var onContextMenu: js.UndefOr[js.Function1[/* event */ ThreeEvent[MouseEvent], Unit]] = js.undefined
    
    var onDoubleClick: js.UndefOr[js.Function1[/* event */ ThreeEvent[MouseEvent], Unit]] = js.undefined
    
    var onPointerCancel: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
    
    var onPointerDown: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
    
    var onPointerEnter: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
    
    var onPointerLeave: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
    
    var onPointerMissed: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onPointerMove: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
    
    var onPointerOut: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
    
    var onPointerOver: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
    
    var onPointerUp: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
    
    var onWheel: js.UndefOr[js.Function1[/* event */ ThreeEvent[WheelEvent], Unit]] = js.undefined
  }
  object EventHandlers {
    
    inline def apply(): EventHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventHandlers]
    }
    
    extension [Self <: EventHandlers](x: Self) {
      
      inline def setOnClick(value: /* event */ ThreeEvent[MouseEvent] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ThreeEvent[MouseEvent]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: /* event */ ThreeEvent[MouseEvent] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: /* event */ ThreeEvent[MouseEvent]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnDoubleClick(value: /* event */ ThreeEvent[MouseEvent] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: /* event */ ThreeEvent[MouseEvent]) => value(t0).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnPointerCancel(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMissed(value: /* event */ MouseEvent => Callback): Self = StObject.set(x, "onPointerMissed", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
      
      inline def setOnPointerMissedUndefined: Self = StObject.set(x, "onPointerMissed", js.undefined)
      
      inline def setOnPointerMove(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnWheel(value: /* event */ ThreeEvent[WheelEvent] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: /* event */ ThreeEvent[WheelEvent]) => value(t0).runNow()))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    }
  }
  
  trait EventManager[TTarget] extends StObject {
    
    var compute: js.UndefOr[ComputeFunction] = js.undefined
    
    var connect: js.UndefOr[js.Function1[/* target */ TTarget, Unit]] = js.undefined
    
    var connected: js.UndefOr[TTarget] = js.undefined
    
    var disconnect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enabled: Boolean
    
    var filter: js.UndefOr[FilterFunction] = js.undefined
    
    var handlers: js.UndefOr[Events] = js.undefined
    
    var priority: Double
  }
  object EventManager {
    
    inline def apply[TTarget](enabled: Boolean, priority: Double): EventManager[TTarget] = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventManager[TTarget]]
    }
    
    extension [Self <: EventManager[?], TTarget](x: Self & EventManager[TTarget]) {
      
      inline def setCompute(
        value: (/* event */ DomEvent, /* root */ RootState, /* previous */ js.UndefOr[RootState]) => Callback
      ): Self = StObject.set(x, "compute", js.Any.fromFunction3((t0: /* event */ DomEvent, t1: /* root */ RootState, t2: /* previous */ js.UndefOr[RootState]) => (value(t0, t1, t2)).runNow()))
      
      inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
      
      inline def setConnect(value: /* target */ TTarget => Callback): Self = StObject.set(x, "connect", js.Any.fromFunction1((t0: /* target */ TTarget) => value(t0).runNow()))
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setConnected(value: TTarget): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFilter(
        value: (/* items */ js.Array[
              typingsJapgolly.three.srcCoreRaycasterMod.Intersection[typingsJapgolly.three.srcCoreObject3DMod.Object3D[Event]]
            ], /* state */ RootState) => js.Array[
              typingsJapgolly.three.srcCoreRaycasterMod.Intersection[typingsJapgolly.three.srcCoreObject3DMod.Object3D[Event]]
            ]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHandlers(value: Events): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  trait Events extends StObject {
    
    var onClick: EventListener
    
    var onContextMenu: EventListener
    
    var onDoubleClick: EventListener
    
    var onLostPointerCapture: EventListener
    
    var onPointerCancel: EventListener
    
    var onPointerDown: EventListener
    
    var onPointerLeave: EventListener
    
    var onPointerMove: EventListener
    
    var onPointerUp: EventListener
    
    var onWheel: EventListener
  }
  object Events {
    
    inline def apply(
      onClick: /* evt */ org.scalajs.dom.Event => Callback,
      onContextMenu: /* evt */ org.scalajs.dom.Event => Callback,
      onDoubleClick: /* evt */ org.scalajs.dom.Event => Callback,
      onLostPointerCapture: /* evt */ org.scalajs.dom.Event => Callback,
      onPointerCancel: /* evt */ org.scalajs.dom.Event => Callback,
      onPointerDown: /* evt */ org.scalajs.dom.Event => Callback,
      onPointerLeave: /* evt */ org.scalajs.dom.Event => Callback,
      onPointerMove: /* evt */ org.scalajs.dom.Event => Callback,
      onPointerUp: /* evt */ org.scalajs.dom.Event => Callback,
      onWheel: /* evt */ org.scalajs.dom.Event => Callback
    ): Events = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => onClick(t0).runNow()), onContextMenu = js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => onContextMenu(t0).runNow()), onDoubleClick = js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => onDoubleClick(t0).runNow()), onLostPointerCapture = js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => onLostPointerCapture(t0).runNow()), onPointerCancel = js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => onPointerCancel(t0).runNow()), onPointerDown = js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => onPointerDown(t0).runNow()), onPointerLeave = js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => onPointerLeave(t0).runNow()), onPointerMove = js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => onPointerMove(t0).runNow()), onPointerUp = js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => onPointerUp(t0).runNow()), onWheel = js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => onWheel(t0).runNow()))
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setOnClick(value: /* evt */ org.scalajs.dom.Event => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => value(t0).runNow()))
      
      inline def setOnContextMenu(value: /* evt */ org.scalajs.dom.Event => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => value(t0).runNow()))
      
      inline def setOnDoubleClick(value: /* evt */ org.scalajs.dom.Event => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => value(t0).runNow()))
      
      inline def setOnLostPointerCapture(value: /* evt */ org.scalajs.dom.Event => Callback): Self = StObject.set(x, "onLostPointerCapture", js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => value(t0).runNow()))
      
      inline def setOnPointerCancel(value: /* evt */ org.scalajs.dom.Event => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => value(t0).runNow()))
      
      inline def setOnPointerDown(value: /* evt */ org.scalajs.dom.Event => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => value(t0).runNow()))
      
      inline def setOnPointerLeave(value: /* evt */ org.scalajs.dom.Event => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => value(t0).runNow()))
      
      inline def setOnPointerMove(value: /* evt */ org.scalajs.dom.Event => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => value(t0).runNow()))
      
      inline def setOnPointerUp(value: /* evt */ org.scalajs.dom.Event => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => value(t0).runNow()))
      
      inline def setOnWheel(value: /* evt */ org.scalajs.dom.Event => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: /* evt */ org.scalajs.dom.Event) => value(t0).runNow()))
    }
  }
  
  type FilterFunction = js.Function2[
    /* items */ js.Array[
      typingsJapgolly.three.srcCoreRaycasterMod.Intersection[typingsJapgolly.three.srcCoreObject3DMod.Object3D[Event]]
    ], 
    /* state */ RootState, 
    js.Array[
      typingsJapgolly.three.srcCoreRaycasterMod.Intersection[typingsJapgolly.three.srcCoreObject3DMod.Object3D[Event]]
    ]
  ]
  
  trait Intersection
    extends StObject
       with typingsJapgolly.three.srcCoreRaycasterMod.Intersection[typingsJapgolly.three.srcCoreObject3DMod.Object3D[Event]] {
    
    var eventObject: Object3D[Event]
  }
  object Intersection {
    
    inline def apply(
      distance: Double,
      eventObject: Object3D[Event],
      `object`: typingsJapgolly.three.srcCoreObject3DMod.Object3D[Event],
      point: Vector3
    ): Intersection = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Intersection]
    }
    
    extension [Self <: Intersection](x: Self) {
      
      inline def setEventObject(value: Object3D[Event]): Self = StObject.set(x, "eventObject", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntersectionEvent[TSourceEvent]
    extends StObject
       with Intersection {
    
    var camera: Camera
    
    var delta: Double
    
    var intersections: js.Array[Intersection]
    
    var nativeEvent: TSourceEvent
    
    var pointer: Vector2
    
    var ray: Ray
    
    def stopPropagation(): Unit
    
    var stopped: Boolean
    
    var unprojectedPoint: typingsJapgolly.three.mod.Vector3
  }
  object IntersectionEvent {
    
    inline def apply[TSourceEvent](
      camera: Camera,
      delta: Double,
      distance: Double,
      eventObject: Object3D[Event],
      intersections: js.Array[Intersection],
      nativeEvent: TSourceEvent,
      `object`: typingsJapgolly.three.srcCoreObject3DMod.Object3D[Event],
      point: Vector3,
      pointer: Vector2,
      ray: Ray,
      stopPropagation: Callback,
      stopped: Boolean,
      unprojectedPoint: typingsJapgolly.three.mod.Vector3
    ): IntersectionEvent[TSourceEvent] = {
      val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], intersections = intersections.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], ray = ray.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, stopped = stopped.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntersectionEvent[TSourceEvent]]
    }
    
    extension [Self <: IntersectionEvent[?], TSourceEvent](x: Self & IntersectionEvent[TSourceEvent]) {
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setIntersections(value: js.Array[Intersection]): Self = StObject.set(x, "intersections", value.asInstanceOf[js.Any])
      
      inline def setIntersectionsVarargs(value: Intersection*): Self = StObject.set(x, "intersections", js.Array(value*))
      
      inline def setNativeEvent(value: TSourceEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setPointer(value: Vector2): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setRay(value: Ray): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
      
      inline def setUnprojectedPoint(value: typingsJapgolly.three.mod.Vector3): Self = StObject.set(x, "unprojectedPoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointerCaptureTarget extends StObject {
    
    var intersection: Intersection
    
    var target: Element
  }
  object PointerCaptureTarget {
    
    inline def apply(intersection: Intersection, target: Element): PointerCaptureTarget = {
      val __obj = js.Dynamic.literal(intersection = intersection.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerCaptureTarget]
    }
    
    extension [Self <: PointerCaptureTarget](x: Self) {
      
      inline def setIntersection(value: Intersection): Self = StObject.set(x, "intersection", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type ThreeEvent[TEvent] = IntersectionEvent[TEvent]
}
