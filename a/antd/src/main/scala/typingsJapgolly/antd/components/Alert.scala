package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.antd.alertMod.AlertProps
import typingsJapgolly.antd.alertMod.default
import typingsJapgolly.antd.antdStrings.error
import typingsJapgolly.antd.antdStrings.info
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.warning
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Alert {
  def apply(
    afterClose: js.UndefOr[Callback] = js.undefined,
    banner: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeText: VdomNode = null,
    description: VdomNode = null,
    icon: VdomNode = null,
    message: VdomNode = null,
    onClose: ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    prefixCls: String = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    `type`: success | info | warning | error = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AlertProps, default, Unit, AlertProps] = {
    val __obj = js.Dynamic.literal()
  
      afterClose.foreach(p => __obj.updateDynamic("afterClose")(p.toJsFn))
    if (!js.isUndefined(banner)) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.rawNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onClose(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.alertMod.AlertProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.alertMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.alertMod.AlertProps])(children: _*)
  }
  @JSImport("antd/lib/alert", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

