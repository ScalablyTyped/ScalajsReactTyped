package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.esTypographyTypographyMod.TypographyProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Typography {
  def apply(
    `aria-label`: String = null,
    className: String = null,
    id: String = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TypographyProps, 
    MountedWithRawType[TypographyProps, js.Object, RawMounted[TypographyProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.esTypographyTypographyMod.TypographyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](typingsJapgolly.antd.esTypographyTypographyMod.default)
    f(__obj.asInstanceOf[typingsJapgolly.antd.esTypographyTypographyMod.TypographyProps])(children: _*)
  }
}

