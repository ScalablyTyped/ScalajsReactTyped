package typingsJapgolly.reactDashRedux.reactDashReduxMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.reactMod.Context
import typingsJapgolly.redux.reduxMod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[State, TStateProps, TOwnProps, TMergedProps] extends ConnectOptions {
  /**
    * When pure, compares the result of mergeProps to its previous value.
    * @default shallowEqual
    */
  var areMergedPropsEqual: js.UndefOr[
    js.Function2[/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps, Boolean]
  ] = js.undefined
  /**
    * When pure, compares incoming props to its previous value.
    * @default shallowEqual
    */
  var areOwnPropsEqual: js.UndefOr[
    js.Function2[/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps, Boolean]
  ] = js.undefined
  /**
    * When pure, compares the result of mapStateToProps to its previous value.
    * @default shallowEqual
    */
  var areStatePropsEqual: js.UndefOr[
    js.Function2[/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps, Boolean]
  ] = js.undefined
  /**
    * When pure, compares incoming store state to its previous value.
    * @default strictEqual
    */
  var areStatesEqual: js.UndefOr[js.Function2[/* nextState */ State, /* prevState */ State, Boolean]] = js.undefined
  /**
    * If true, use React's forwardRef to expose a ref of the wrapped component
    *
    * @default false
    */
  var forwardRef: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, implements shouldComponentUpdate and shallowly compares the result of mergeProps,
    * preventing unnecessary updates, assuming that the component is a “pure” component
    * and does not rely on any input or state other than its props and the selected Redux store’s state.
    * Defaults to true.
    * @default true
    */
  var pure: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[State, TStateProps, TOwnProps, TMergedProps](
    areMergedPropsEqual: (/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps) => CallbackTo[Boolean] = null,
    areOwnPropsEqual: (/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps) => CallbackTo[Boolean] = null,
    areStatePropsEqual: (/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps) => CallbackTo[Boolean] = null,
    areStatesEqual: (/* nextState */ State, /* prevState */ State) => CallbackTo[Boolean] = null,
    context: Context[ReactReduxContextValue[_, AnyAction]] = null,
    forwardRef: js.UndefOr[Boolean] = js.undefined,
    getDisplayName: /* componentName */ String => CallbackTo[String] = null,
    methodName: String = null,
    pure: js.UndefOr[Boolean] = js.undefined,
    renderCountProp: String = null,
    shouldHandleStateChanges: js.UndefOr[Boolean] = js.undefined,
    storeKey: String = null,
    withRef: js.UndefOr[Boolean] = js.undefined
  ): Options[State, TStateProps, TOwnProps, TMergedProps] = {
    val __obj = js.Dynamic.literal()
    if (areMergedPropsEqual != null) __obj.updateDynamic("areMergedPropsEqual")(js.Any.fromFunction2((t0: /* nextMergedProps */ TMergedProps, t1: /* prevMergedProps */ TMergedProps) => areMergedPropsEqual(t0, t1).runNow()))
    if (areOwnPropsEqual != null) __obj.updateDynamic("areOwnPropsEqual")(js.Any.fromFunction2((t0: /* nextOwnProps */ TOwnProps, t1: /* prevOwnProps */ TOwnProps) => areOwnPropsEqual(t0, t1).runNow()))
    if (areStatePropsEqual != null) __obj.updateDynamic("areStatePropsEqual")(js.Any.fromFunction2((t0: /* nextStateProps */ TStateProps, t1: /* prevStateProps */ TStateProps) => areStatePropsEqual(t0, t1).runNow()))
    if (areStatesEqual != null) __obj.updateDynamic("areStatesEqual")(js.Any.fromFunction2((t0: /* nextState */ State, t1: /* prevState */ State) => areStatesEqual(t0, t1).runNow()))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef.asInstanceOf[js.Any])
    if (getDisplayName != null) __obj.updateDynamic("getDisplayName")(js.Any.fromFunction1((t0: /* componentName */ java.lang.String) => getDisplayName(t0).runNow()))
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.asInstanceOf[js.Any])
    if (renderCountProp != null) __obj.updateDynamic("renderCountProp")(renderCountProp.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldHandleStateChanges)) __obj.updateDynamic("shouldHandleStateChanges")(shouldHandleStateChanges.asInstanceOf[js.Any])
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[State, TStateProps, TOwnProps, TMergedProps]]
  }
}

