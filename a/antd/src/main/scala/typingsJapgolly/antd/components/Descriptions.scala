package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.PartialRecordBreakpointnumber
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.middle
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.vertical
import typingsJapgolly.antd.esDescriptionsMod.DescriptionsProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Descriptions {
  def apply(
    bordered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    colon: js.UndefOr[Boolean] = js.undefined,
    column: Double | PartialRecordBreakpointnumber = null,
    layout: horizontal | vertical = null,
    prefixCls: String = null,
    size: middle | small | default = null,
    style: CSSProperties = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DescriptionsProps, 
    typingsJapgolly.antd.esDescriptionsMod.default, 
    Unit, 
    DescriptionsProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.esDescriptionsMod.DescriptionsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.esDescriptionsMod.default](js.constructorOf[typingsJapgolly.antd.esDescriptionsMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.antd.esDescriptionsMod.DescriptionsProps])(children: _*)
  }
}

