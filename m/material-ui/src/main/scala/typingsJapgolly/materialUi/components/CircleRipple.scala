package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.circleRippleMod.CircleRippleProps
import typingsJapgolly.materialUi.circleRippleMod.default
import typingsJapgolly.react.mod.CSSProperties
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
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CircleRippleProps, default, Unit, CircleRippleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(aborted)) __obj.updateDynamic("aborted")(aborted.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.circleRippleMod.CircleRippleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.circleRippleMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.circleRippleMod.CircleRippleProps])(children: _*)
  }
  @JSImport("material-ui/internal/CircleRipple", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

