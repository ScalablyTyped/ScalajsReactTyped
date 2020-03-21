package typingsJapgolly.reduxFirstRouterRestoreScroll

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reduxFirstRouter.mod.LocationState
import typingsJapgolly.reduxFirstRouterRestoreScroll.reduxFirstRouterRestoreScrollStrings.`profile-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManual extends js.Object {
  /** @default false */
  var manual: js.UndefOr[Boolean] = js.undefined
  /** Use to implement custom scroll positioning. */
  var shouldUpdateScroll: js.UndefOr[
    js.Function2[
      /* prev */ LocationState[js.Object, _], 
      /* locationState */ LocationState[js.Object, _], 
      Boolean | `profile-box` | (js.Tuple2[Double, Double])
    ]
  ] = js.undefined
  /**
    * To implement a custom backend storage for scroll state, pass a custom
    * stateStorage object. The object should implement the methods as described
    * by the package `scroll-behavior` as well as a function called setPrevKey
    * that keeps track of the previous key.
    */
  var stateStorage: js.UndefOr[AnonRead] = js.undefined
}

object AnonManual {
  @scala.inline
  def apply(
    manual: js.UndefOr[Boolean] = js.undefined,
    shouldUpdateScroll: (/* prev */ LocationState[js.Object, js.Any], /* locationState */ LocationState[js.Object, js.Any]) => CallbackTo[Boolean | `profile-box` | (js.Tuple2[Double, Double])] = null,
    stateStorage: AnonRead = null
  ): AnonManual = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(manual)) __obj.updateDynamic("manual")(manual.asInstanceOf[js.Any])
    if (shouldUpdateScroll != null) __obj.updateDynamic("shouldUpdateScroll")(js.Any.fromFunction2((t0: /* prev */ typingsJapgolly.reduxFirstRouter.mod.LocationState[js.Object, js.Any], t1: /* locationState */ typingsJapgolly.reduxFirstRouter.mod.LocationState[js.Object, js.Any]) => shouldUpdateScroll(t0, t1).runNow()))
    if (stateStorage != null) __obj.updateDynamic("stateStorage")(stateStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManual]
  }
}

