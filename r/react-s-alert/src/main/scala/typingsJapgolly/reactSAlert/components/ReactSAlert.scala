package typingsJapgolly.reactSAlert.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSAlert.mod.SAlert.SAlertBeepProps
import typingsJapgolly.reactSAlert.mod.SAlert.SAlertProps
import typingsJapgolly.reactSAlert.mod.SAlert.SAlertStackProps
import typingsJapgolly.reactSAlert.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSAlert {
  def apply(
    beep: String | Boolean | SAlertBeepProps = null,
    contentTemplate: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    customFields: js.Object = null,
    effect: String = null,
    html: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    offset: Int | Double = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    position: String = null,
    stack: Boolean | SAlertStackProps = null,
    timeout: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SAlertProps, default, Unit, SAlertProps] = {
    val __obj = js.Dynamic.literal()
  
      if (beep != null) __obj.updateDynamic("beep")(beep.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => contentTemplate(t0).runNow()))
    if (customFields != null) __obj.updateDynamic("customFields")(customFields.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSAlert.mod.SAlert.SAlertProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSAlert.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSAlert.mod.SAlert.SAlertProps])(children: _*)
  }
  @JSImport("react-s-alert", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

