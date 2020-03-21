package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.antdMobileStrings.ghost
import typingsJapgolly.antdMobile.antdMobileStrings.primary
import typingsJapgolly.antdMobile.resultMod.ResultProps
import typingsJapgolly.antdMobile.resultMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Result {
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    className: String = null,
    img: VdomNode = null,
    imgUrl: String = null,
    message: VdomNode = null,
    onButtonClick: js.UndefOr[Callback] = js.undefined,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ResultProps, default, Unit, ResultProps] = {
    val __obj = js.Dynamic.literal()
  
      if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.rawNode.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    onButtonClick.foreach(p => __obj.updateDynamic("onButtonClick")(p.toJsFn))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.resultMod.ResultProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.resultMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.resultMod.ResultProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/result", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

