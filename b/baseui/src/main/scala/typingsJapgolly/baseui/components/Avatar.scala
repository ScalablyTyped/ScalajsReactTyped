package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.avatarMod.AvatarOverrides
import typingsJapgolly.baseui.avatarMod.AvatarProps
import typingsJapgolly.baseui.avatarMod.StyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Avatar {
  def apply(
    name: String,
    overrides: AvatarOverrides[StyleProps] = null,
    size: String = null,
    src: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AvatarProps, typingsJapgolly.baseui.avatarMod.Avatar, Unit, AvatarProps] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.avatarMod.AvatarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.avatarMod.Avatar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.avatarMod.AvatarProps])(children: _*)
  }
  @JSImport("baseui/avatar", "Avatar")
  @js.native
  object componentImport extends js.Object
  
}

