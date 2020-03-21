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

trait OptionalProps extends js.Object {
  // background of the svg
  var SVGBackground: String
  // background of the viewer
  var background: String
  // className of the Viewer
  var className: String
  var customMiniature: Element | ComponentType[js.Object]
  // override default toolbar component
  // TODO: specify function type more clearly
  var customToolbar: (Component[js.Object, js.Object]) | StatelessComponent[_]
  // perform PAN if the mouse is on viewer border
  var detectAutoPan: Boolean
  var detectPinchGesture: Boolean
  // detect zoom operation performed trough pinch gesture or mouse scroll
  var detectWheel: Boolean
  // Turn off zoom on double click
  var disableDoubleClickZoomWithToolAuto: Boolean
  var miniatureProps: AnonBackground
  // modifier keys //https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/getModifierState
  var modifierKeys: js.Array[String]
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
  var toolbarProps: AnonPosition
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
}

object OptionalProps {
  @scala.inline
  def apply(
    SVGBackground: String,
    background: String,
    className: String,
    customMiniature: Element | ComponentType[js.Object],
    customToolbar: (Component[js.Object, js.Object]) | StatelessComponent[_],
    detectAutoPan: Boolean,
    detectPinchGesture: Boolean,
    detectWheel: Boolean,
    disableDoubleClickZoomWithToolAuto: Boolean,
    miniatureProps: AnonBackground,
    modifierKeys: js.Array[String],
    onClick: ViewerMouseEvent[js.Any] => Callback,
    onDoubleClick: ViewerMouseEvent[js.Any] => Callback,
    onMouseDown: ViewerMouseEvent[js.Any] => Callback,
    onMouseMove: ViewerMouseEvent[js.Any] => Callback,
    onMouseUp: ViewerMouseEvent[js.Any] => Callback,
    onPan: ViewerMouseEvent[js.Any] => Callback,
    onZoom: ViewerMouseEvent[js.Any] => Callback,
    preventPanOutside: Boolean,
    scaleFactor: Double,
    scaleFactorMax: Double,
    scaleFactorMin: Double,
    scaleFactorOnWheel: Double,
    style: js.Object,
    toolbarProps: AnonPosition
  ): OptionalProps = {
    val __obj = js.Dynamic.literal(SVGBackground = SVGBackground.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], customMiniature = customMiniature.asInstanceOf[js.Any], customToolbar = customToolbar.asInstanceOf[js.Any], detectAutoPan = detectAutoPan.asInstanceOf[js.Any], detectPinchGesture = detectPinchGesture.asInstanceOf[js.Any], detectWheel = detectWheel.asInstanceOf[js.Any], disableDoubleClickZoomWithToolAuto = disableDoubleClickZoomWithToolAuto.asInstanceOf[js.Any], miniatureProps = miniatureProps.asInstanceOf[js.Any], modifierKeys = modifierKeys.asInstanceOf[js.Any], preventPanOutside = preventPanOutside.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], scaleFactorMax = scaleFactorMax.asInstanceOf[js.Any], scaleFactorMin = scaleFactorMin.asInstanceOf[js.Any], scaleFactorOnWheel = scaleFactorOnWheel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], toolbarProps = toolbarProps.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onClick(t0).runNow()))
    __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onDoubleClick(t0).runNow()))
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onMouseMove(t0).runNow()))
    __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onMouseUp(t0).runNow()))
    __obj.updateDynamic("onPan")(js.Any.fromFunction1((t0: typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onPan(t0).runNow()))
    __obj.updateDynamic("onZoom")(js.Any.fromFunction1((t0: typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent[js.Any]) => onZoom(t0).runNow()))
    __obj.asInstanceOf[OptionalProps]
  }
}

