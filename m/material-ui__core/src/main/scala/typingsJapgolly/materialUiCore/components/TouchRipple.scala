package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiCore.touchRippleMod.TouchRippleClassKey
import typingsJapgolly.materialUiCore.touchRippleMod.TouchRippleProps
import typingsJapgolly.materialUiCore.touchRippleMod.default
import typingsJapgolly.materialUiCore.withStylesMod.ClassNameMap
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TouchRipple {
  def apply(
    center: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    classes: Partial[ClassNameMap[TouchRippleClassKey]] = null,
    innerRef: Ref | RefHandle[_] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TouchRippleProps, default, Unit, TouchRippleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.touchRippleMod.TouchRippleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.touchRippleMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.touchRippleMod.TouchRippleProps])(children: _*)
  }
  @JSImport("@material-ui/core/ButtonBase/TouchRipple", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

