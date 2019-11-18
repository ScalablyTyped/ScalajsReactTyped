package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.antdStrings.center
import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.left
import typingsJapgolly.antd.antdStrings.right
import typingsJapgolly.antd.antdStrings.vertical
import typingsJapgolly.antd.esDividerMod.DividerProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Divider {
  def apply(
    className: String = null,
    dashed: js.UndefOr[Boolean] = js.undefined,
    orientation: left | right | center = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    `type`: horizontal | vertical = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    DividerProps, 
    MountedWithRawType[DividerProps, js.Object, RawMounted[DividerProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dashed)) __obj.updateDynamic("dashed")(dashed.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.esDividerMod.DividerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](typingsJapgolly.antd.esDividerMod.default)
    f(__obj.asInstanceOf[typingsJapgolly.antd.esDividerMod.DividerProps])(children: _*)
  }
}

