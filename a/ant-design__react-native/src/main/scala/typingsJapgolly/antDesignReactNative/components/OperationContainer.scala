package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.Action
import typingsJapgolly.antDesignReactNative.operationContainerMod.OperationContainerProps
import typingsJapgolly.antDesignReactNative.operationContainerMod.default
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OperationContainer {
  def apply(
    actions: js.Array[Action[TextStyle]],
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    onBackHandler: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OperationContainerProps, default, Unit, OperationContainerProps] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
  
      if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    onBackHandler.foreach(p => __obj.updateDynamic("onBackHandler")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.operationContainerMod.OperationContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.operationContainerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.operationContainerMod.OperationContainerProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/modal/OperationContainer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

