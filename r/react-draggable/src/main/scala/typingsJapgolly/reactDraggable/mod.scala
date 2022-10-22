package typingsJapgolly.reactDraggable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.SVGElement
import org.scalajs.dom.TouchEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDraggable.anon.PartialDraggableCoreProps
import typingsJapgolly.reactDraggable.anon.PartialDraggableProps
import typingsJapgolly.reactDraggable.reactDraggableBooleans.`false`
import typingsJapgolly.reactDraggable.reactDraggableStrings.both
import typingsJapgolly.reactDraggable.reactDraggableStrings.none
import typingsJapgolly.reactDraggable.reactDraggableStrings.x
import typingsJapgolly.reactDraggable.reactDraggableStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-draggable", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PartialDraggableProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-draggable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-draggable", "default.defaultProps")
    @js.native
    def defaultProps: DraggableProps = js.native
    inline def defaultProps_=(x: DraggableProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-draggable", "DraggableCore")
  @js.native
  open class DraggableCore protected ()
    extends Component[PartialDraggableCoreProps, js.Object, Any] {
    def this(props: PartialDraggableCoreProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PartialDraggableCoreProps, context: Any) = this()
  }
  /* static members */
  object DraggableCore {
    
    @JSImport("react-draggable", "DraggableCore")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-draggable", "DraggableCore.defaultProps")
    @js.native
    def defaultProps: DraggableCoreProps = js.native
    inline def defaultProps_=(x: DraggableCoreProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ControlPosition extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object ControlPosition {
    
    inline def apply(x: Double, y: Double): ControlPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlPosition]
    }
    
    extension [Self <: ControlPosition](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Draggable = japgolly.scalajs.react.facade.React.Component[PartialDraggableProps & js.Object, js.Object]
  
  trait DraggableBounds extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object DraggableBounds {
    
    inline def apply(): DraggableBounds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggableBounds]
    }
    
    extension [Self <: DraggableBounds](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait DraggableCoreProps extends StObject {
    
    var allowAnyClick: Boolean
    
    var cancel: String
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disabled: Boolean
    
    var enableUserSelectHack: Boolean
    
    var grid: js.Tuple2[Double, Double]
    
    var handle: String
    
    var nodeRef: js.UndefOr[RefHandle[HTMLElement]] = js.undefined
    
    var offsetParent: HTMLElement
    
    var onDrag: DraggableEventHandler
    
    def onMouseDown(e: MouseEvent): Unit
    
    var onStart: DraggableEventHandler
    
    var onStop: DraggableEventHandler
    
    var scale: Double
  }
  object DraggableCoreProps {
    
    inline def apply(
      allowAnyClick: Boolean,
      cancel: String,
      disabled: Boolean,
      enableUserSelectHack: Boolean,
      grid: js.Tuple2[Double, Double],
      handle: String,
      offsetParent: HTMLElement,
      onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      onMouseDown: MouseEvent => Callback,
      onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      scale: Double
    ): DraggableCoreProps = {
      val __obj = js.Dynamic.literal(allowAnyClick = allowAnyClick.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enableUserSelectHack = enableUserSelectHack.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onMouseDown = js.Any.fromFunction1((t0: MouseEvent) => onMouseDown(t0).runNow()), onStart = js.Any.fromFunction2(onStart), onStop = js.Any.fromFunction2(onStop), scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggableCoreProps]
    }
    
    extension [Self <: DraggableCoreProps](x: Self) {
      
      inline def setAllowAnyClick(value: Boolean): Self = StObject.set(x, "allowAnyClick", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEnableUserSelectHack(value: Boolean): Self = StObject.set(x, "enableUserSelectHack", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setNodeRef(value: RefHandle[HTMLElement]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
      
      inline def setNodeRefUndefined: Self = StObject.set(x, "nodeRef", js.undefined)
      
      inline def setOffsetParent(value: HTMLElement): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      inline def setOnDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      inline def setOnMouseDown(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      inline def setOnStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStop", js.Any.fromFunction2(value))
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait DraggableData extends StObject {
    
    var deltaX: Double
    
    var deltaY: Double
    
    var lastX: Double
    
    var lastY: Double
    
    var node: HTMLElement
    
    var x: Double
    
    var y: Double
  }
  object DraggableData {
    
    inline def apply(
      deltaX: Double,
      deltaY: Double,
      lastX: Double,
      lastY: Double,
      node: HTMLElement,
      x: Double,
      y: Double
    ): DraggableData = {
      val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggableData]
    }
    
    extension [Self <: DraggableData](x: Self) {
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setLastX(value: Double): Self = StObject.set(x, "lastX", value.asInstanceOf[js.Any])
      
      inline def setLastY(value: Double): Self = StObject.set(x, "lastY", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type DraggableEvent = (ReactMouseEventFrom[(HTMLElement | SVGElement) & org.scalajs.dom.Element]) | (ReactTouchEventFrom[(HTMLElement | SVGElement) & org.scalajs.dom.Element]) | MouseEvent | TouchEvent
  
  type DraggableEventHandler = js.Function2[/* e */ DraggableEvent, /* data */ DraggableData, Unit | `false`]
  
  trait DraggableProps
    extends StObject
       with DraggableCoreProps {
    
    var axis: both | x | y | none
    
    var bounds: DraggableBounds | String | `false`
    
    var defaultClassName: String
    
    var defaultClassNameDragged: String
    
    var defaultClassNameDragging: String
    
    var defaultPosition: ControlPosition
    
    var position: ControlPosition
    
    var positionOffset: PositionOffsetControlPosition
  }
  object DraggableProps {
    
    inline def apply(
      allowAnyClick: Boolean,
      axis: both | x | y | none,
      bounds: DraggableBounds | String | `false`,
      cancel: String,
      defaultClassName: String,
      defaultClassNameDragged: String,
      defaultClassNameDragging: String,
      defaultPosition: ControlPosition,
      disabled: Boolean,
      enableUserSelectHack: Boolean,
      grid: js.Tuple2[Double, Double],
      handle: String,
      offsetParent: HTMLElement,
      onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      onMouseDown: MouseEvent => Callback,
      onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
      position: ControlPosition,
      positionOffset: PositionOffsetControlPosition,
      scale: Double
    ): DraggableProps = {
      val __obj = js.Dynamic.literal(allowAnyClick = allowAnyClick.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], defaultClassName = defaultClassName.asInstanceOf[js.Any], defaultClassNameDragged = defaultClassNameDragged.asInstanceOf[js.Any], defaultClassNameDragging = defaultClassNameDragging.asInstanceOf[js.Any], defaultPosition = defaultPosition.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enableUserSelectHack = enableUserSelectHack.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onMouseDown = js.Any.fromFunction1((t0: MouseEvent) => onMouseDown(t0).runNow()), onStart = js.Any.fromFunction2(onStart), onStop = js.Any.fromFunction2(onStop), position = position.asInstanceOf[js.Any], positionOffset = positionOffset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggableProps]
    }
    
    extension [Self <: DraggableProps](x: Self) {
      
      inline def setAxis(value: both | typingsJapgolly.reactDraggable.reactDraggableStrings.x | y | none): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setBounds(value: DraggableBounds | String | `false`): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setDefaultClassName(value: String): Self = StObject.set(x, "defaultClassName", value.asInstanceOf[js.Any])
      
      inline def setDefaultClassNameDragged(value: String): Self = StObject.set(x, "defaultClassNameDragged", value.asInstanceOf[js.Any])
      
      inline def setDefaultClassNameDragging(value: String): Self = StObject.set(x, "defaultClassNameDragging", value.asInstanceOf[js.Any])
      
      inline def setDefaultPosition(value: ControlPosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionOffset(value: PositionOffsetControlPosition): Self = StObject.set(x, "positionOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait PositionOffsetControlPosition extends StObject {
    
    var x: Double | String
    
    var y: Double | String
  }
  object PositionOffsetControlPosition {
    
    inline def apply(x: Double | String, y: Double | String): PositionOffsetControlPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionOffsetControlPosition]
    }
    
    extension [Self <: PositionOffsetControlPosition](x: Self) {
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
