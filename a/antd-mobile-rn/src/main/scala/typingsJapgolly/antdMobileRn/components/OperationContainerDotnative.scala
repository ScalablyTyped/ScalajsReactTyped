package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.modalPropsTypeMod.Action
import typingsJapgolly.antdMobileRn.operationContainerNativeMod.OperationContainerProps
import typingsJapgolly.antdMobileRn.operationContainerNativeMod.default
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OperationContainerDotnative {
  def apply(
    actions: js.Array[Action[TextStyle]],
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OperationContainerProps, default, Unit, OperationContainerProps] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
  
      if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.operationContainerNativeMod.OperationContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.operationContainerNativeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.operationContainerNativeMod.OperationContainerProps])(children: _*)
  }
  @JSImport("antd-mobile-rn/lib/modal/OperationContainer.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

