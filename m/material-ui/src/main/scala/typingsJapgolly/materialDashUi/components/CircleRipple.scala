package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.internalCircleRippleMod.CircleRippleProps
import typingsJapgolly.materialDashUi.internalCircleRippleMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CircleRipple {
  def apply(
    aborted: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    opacity: Int | Double = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CircleRippleProps, default, Unit, CircleRippleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(aborted)) __obj.updateDynamic("aborted")(aborted.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.internalCircleRippleMod.CircleRippleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.internalCircleRippleMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.internalCircleRippleMod.CircleRippleProps])(children: _*)
  }
  @JSImport("material-ui/internal/CircleRipple", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

