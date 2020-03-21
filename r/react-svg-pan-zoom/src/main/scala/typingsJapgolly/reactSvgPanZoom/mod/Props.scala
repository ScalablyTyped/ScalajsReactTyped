package typingsJapgolly.reactSvgPanZoom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactSvgPanZoom.AnonBackground
import typingsJapgolly.reactSvgPanZoom.AnonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-svg-pan-zoom.react-svg-pan-zoom.RequiredProps & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.OptionalProps> */
trait Props extends js.Object {
  var SVGBackground: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var customMiniature: js.UndefOr[Element | ComponentType[js.Object]] = js.undefined
  var customToolbar: js.UndefOr[(Component[js.Object, js.Object]) | StatelessComponent[_]] = js.undefined
  var detectAutoPan: js.UndefOr[Boolean] = js.undefined
  var detectPinchGesture: js.UndefOr[Boolean] = js.undefined
  var detectWheel: js.UndefOr[Boolean] = js.undefined
  var disableDoubleClickZoomWithToolAuto: js.UndefOr[Boolean] = js.undefined
  // height of the viewer displayed on screen
  var height: Double
  var miniatureProps: js.UndefOr[AnonBackground] = js.undefined
  var modifierKeys: js.UndefOr[js.Array[String]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onPan: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onZoom: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var preventPanOutside: js.UndefOr[Boolean] = js.undefined
  var scaleFactor: js.UndefOr[Double] = js.undefined
  var scaleFactorMax: js.UndefOr[Double] = js.undefined
  var scaleFactorMin: js.UndefOr[Double] = js.undefined
  var scaleFactorOnWheel: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
  var tool: Tool
  var toolbarProps: js.UndefOr[AnonPosition] = js.undefined
  // value of the viewer (current point of view)
  var value: Value | Null
  // width of the viewer displayed on screen
  var width: Double
  // handler tool changed
  def onChangeTool(tool: Tool): Unit
  // handler something changed
  def onChangeValue(value: Value): Unit
}

object Props {
  @scala.inline
  def apply(
    height: Double,
    onChangeTool: Tool => Callback,
    onChangeValue: Value => Callback,
    tool: Tool,
    width: Double,
    SVGBackground: String = null,
    background: String = null,
    className: String = null,
    customMiniature: Element | ComponentType[js.Object] = null,
    customToolbar: (Component[js.Object, js.Object]) | StatelessComponent[_] = null,
    detectAutoPan: js.UndefOr[Boolean] = js.undefined,
    detectPinchGesture: js.UndefOr[Boolean] = js.undefined,
    detectWheel: js.UndefOr[Boolean] = js.undefined,
    disableDoubleClickZoomWithToolAuto: js.UndefOr[Boolean] = js.undefined,
    miniatureProps: AnonBackground = null,
    modifierKeys: js.Array[String] = null,
    onClick: /* event */ ViewerMouseEvent[js.Any] => Callback = null,
    onDoubleClick: /* event */ ViewerMouseEvent[js.Any] => Callback = null,
    onMouseDown: /* event */ ViewerMouseEvent[js.Any] => Callback = null,
    onMouseMove: /* event */ ViewerMouseEvent[js.Any] => Callback = null,
    onMouseUp: /* event */ ViewerMouseEvent[js.Any] => Callback = null,
    onPan: /* event */ ViewerMouseEvent[js.Any] => Callback = null,
    onZoom: /* event */ ViewerMouseEvent[js.Any] => Callback = null,
    preventPanOutside: js.UndefOr[Boolean] = js.undefined,
    scaleFactor: Int | Double = null,
    scaleFactorMax: Int | Double = null,
    scaleFactorMin: Int | Double = null,
    scaleFactorOnWheel: Int | Double = null,
    style: js.Object = null,
    toolbarProps: AnonPosition = null,
    value: Value = null
  ): Props = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("onChangeTool")(js.Any.fromFunction1((t0: typingsJapgolly.reactSvgPanZoom.mod.Tool) => onChangeTool(t0).runNow()))
    __obj.updateDynamic("onChangeValue")(js.Any.fromFunction1((t0: typingsJapgolly.reactSvgPanZoom.mod.Value) => onChangeValue(t0).runNow()))
    if (SVGBackground != null) __obj.updateDynamic("SVGBackground")(SVGBackground.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customMiniature != null) __obj.updateDynamic("customMiniature")(customMiniature.asInstanceOf[js.Any])
    if (customToolbar != null) __obj.updateDynamic("customToolbar")(customToolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(detectAutoPan)) __obj.updateDynamic("detectAutoPan")(detectAutoPan.asInstanceOf[js.Any])
    if (!js.isUndefined(detectPinchGesture)) __obj.updateDynamic("detectPinchGesture")(detectPinchGesture.asInstanceOf[js.Any])
    if (!js.isUndefined(detectWheel)) __obj.updateDynamic("detectWheel")(detectWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDoubleClickZoomWithToolAuto)) __obj.updateDynamic("disableDoubleClickZoomWithToolAuto")(disableDoubleClickZoomWithToolAuto.asInstanceOf[js.Any])
    if (miniatureProps != null) __obj.updateDynamic("miniatureProps")(miniatureProps.asInstanceOf[js.Any])
    if (modifierKeys != null) __obj.updateDynamic("modifierKeys")(modifierKeys.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onClick(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onDoubleClick(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onMouseDown(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onMouseMove(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onMouseUp(t0).runNow()))
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onPan(t0).runNow()))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onZoom(t0).runNow()))
    if (!js.isUndefined(preventPanOutside)) __obj.updateDynamic("preventPanOutside")(preventPanOutside.asInstanceOf[js.Any])
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (scaleFactorMax != null) __obj.updateDynamic("scaleFactorMax")(scaleFactorMax.asInstanceOf[js.Any])
    if (scaleFactorMin != null) __obj.updateDynamic("scaleFactorMin")(scaleFactorMin.asInstanceOf[js.Any])
    if (scaleFactorOnWheel != null) __obj.updateDynamic("scaleFactorOnWheel")(scaleFactorOnWheel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (toolbarProps != null) __obj.updateDynamic("toolbarProps")(toolbarProps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

