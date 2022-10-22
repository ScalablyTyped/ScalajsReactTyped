package typingsJapgolly.reactSvgPanZoom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactSvgPanZoom.anon.Background
import typingsJapgolly.reactSvgPanZoom.anon.Position
import typingsJapgolly.reactSvgPanZoom.reactSvgPanZoomInts.`2`
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-svg-pan-zoom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-svg-pan-zoom", "ALIGN_BOTTOM")
  @js.native
  val ALIGN_BOTTOM: /* "bottom" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "ALIGN_CENTER")
  @js.native
  val ALIGN_CENTER: /* "center" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "ALIGN_LEFT")
  @js.native
  val ALIGN_LEFT: /* "left" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "ALIGN_RIGHT")
  @js.native
  val ALIGN_RIGHT: /* "right" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "ALIGN_TOP")
  @js.native
  val ALIGN_TOP: /* "top" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "MODE_IDLE")
  @js.native
  val MODE_IDLE: /* "idle" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "MODE_PANNING")
  @js.native
  val MODE_PANNING: /* "panning" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "MODE_ZOOMING")
  @js.native
  val MODE_ZOOMING: /* "zooming" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "POSITION_BOTTOM")
  @js.native
  val POSITION_BOTTOM: /* "bottom" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "POSITION_LEFT")
  @js.native
  val POSITION_LEFT: /* "left" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "POSITION_NONE")
  @js.native
  val POSITION_NONE: /* "none" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "POSITION_RIGHT")
  @js.native
  val POSITION_RIGHT: /* "right" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "POSITION_TOP")
  @js.native
  val POSITION_TOP: /* "top" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "ReactSVGPanZoom")
  @js.native
  open class ReactSVGPanZoom protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
    
    def fitSelection(
      selectionSVGPointX: Double,
      selectionSVGPointY: Double,
      selectionWidth: Double,
      selectionHeight: Double
    ): Unit = js.native
    
    def fitToViewer(): Unit = js.native
    
    def getTool(): Tool = js.native
    
    def getValue(): Value = js.native
    
    def pan(SVGDeltaX: Double, SVGDeltaY: Double): Unit = js.native
    
    def reset(): Unit = js.native
    
    def setPointOnViewerCenter(SVGPointX: Double, SVGPointY: Double, zoomLevel: Double): Unit = js.native
    
    def setTool(tool: Tool): Unit = js.native
    
    def setValue(value: Value): Unit = js.native
    
    def zoom(SVGPointX: Double, SVGPointY: Double, scaleFactor: Double): Unit = js.native
    
    def zoomOnViewerCenter(scaleFactor: Double): Unit = js.native
  }
  
  @JSImport("react-svg-pan-zoom", "TOOL_AUTO")
  @js.native
  val TOOL_AUTO: /* "auto" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "TOOL_NONE")
  @js.native
  val TOOL_NONE: /* "none" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "TOOL_PAN")
  @js.native
  val TOOL_PAN: /* "pan" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "TOOL_ZOOM_IN")
  @js.native
  val TOOL_ZOOM_IN: /* "zoom-in" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "TOOL_ZOOM_OUT")
  @js.native
  val TOOL_ZOOM_OUT: /* "zoom-out" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "UncontrolledReactSVGPanZoom")
  @js.native
  open class UncontrolledReactSVGPanZoom protected ()
    extends Component[UncontrolledProps, js.Object, Any] {
    def this(props: UncontrolledProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UncontrolledProps, context: Any) = this()
    
    def fitSelection(
      selectionSVGPointX: Double,
      selectionSVGPointY: Double,
      selectionWidth: Double,
      selectionHeight: Double
    ): Unit = js.native
    
    def fitToViewer(): Unit = js.native
    
    def getTool(): Tool = js.native
    
    def getValue(): Value = js.native
    
    def pan(SVGDeltaX: Double, SVGDeltaY: Double): Unit = js.native
    
    def reset(): Unit = js.native
    
    def setPointOnViewerCenter(SVGPointX: Double, SVGPointY: Double, zoomLevel: Double): Unit = js.native
    
    def setTool(tool: Tool): Unit = js.native
    
    def setValue(value: Value): Unit = js.native
    
    def zoom(SVGPointX: Double, SVGPointY: Double, scaleFactor: Double): Unit = js.native
    
    def zoomOnViewerCenter(scaleFactor: Double): Unit = js.native
  }
  
  inline def fitSelection(
    value: Value,
    selectionSVGPointX: Double,
    selectionSVGPointY: Double,
    selectionWidth: Double,
    selectionHeight: Double
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fitSelection")(value.asInstanceOf[js.Any], selectionSVGPointX.asInstanceOf[js.Any], selectionSVGPointY.asInstanceOf[js.Any], selectionWidth.asInstanceOf[js.Any], selectionHeight.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def fitToViewer(value: Value): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fitToViewer")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  inline def pan(value: Value, SVGDeltaX: Double, SVGDeltaY: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("pan")(value.asInstanceOf[js.Any], SVGDeltaX.asInstanceOf[js.Any], SVGDeltaY.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def pan(value: Value, SVGDeltaX: Double, SVGDeltaY: Double, panLimit: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("pan")(value.asInstanceOf[js.Any], SVGDeltaX.asInstanceOf[js.Any], SVGDeltaY.asInstanceOf[js.Any], panLimit.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def reset(value: Value): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  inline def setPointOnViewerCenter(value: Value, SVGPointX: Double, SVGPointY: Double, zoomLevel: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("setPointOnViewerCenter")(value.asInstanceOf[js.Any], SVGPointX.asInstanceOf[js.Any], SVGPointY.asInstanceOf[js.Any], zoomLevel.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def zoom(value: Value, SVGPointX: Double, SVGPointY: Double, scaleFactor: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("zoom")(value.asInstanceOf[js.Any], SVGPointX.asInstanceOf[js.Any], SVGPointY.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def zoomOnViewerCenter(value: Value, scaleFactor: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomOnViewerCenter")(value.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  type Mode = /* "idle" */ String
  
  trait OptionalProps extends StObject {
    
    // background of the svg
    var SVGBackground: String
    
    // background of the viewer
    var background: String
    
    // className of the Viewer
    var className: String
    
    var customMiniature: Element | ComponentType[js.Object]
    
    // override default toolbar component
    // TODO: specify function type more clearly
    var customToolbar: (japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object]) | FunctionComponent[Any]
    
    // default tool
    var defaultTool: Exclude[Tool, /* "auto" */ String]
    
    // perform PAN if the mouse is on viewer border
    var detectAutoPan: Boolean
    
    var detectPinchGesture: Boolean
    
    // detect zoom operation performed trough pinch gesture or mouse scroll
    var detectWheel: Boolean
    
    // Turn off zoom on double click
    var disableDoubleClickZoomWithToolAuto: Boolean
    
    var miniatureProps: Background
    
    // modifier keys //https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/getModifierState
    var modifierKeys: js.Array[String]
    
    // Note: The `T` type parameter is the type of the `target` of the event:
    // handler click
    def onClick[T](event: ViewerMouseEvent[T]): Unit
    
    // handler double click
    def onDoubleClick[T](event: ViewerMouseEvent[T]): Unit
    
    // handler mousedown
    def onMouseDown[T](event: ViewerMouseEvent[T]): Unit
    
    // handler mousemove
    def onMouseMove[T](event: ViewerMouseEvent[T]): Unit
    
    // handler mouseup
    def onMouseUp[T](event: ViewerMouseEvent[T]): Unit
    
    // handler pan action performed
    def onPan[T](event: ViewerMouseEvent[T]): Unit
    
    // handler zoom level changed
    def onZoom[T](event: ViewerMouseEvent[T]): Unit
    
    // if disabled the user can move the image outside the viewer
    var preventPanOutside: Boolean
    
    // how much scale in or out
    var scaleFactor: Double
    
    // maximum amount of scale a user can zoom in to
    var scaleFactorMax: Double
    
    // minimum amount of a scale a user can zoom out of
    var scaleFactorMin: Double
    
    // how much scale in or out on mouse wheel (requires detectWheel enabled)
    var scaleFactorOnWheel: Double
    
    // CSS style of the Viewer
    var style: js.Object
    
    var toolbarProps: Position
  }
  object OptionalProps {
    
    inline def apply(
      SVGBackground: String,
      background: String,
      className: String,
      customMiniature: Element | ComponentType[js.Object],
      customToolbar: (japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object]) | FunctionComponent[Any],
      defaultTool: Exclude[Tool, /* "auto" */ String],
      detectAutoPan: Boolean,
      detectPinchGesture: Boolean,
      detectWheel: Boolean,
      disableDoubleClickZoomWithToolAuto: Boolean,
      miniatureProps: Background,
      modifierKeys: js.Array[String],
      onClick: ViewerMouseEvent[Any] => Callback,
      onDoubleClick: ViewerMouseEvent[Any] => Callback,
      onMouseDown: ViewerMouseEvent[Any] => Callback,
      onMouseMove: ViewerMouseEvent[Any] => Callback,
      onMouseUp: ViewerMouseEvent[Any] => Callback,
      onPan: ViewerMouseEvent[Any] => Callback,
      onZoom: ViewerMouseEvent[Any] => Callback,
      preventPanOutside: Boolean,
      scaleFactor: Double,
      scaleFactorMax: Double,
      scaleFactorMin: Double,
      scaleFactorOnWheel: Double,
      style: js.Object,
      toolbarProps: Position
    ): OptionalProps = {
      val __obj = js.Dynamic.literal(SVGBackground = SVGBackground.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], customMiniature = customMiniature.asInstanceOf[js.Any], customToolbar = customToolbar.asInstanceOf[js.Any], defaultTool = defaultTool.asInstanceOf[js.Any], detectAutoPan = detectAutoPan.asInstanceOf[js.Any], detectPinchGesture = detectPinchGesture.asInstanceOf[js.Any], detectWheel = detectWheel.asInstanceOf[js.Any], disableDoubleClickZoomWithToolAuto = disableDoubleClickZoomWithToolAuto.asInstanceOf[js.Any], miniatureProps = miniatureProps.asInstanceOf[js.Any], modifierKeys = modifierKeys.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => onClick(t0).runNow()), onDoubleClick = js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => onDoubleClick(t0).runNow()), onMouseDown = js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => onMouseDown(t0).runNow()), onMouseMove = js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => onMouseMove(t0).runNow()), onMouseUp = js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => onMouseUp(t0).runNow()), onPan = js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => onPan(t0).runNow()), onZoom = js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => onZoom(t0).runNow()), preventPanOutside = preventPanOutside.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], scaleFactorMax = scaleFactorMax.asInstanceOf[js.Any], scaleFactorMin = scaleFactorMin.asInstanceOf[js.Any], scaleFactorOnWheel = scaleFactorOnWheel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], toolbarProps = toolbarProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionalProps]
    }
    
    extension [Self <: OptionalProps](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setCustomMiniature(value: Element | ComponentType[js.Object]): Self = StObject.set(x, "customMiniature", value.asInstanceOf[js.Any])
      
      inline def setCustomMiniatureVdomElement(value: VdomElement): Self = StObject.set(x, "customMiniature", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCustomToolbar(
        value: (japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object]) | FunctionComponent[Any]
      ): Self = StObject.set(x, "customToolbar", value.asInstanceOf[js.Any])
      
      inline def setDefaultTool(value: Exclude[Tool, /* "auto" */ String]): Self = StObject.set(x, "defaultTool", value.asInstanceOf[js.Any])
      
      inline def setDetectAutoPan(value: Boolean): Self = StObject.set(x, "detectAutoPan", value.asInstanceOf[js.Any])
      
      inline def setDetectPinchGesture(value: Boolean): Self = StObject.set(x, "detectPinchGesture", value.asInstanceOf[js.Any])
      
      inline def setDetectWheel(value: Boolean): Self = StObject.set(x, "detectWheel", value.asInstanceOf[js.Any])
      
      inline def setDisableDoubleClickZoomWithToolAuto(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoomWithToolAuto", value.asInstanceOf[js.Any])
      
      inline def setMiniatureProps(value: Background): Self = StObject.set(x, "miniatureProps", value.asInstanceOf[js.Any])
      
      inline def setModifierKeys(value: js.Array[String]): Self = StObject.set(x, "modifierKeys", value.asInstanceOf[js.Any])
      
      inline def setModifierKeysVarargs(value: String*): Self = StObject.set(x, "modifierKeys", js.Array(value*))
      
      inline def setOnClick(value: ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnDoubleClick(value: ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnMouseDown(value: ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnMouseMove(value: ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnMouseUp(value: ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnPan(value: ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onPan", js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnZoom(value: ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onZoom", js.Any.fromFunction1((t0: ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setPreventPanOutside(value: Boolean): Self = StObject.set(x, "preventPanOutside", value.asInstanceOf[js.Any])
      
      inline def setSVGBackground(value: String): Self = StObject.set(x, "SVGBackground", value.asInstanceOf[js.Any])
      
      inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorMax(value: Double): Self = StObject.set(x, "scaleFactorMax", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorMin(value: Double): Self = StObject.set(x, "scaleFactorMin", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorOnWheel(value: Double): Self = StObject.set(x, "scaleFactorOnWheel", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setToolbarProps(value: Position): Self = StObject.set(x, "toolbarProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-svg-pan-zoom.react-svg-pan-zoom.RequiredProps & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.OptionalProps> */
  trait Props extends StObject {
    
    var SVGBackground: js.UndefOr[String] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var children: Element
    
    var className: js.UndefOr[String] = js.undefined
    
    var customMiniature: js.UndefOr[Element | ComponentType[js.Object]] = js.undefined
    
    var customToolbar: js.UndefOr[
        (japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object]) | FunctionComponent[Any]
      ] = js.undefined
    
    var defaultTool: js.UndefOr[Exclude[Tool, /* "auto" */ String]] = js.undefined
    
    var detectAutoPan: js.UndefOr[Boolean] = js.undefined
    
    var detectPinchGesture: js.UndefOr[Boolean] = js.undefined
    
    var detectWheel: js.UndefOr[Boolean] = js.undefined
    
    var disableDoubleClickZoomWithToolAuto: js.UndefOr[Boolean] = js.undefined
    
    // height of the viewer displayed on screen
    var height: Double
    
    var miniatureProps: js.UndefOr[Background] = js.undefined
    
    var modifierKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    // handler tool changed
    def onChangeTool(tool: Tool): Unit
    
    // handler something changed
    def onChangeValue(value: Value): Unit
    
    var onClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onDoubleClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onMouseMove: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onMouseUp: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onPan: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onZoom: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var preventPanOutside: js.UndefOr[Boolean] = js.undefined
    
    var scaleFactor: js.UndefOr[Double] = js.undefined
    
    var scaleFactorMax: js.UndefOr[Double] = js.undefined
    
    var scaleFactorMin: js.UndefOr[Double] = js.undefined
    
    var scaleFactorOnWheel: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
    var tool: Tool
    
    var toolbarProps: js.UndefOr[Position] = js.undefined
    
    // value of the viewer (current point of view)
    var value: Value | Null
    
    // width of the viewer displayed on screen
    var width: Double
  }
  object Props {
    
    inline def apply(
      children: VdomElement,
      height: Double,
      onChangeTool: Tool => Callback,
      onChangeValue: Value => Callback,
      tool: Tool,
      width: Double
    ): Props = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onChangeTool = js.Any.fromFunction1((t0: Tool) => onChangeTool(t0).runNow()), onChangeValue = js.Any.fromFunction1((t0: Value) => onChangeValue(t0).runNow()), tool = tool.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCustomMiniature(value: Element | ComponentType[js.Object]): Self = StObject.set(x, "customMiniature", value.asInstanceOf[js.Any])
      
      inline def setCustomMiniatureUndefined: Self = StObject.set(x, "customMiniature", js.undefined)
      
      inline def setCustomMiniatureVdomElement(value: VdomElement): Self = StObject.set(x, "customMiniature", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCustomToolbar(
        value: (japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object]) | FunctionComponent[Any]
      ): Self = StObject.set(x, "customToolbar", value.asInstanceOf[js.Any])
      
      inline def setCustomToolbarUndefined: Self = StObject.set(x, "customToolbar", js.undefined)
      
      inline def setDefaultTool(value: Exclude[Tool, /* "auto" */ String]): Self = StObject.set(x, "defaultTool", value.asInstanceOf[js.Any])
      
      inline def setDefaultToolUndefined: Self = StObject.set(x, "defaultTool", js.undefined)
      
      inline def setDetectAutoPan(value: Boolean): Self = StObject.set(x, "detectAutoPan", value.asInstanceOf[js.Any])
      
      inline def setDetectAutoPanUndefined: Self = StObject.set(x, "detectAutoPan", js.undefined)
      
      inline def setDetectPinchGesture(value: Boolean): Self = StObject.set(x, "detectPinchGesture", value.asInstanceOf[js.Any])
      
      inline def setDetectPinchGestureUndefined: Self = StObject.set(x, "detectPinchGesture", js.undefined)
      
      inline def setDetectWheel(value: Boolean): Self = StObject.set(x, "detectWheel", value.asInstanceOf[js.Any])
      
      inline def setDetectWheelUndefined: Self = StObject.set(x, "detectWheel", js.undefined)
      
      inline def setDisableDoubleClickZoomWithToolAuto(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoomWithToolAuto", value.asInstanceOf[js.Any])
      
      inline def setDisableDoubleClickZoomWithToolAutoUndefined: Self = StObject.set(x, "disableDoubleClickZoomWithToolAuto", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMiniatureProps(value: Background): Self = StObject.set(x, "miniatureProps", value.asInstanceOf[js.Any])
      
      inline def setMiniaturePropsUndefined: Self = StObject.set(x, "miniatureProps", js.undefined)
      
      inline def setModifierKeys(value: js.Array[String]): Self = StObject.set(x, "modifierKeys", value.asInstanceOf[js.Any])
      
      inline def setModifierKeysUndefined: Self = StObject.set(x, "modifierKeys", js.undefined)
      
      inline def setModifierKeysVarargs(value: String*): Self = StObject.set(x, "modifierKeys", js.Array(value*))
      
      inline def setOnChangeTool(value: Tool => Callback): Self = StObject.set(x, "onChangeTool", js.Any.fromFunction1((t0: Tool) => value(t0).runNow()))
      
      inline def setOnChangeValue(value: Value => Callback): Self = StObject.set(x, "onChangeValue", js.Any.fromFunction1((t0: Value) => value(t0).runNow()))
      
      inline def setOnClick(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDoubleClick(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnMouseDown(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseMove(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseUp(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPan(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onPan", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
      
      inline def setOnZoom(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onZoom", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
      
      inline def setPreventPanOutside(value: Boolean): Self = StObject.set(x, "preventPanOutside", value.asInstanceOf[js.Any])
      
      inline def setPreventPanOutsideUndefined: Self = StObject.set(x, "preventPanOutside", js.undefined)
      
      inline def setSVGBackground(value: String): Self = StObject.set(x, "SVGBackground", value.asInstanceOf[js.Any])
      
      inline def setSVGBackgroundUndefined: Self = StObject.set(x, "SVGBackground", js.undefined)
      
      inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorMax(value: Double): Self = StObject.set(x, "scaleFactorMax", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorMaxUndefined: Self = StObject.set(x, "scaleFactorMax", js.undefined)
      
      inline def setScaleFactorMin(value: Double): Self = StObject.set(x, "scaleFactorMin", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorMinUndefined: Self = StObject.set(x, "scaleFactorMin", js.undefined)
      
      inline def setScaleFactorOnWheel(value: Double): Self = StObject.set(x, "scaleFactorOnWheel", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorOnWheelUndefined: Self = StObject.set(x, "scaleFactorOnWheel", js.undefined)
      
      inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      inline def setToolbarProps(value: Position): Self = StObject.set(x, "toolbarProps", value.asInstanceOf[js.Any])
      
      inline def setToolbarPropsUndefined: Self = StObject.set(x, "toolbarProps", js.undefined)
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequiredProps extends StObject {
    
    var children: Element
    
    // height of the viewer displayed on screen
    var height: Double
    
    // handler tool changed
    def onChangeTool(tool: Tool): Unit
    
    // handler something changed
    def onChangeValue(value: Value): Unit
    
    // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
    var tool: Tool
    
    // value of the viewer (current point of view)
    var value: Value | Null
    
    // width of the viewer displayed on screen
    var width: Double
  }
  object RequiredProps {
    
    inline def apply(
      children: VdomElement,
      height: Double,
      onChangeTool: Tool => Callback,
      onChangeValue: Value => Callback,
      tool: Tool,
      width: Double
    ): RequiredProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onChangeTool = js.Any.fromFunction1((t0: Tool) => onChangeTool(t0).runNow()), onChangeValue = js.Any.fromFunction1((t0: Value) => onChangeValue(t0).runNow()), tool = tool.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[RequiredProps]
    }
    
    extension [Self <: RequiredProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOnChangeTool(value: Tool => Callback): Self = StObject.set(x, "onChangeTool", js.Any.fromFunction1((t0: Tool) => value(t0).runNow()))
      
      inline def setOnChangeValue(value: Value => Callback): Self = StObject.set(x, "onChangeValue", js.Any.fromFunction1((t0: Value) => value(t0).runNow()))
      
      inline def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type Tool = /* "auto" */ String
  
  type ToolbarPosition = /* "none" */ String
  
  trait UncontrolledExtraOptionalProps extends StObject {
    
    // handler tool changed
    def onChangeTool(tool: Tool): Unit
    
    // handler something changed
    def onChangeValue(value: Value): Unit
    
    // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
    var tool: Tool
    
    // value of the viewer (current point of view)
    var value: Value | Null
  }
  object UncontrolledExtraOptionalProps {
    
    inline def apply(onChangeTool: Tool => Callback, onChangeValue: Value => Callback, tool: Tool): UncontrolledExtraOptionalProps = {
      val __obj = js.Dynamic.literal(onChangeTool = js.Any.fromFunction1((t0: Tool) => onChangeTool(t0).runNow()), onChangeValue = js.Any.fromFunction1((t0: Value) => onChangeValue(t0).runNow()), tool = tool.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[UncontrolledExtraOptionalProps]
    }
    
    extension [Self <: UncontrolledExtraOptionalProps](x: Self) {
      
      inline def setOnChangeTool(value: Tool => Callback): Self = StObject.set(x, "onChangeTool", js.Any.fromFunction1((t0: Tool) => value(t0).runNow()))
      
      inline def setOnChangeValue(value: Value => Callback): Self = StObject.set(x, "onChangeValue", js.Any.fromFunction1((t0: Value) => value(t0).runNow()))
      
      inline def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  /* Inlined react-svg-pan-zoom.react-svg-pan-zoom.UncontrolledRequiredProps & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.OptionalProps> & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.UncontrolledExtraOptionalProps> */
  trait UncontrolledProps extends StObject {
    
    var SVGBackground: js.UndefOr[String] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var children: Element
    
    var className: js.UndefOr[String] = js.undefined
    
    var customMiniature: js.UndefOr[Element | ComponentType[js.Object]] = js.undefined
    
    var customToolbar: js.UndefOr[
        (japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object]) | FunctionComponent[Any]
      ] = js.undefined
    
    var defaultTool: js.UndefOr[Exclude[Tool, /* "auto" */ String]] = js.undefined
    
    var detectAutoPan: js.UndefOr[Boolean] = js.undefined
    
    var detectPinchGesture: js.UndefOr[Boolean] = js.undefined
    
    var detectWheel: js.UndefOr[Boolean] = js.undefined
    
    var disableDoubleClickZoomWithToolAuto: js.UndefOr[Boolean] = js.undefined
    
    // height of the viewer displayed on screen
    var height: Double
    
    var miniatureProps: js.UndefOr[Background] = js.undefined
    
    var modifierKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var onChangeTool: js.UndefOr[js.Function1[/* tool */ Tool, Unit]] = js.undefined
    
    var onChangeValue: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onDoubleClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onMouseMove: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onMouseUp: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onPan: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var onZoom: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[Any], Unit]] = js.undefined
    
    var preventPanOutside: js.UndefOr[Boolean] = js.undefined
    
    var scaleFactor: js.UndefOr[Double] = js.undefined
    
    var scaleFactorMax: js.UndefOr[Double] = js.undefined
    
    var scaleFactorMin: js.UndefOr[Double] = js.undefined
    
    var scaleFactorOnWheel: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tool: js.UndefOr[Tool] = js.undefined
    
    var toolbarProps: js.UndefOr[Position] = js.undefined
    
    var value: js.UndefOr[Value | Null] = js.undefined
    
    // width of the viewer displayed on screen
    var width: Double
  }
  object UncontrolledProps {
    
    inline def apply(children: VdomElement, height: Double, width: Double): UncontrolledProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledProps]
    }
    
    extension [Self <: UncontrolledProps](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCustomMiniature(value: Element | ComponentType[js.Object]): Self = StObject.set(x, "customMiniature", value.asInstanceOf[js.Any])
      
      inline def setCustomMiniatureUndefined: Self = StObject.set(x, "customMiniature", js.undefined)
      
      inline def setCustomMiniatureVdomElement(value: VdomElement): Self = StObject.set(x, "customMiniature", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCustomToolbar(
        value: (japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object]) | FunctionComponent[Any]
      ): Self = StObject.set(x, "customToolbar", value.asInstanceOf[js.Any])
      
      inline def setCustomToolbarUndefined: Self = StObject.set(x, "customToolbar", js.undefined)
      
      inline def setDefaultTool(value: Exclude[Tool, /* "auto" */ String]): Self = StObject.set(x, "defaultTool", value.asInstanceOf[js.Any])
      
      inline def setDefaultToolUndefined: Self = StObject.set(x, "defaultTool", js.undefined)
      
      inline def setDetectAutoPan(value: Boolean): Self = StObject.set(x, "detectAutoPan", value.asInstanceOf[js.Any])
      
      inline def setDetectAutoPanUndefined: Self = StObject.set(x, "detectAutoPan", js.undefined)
      
      inline def setDetectPinchGesture(value: Boolean): Self = StObject.set(x, "detectPinchGesture", value.asInstanceOf[js.Any])
      
      inline def setDetectPinchGestureUndefined: Self = StObject.set(x, "detectPinchGesture", js.undefined)
      
      inline def setDetectWheel(value: Boolean): Self = StObject.set(x, "detectWheel", value.asInstanceOf[js.Any])
      
      inline def setDetectWheelUndefined: Self = StObject.set(x, "detectWheel", js.undefined)
      
      inline def setDisableDoubleClickZoomWithToolAuto(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoomWithToolAuto", value.asInstanceOf[js.Any])
      
      inline def setDisableDoubleClickZoomWithToolAutoUndefined: Self = StObject.set(x, "disableDoubleClickZoomWithToolAuto", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMiniatureProps(value: Background): Self = StObject.set(x, "miniatureProps", value.asInstanceOf[js.Any])
      
      inline def setMiniaturePropsUndefined: Self = StObject.set(x, "miniatureProps", js.undefined)
      
      inline def setModifierKeys(value: js.Array[String]): Self = StObject.set(x, "modifierKeys", value.asInstanceOf[js.Any])
      
      inline def setModifierKeysUndefined: Self = StObject.set(x, "modifierKeys", js.undefined)
      
      inline def setModifierKeysVarargs(value: String*): Self = StObject.set(x, "modifierKeys", js.Array(value*))
      
      inline def setOnChangeTool(value: /* tool */ Tool => Callback): Self = StObject.set(x, "onChangeTool", js.Any.fromFunction1((t0: /* tool */ Tool) => value(t0).runNow()))
      
      inline def setOnChangeToolUndefined: Self = StObject.set(x, "onChangeTool", js.undefined)
      
      inline def setOnChangeValue(value: /* value */ Value => Callback): Self = StObject.set(x, "onChangeValue", js.Any.fromFunction1((t0: /* value */ Value) => value(t0).runNow()))
      
      inline def setOnChangeValueUndefined: Self = StObject.set(x, "onChangeValue", js.undefined)
      
      inline def setOnClick(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDoubleClick(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnMouseDown(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseMove(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseUp(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPan(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onPan", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
      
      inline def setOnZoom(value: /* event */ ViewerMouseEvent[Any] => Callback): Self = StObject.set(x, "onZoom", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
      
      inline def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
      
      inline def setPreventPanOutside(value: Boolean): Self = StObject.set(x, "preventPanOutside", value.asInstanceOf[js.Any])
      
      inline def setPreventPanOutsideUndefined: Self = StObject.set(x, "preventPanOutside", js.undefined)
      
      inline def setSVGBackground(value: String): Self = StObject.set(x, "SVGBackground", value.asInstanceOf[js.Any])
      
      inline def setSVGBackgroundUndefined: Self = StObject.set(x, "SVGBackground", js.undefined)
      
      inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorMax(value: Double): Self = StObject.set(x, "scaleFactorMax", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorMaxUndefined: Self = StObject.set(x, "scaleFactorMax", js.undefined)
      
      inline def setScaleFactorMin(value: Double): Self = StObject.set(x, "scaleFactorMin", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorMinUndefined: Self = StObject.set(x, "scaleFactorMin", js.undefined)
      
      inline def setScaleFactorOnWheel(value: Double): Self = StObject.set(x, "scaleFactorOnWheel", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorOnWheelUndefined: Self = StObject.set(x, "scaleFactorOnWheel", js.undefined)
      
      inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      inline def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
      
      inline def setToolbarProps(value: Position): Self = StObject.set(x, "toolbarProps", value.asInstanceOf[js.Any])
      
      inline def setToolbarPropsUndefined: Self = StObject.set(x, "toolbarProps", js.undefined)
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait UncontrolledRequiredProps extends StObject {
    
    var children: Element
    
    // height of the viewer displayed on screen
    var height: Double
    
    // width of the viewer displayed on screen
    var width: Double
  }
  object UncontrolledRequiredProps {
    
    inline def apply(children: VdomElement, height: Double, width: Double): UncontrolledRequiredProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledRequiredProps]
    }
    
    extension [Self <: UncontrolledRequiredProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var SVGHeight: Double
    
    var SVGWidth: Double
    
    var a: Double
    
    var b: Double
    
    var c: Double
    
    var d: Double
    
    var e: Double
    
    var endX: js.UndefOr[Double | Null] = js.undefined
    
    var endY: js.UndefOr[Double | Null] = js.undefined
    
    var f: Double
    
    var focus: Boolean
    
    var miniatureOpen: Boolean
    
    var mode: Mode
    
    var startX: js.UndefOr[Double | Null] = js.undefined
    
    var startY: js.UndefOr[Double | Null] = js.undefined
    
    var version: `2`
    
    var viewerHeight: Double
    
    var viewerWidth: Double
  }
  object Value {
    
    inline def apply(
      SVGHeight: Double,
      SVGWidth: Double,
      a: Double,
      b: Double,
      c: Double,
      d: Double,
      e: Double,
      f: Double,
      focus: Boolean,
      miniatureOpen: Boolean,
      mode: Mode,
      viewerHeight: Double,
      viewerWidth: Double
    ): Value = {
      val __obj = js.Dynamic.literal(SVGHeight = SVGHeight.asInstanceOf[js.Any], SVGWidth = SVGWidth.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], miniatureOpen = miniatureOpen.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], version = 2, viewerHeight = viewerHeight.asInstanceOf[js.Any], viewerWidth = viewerWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEndX(value: Double): Self = StObject.set(x, "endX", value.asInstanceOf[js.Any])
      
      inline def setEndXNull: Self = StObject.set(x, "endX", null)
      
      inline def setEndXUndefined: Self = StObject.set(x, "endX", js.undefined)
      
      inline def setEndY(value: Double): Self = StObject.set(x, "endY", value.asInstanceOf[js.Any])
      
      inline def setEndYNull: Self = StObject.set(x, "endY", null)
      
      inline def setEndYUndefined: Self = StObject.set(x, "endY", js.undefined)
      
      inline def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setMiniatureOpen(value: Boolean): Self = StObject.set(x, "miniatureOpen", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setSVGHeight(value: Double): Self = StObject.set(x, "SVGHeight", value.asInstanceOf[js.Any])
      
      inline def setSVGWidth(value: Double): Self = StObject.set(x, "SVGWidth", value.asInstanceOf[js.Any])
      
      inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      inline def setStartXNull: Self = StObject.set(x, "startX", null)
      
      inline def setStartXUndefined: Self = StObject.set(x, "startX", js.undefined)
      
      inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
      
      inline def setStartYNull: Self = StObject.set(x, "startY", null)
      
      inline def setStartYUndefined: Self = StObject.set(x, "startY", js.undefined)
      
      inline def setVersion(value: `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setViewerHeight(value: Double): Self = StObject.set(x, "viewerHeight", value.asInstanceOf[js.Any])
      
      inline def setViewerWidth(value: Double): Self = StObject.set(x, "viewerWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewerMouseEvent[T] extends StObject {
    
    var SVGViewer: SVGSVGElement
    
    var originalEvent: ReactMouseEventFrom[T & org.scalajs.dom.Element]
    
    var point: Point
    
    def preventDefault(): Unit
    
    var scaleFactor: Double
    
    def stopPropagation(): Unit
    
    var translationX: Double
    
    var translationY: Double
    
    var x: Double
    
    var y: Double
  }
  object ViewerMouseEvent {
    
    inline def apply[T](
      SVGViewer: SVGSVGElement,
      originalEvent: ReactMouseEventFrom[T & org.scalajs.dom.Element],
      point: Point,
      preventDefault: Callback,
      scaleFactor: Double,
      stopPropagation: Callback,
      translationX: Double,
      translationY: Double,
      x: Double,
      y: Double
    ): ViewerMouseEvent[T] = {
      val __obj = js.Dynamic.literal(SVGViewer = SVGViewer.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, scaleFactor = scaleFactor.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewerMouseEvent[T]]
    }
    
    extension [Self <: ViewerMouseEvent[?], T](x: Self & ViewerMouseEvent[T]) {
      
      inline def setOriginalEvent(value: ReactMouseEventFrom[T & org.scalajs.dom.Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setSVGViewer(value: SVGSVGElement): Self = StObject.set(x, "SVGViewer", value.asInstanceOf[js.Any])
      
      inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setTranslationX(value: Double): Self = StObject.set(x, "translationX", value.asInstanceOf[js.Any])
      
      inline def setTranslationY(value: Double): Self = StObject.set(x, "translationY", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewerTouchEvent[T] extends StObject {
    
    var SVGViewer: SVGSVGElement
    
    var changedPoints: js.Array[Point]
    
    var originalEvent: ReactTouchEventFrom[T & org.scalajs.dom.Element]
    
    var points: js.Array[Point]
    
    def preventDefault(): Unit
    
    var scaleFactor: Double
    
    def stopPropagation(): Unit
    
    var translationX: Double
    
    var translationY: Double
  }
  object ViewerTouchEvent {
    
    inline def apply[T](
      SVGViewer: SVGSVGElement,
      changedPoints: js.Array[Point],
      originalEvent: ReactTouchEventFrom[T & org.scalajs.dom.Element],
      points: js.Array[Point],
      preventDefault: Callback,
      scaleFactor: Double,
      stopPropagation: Callback,
      translationX: Double,
      translationY: Double
    ): ViewerTouchEvent[T] = {
      val __obj = js.Dynamic.literal(SVGViewer = SVGViewer.asInstanceOf[js.Any], changedPoints = changedPoints.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, scaleFactor = scaleFactor.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewerTouchEvent[T]]
    }
    
    extension [Self <: ViewerTouchEvent[?], T](x: Self & ViewerTouchEvent[T]) {
      
      inline def setChangedPoints(value: js.Array[Point]): Self = StObject.set(x, "changedPoints", value.asInstanceOf[js.Any])
      
      inline def setChangedPointsVarargs(value: Point*): Self = StObject.set(x, "changedPoints", js.Array(value*))
      
      inline def setOriginalEvent(value: ReactTouchEventFrom[T & org.scalajs.dom.Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setSVGViewer(value: SVGSVGElement): Self = StObject.set(x, "SVGViewer", value.asInstanceOf[js.Any])
      
      inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setTranslationX(value: Double): Self = StObject.set(x, "translationX", value.asInstanceOf[js.Any])
      
      inline def setTranslationY(value: Double): Self = StObject.set(x, "translationY", value.asInstanceOf[js.Any])
    }
  }
}
