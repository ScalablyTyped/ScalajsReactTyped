package typingsJapgolly.reactAsync.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.AbortController
import typingsJapgolly.reactAsync.mod.AsyncAction
import typingsJapgolly.reactAsync.mod.AsyncChildren
import typingsJapgolly.reactAsync.mod.AsyncProps
import typingsJapgolly.reactAsync.mod.AsyncState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_AsyncProps_522022011[ComponentRef] () {
  val componentImport: js.Any
  def apply[T](
    debugLabel: String = null,
    deferFn: (/* args */ js.Array[js.Any], /* props */ AsyncProps[T], /* controller */ AbortController) => CallbackTo[js.Promise[T]] = null,
    dispatcher: (/* action */ AsyncAction[T], /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], /* props */ AsyncProps[T]) => Callback = null,
    initialValue: T = null,
    onReject: /* error */ js.Error => Callback = null,
    onResolve: T => Callback = null,
    promise: js.Promise[T] = null,
    promiseFn: (/* props */ AsyncProps[T], /* controller */ AbortController) => CallbackTo[js.Promise[T]] = null,
    reducer: (/* state */ AsyncState[T], /* action */ AsyncAction[T], /* internalReducer */ js.Function2[/* state */ AsyncState[T], /* action */ AsyncAction[T], AsyncState[T]]) => CallbackTo[AsyncState[T]] = null,
    watch: js.Any = null,
    watchFn: (/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T]) => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: AsyncChildren[T] = null
  ): UnmountedWithRoot[AsyncProps[T], ComponentRef, Unit, AsyncProps[T]] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (debugLabel != null) __obj.updateDynamic("debugLabel")(debugLabel.asInstanceOf[js.Any])
    if (deferFn != null) __obj.updateDynamic("deferFn")(js.Any.fromFunction3((t0: /* args */ js.Array[js.Any], t1: /* props */ typingsJapgolly.reactAsync.mod.AsyncProps[T], t2: /* controller */ org.scalajs.dom.experimental.AbortController) => deferFn(t0, t1, t2).runNow()))
    if (dispatcher != null) __obj.updateDynamic("dispatcher")(js.Any.fromFunction3((t0: /* action */ typingsJapgolly.reactAsync.mod.AsyncAction[T], t1: /* internalDispatch */ js.Function1[/* action */ typingsJapgolly.reactAsync.mod.AsyncAction[T], scala.Unit], t2: /* props */ typingsJapgolly.reactAsync.mod.AsyncProps[T]) => dispatcher(t0, t1, t2).runNow()))
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1((t0: /* error */ js.Error) => onReject(t0).runNow()))
    if (onResolve != null) __obj.updateDynamic("onResolve")(js.Any.fromFunction1((t0: T) => onResolve(t0).runNow()))
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (promiseFn != null) __obj.updateDynamic("promiseFn")(js.Any.fromFunction2((t0: /* props */ typingsJapgolly.reactAsync.mod.AsyncProps[T], t1: /* controller */ org.scalajs.dom.experimental.AbortController) => promiseFn(t0, t1).runNow()))
    if (reducer != null) __obj.updateDynamic("reducer")(js.Any.fromFunction3((t0: /* state */ typingsJapgolly.reactAsync.mod.AsyncState[T], t1: /* action */ typingsJapgolly.reactAsync.mod.AsyncAction[T], t2: /* internalReducer */ js.Function2[
  /* state */ typingsJapgolly.reactAsync.mod.AsyncState[T], 
  /* action */ typingsJapgolly.reactAsync.mod.AsyncAction[T], 
  typingsJapgolly.reactAsync.mod.AsyncState[T]]) => reducer(t0, t1, t2).runNow()))
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    if (watchFn != null) __obj.updateDynamic("watchFn")(js.Any.fromFunction2((t0: /* props */ typingsJapgolly.reactAsync.mod.AsyncProps[T], t1: /* prevProps */ typingsJapgolly.reactAsync.mod.AsyncProps[T]) => watchFn(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAsync.mod.AsyncProps[T], 
  japgolly.scalajs.react.Children.None, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAsync.mod.AsyncProps[T]])
  }
}

