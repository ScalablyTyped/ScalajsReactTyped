package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.avatarItemMod.AvatarItemProps
import typingsJapgolly.antDesignPro.avatarItemMod.SizeType
import typingsJapgolly.antDesignPro.avatarItemMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AvatarItem {
  def apply(
    src: String,
    onClick: js.UndefOr[Callback] = js.undefined,
    size: SizeType = null,
    style: CSSProperties = null,
    tips: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AvatarItemProps, default, Unit, AvatarItemProps] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tips != null) __obj.updateDynamic("tips")(tips.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.avatarItemMod.AvatarItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.avatarItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.avatarItemMod.AvatarItemProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/AvatarList/AvatarItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

