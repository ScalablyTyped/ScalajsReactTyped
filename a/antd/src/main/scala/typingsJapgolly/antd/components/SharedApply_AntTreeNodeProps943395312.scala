package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps
import typingsJapgolly.antd.libTreeTreeMod.AntdTreeNodeAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_AntTreeNodeProps943395312 () {
  val componentImport: js.Any
  def apply(
    StringDictionary: /* customProp */ StringDictionary[js.Any] = null,
    checkable: js.UndefOr[Boolean] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    eventKey: String = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    icon: (js.Function1[/* treeNode */ AntdTreeNodeAttribute, Node]) | Node = null,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    title: String | Node = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    AntTreeNodeProps, 
    MountedWithRawType[AntTreeNodeProps, js.Object, RawMounted[AntTreeNodeProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps])(children: _*)
  }
}

