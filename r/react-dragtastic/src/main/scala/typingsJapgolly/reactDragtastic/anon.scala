package typingsJapgolly.reactDragtastic

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.reactDragtastic.mod.Accepts
import typingsJapgolly.reactDragtastic.mod.Id
import typingsJapgolly.reactDragtastic.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OnMouseDown extends StObject {
    
    var onMouseDown: MouseEventHandler[Element]
    
    var onTouchStart: TouchEventHandler[Element]
  }
  object OnMouseDown {
    
    inline def apply(
      onMouseDown: ReactMouseEventFrom[Element & Element] => Callback,
      onTouchStart: ReactTouchEventFrom[Element & Element] => Callback
    ): OnMouseDown = {
      val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseDown(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => onTouchStart(t0).runNow()))
      __obj.asInstanceOf[OnMouseDown]
    }
    
    extension [Self <: OnMouseDown](x: Self) {
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
    }
  }
  
  trait OnMouseEnter extends StObject {
    
    def onMouseEnter(): Unit
    
    def onMouseLeave(): Unit
    
    def onMouseUp(): Unit
  }
  object OnMouseEnter {
    
    inline def apply(onMouseEnter: Callback, onMouseLeave: Callback, onMouseUp: Callback): OnMouseEnter = {
      val __obj = js.Dynamic.literal(onMouseEnter = onMouseEnter.toJsFn, onMouseLeave = onMouseLeave.toJsFn, onMouseUp = onMouseUp.toJsFn)
      __obj.asInstanceOf[OnMouseEnter]
    }
    
    extension [Self <: OnMouseEnter](x: Self) {
      
      inline def setOnMouseEnter(value: Callback): Self = StObject.set(x, "onMouseEnter", value.toJsFn)
      
      inline def setOnMouseLeave(value: Callback): Self = StObject.set(x, "onMouseLeave", value.toJsFn)
      
      inline def setOnMouseUp(value: Callback): Self = StObject.set(x, "onMouseUp", value.toJsFn)
    }
  }
  
  /* Inlined react-dragtastic.react-dragtastic.State & {  isActive :boolean,   events :{  onMouseDown :react.react.MouseEventHandler<std.Element>,   onTouchStart :react.react.TouchEventHandler<std.Element>}} */
  trait StateisActivebooleanevent extends StObject {
    
    /** The id of the currently dragging element. */
    var currentlyDraggingId: js.UndefOr[Id] = js.undefined
    
    /** The accepts property of the <Droppable/> currently being hovered. */
    var currentlyHoveredDroppableAccepts: js.UndefOr[Accepts] = js.undefined
    
    /** The id of the <Droppable/> currently being hovered. */
    var currentlyHoveredDroppableId: js.UndefOr[Id] = js.undefined
    
    /** Data from the data property of the <Draggable/> which is currently active. null if not dragging. */
    var data: Any
    
    var events: OnMouseDown
    
    /** A boolean representing if the draggable is currently active. */
    var isActive: Boolean
    
    /** A boolean representing whether the user is currently dragging. */
    var isDragging: Boolean
    
    /** The user's initial horizontal position on the page when they started dragging. */
    var startingX: Double
    
    /** The user's initial vertical position on the page when they started dragging. */
    var startingY: Double
    
    /** The type of the component being currently dragged. null if not dragging. */
    var `type`: js.UndefOr[Type] = js.undefined
    
    /** The user's current horizontal position on the page. */
    var x: Double
    
    /** The user's current vertical position on the page. */
    var y: Double
  }
  object StateisActivebooleanevent {
    
    inline def apply(
      data: Any,
      events: OnMouseDown,
      isActive: Boolean,
      isDragging: Boolean,
      startingX: Double,
      startingY: Double,
      x: Double,
      y: Double
    ): StateisActivebooleanevent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], startingX = startingX.asInstanceOf[js.Any], startingY = startingY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateisActivebooleanevent]
    }
    
    extension [Self <: StateisActivebooleanevent](x: Self) {
      
      inline def setCurrentlyDraggingId(value: Id): Self = StObject.set(x, "currentlyDraggingId", value.asInstanceOf[js.Any])
      
      inline def setCurrentlyDraggingIdUndefined: Self = StObject.set(x, "currentlyDraggingId", js.undefined)
      
      inline def setCurrentlyHoveredDroppableAccepts(value: Accepts): Self = StObject.set(x, "currentlyHoveredDroppableAccepts", value.asInstanceOf[js.Any])
      
      inline def setCurrentlyHoveredDroppableAcceptsUndefined: Self = StObject.set(x, "currentlyHoveredDroppableAccepts", js.undefined)
      
      inline def setCurrentlyHoveredDroppableAcceptsVarargs(value: String*): Self = StObject.set(x, "currentlyHoveredDroppableAccepts", js.Array(value*))
      
      inline def setCurrentlyHoveredDroppableId(value: Id): Self = StObject.set(x, "currentlyHoveredDroppableId", value.asInstanceOf[js.Any])
      
      inline def setCurrentlyHoveredDroppableIdUndefined: Self = StObject.set(x, "currentlyHoveredDroppableId", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: OnMouseDown): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setStartingX(value: Double): Self = StObject.set(x, "startingX", value.asInstanceOf[js.Any])
      
      inline def setStartingY(value: Double): Self = StObject.set(x, "startingY", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-dragtastic.react-dragtastic.State & {  isOverAccepted :boolean} */
  trait StateisOverAcceptedboolea extends StObject {
    
    /** The id of the currently dragging element. */
    var currentlyDraggingId: js.UndefOr[Id] = js.undefined
    
    /** The accepts property of the <Droppable/> currently being hovered. */
    var currentlyHoveredDroppableAccepts: js.UndefOr[Accepts] = js.undefined
    
    /** The id of the <Droppable/> currently being hovered. */
    var currentlyHoveredDroppableId: js.UndefOr[Id] = js.undefined
    
    /** Data from the data property of the <Draggable/> which is currently active. null if not dragging. */
    var data: Any
    
    /** A boolean representing whether the user is currently dragging. */
    var isDragging: Boolean
    
    /** A boolean representing whether the user is currently hovering a <Droppable/> that accepts the type of the currently active <Draggable/> */
    var isOverAccepted: Boolean
    
    /** The user's initial horizontal position on the page when they started dragging. */
    var startingX: Double
    
    /** The user's initial vertical position on the page when they started dragging. */
    var startingY: Double
    
    /** The type of the component being currently dragged. null if not dragging. */
    var `type`: js.UndefOr[Type] = js.undefined
    
    /** The user's current horizontal position on the page. */
    var x: Double
    
    /** The user's current vertical position on the page. */
    var y: Double
  }
  object StateisOverAcceptedboolea {
    
    inline def apply(
      data: Any,
      isDragging: Boolean,
      isOverAccepted: Boolean,
      startingX: Double,
      startingY: Double,
      x: Double,
      y: Double
    ): StateisOverAcceptedboolea = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isOverAccepted = isOverAccepted.asInstanceOf[js.Any], startingX = startingX.asInstanceOf[js.Any], startingY = startingY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateisOverAcceptedboolea]
    }
    
    extension [Self <: StateisOverAcceptedboolea](x: Self) {
      
      inline def setCurrentlyDraggingId(value: Id): Self = StObject.set(x, "currentlyDraggingId", value.asInstanceOf[js.Any])
      
      inline def setCurrentlyDraggingIdUndefined: Self = StObject.set(x, "currentlyDraggingId", js.undefined)
      
      inline def setCurrentlyHoveredDroppableAccepts(value: Accepts): Self = StObject.set(x, "currentlyHoveredDroppableAccepts", value.asInstanceOf[js.Any])
      
      inline def setCurrentlyHoveredDroppableAcceptsUndefined: Self = StObject.set(x, "currentlyHoveredDroppableAccepts", js.undefined)
      
      inline def setCurrentlyHoveredDroppableAcceptsVarargs(value: String*): Self = StObject.set(x, "currentlyHoveredDroppableAccepts", js.Array(value*))
      
      inline def setCurrentlyHoveredDroppableId(value: Id): Self = StObject.set(x, "currentlyHoveredDroppableId", value.asInstanceOf[js.Any])
      
      inline def setCurrentlyHoveredDroppableIdUndefined: Self = StObject.set(x, "currentlyHoveredDroppableId", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setIsOverAccepted(value: Boolean): Self = StObject.set(x, "isOverAccepted", value.asInstanceOf[js.Any])
      
      inline def setStartingX(value: Double): Self = StObject.set(x, "startingX", value.asInstanceOf[js.Any])
      
      inline def setStartingY(value: Double): Self = StObject.set(x, "startingY", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-dragtastic.react-dragtastic.State & {  isOver :boolean,   willAccept :boolean,   events :{onMouseEnter (): void, onMouseLeave (): void, onMouseUp (): void}} */
  trait StateisOverbooleanwillAcc extends StObject {
    
    /** The id of the currently dragging element. */
    var currentlyDraggingId: js.UndefOr[Id] = js.undefined
    
    /** The accepts property of the <Droppable/> currently being hovered. */
    var currentlyHoveredDroppableAccepts: js.UndefOr[Accepts] = js.undefined
    
    /** The id of the <Droppable/> currently being hovered. */
    var currentlyHoveredDroppableId: js.UndefOr[Id] = js.undefined
    
    /** Data from the data property of the <Draggable/> which is currently active. null if not dragging. */
    var data: Any
    
    var events: OnMouseEnter
    
    /** A boolean representing whether the user is currently dragging. */
    var isDragging: Boolean
    
    /** A boolean representing if the user is currently hovering the <Droppable/>. */
    var isOver: Boolean
    
    /** The user's initial horizontal position on the page when they started dragging. */
    var startingX: Double
    
    /** The user's initial vertical position on the page when they started dragging. */
    var startingY: Double
    
    /** The type of the component being currently dragged. null if not dragging. */
    var `type`: js.UndefOr[Type] = js.undefined
    
    /** A boolean representing if this droppable will accept the currently dragging <DragComponent/>. */
    var willAccept: Boolean
    
    /** The user's current horizontal position on the page. */
    var x: Double
    
    /** The user's current vertical position on the page. */
    var y: Double
  }
  object StateisOverbooleanwillAcc {
    
    inline def apply(
      data: Any,
      events: OnMouseEnter,
      isDragging: Boolean,
      isOver: Boolean,
      startingX: Double,
      startingY: Double,
      willAccept: Boolean,
      x: Double,
      y: Double
    ): StateisOverbooleanwillAcc = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isOver = isOver.asInstanceOf[js.Any], startingX = startingX.asInstanceOf[js.Any], startingY = startingY.asInstanceOf[js.Any], willAccept = willAccept.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateisOverbooleanwillAcc]
    }
    
    extension [Self <: StateisOverbooleanwillAcc](x: Self) {
      
      inline def setCurrentlyDraggingId(value: Id): Self = StObject.set(x, "currentlyDraggingId", value.asInstanceOf[js.Any])
      
      inline def setCurrentlyDraggingIdUndefined: Self = StObject.set(x, "currentlyDraggingId", js.undefined)
      
      inline def setCurrentlyHoveredDroppableAccepts(value: Accepts): Self = StObject.set(x, "currentlyHoveredDroppableAccepts", value.asInstanceOf[js.Any])
      
      inline def setCurrentlyHoveredDroppableAcceptsUndefined: Self = StObject.set(x, "currentlyHoveredDroppableAccepts", js.undefined)
      
      inline def setCurrentlyHoveredDroppableAcceptsVarargs(value: String*): Self = StObject.set(x, "currentlyHoveredDroppableAccepts", js.Array(value*))
      
      inline def setCurrentlyHoveredDroppableId(value: Id): Self = StObject.set(x, "currentlyHoveredDroppableId", value.asInstanceOf[js.Any])
      
      inline def setCurrentlyHoveredDroppableIdUndefined: Self = StObject.set(x, "currentlyHoveredDroppableId", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: OnMouseEnter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setIsOver(value: Boolean): Self = StObject.set(x, "isOver", value.asInstanceOf[js.Any])
      
      inline def setStartingX(value: Double): Self = StObject.set(x, "startingX", value.asInstanceOf[js.Any])
      
      inline def setStartingY(value: Double): Self = StObject.set(x, "startingY", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWillAccept(value: Boolean): Self = StObject.set(x, "willAccept", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
