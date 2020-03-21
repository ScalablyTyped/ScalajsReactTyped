package typingsJapgolly.reactCanvasDraw.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactCanvasDraw.mod.CanvasDraw
import typingsJapgolly.reactCanvasDraw.mod.CanvasDrawProps
import typingsJapgolly.reactCanvasDraw.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCanvasDraw {
  def apply(
    backgroundColor: String = null,
    brushColor: String = null,
    brushRadius: Int | Double = null,
    canvasHeight: Double | String = null,
    canvasWidth: Double | String = null,
    catenaryColor: String = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gridColor: String = null,
    hideGrid: js.UndefOr[Boolean] = js.undefined,
    hideInterface: js.UndefOr[Boolean] = js.undefined,
    imgSrc: String = null,
    immediateLoading: js.UndefOr[Boolean] = js.undefined,
    lazyRadius: Int | Double = null,
    loadTimeOffset: Int | Double = null,
    onChange: /* canvas */ CanvasDraw => Callback = null,
    saveData: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CanvasDrawProps, default, Unit, CanvasDrawProps] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (brushColor != null) __obj.updateDynamic("brushColor")(brushColor.asInstanceOf[js.Any])
    if (brushRadius != null) __obj.updateDynamic("brushRadius")(brushRadius.asInstanceOf[js.Any])
    if (canvasHeight != null) __obj.updateDynamic("canvasHeight")(canvasHeight.asInstanceOf[js.Any])
    if (canvasWidth != null) __obj.updateDynamic("canvasWidth")(canvasWidth.asInstanceOf[js.Any])
    if (catenaryColor != null) __obj.updateDynamic("catenaryColor")(catenaryColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (gridColor != null) __obj.updateDynamic("gridColor")(gridColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideGrid)) __obj.updateDynamic("hideGrid")(hideGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(hideInterface)) __obj.updateDynamic("hideInterface")(hideInterface.asInstanceOf[js.Any])
    if (imgSrc != null) __obj.updateDynamic("imgSrc")(imgSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(immediateLoading)) __obj.updateDynamic("immediateLoading")(immediateLoading.asInstanceOf[js.Any])
    if (lazyRadius != null) __obj.updateDynamic("lazyRadius")(lazyRadius.asInstanceOf[js.Any])
    if (loadTimeOffset != null) __obj.updateDynamic("loadTimeOffset")(loadTimeOffset.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* canvas */ typingsJapgolly.reactCanvasDraw.mod.CanvasDraw) => onChange(t0).runNow()))
    if (saveData != null) __obj.updateDynamic("saveData")(saveData.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCanvasDraw.mod.CanvasDrawProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCanvasDraw.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCanvasDraw.mod.CanvasDrawProps])(children: _*)
  }
  @JSImport("react-canvas-draw", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

