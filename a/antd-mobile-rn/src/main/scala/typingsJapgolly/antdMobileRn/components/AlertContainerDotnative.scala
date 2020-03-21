package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.alertContainerNativeMod.AlertContainerProps
import typingsJapgolly.antdMobileRn.alertContainerNativeMod.default
import typingsJapgolly.antdMobileRn.modalPropsTypeMod.Action
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AlertContainerDotnative {
  def apply(
    actions: js.Array[Action[TextStyle]],
    content: VdomNode = null,
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AlertContainerProps, default, Unit, AlertContainerProps] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
  
      if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.alertContainerNativeMod.AlertContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.alertContainerNativeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.alertContainerNativeMod.AlertContainerProps])(children: _*)
  }
  @JSImport("antd-mobile-rn/lib/modal/AlertContainer.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

