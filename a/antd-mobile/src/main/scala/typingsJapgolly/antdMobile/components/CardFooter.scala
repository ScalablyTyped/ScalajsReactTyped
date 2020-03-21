package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.cardFooterMod.CardFooterProps
import typingsJapgolly.antdMobile.cardFooterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardFooter {
  def apply(
    className: String = null,
    content: VdomNode = null,
    extra: VdomNode = null,
    prefixCls: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardFooterProps, default, Unit, CardFooterProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.cardFooterMod.CardFooterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.cardFooterMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.cardFooterMod.CardFooterProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/card/CardFooter", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

