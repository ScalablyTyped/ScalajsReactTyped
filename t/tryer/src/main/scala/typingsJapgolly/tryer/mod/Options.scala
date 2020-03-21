package typingsJapgolly.tryer.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The function that you want to invoke.
    * If action returns a promise, iterations will not end until the promise is resolved or rejected.
    * Alternatively, action may take a callback argument, done, to signal that it is asynchronous. In that case, you are responsible for calling done when the action is finished.
    *
    * If action is not set, it defaults to an empty function.
    */
  var action: js.UndefOr[js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _])] = js.undefined
  /**
    * fail: The error handler.
    * A function that will be called if limit falsey values are returned by when or until.
    * Defaults to an empty function.
    */
  var fail: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  /**
    * interval: The retry interval, in milliseconds.
    * A negative number indicates that each subsequent retry should wait for twice the interval from the preceding iteration (i.e. exponential backoff).
    * The default value is -1000, signifying that the initial retry interval should be one second and that each subsequent attempt should wait for double the length of the previous interval.
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * limit: Failure limit, representing the maximum number of falsey returns from when or until that will be permitted before invocation is deemed to have failed.
    * A negative number indicates that the attempt should never fail, instead continuing for as long as when and until have returned truthy values.
    * Defaults to -1.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * pass: Success handler.
    * A function that will be called after until has returned truthily.
    * Defaults to an empty function.
    */
  var pass: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * until: A predicate that tests the post-condition for invoking action.
    * After until returns true (or a truthy value), action will no longer be called.
    * Defaults to a function that immediately returns true.
    */
  var until: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * when: A predicate that tests the pre-condition for invoking action.
    * Until when returns true (or a truthy value), action will not be called.
    * Defaults to a function that immediately returns true.
    */
  var when: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    action: js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _]) = null,
    fail: /* err */ js.Error => Callback = null,
    interval: Int | Double = null,
    limit: Int | Double = null,
    pass: js.UndefOr[Callback] = js.undefined,
    until: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    when: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ js.Error) => fail(t0).runNow()))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    pass.foreach(p => __obj.updateDynamic("pass")(p.toJsFn))
    until.foreach(p => __obj.updateDynamic("until")(p.toJsFn))
    when.foreach(p => __obj.updateDynamic("when")(p.toJsFn))
    __obj.asInstanceOf[Options]
  }
}

