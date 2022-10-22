package typingsJapgolly.heremaps.H

import japgolly.scalajs.react.Callback
import typingsJapgolly.heremaps.H.map.Object
import typingsJapgolly.heremaps.H.mapevents.Pointer.Button
import typingsJapgolly.heremaps.H.math.BitMask
import typingsJapgolly.heremaps.H.util.ContextItem
import typingsJapgolly.heremaps.H.util.Disposable
import typingsJapgolly.heremaps.H.util.kinetics.IKinetics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** mapevents *****/
object mapevents {
  
  /**
    * Class representing pointer on the map surface. A pointer in platform specific definition would mean either mouse, touch, pen or any pointing device which can trigger browser events.
    * @property viewportX {number} - X coordinate on the map's viewport
    * @property viewportY {number} - Y coordinate on the map's viewport
    * @property target {(H.map.Object | H.Map)} - Map object directly under the pointer. Can be null if if pointer is out of the map viewport
    * @property id {number} - Pointer unique identifier.
    * @property type {string} - Pointer type can be: 'mouse', 'touch' or 'pen'
    * @property dragTarget {(H.map.Object | H.Map)} - Object which is currently dragged by the pointer
    * @property button {H.mapevents.Pointer.Button} - Indicates which pointer device button has changed.
    */
  trait Pointer extends StObject {
    
    var button: Button
    
    var dragTarget: Object | Map_
    
    var id: Double
    
    var target: Object | Map_
    
    var `type`: String
    
    var viewportX: Double
    
    var viewportY: Double
  }
  object Pointer {
    
    inline def apply(
      button: Button,
      dragTarget: Object | Map_,
      id: Double,
      target: Object | Map_,
      `type`: String,
      viewportX: Double,
      viewportY: Double
    ): Pointer = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], dragTarget = dragTarget.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], viewportX = viewportX.asInstanceOf[js.Any], viewportY = viewportY.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pointer]
    }
    
    @js.native
    sealed trait Button extends StObject
    /**
      * Types of a button
      */
    @JSGlobal("H.mapevents.Pointer.Button")
    @js.native
    object Button extends StObject {
      
      /** Left mouse button or touch contact or pen contact */
      @js.native
      sealed trait LEFT
        extends StObject
           with Button
      
      /** Middle mouse button */
      @js.native
      sealed trait MIDDLE
        extends StObject
           with Button
      
      /** No button */
      @js.native
      sealed trait NONE
        extends StObject
           with Button
      
      /** Right mouse button or Pen barrel button */
      @js.native
      sealed trait RIGHT
        extends StObject
           with Button
    }
    
    /**
      * Indicates which pointer device buttons are being pressed, expressed as a bitmask. Bit values are:
      *
      *   - 0: No button pressed
      *   - 1: Left mouse button pressed, or Touch contact or Pen contact
      *   - 2: Right mouse button pressed, or Pen contact with barrel button pressed
      *   - 4: Middle mouse button pressed
      */
    // TODO not sure this is the right interpretation of the docs
    type Buttons = BitMask
    
    extension [Self <: Pointer](x: Self) {
      
      inline def setButton(value: Button): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setDragTarget(value: Object | Map_): Self = StObject.set(x, "dragTarget", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Object | Map_): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setViewportX(value: Double): Self = StObject.set(x, "viewportX", value.asInstanceOf[js.Any])
      
      inline def setViewportY(value: Double): Self = StObject.set(x, "viewportY", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Behavior class uses map events and adds behavior functionality to the map. This allows map panning and zooming via using mouse wheel
    * @property DRAGGING {number} - Map responds to user dragging via mouse or touch
    * @property WHEELZOOM {number} - Map zooms in or out in respond to mouse wheel events
    * @property DBLTAPZOOM {number} - Map zooms in or out in response to double click or double tap. For double tap if more that one touches are on the screen map will zoom out.
    */
  @js.native
  trait Behavior
    extends StObject
       with Disposable {
    
    /**
      * This method disables the behavior functionality for the map
      * @param opt_behavior {number=} - The bitmask of behaviors to disable. If no arguments are passed, all behaviors will be disabled.
      */
    def disable(): Unit = js.native
    def disable(opt_behavior: BitMask): Unit = js.native
    
    /**
      * This method destroys all map interaction handling. Should be used when the behavior functionality is disposed. Behavior object will also be disposed (this function will be called)
      * when attached H.mapevents.MapEvents object is dispose.
      */
    def dispose(): Unit = js.native
    
    /**
      * This method re-enables the behavior functionality for the map.
      * @param opt_behavior {number=} - The bitmask of behaviors to enable. If no arguments are passed, all behaviors will be enabled.
      */
    def enable(): Unit = js.native
    def enable(opt_behavior: BitMask): Unit = js.native
    
    /**
      * This method checks if certain functionality is enabled
      * @param behavior {number} - value like H.mapevents.Behavior.DRAGGING which the check is being performed
      * @returns {boolean}
      */
    def isEnabled(behavior: Double): Boolean = js.native
  }
  object Behavior {
    
    /**
      * Options which are used to initialize the Behavior class.
      * @property kinetics {H.util.kinetics.IKinetics=} - The parameters for the kinetic movement.
      * @property enable {number=} - The bitmask of behaviors to enable like H.mapevents.Behavior.DRAGGING. All are enabled by default.
      */
    trait Options extends StObject {
      
      var enable: js.UndefOr[BitMask] = js.undefined
      
      var kinetics: js.UndefOr[IKinetics] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setEnable(value: BitMask): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
        
        inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
        
        inline def setKinetics(value: IKinetics): Self = StObject.set(x, "kinetics", value.asInstanceOf[js.Any])
        
        inline def setKineticsUndefined: Self = StObject.set(x, "kinetics", js.undefined)
      }
    }
  }
  
  /**
    * ContextMenuEvent should be fired, when a user right-clicks or longpresses on a map object.
    * @property viewportX {Array<H.util.ContextItem>} - Contains ContextItems, that will be used to create context menu entries. Should be filled by listeners of the "contextmenu" event
    * @property viewportY {number} - Map viewport y position
    * @property target {(H.map.Object | H.Map)} - Target for the event
    * @property originalEvent {Event} - Original event
    * @property currentTarget {(H.map.Object | H.Map)} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  trait ContextMenuEvent
    extends StObject
       with typingsJapgolly.heremaps.H.util.Event {
    
    var originalEvent: Event
    
    var viewportX: js.Array[ContextItem]
    
    var viewportY: Double
  }
  object ContextMenuEvent {
    
    inline def apply(
      currentTarget: Any,
      defaultPrevented: Boolean,
      originalEvent: Event,
      preventDefault: Callback,
      stopPropagation: Callback,
      target: Any,
      `type`: String,
      viewportX: js.Array[ContextItem],
      viewportY: Double
    ): ContextMenuEvent = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], viewportX = viewportX.asInstanceOf[js.Any], viewportY = viewportY.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuEvent]
    }
    
    extension [Self <: ContextMenuEvent](x: Self) {
      
      inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setViewportX(value: js.Array[ContextItem]): Self = StObject.set(x, "viewportX", value.asInstanceOf[js.Any])
      
      inline def setViewportXVarargs(value: ContextItem*): Self = StObject.set(x, "viewportX", js.Array(value*))
      
      inline def setViewportY(value: Double): Self = StObject.set(x, "viewportY", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom map event. Contains list of pointers on the map, list of changed pointers and original event. Inherits from H.util.Event.
    * @property pointers {Array<H.mapevents.Pointer>} - Pointers which are currently on the screen
    * @property changedPointers {Array<H.mapevents.Pointer>} - Pointers which has changed in course of event
    * @property targetPointers {Array<H.mapevents.Pointer>} - Pointers which are on same target as the current pointer
    * @property currentPointer {H.mapevents.Pointer} - Current pointer
    * @property originalEvent {Event} - Original event fired by the browser
    * @property target {(H.map.Object | H.Map)} - Object which triggered event. Can be the map object (i.e marker or polyline) or the map itself
    * @property currentTarget {(H.map.Object | H.Map)} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  trait Event
    extends StObject
       with typingsJapgolly.heremaps.H.util.Event {
    
    var changedPointers: js.Array[Pointer]
    
    var currentPointer: Pointer
    
    var originalEvent: Event
    
    var pointers: js.Array[Pointer]
    
    var targetPointers: js.Array[Pointer]
  }
  object Event {
    
    inline def apply(
      changedPointers: js.Array[Pointer],
      currentPointer: Pointer,
      currentTarget: Any,
      defaultPrevented: Boolean,
      originalEvent: Event,
      pointers: js.Array[Pointer],
      preventDefault: Callback,
      stopPropagation: Callback,
      target: Any,
      targetPointers: js.Array[Pointer],
      `type`: String
    ): Event = {
      val __obj = js.Dynamic.literal(changedPointers = changedPointers.asInstanceOf[js.Any], currentPointer = currentPointer.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], targetPointers = targetPointers.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setChangedPointers(value: js.Array[Pointer]): Self = StObject.set(x, "changedPointers", value.asInstanceOf[js.Any])
      
      inline def setChangedPointersVarargs(value: Pointer*): Self = StObject.set(x, "changedPointers", js.Array(value*))
      
      inline def setCurrentPointer(value: Pointer): Self = StObject.set(x, "currentPointer", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setPointers(value: js.Array[Pointer]): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
      
      inline def setPointersVarargs(value: Pointer*): Self = StObject.set(x, "pointers", js.Array(value*))
      
      inline def setTargetPointers(value: js.Array[Pointer]): Self = StObject.set(x, "targetPointers", value.asInstanceOf[js.Any])
      
      inline def setTargetPointersVarargs(value: Pointer*): Self = StObject.set(x, "targetPointers", js.Array(value*))
    }
  }
  
  /**
    * MapEvents enable the events functionality on the map and on the map objects. By using this extension it is possible to listen to events on map objects like markers, polylines, polygons,
    * circles and on the map object itself. Events are triggered depending on user interaction. Please check the Events Summary section for the list of events fired by this class and by the map
    * objects.
    */
  @js.native
  trait MapEvents
    extends StObject
       with Disposable {
    
    /**
      * This method destroys the MapEvents by removing all handlers from the map object. After calling this function mapEvents and map objects will not trigger any events. This object will be
      * disposed automatically if the corresponding map object is disposed.
      */
    def dispose(): Unit = js.native
    
    /**
      * This method returns map into which events are attached
      * @returns {H.Map}
      */
    def getAttachedMap(): Map_ = js.native
  }
  
  /**
    * WheelEvent is fired when the mouse wheel is used over the map. It contains information about cursor position and the map object which resides directly under the cursor.
    * @property delta {number} - Wheel move delta
    * @property viewportX {number} - Map viewport x position
    * @property viewportY {number} - Map viewport y position
    * @property target {(H.map.Object | H.Map)} - Target for the event
    * @property originalEvent {Event} - Original mouse wheel event
    * @property currentTarget {(H.map.Object | H.Map)} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  trait WheelEvent
    extends StObject
       with typingsJapgolly.heremaps.H.util.Event {
    
    var delta: Double
    
    var originalEvent: Event
    
    var viewportX: Double
    
    var viewportY: Double
  }
  object WheelEvent {
    
    inline def apply(
      currentTarget: Any,
      defaultPrevented: Boolean,
      delta: Double,
      originalEvent: Event,
      preventDefault: Callback,
      stopPropagation: Callback,
      target: Any,
      `type`: String,
      viewportX: Double,
      viewportY: Double
    ): WheelEvent = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], viewportX = viewportX.asInstanceOf[js.Any], viewportY = viewportY.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WheelEvent]
    }
    
    extension [Self <: WheelEvent](x: Self) {
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setViewportX(value: Double): Self = StObject.set(x, "viewportX", value.asInstanceOf[js.Any])
      
      inline def setViewportY(value: Double): Self = StObject.set(x, "viewportY", value.asInstanceOf[js.Any])
    }
  }
}
