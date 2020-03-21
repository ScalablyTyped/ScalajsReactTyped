package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsCore.propsMod.IActionProps
import typingsJapgolly.blueprintjsCore.propsMod.ILinkProps
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.toastMod.IToastProps
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toast {
  def apply(
    action: IActionProps with ILinkProps = null,
    className: String = null,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    message: VdomNode = null,
    onDismiss: /* didTimeoutExpire */ Boolean => Callback = null,
    timeout: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IToastProps, typingsJapgolly.blueprintjsCore.mod.Toast, Unit, IToastProps] = {
    val __obj = js.Dynamic.literal()
  
      if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* didTimeoutExpire */ scala.Boolean) => onDismiss(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.toastMod.IToastProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.Toast](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.toastMod.IToastProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "Toast")
  @js.native
  object componentImport extends js.Object
  
}

