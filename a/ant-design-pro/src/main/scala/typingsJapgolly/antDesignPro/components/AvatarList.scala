package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.avatarItemMod.SizeType
import typingsJapgolly.antDesignPro.avatarListMod.AvatarListProps
import typingsJapgolly.antDesignPro.avatarListMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AvatarList {
  def apply(
    Item: VdomElement = null,
    excessItemsStyle: CSSProperties = null,
    maxLength: Int | Double = null,
    size: SizeType = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Array[Element]
  ): UnmountedWithRoot[AvatarListProps, default, Unit, AvatarListProps] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (Item != null) __obj.updateDynamic("Item")(Item.rawElement.asInstanceOf[js.Any])
    if (excessItemsStyle != null) __obj.updateDynamic("excessItemsStyle")(excessItemsStyle.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.avatarListMod.AvatarListProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antDesignPro.avatarListMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.avatarListMod.AvatarListProps])
  }
  @JSImport("ant-design-pro/lib/AvatarList", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

