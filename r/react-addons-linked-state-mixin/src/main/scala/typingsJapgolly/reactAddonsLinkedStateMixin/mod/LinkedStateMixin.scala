package typingsJapgolly.reactAddonsLinkedStateMixin.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ErrorInfo
import typingsJapgolly.react.mod.Mixin
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedStateMixin
  extends Mixin[js.Any, js.Any] {
  def linkState[T](key: String): ReactLink[T]
}

object LinkedStateMixin {
  @scala.inline
  def apply(
    linkState: String => CallbackTo[ReactLink[js.Any]],
    UNSAFE_componentWillMount: js.UndefOr[Callback] = js.undefined,
    UNSAFE_componentWillReceiveProps: (js.Any, /* nextContext */ js.Any) => Callback = null,
    UNSAFE_componentWillUpdate: (js.Any, js.Any, /* nextContext */ js.Any) => Callback = null,
    childContextTypes: ValidationMap[_] = null,
    componentDidCatch: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Callback = null,
    componentDidMount: js.UndefOr[Callback] = js.undefined,
    componentDidUpdate: (js.Any, js.Any, /* snapshot */ js.UndefOr[js.Any]) => Callback = null,
    componentWillMount: js.UndefOr[Callback] = js.undefined,
    componentWillReceiveProps: (js.Any, /* nextContext */ js.Any) => Callback = null,
    componentWillUnmount: js.UndefOr[Callback] = js.undefined,
    componentWillUpdate: (js.Any, js.Any, /* nextContext */ js.Any) => Callback = null,
    contextTypes: ValidationMap[_] = null,
    displayName: String = null,
    getDefaultProps: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialState: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSnapshotBeforeUpdate: (js.Any, js.Any) => CallbackTo[js.Any | Null] = null,
    mixins: js.Array[Mixin[js.Any, js.Any]] = null,
    propTypes: ValidationMap[_] = null,
    shouldComponentUpdate: (js.Any, js.Any, /* nextContext */ js.Any) => CallbackTo[Boolean] = null,
    statics: StringDictionary[js.Any] = null
  ): LinkedStateMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("linkState")(js.Any.fromFunction1((t0: java.lang.String) => linkState(t0).runNow()))
    UNSAFE_componentWillMount.foreach(p => __obj.updateDynamic("UNSAFE_componentWillMount")(p.toJsFn))
    if (UNSAFE_componentWillReceiveProps != null) __obj.updateDynamic("UNSAFE_componentWillReceiveProps")(js.Any.fromFunction2((t0: js.Any, t1: /* nextContext */ js.Any) => UNSAFE_componentWillReceiveProps(t0, t1).runNow()))
    if (UNSAFE_componentWillUpdate != null) __obj.updateDynamic("UNSAFE_componentWillUpdate")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: /* nextContext */ js.Any) => UNSAFE_componentWillUpdate(t0, t1, t2).runNow()))
    if (childContextTypes != null) __obj.updateDynamic("childContextTypes")(childContextTypes.asInstanceOf[js.Any])
    if (componentDidCatch != null) __obj.updateDynamic("componentDidCatch")(js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* errorInfo */ typingsJapgolly.react.mod.ErrorInfo) => componentDidCatch(t0, t1).runNow()))
    componentDidMount.foreach(p => __obj.updateDynamic("componentDidMount")(p.toJsFn))
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: /* snapshot */ js.UndefOr[js.Any]) => componentDidUpdate(t0, t1, t2).runNow()))
    componentWillMount.foreach(p => __obj.updateDynamic("componentWillMount")(p.toJsFn))
    if (componentWillReceiveProps != null) __obj.updateDynamic("componentWillReceiveProps")(js.Any.fromFunction2((t0: js.Any, t1: /* nextContext */ js.Any) => componentWillReceiveProps(t0, t1).runNow()))
    componentWillUnmount.foreach(p => __obj.updateDynamic("componentWillUnmount")(p.toJsFn))
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: /* nextContext */ js.Any) => componentWillUpdate(t0, t1, t2).runNow()))
    if (contextTypes != null) __obj.updateDynamic("contextTypes")(contextTypes.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    getDefaultProps.foreach(p => __obj.updateDynamic("getDefaultProps")(p.toJsFn))
    getInitialState.foreach(p => __obj.updateDynamic("getInitialState")(p.toJsFn))
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => getSnapshotBeforeUpdate(t0, t1).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: /* nextContext */ js.Any) => shouldComponentUpdate(t0, t1, t2).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedStateMixin]
  }
}

