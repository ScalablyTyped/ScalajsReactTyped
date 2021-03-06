package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.baseMod.BaseType
import typingsJapgolly.antd.baseMod.BlockProps
import typingsJapgolly.antd.baseMod.CopyConfig
import typingsJapgolly.antd.baseMod.EditConfig
import typingsJapgolly.antd.baseMod.EllipsisConfig
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Paragraph {
  def apply(
    `aria-label`: String = null,
    className: String = null,
    code: js.UndefOr[Boolean] = js.undefined,
    copyable: Boolean | CopyConfig = null,
    delete: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: Boolean | EditConfig = null,
    ellipsis: Boolean | EllipsisConfig = null,
    id: String = null,
    mark: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    strong: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: String = null,
    `type`: BaseType = null,
    underline: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    BlockProps, 
    MountedWithRawType[BlockProps, js.Object, RawMounted[BlockProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (copyable != null) __obj.updateDynamic("copyable")(copyable.asInstanceOf[js.Any])
    if (!js.isUndefined(delete)) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(strong)) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.baseMod.BlockProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.baseMod.BlockProps])(children: _*)
  }
  @JSImport("antd/lib/typography/Paragraph", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

