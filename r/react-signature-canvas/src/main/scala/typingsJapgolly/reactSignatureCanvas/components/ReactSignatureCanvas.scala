package typingsJapgolly.reactSignatureCanvas.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.CanvasHTMLAttributes
import typingsJapgolly.reactSignatureCanvas.mod.ReactSignatureCanvasProps
import typingsJapgolly.reactSignatureCanvas.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSignatureCanvas {
  def apply(
    backgroundColor: String = null,
    canvasProps: CanvasHTMLAttributes[HTMLCanvasElement] = null,
    clearOnResize: js.UndefOr[Boolean] = js.undefined,
    dotSize: Double | js.Function0[Double] = null,
    maxWidth: Int | Double = null,
    minDistance: Int | Double = null,
    minWidth: Int | Double = null,
    onBegin: /* event */ MouseEvent => Callback = null,
    onEnd: /* event */ MouseEvent => Callback = null,
    penColor: String = null,
    throttle: Int | Double = null,
    velocityFilterWeight: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactSignatureCanvasProps, default, Unit, ReactSignatureCanvasProps] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (canvasProps != null) __obj.updateDynamic("canvasProps")(canvasProps.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnResize)) __obj.updateDynamic("clearOnResize")(clearOnResize.asInstanceOf[js.Any])
    if (dotSize != null) __obj.updateDynamic("dotSize")(dotSize.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minDistance != null) __obj.updateDynamic("minDistance")(minDistance.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onBegin != null) __obj.updateDynamic("onBegin")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onBegin(t0).runNow()))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onEnd(t0).runNow()))
    if (penColor != null) __obj.updateDynamic("penColor")(penColor.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (velocityFilterWeight != null) __obj.updateDynamic("velocityFilterWeight")(velocityFilterWeight.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSignatureCanvas.mod.ReactSignatureCanvasProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSignatureCanvas.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSignatureCanvas.mod.ReactSignatureCanvasProps])(children: _*)
  }
  @JSImport("react-signature-canvas", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

