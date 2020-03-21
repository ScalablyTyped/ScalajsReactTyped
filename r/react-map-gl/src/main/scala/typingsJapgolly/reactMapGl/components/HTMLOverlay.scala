package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMapGl.mod.HTMLOverlayProps
import typingsJapgolly.reactMapGl.mod.HTMLRedrawOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HTMLOverlay {
  def apply(
    redraw: HTMLRedrawOptions => Callback,
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HTMLOverlayProps, typingsJapgolly.reactMapGl.mod.HTMLOverlay, Unit, HTMLOverlayProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("redraw")(js.Any.fromFunction1((t0: typingsJapgolly.reactMapGl.mod.HTMLRedrawOptions) => redraw(t0).runNow()))
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMapGl.mod.HTMLOverlayProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMapGl.mod.HTMLOverlay](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMapGl.mod.HTMLOverlayProps])(children: _*)
  }
  @JSImport("react-map-gl", "HTMLOverlay")
  @js.native
  object componentImport extends js.Object
  
}

