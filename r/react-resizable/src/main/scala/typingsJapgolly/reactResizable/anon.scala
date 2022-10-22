package typingsJapgolly.reactResizable

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactResizable.mod.ResizableProps
import typingsJapgolly.reactResizable.mod.ResizeCallbackData
import typingsJapgolly.reactResizable.mod.ResizeHandle
import typingsJapgolly.reactResizable.reactResizableStrings.both
import typingsJapgolly.reactResizable.reactResizableStrings.x
import typingsJapgolly.reactResizable.reactResizableStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Style extends StObject {
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined {  width :number,   height :number,   axis :'both' | undefined} & {  children :react.react.ReactNode | undefined,   className :string | undefined,   handle :react.react.ReactNode | (resizeHandle : react-resizable.react-resizable.ResizeHandle, ref : react.react.RefObject<any>): react.react.ReactNode | undefined,   handleSize :[number, number] | undefined,   lockAspectRatio :boolean | undefined,   minConstraints :[number, number] | undefined,   maxConstraints :[number, number] | undefined,   onResizeStop :(e : react.react.SyntheticEvent<std.Element, std.Event>, data : react-resizable.react-resizable.ResizeCallbackData): any | undefined,   onResizeStart :(e : react.react.SyntheticEvent<std.Element, std.Event>, data : react-resizable.react-resizable.ResizeCallbackData): any | undefined,   onResize :(e : react.react.SyntheticEvent<std.Element, std.Event>, data : react-resizable.react-resizable.ResizeCallbackData): any | undefined,   draggableOpts :any | undefined,   resizeHandles :std.Array<react-resizable.react-resizable.ResizeHandle> | undefined,   transformScale :number | undefined} */
  trait widthnumberheightnumberax
    extends StObject
       with ResizableProps {
    
    var axis: js.UndefOr[both] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var draggableOpts: js.UndefOr[Any] = js.undefined
    
    var handle: js.UndefOr[
        Node | (js.Function2[/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any], Node])
      ] = js.undefined
    
    var handleSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var height: Double
    
    var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
    
    var maxConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var minConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var onResize: js.UndefOr[
        js.Function2[/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData, Any]
      ] = js.undefined
    
    var onResizeStart: js.UndefOr[
        js.Function2[/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData, Any]
      ] = js.undefined
    
    var onResizeStop: js.UndefOr[
        js.Function2[/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData, Any]
      ] = js.undefined
    
    var resizeHandles: js.UndefOr[js.Array[ResizeHandle]] = js.undefined
    
    var transformScale: js.UndefOr[Double] = js.undefined
    
    var width: Double
  }
  object widthnumberheightnumberax {
    
    inline def apply(height: Double, width: Double): widthnumberheightnumberax = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[widthnumberheightnumberax]
    }
    
    extension [Self <: widthnumberheightnumberax](x: Self) {
      
      inline def setAxis(value: both): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDraggableOpts(value: Any): Self = StObject.set(x, "draggableOpts", value.asInstanceOf[js.Any])
      
      inline def setDraggableOptsUndefined: Self = StObject.set(x, "draggableOpts", js.undefined)
      
      inline def setHandle(value: Node | (js.Function2[/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any], Node])): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleFunction2(value: (/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any]) => Node): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
      
      inline def setHandleNull: Self = StObject.set(x, "handle", null)
      
      inline def setHandleSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "handleSize", value.asInstanceOf[js.Any])
      
      inline def setHandleSizeUndefined: Self = StObject.set(x, "handleSize", js.undefined)
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHandleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "handle", js.Array(value*))
      
      inline def setHandleVdomElement(value: VdomElement): Self = StObject.set(x, "handle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
      
      inline def setMaxConstraints(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "maxConstraints", value.asInstanceOf[js.Any])
      
      inline def setMaxConstraintsUndefined: Self = StObject.set(x, "maxConstraints", js.undefined)
      
      inline def setMinConstraints(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "minConstraints", value.asInstanceOf[js.Any])
      
      inline def setMinConstraintsUndefined: Self = StObject.set(x, "minConstraints", js.undefined)
      
      inline def setOnResize(value: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => Any): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
      
      inline def setOnResizeStart(value: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => Any): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction2(value))
      
      inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      inline def setOnResizeStop(value: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => Any): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction2(value))
      
      inline def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setResizeHandles(value: js.Array[ResizeHandle]): Self = StObject.set(x, "resizeHandles", value.asInstanceOf[js.Any])
      
      inline def setResizeHandlesUndefined: Self = StObject.set(x, "resizeHandles", js.undefined)
      
      inline def setResizeHandlesVarargs(value: ResizeHandle*): Self = StObject.set(x, "resizeHandles", js.Array(value*))
      
      inline def setTransformScale(value: Double): Self = StObject.set(x, "transformScale", value.asInstanceOf[js.Any])
      
      inline def setTransformScaleUndefined: Self = StObject.set(x, "transformScale", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  width :number,   height :number | undefined,   axis :'x'} & {  children :react.react.ReactNode | undefined,   className :string | undefined,   handle :react.react.ReactNode | (resizeHandle : react-resizable.react-resizable.ResizeHandle, ref : react.react.RefObject<any>): react.react.ReactNode | undefined,   handleSize :[number, number] | undefined,   lockAspectRatio :boolean | undefined,   minConstraints :[number, number] | undefined,   maxConstraints :[number, number] | undefined,   onResizeStop :(e : react.react.SyntheticEvent<std.Element, std.Event>, data : react-resizable.react-resizable.ResizeCallbackData): any | undefined,   onResizeStart :(e : react.react.SyntheticEvent<std.Element, std.Event>, data : react-resizable.react-resizable.ResizeCallbackData): any | undefined,   onResize :(e : react.react.SyntheticEvent<std.Element, std.Event>, data : react-resizable.react-resizable.ResizeCallbackData): any | undefined,   draggableOpts :any | undefined,   resizeHandles :std.Array<react-resizable.react-resizable.ResizeHandle> | undefined,   transformScale :number | undefined} */
  trait widthnumberheightnumberun
    extends StObject
       with ResizableProps {
    
    var axis: x
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var draggableOpts: js.UndefOr[Any] = js.undefined
    
    var handle: js.UndefOr[
        Node | (js.Function2[/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any], Node])
      ] = js.undefined
    
    var handleSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
    
    var maxConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var minConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var onResize: js.UndefOr[
        js.Function2[/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData, Any]
      ] = js.undefined
    
    var onResizeStart: js.UndefOr[
        js.Function2[/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData, Any]
      ] = js.undefined
    
    var onResizeStop: js.UndefOr[
        js.Function2[/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData, Any]
      ] = js.undefined
    
    var resizeHandles: js.UndefOr[js.Array[ResizeHandle]] = js.undefined
    
    var transformScale: js.UndefOr[Double] = js.undefined
    
    var width: Double
  }
  object widthnumberheightnumberun {
    
    inline def apply(width: Double): widthnumberheightnumberun = {
      val __obj = js.Dynamic.literal(axis = "x", width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[widthnumberheightnumberun]
    }
    
    extension [Self <: widthnumberheightnumberun](x: Self) {
      
      inline def setAxis(value: typingsJapgolly.reactResizable.reactResizableStrings.x): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDraggableOpts(value: Any): Self = StObject.set(x, "draggableOpts", value.asInstanceOf[js.Any])
      
      inline def setDraggableOptsUndefined: Self = StObject.set(x, "draggableOpts", js.undefined)
      
      inline def setHandle(value: Node | (js.Function2[/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any], Node])): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleFunction2(value: (/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any]) => Node): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
      
      inline def setHandleNull: Self = StObject.set(x, "handle", null)
      
      inline def setHandleSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "handleSize", value.asInstanceOf[js.Any])
      
      inline def setHandleSizeUndefined: Self = StObject.set(x, "handleSize", js.undefined)
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHandleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "handle", js.Array(value*))
      
      inline def setHandleVdomElement(value: VdomElement): Self = StObject.set(x, "handle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
      
      inline def setMaxConstraints(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "maxConstraints", value.asInstanceOf[js.Any])
      
      inline def setMaxConstraintsUndefined: Self = StObject.set(x, "maxConstraints", js.undefined)
      
      inline def setMinConstraints(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "minConstraints", value.asInstanceOf[js.Any])
      
      inline def setMinConstraintsUndefined: Self = StObject.set(x, "minConstraints", js.undefined)
      
      inline def setOnResize(value: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => Any): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
      
      inline def setOnResizeStart(value: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => Any): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction2(value))
      
      inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      inline def setOnResizeStop(value: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => Any): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction2(value))
      
      inline def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setResizeHandles(value: js.Array[ResizeHandle]): Self = StObject.set(x, "resizeHandles", value.asInstanceOf[js.Any])
      
      inline def setResizeHandlesUndefined: Self = StObject.set(x, "resizeHandles", js.undefined)
      
      inline def setResizeHandlesVarargs(value: ResizeHandle*): Self = StObject.set(x, "resizeHandles", js.Array(value*))
      
      inline def setTransformScale(value: Double): Self = StObject.set(x, "transformScale", value.asInstanceOf[js.Any])
      
      inline def setTransformScaleUndefined: Self = StObject.set(x, "transformScale", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  width :number | undefined,   height :number,   axis :'y'} & {  children :react.react.ReactNode | undefined,   className :string | undefined,   handle :react.react.ReactNode | (resizeHandle : react-resizable.react-resizable.ResizeHandle, ref : react.react.RefObject<any>): react.react.ReactNode | undefined,   handleSize :[number, number] | undefined,   lockAspectRatio :boolean | undefined,   minConstraints :[number, number] | undefined,   maxConstraints :[number, number] | undefined,   onResizeStop :(e : react.react.SyntheticEvent<std.Element, std.Event>, data : react-resizable.react-resizable.ResizeCallbackData): any | undefined,   onResizeStart :(e : react.react.SyntheticEvent<std.Element, std.Event>, data : react-resizable.react-resizable.ResizeCallbackData): any | undefined,   onResize :(e : react.react.SyntheticEvent<std.Element, std.Event>, data : react-resizable.react-resizable.ResizeCallbackData): any | undefined,   draggableOpts :any | undefined,   resizeHandles :std.Array<react-resizable.react-resizable.ResizeHandle> | undefined,   transformScale :number | undefined} */
  trait widthnumberundefinedheigh
    extends StObject
       with ResizableProps {
    
    var axis: y
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var draggableOpts: js.UndefOr[Any] = js.undefined
    
    var handle: js.UndefOr[
        Node | (js.Function2[/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any], Node])
      ] = js.undefined
    
    var handleSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var height: Double
    
    var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
    
    var maxConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var minConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var onResize: js.UndefOr[
        js.Function2[/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData, Any]
      ] = js.undefined
    
    var onResizeStart: js.UndefOr[
        js.Function2[/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData, Any]
      ] = js.undefined
    
    var onResizeStop: js.UndefOr[
        js.Function2[/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData, Any]
      ] = js.undefined
    
    var resizeHandles: js.UndefOr[js.Array[ResizeHandle]] = js.undefined
    
    var transformScale: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object widthnumberundefinedheigh {
    
    inline def apply(height: Double): widthnumberundefinedheigh = {
      val __obj = js.Dynamic.literal(axis = "y", height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[widthnumberundefinedheigh]
    }
    
    extension [Self <: widthnumberundefinedheigh](x: Self) {
      
      inline def setAxis(value: y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDraggableOpts(value: Any): Self = StObject.set(x, "draggableOpts", value.asInstanceOf[js.Any])
      
      inline def setDraggableOptsUndefined: Self = StObject.set(x, "draggableOpts", js.undefined)
      
      inline def setHandle(value: Node | (js.Function2[/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any], Node])): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleFunction2(value: (/* resizeHandle */ ResizeHandle, /* ref */ RefHandle[Any]) => Node): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
      
      inline def setHandleNull: Self = StObject.set(x, "handle", null)
      
      inline def setHandleSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "handleSize", value.asInstanceOf[js.Any])
      
      inline def setHandleSizeUndefined: Self = StObject.set(x, "handleSize", js.undefined)
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHandleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "handle", js.Array(value*))
      
      inline def setHandleVdomElement(value: VdomElement): Self = StObject.set(x, "handle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
      
      inline def setMaxConstraints(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "maxConstraints", value.asInstanceOf[js.Any])
      
      inline def setMaxConstraintsUndefined: Self = StObject.set(x, "maxConstraints", js.undefined)
      
      inline def setMinConstraints(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "minConstraints", value.asInstanceOf[js.Any])
      
      inline def setMinConstraintsUndefined: Self = StObject.set(x, "minConstraints", js.undefined)
      
      inline def setOnResize(value: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => Any): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
      
      inline def setOnResizeStart(value: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => Any): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction2(value))
      
      inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      inline def setOnResizeStop(value: (/* e */ ReactEventFrom[Element], /* data */ ResizeCallbackData) => Any): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction2(value))
      
      inline def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setResizeHandles(value: js.Array[ResizeHandle]): Self = StObject.set(x, "resizeHandles", value.asInstanceOf[js.Any])
      
      inline def setResizeHandlesUndefined: Self = StObject.set(x, "resizeHandles", js.undefined)
      
      inline def setResizeHandlesVarargs(value: ResizeHandle*): Self = StObject.set(x, "resizeHandles", js.Array(value*))
      
      inline def setTransformScale(value: Double): Self = StObject.set(x, "transformScale", value.asInstanceOf[js.Any])
      
      inline def setTransformScaleUndefined: Self = StObject.set(x, "transformScale", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
