package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.esListItemMod.ListItemMetaProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ItemMeta {
  def apply(
    avatar: VdomNode = null,
    className: String = null,
    description: VdomNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    /* props */ ListItemMetaProps, 
    MountedWithRawType[
      /* props */ ListItemMetaProps, 
      js.Object, 
      RawMounted[/* props */ ListItemMetaProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (avatar != null) __obj.updateDynamic("avatar")(avatar.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  /* props */ typingsJapgolly.antd.esListItemMod.ListItemMetaProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](typingsJapgolly.antd.esListItemMod.default.asInstanceOf[js.Dynamic].selectDynamic("Meta"))
    f(__obj.asInstanceOf[/* props */ typingsJapgolly.antd.esListItemMod.ListItemMetaProps])(children: _*)
  }
}

