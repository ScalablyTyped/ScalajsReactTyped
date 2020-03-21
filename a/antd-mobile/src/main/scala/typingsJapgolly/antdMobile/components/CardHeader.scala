package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.cardHeaderMod.CardHeaderProps
import typingsJapgolly.antdMobile.cardHeaderMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardHeader {
  def apply(
    className: String = null,
    extra: VdomNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    thumb: VdomNode = null,
    thumbStyle: CSSProperties = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardHeaderProps, default, Unit, CardHeaderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.rawNode.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.cardHeaderMod.CardHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.cardHeaderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.cardHeaderMod.CardHeaderProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/card/CardHeader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

