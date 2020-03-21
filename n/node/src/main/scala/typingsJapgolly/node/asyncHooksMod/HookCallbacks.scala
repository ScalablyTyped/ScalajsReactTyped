package typingsJapgolly.node.asyncHooksMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookCallbacks extends js.Object {
  /**
    * Called immediately after the callback specified in before is completed.
    * @param asyncId the unique identifier assigned to the resource which has executed the callback.
    */
  var after: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.undefined
  /**
    * When an asynchronous operation is initiated or completes a callback is called to notify the user.
    * The before callback is called just before said callback is executed.
    * @param asyncId the unique identifier assigned to the resource about to execute the callback.
    */
  var before: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.undefined
  /**
    * Called after the resource corresponding to asyncId is destroyed
    * @param asyncId a unique ID for the async resource
    */
  var destroy: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.undefined
  /**
    * Called when a class is constructed that has the possibility to emit an asynchronous event.
    * @param asyncId a unique ID for the async resource
    * @param type the type of the async resource
    * @param triggerAsyncId the unique ID of the async resource in whose execution context this async resource was created
    * @param resource reference to the resource representing the async operation, needs to be released during destroy
    */
  var init: js.UndefOr[
    js.Function4[
      /* asyncId */ Double, 
      /* type */ String, 
      /* triggerAsyncId */ Double, 
      /* resource */ js.Object, 
      Unit
    ]
  ] = js.undefined
  /**
    * Called when a promise has resolve() called. This may not be in the same execution id
    * as the promise itself.
    * @param asyncId the unique id for the promise that was resolve()d.
    */
  var promiseResolve: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.undefined
}

object HookCallbacks {
  @scala.inline
  def apply(
    after: /* asyncId */ Double => Callback = null,
    before: /* asyncId */ Double => Callback = null,
    destroy: /* asyncId */ Double => Callback = null,
    init: (/* asyncId */ Double, /* type */ String, /* triggerAsyncId */ Double, /* resource */ js.Object) => Callback = null,
    promiseResolve: /* asyncId */ Double => Callback = null
  ): HookCallbacks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* asyncId */ scala.Double) => after(t0).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* asyncId */ scala.Double) => before(t0).runNow()))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* asyncId */ scala.Double) => destroy(t0).runNow()))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction4((t0: /* asyncId */ scala.Double, t1: /* type */ java.lang.String, t2: /* triggerAsyncId */ scala.Double, t3: /* resource */ js.Object) => init(t0, t1, t2, t3).runNow()))
    if (promiseResolve != null) __obj.updateDynamic("promiseResolve")(js.Any.fromFunction1((t0: /* asyncId */ scala.Double) => promiseResolve(t0).runNow()))
    __obj.asInstanceOf[HookCallbacks]
  }
}

