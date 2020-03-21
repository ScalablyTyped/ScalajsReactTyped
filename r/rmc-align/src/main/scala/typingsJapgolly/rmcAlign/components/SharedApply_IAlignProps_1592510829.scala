package typingsJapgolly.rmcAlign.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcAlign.alignMod.IAlignProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IAlignProps_1592510829[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    target: Callback,
    childrenProps: js.Object = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    monitorBufferTime: Int | Double = null,
    monitorWindowResize: js.UndefOr[Boolean] = js.undefined,
    onAlign: (/* source */ js.Any, /* align */ js.Any) => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IAlignProps, ComponentRef, Unit, IAlignProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("target")(target.toJsFn)
    if (childrenProps != null) __obj.updateDynamic("childrenProps")(childrenProps.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (monitorBufferTime != null) __obj.updateDynamic("monitorBufferTime")(monitorBufferTime.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWindowResize)) __obj.updateDynamic("monitorWindowResize")(monitorWindowResize.asInstanceOf[js.Any])
    if (onAlign != null) __obj.updateDynamic("onAlign")(js.Any.fromFunction2((t0: /* source */ js.Any, t1: /* align */ js.Any) => onAlign(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcAlign.alignMod.IAlignProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcAlign.alignMod.IAlignProps])(children: _*)
  }
}

