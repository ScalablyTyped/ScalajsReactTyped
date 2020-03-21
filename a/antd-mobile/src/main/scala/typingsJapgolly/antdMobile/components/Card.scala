package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antdMobile.cardMod.CardProps
import typingsJapgolly.antdMobile.cardMod.default
import typingsJapgolly.antdMobile.cardPropsTypeMod.CardPropsType
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    CardPropsType: CardPropsType = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    prefixCls: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardProps, default, Unit, CardProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (CardPropsType != null) js.Dynamic.global.Object.assign(__obj, CardPropsType)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.cardMod.CardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.cardMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.cardMod.CardProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/card", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

