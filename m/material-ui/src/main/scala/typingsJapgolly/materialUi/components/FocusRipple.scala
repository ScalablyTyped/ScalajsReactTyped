package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.focusRippleMod.FocusRippleProps
import typingsJapgolly.materialUi.focusRippleMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FocusRipple {
  def apply(
    color: String = null,
    innerStyle: CSSProperties = null,
    opacity: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FocusRippleProps, default, Unit, FocusRippleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.focusRippleMod.FocusRippleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.focusRippleMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.focusRippleMod.FocusRippleProps])(children: _*)
  }
  @JSImport("material-ui/internal/FocusRipple", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

