package typingsJapgolly.reactLifecycleComponent.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ErrorInfo
import typingsJapgolly.reactLifecycleComponent.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LifecycleComponent {
  def apply(
    component: ComponentClassP[js.Any with js.Object],
    UNSAFE_componentWillMount: js.UndefOr[Callback] = js.undefined,
    UNSAFE_componentWillReceiveProps: (js.Any, /* nextContext */ js.Any) => Callback = null,
    UNSAFE_componentWillUpdate: (js.Any, js.Any, /* nextContext */ js.Any) => Callback = null,
    componentDidCatch: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Callback = null,
    componentDidMount: js.UndefOr[Callback] = js.undefined,
    componentDidUpdate: (js.Any, js.Any, /* snapshot */ js.UndefOr[js.Any]) => Callback = null,
    componentWillMount: js.UndefOr[Callback] = js.undefined,
    componentWillReceiveProps: (js.Any, /* nextContext */ js.Any) => Callback = null,
    componentWillUnmount: js.UndefOr[Callback] = js.undefined,
    componentWillUpdate: (js.Any, js.Any, /* nextContext */ js.Any) => Callback = null,
    getSnapshotBeforeUpdate: (js.Any, js.Any) => CallbackTo[js.Any | Null] = null,
    shouldComponentUpdate: (js.Any, js.Any, /* nextContext */ js.Any) => CallbackTo[Boolean] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    Props[js.Any, js.Any], 
    typingsJapgolly.reactLifecycleComponent.mod.LifecycleComponent, 
    Unit, 
    Props[js.Any, js.Any]
  ] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
  
      UNSAFE_componentWillMount.foreach(p => __obj.updateDynamic("UNSAFE_componentWillMount")(p.toJsFn))
    if (UNSAFE_componentWillReceiveProps != null) __obj.updateDynamic("UNSAFE_componentWillReceiveProps")(js.Any.fromFunction2((t0: js.Any, t1: /* nextContext */ js.Any) => UNSAFE_componentWillReceiveProps(t0, t1).runNow()))
    if (UNSAFE_componentWillUpdate != null) __obj.updateDynamic("UNSAFE_componentWillUpdate")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: /* nextContext */ js.Any) => UNSAFE_componentWillUpdate(t0, t1, t2).runNow()))
    if (componentDidCatch != null) __obj.updateDynamic("componentDidCatch")(js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* errorInfo */ typingsJapgolly.react.mod.ErrorInfo) => componentDidCatch(t0, t1).runNow()))
    componentDidMount.foreach(p => __obj.updateDynamic("componentDidMount")(p.toJsFn))
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: /* snapshot */ js.UndefOr[js.Any]) => componentDidUpdate(t0, t1, t2).runNow()))
    componentWillMount.foreach(p => __obj.updateDynamic("componentWillMount")(p.toJsFn))
    if (componentWillReceiveProps != null) __obj.updateDynamic("componentWillReceiveProps")(js.Any.fromFunction2((t0: js.Any, t1: /* nextContext */ js.Any) => componentWillReceiveProps(t0, t1).runNow()))
    componentWillUnmount.foreach(p => __obj.updateDynamic("componentWillUnmount")(p.toJsFn))
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: /* nextContext */ js.Any) => componentWillUpdate(t0, t1, t2).runNow()))
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => getSnapshotBeforeUpdate(t0, t1).runNow()))
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: /* nextContext */ js.Any) => shouldComponentUpdate(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLifecycleComponent.mod.Props[js.Any, js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLifecycleComponent.mod.LifecycleComponent](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLifecycleComponent.mod.Props[js.Any, js.Any]])(children: _*)
  }
  @JSImport("react-lifecycle-component", "LifecycleComponent")
  @js.native
  object componentImport extends js.Object
  
}

