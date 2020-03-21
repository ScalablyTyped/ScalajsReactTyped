package typingsJapgolly.reactSvgPanZoom.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactSvgPanZoom.AnonBackground
import typingsJapgolly.reactSvgPanZoom.AnonPosition
import typingsJapgolly.reactSvgPanZoom.mod.Tool
import typingsJapgolly.reactSvgPanZoom.mod.UncontrolledProps
import typingsJapgolly.reactSvgPanZoom.mod.Value
import typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UncontrolledReactSVGPanZoom {
  def apply(
    height: Double,
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
    onChangeTool: /* tool */ Tool => Callback = null,
    onChangeValue: /* value */ Value => Callback = null,
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
    tool: Tool = null,
    toolbarProps: AnonPosition = null,
    value: Value = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    UncontrolledProps, 
    typingsJapgolly.reactSvgPanZoom.mod.UncontrolledReactSVGPanZoom, 
    Unit, 
    UncontrolledProps
  ] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
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
    if (onChangeTool != null) __obj.updateDynamic("onChangeTool")(js.Any.fromFunction1((t0: /* tool */ typingsJapgolly.reactSvgPanZoom.mod.Tool) => onChangeTool(t0).runNow()))
    if (onChangeValue != null) __obj.updateDynamic("onChangeValue")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.reactSvgPanZoom.mod.Value) => onChangeValue(t0).runNow()))
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
    if (tool != null) __obj.updateDynamic("tool")(tool.asInstanceOf[js.Any])
    if (toolbarProps != null) __obj.updateDynamic("toolbarProps")(toolbarProps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSvgPanZoom.mod.UncontrolledProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSvgPanZoom.mod.UncontrolledReactSVGPanZoom](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSvgPanZoom.mod.UncontrolledProps])(children: _*)
  }
  @JSImport("react-svg-pan-zoom", "UncontrolledReactSVGPanZoom")
  @js.native
  object componentImport extends js.Object
  
}

