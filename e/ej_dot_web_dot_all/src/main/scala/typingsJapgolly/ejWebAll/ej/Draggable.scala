package typingsJapgolly.ejWebAll.ej

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draggable
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_Draggable: Model = js.native
}
object Draggable {
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the autocomplete model
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event model values
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the draggable model
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** returns the exact mouse down target element
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragEventArgs {
    
    inline def apply(): DragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragEventArgs]
    }
    
    extension [Self <: DragEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragStartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event model values
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the draggable model
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** returns the exact mouse down target element
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragStartEventArgs {
    
    inline def apply(): DragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStartEventArgs]
    }
    
    extension [Self <: DragStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragStopEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event model values
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the draggable model
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** returns the exact mouse down target element
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragStopEventArgs {
    
    inline def apply(): DragStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStopEventArgs]
    }
    
    extension [Self <: DragStopEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait HelperEventArgs extends StObject {
    
    /** returns the draggable element object
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the event model values
      */
    var sender: js.UndefOr[Any] = js.undefined
  }
  object HelperEventArgs {
    
    inline def apply(): HelperEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelperEventArgs]
    }
    
    extension [Self <: HelperEventArgs](x: Self) {
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setSender(value: Any): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Used to enable auto scroll while drag and drop the element.
      * @Default {'false'}
      */
    var autoScroll: js.UndefOr[Boolean] = js.undefined
    
    /** If clone is specified.
      * @Default {false}
      */
    @JSName("clone")
    var clone_FModel: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the offset of the dragging helper relative to the mouse cursor.
      * @Default {{ top: -1, left: -2 }}
      */
    var cursorAt: js.UndefOr[Any] = js.undefined
    
    /** This event is triggered when dragging element is destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Distance in pixels after mousedown the mouse must move before dragging should start. This option can be used to prevent unwanted drags when clicking on an element.
      * @Default {1}
      */
    var distance: js.UndefOr[Double] = js.undefined
    
    /** This event is triggered when the mouse is moved during the dragging.
      */
    var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.undefined
    
    /** The drag area is used to restrict the dragging element bounds.Specify the id of the container within which the element should be dragged.
      * @Default {null}
      */
    var dragArea: js.UndefOr[Boolean] = js.undefined
    
    /** Supply a callback function to handle the drag start event as an init option.
      */
    var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.undefined
    
    /** This event is triggered when the mouse is moved during the dragging.
      */
    var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.undefined
    
    /** If specified, restricts drag start click to the specified element(s).
      * @Default {null}
      */
    var handle: js.UndefOr[String] = js.undefined
    
    /** This event is triggered when dragged.
      */
    var helper: js.UndefOr[js.Function1[/* e */ HelperEventArgs, Unit]] = js.undefined
    
    /** Used to group sets of draggable and droppable items, in addition to droppable's accept option. A draggable with the same scope value as a droppable will be accepted by the
      * droppable.
      * @Default {'default'}
      */
    var scope: js.UndefOr[String] = js.undefined
    
    /** Represents when to start the scrolling inside the scroll container on dragging
      * @Default {'20'}
      */
    var scrollSensitivity: js.UndefOr[Double] = js.undefined
    
    /** Specifies how much distance of scroll should move on dragging once reached scroll sensitivity area.
      * @Default {'20'}
      */
    var scrollSpeed: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typingsJapgolly.ejWebAll.ej.Draggable.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.ejWebAll.ej.Draggable.Model]
    }
    
    extension [Self <: typingsJapgolly.ejWebAll.ej.Draggable.Model](x: Self) {
      
      inline def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setCursorAt(value: Any): Self = StObject.set(x, "cursorAt", value.asInstanceOf[js.Any])
      
      inline def setCursorAtUndefined: Self = StObject.set(x, "cursorAt", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction1((t0: /* e */ DestroyEventArgs) => value(t0).runNow()))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setDrag(value: /* e */ DragEventArgs => Callback): Self = StObject.set(x, "drag", js.Any.fromFunction1((t0: /* e */ DragEventArgs) => value(t0).runNow()))
      
      inline def setDragArea(value: Boolean): Self = StObject.set(x, "dragArea", value.asInstanceOf[js.Any])
      
      inline def setDragAreaUndefined: Self = StObject.set(x, "dragArea", js.undefined)
      
      inline def setDragStart(value: /* e */ DragStartEventArgs => Callback): Self = StObject.set(x, "dragStart", js.Any.fromFunction1((t0: /* e */ DragStartEventArgs) => value(t0).runNow()))
      
      inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      inline def setDragStop(value: /* e */ DragStopEventArgs => Callback): Self = StObject.set(x, "dragStop", js.Any.fromFunction1((t0: /* e */ DragStopEventArgs) => value(t0).runNow()))
      
      inline def setDragStopUndefined: Self = StObject.set(x, "dragStop", js.undefined)
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHelper(value: /* e */ HelperEventArgs => Callback): Self = StObject.set(x, "helper", js.Any.fromFunction1((t0: /* e */ HelperEventArgs) => value(t0).runNow()))
      
      inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
      
      inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
      
      inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
      
      inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
    }
  }
}
