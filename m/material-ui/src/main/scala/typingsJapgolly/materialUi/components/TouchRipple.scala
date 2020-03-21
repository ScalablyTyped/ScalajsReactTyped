package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.touchRippleMod.TouchRippleProps
import typingsJapgolly.materialUi.touchRippleMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TouchRipple {
  def apply(
    abortOnScroll: js.UndefOr[Boolean] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    opacity: Int | Double = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TouchRippleProps, default, Unit, TouchRippleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(abortOnScroll)) __obj.updateDynamic("abortOnScroll")(abortOnScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.touchRippleMod.TouchRippleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.touchRippleMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.touchRippleMod.TouchRippleProps])(children: _*)
  }
  @JSImport("material-ui/internal/TouchRipple", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

