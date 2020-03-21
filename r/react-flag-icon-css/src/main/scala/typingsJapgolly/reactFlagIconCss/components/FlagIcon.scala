package typingsJapgolly.reactFlagIconCss.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFlagIconCss.mod.FlagIconFlip
import typingsJapgolly.reactFlagIconCss.mod.FlagIconProps
import typingsJapgolly.reactFlagIconCss.mod.FlagIconRotate
import typingsJapgolly.reactFlagIconCss.mod.FlagIconSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FlagIcon {
  def apply(
    code: String,
    Component: String = null,
    className: String = null,
    flip: FlagIconFlip = null,
    rotate: FlagIconRotate = null,
    size: FlagIconSize = null,
    squared: js.UndefOr[Boolean] = js.undefined,
    styleName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FlagIconProps, typingsJapgolly.reactFlagIconCss.mod.FlagIcon, Unit, FlagIconProps] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
      if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(squared)) __obj.updateDynamic("squared")(squared.asInstanceOf[js.Any])
    if (styleName != null) __obj.updateDynamic("styleName")(styleName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFlagIconCss.mod.FlagIconProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFlagIconCss.mod.FlagIcon](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFlagIconCss.mod.FlagIconProps])(children: _*)
  }
  @JSImport("react-flag-icon-css", "FlagIcon")
  @js.native
  object componentImport extends js.Object
  
}

