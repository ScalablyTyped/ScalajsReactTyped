package typingsJapgolly.heremaps.global.H

import typingsJapgolly.heremaps.H.map.Object
import typingsJapgolly.heremaps.H.mapevents.Behavior.Options
import typingsJapgolly.heremaps.H.mapevents.Pointer.Button
import typingsJapgolly.heremaps.H.math.BitMask
import typingsJapgolly.heremaps.H.util.ContextItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** mapevents *****/
object mapevents {
  
  /**
    * Behavior class uses map events and adds behavior functionality to the map. This allows map panning and zooming via using mouse wheel
    * @property DRAGGING {number} - Map responds to user dragging via mouse or touch
    * @property WHEELZOOM {number} - Map zooms in or out in respond to mouse wheel events
    * @property DBLTAPZOOM {number} - Map zooms in or out in response to double click or double tap. For double tap if more that one touches are on the screen map will zoom out.
    */
  @JSGlobal("H.mapevents.Behavior")
  @js.native
  open class Behavior protected ()
    extends StObject
       with typingsJapgolly.heremaps.H.mapevents.Behavior {
    /**
      * Constructor
      * @param mapEvents {H.mapevents.MapEvents} - previously initialized map events instance
      * @param options {H.mapevents.Behavior.Options} - additional options (i.e kinetics)
      */
    def this(mapEvents: typingsJapgolly.heremaps.H.mapevents.MapEvents) = this()
    def this(mapEvents: typingsJapgolly.heremaps.H.mapevents.MapEvents, options: Options) = this()
  }
  object Behavior {
    
    @JSGlobal("H.mapevents.Behavior")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("H.mapevents.Behavior.DBLTAPZOOM")
    @js.native
    def DBLTAPZOOM: Double = js.native
    inline def DBLTAPZOOM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DBLTAPZOOM")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("H.mapevents.Behavior.DRAGGING")
    @js.native
    def DRAGGING: Double = js.native
    inline def DRAGGING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAGGING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("H.mapevents.Behavior.WHEELZOOM")
    @js.native
    def WHEELZOOM: Double = js.native
    inline def WHEELZOOM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHEELZOOM")(x.asInstanceOf[js.Any])
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
  @JSGlobal("H.mapevents.ContextMenuEvent")
  @js.native
  open class ContextMenuEvent protected ()
    extends StObject
       with typingsJapgolly.heremaps.H.mapevents.ContextMenuEvent {
    /**
      * Constructor
      * @param viewportX {number} - The x coordinate on the viewport
      * @param viewportY {number} - The y coordinate on the viewport
      * @param target {(H.Map | H.map.Object)} - The event's target element
      * @param originalEvent {Event} - target of the event
      */
    def this(
      viewportX: Double,
      viewportY: Double,
      target: typingsJapgolly.heremaps.H.Map_,
      originalEvent: typingsJapgolly.heremaps.H.mapevents.Event
    ) = this()
    def this(
      viewportX: Double,
      viewportY: Double,
      target: Object,
      originalEvent: typingsJapgolly.heremaps.H.mapevents.Event
    ) = this()
    
    /* CompleteClass */
    var currentTarget: Any = js.native
    
    /* CompleteClass */
    var defaultPrevented: Boolean = js.native
    
    /* CompleteClass */
    var originalEvent: typingsJapgolly.heremaps.H.mapevents.Event = js.native
    
    /**
      * Sets defaultPrevented to true. Which can be used to prevent some default behavior.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * Stops propagation for current event.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /* CompleteClass */
    var target: Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var viewportX: js.Array[ContextItem] = js.native
    
    /* CompleteClass */
    var viewportY: Double = js.native
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
  @JSGlobal("H.mapevents.Event")
  @js.native
  open class Event protected ()
    extends StObject
       with typingsJapgolly.heremaps.H.mapevents.Event {
    /**
      * Constructor
      * @param type {string} - type of event
      * @param pointers {Array<H.mapevents.Pointer>} - pointers which are currently on the screen
      * @param changedPointers {Array<H.mapevents.Pointer>} - pointers which changed during event
      * @param targetPointers {Array<H.mapevents.Pointer>} - pointers on the event target
      * @param currentPointer {H.mapevents.Pointer} - pointer which triggered the event
      * @param target {(H.Map | H.map.Object)} - target map object which triggered event
      * @param originalEvent {Event} - original dom event
      */
    def this(
      `type`: String,
      pointers: js.Array[typingsJapgolly.heremaps.H.mapevents.Pointer],
      changedPointers: js.Array[typingsJapgolly.heremaps.H.mapevents.Pointer],
      targetPointers: js.Array[typingsJapgolly.heremaps.H.mapevents.Pointer],
      currentPointer: typingsJapgolly.heremaps.H.mapevents.Pointer,
      target: typingsJapgolly.heremaps.H.Map_,
      originalEvent: typingsJapgolly.heremaps.H.mapevents.Event
    ) = this()
    def this(
      `type`: String,
      pointers: js.Array[typingsJapgolly.heremaps.H.mapevents.Pointer],
      changedPointers: js.Array[typingsJapgolly.heremaps.H.mapevents.Pointer],
      targetPointers: js.Array[typingsJapgolly.heremaps.H.mapevents.Pointer],
      currentPointer: typingsJapgolly.heremaps.H.mapevents.Pointer,
      target: Object,
      originalEvent: typingsJapgolly.heremaps.H.mapevents.Event
    ) = this()
    
    /* CompleteClass */
    var changedPointers: js.Array[typingsJapgolly.heremaps.H.mapevents.Pointer] = js.native
    
    /* CompleteClass */
    var currentPointer: typingsJapgolly.heremaps.H.mapevents.Pointer = js.native
    
    /* CompleteClass */
    var currentTarget: Any = js.native
    
    /* CompleteClass */
    var defaultPrevented: Boolean = js.native
    
    /* CompleteClass */
    var originalEvent: typingsJapgolly.heremaps.H.mapevents.Event = js.native
    
    /* CompleteClass */
    var pointers: js.Array[typingsJapgolly.heremaps.H.mapevents.Pointer] = js.native
    
    /**
      * Sets defaultPrevented to true. Which can be used to prevent some default behavior.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * Stops propagation for current event.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /* CompleteClass */
    var target: Any = js.native
    
    /* CompleteClass */
    var targetPointers: js.Array[typingsJapgolly.heremaps.H.mapevents.Pointer] = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  /**
    * MapEvents enable the events functionality on the map and on the map objects. By using this extension it is possible to listen to events on map objects like markers, polylines, polygons,
    * circles and on the map object itself. Events are triggered depending on user interaction. Please check the Events Summary section for the list of events fired by this class and by the map
    * objects.
    */
  @JSGlobal("H.mapevents.MapEvents")
  @js.native
  open class MapEvents protected ()
    extends StObject
       with typingsJapgolly.heremaps.H.mapevents.MapEvents {
    /**
      * Constructor
      * @param map {H.Map} - map instance which is used for firing events
      */
    def this(map: typingsJapgolly.heremaps.H.Map_) = this()
  }
  
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
  @JSGlobal("H.mapevents.Pointer")
  @js.native
  open class Pointer protected ()
    extends StObject
       with typingsJapgolly.heremaps.H.mapevents.Pointer {
    /**
      * Constructor
      * @param viewportX {number} - pointer position on x-axis
      * @param viewportY {number} - pointer position on y-axis
      * @param id {number} - unique pointer identifier among currently available pointers
      * @param type {string} - type of pointer can be i.e 'mouse', 'touch'. 'pen'
      * @param opt_button {H.mapevents.Pointer.Button=} - Indicates which pointer device button has changed.
      * @param opt_buttons {number=} - Indicates which pointer device buttons are being pressed, expressed as a bitmask. Uses the same values, as "buttons" in Pointer Events spec.
      */
    def this(viewportX: Double, viewportY: Double, id: Double, `type`: String) = this()
    def this(viewportX: Double, viewportY: Double, id: Double, `type`: String, opt_button: Button) = this()
    def this(
      viewportX: Double,
      viewportY: Double,
      id: Double,
      `type`: String,
      opt_button: Unit,
      opt_buttons: BitMask
    ) = this()
    def this(
      viewportX: Double,
      viewportY: Double,
      id: Double,
      `type`: String,
      opt_button: Button,
      opt_buttons: BitMask
    ) = this()
    
    /* CompleteClass */
    var button: Button = js.native
    
    /* CompleteClass */
    var dragTarget: Object | typingsJapgolly.heremaps.H.Map_ = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var target: Object | typingsJapgolly.heremaps.H.Map_ = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var viewportX: Double = js.native
    
    /* CompleteClass */
    var viewportY: Double = js.native
  }
  object Pointer {
    
    /**
      * Types of a button
      */
    @JSGlobal("H.mapevents.Pointer.Button")
    @js.native
    object Button extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.heremaps.H.mapevents.Pointer.Button & Double] = js.native
      
      /* 1 */ val LEFT: typingsJapgolly.heremaps.H.mapevents.Pointer.Button.LEFT & Double = js.native
      
      /* 2 */ val MIDDLE: typingsJapgolly.heremaps.H.mapevents.Pointer.Button.MIDDLE & Double = js.native
      
      /* 0 */ val NONE: typingsJapgolly.heremaps.H.mapevents.Pointer.Button.NONE & Double = js.native
      
      /* 3 */ val RIGHT: typingsJapgolly.heremaps.H.mapevents.Pointer.Button.RIGHT & Double = js.native
    }
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
  @JSGlobal("H.mapevents.WheelEvent")
  @js.native
  open class WheelEvent protected ()
    extends StObject
       with typingsJapgolly.heremaps.H.mapevents.WheelEvent {
    /**
      * Constructor
      * @param deltaY {number} - The wheel move delta on y-axis
      * @param viewportX {number} - The x coordinate on the viewport
      * @param viewportY {number} - The y coordinate on the viewport
      * @param target {(H.Map | H.map.Object)} - The event's target element
      * @param originalEvent {Event} - target of the event
      */
    def this(
      deltaY: Double,
      viewportX: Double,
      viewportY: Double,
      target: typingsJapgolly.heremaps.H.Map_,
      originalEvent: typingsJapgolly.heremaps.H.mapevents.Event
    ) = this()
    def this(
      deltaY: Double,
      viewportX: Double,
      viewportY: Double,
      target: Object,
      originalEvent: typingsJapgolly.heremaps.H.mapevents.Event
    ) = this()
    
    /* CompleteClass */
    var currentTarget: Any = js.native
    
    /* CompleteClass */
    var defaultPrevented: Boolean = js.native
    
    /* CompleteClass */
    var delta: Double = js.native
    
    /* CompleteClass */
    var originalEvent: typingsJapgolly.heremaps.H.mapevents.Event = js.native
    
    /**
      * Sets defaultPrevented to true. Which can be used to prevent some default behavior.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * Stops propagation for current event.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /* CompleteClass */
    var target: Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var viewportX: Double = js.native
    
    /* CompleteClass */
    var viewportY: Double = js.native
  }
}
