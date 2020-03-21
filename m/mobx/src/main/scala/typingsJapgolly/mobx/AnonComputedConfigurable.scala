package typingsJapgolly.mobx

import japgolly.scalajs.react.Callback
import typingsJapgolly.mobx.mobxStrings.always
import typingsJapgolly.mobx.mobxStrings.never
import typingsJapgolly.mobx.mobxStrings.observed
import typingsJapgolly.mobx.mobxStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComputedConfigurable extends js.Object {
  var computedConfigurable: js.UndefOr[Boolean] = js.undefined
  var computedRequiresReaction: js.UndefOr[Boolean] = js.undefined
  var disableErrorBoundaries: js.UndefOr[Boolean] = js.undefined
  var enforceActions: js.UndefOr[Boolean | strict | never | always | observed] = js.undefined
  var isolateGlobalState: js.UndefOr[Boolean] = js.undefined
  /**
    * (Experimental)
    * Warn if observables are accessed outside a reactive context
    */
  var observableRequiresReaction: js.UndefOr[Boolean] = js.undefined
  /**
    * (Experimental)
    * Warn if you try to create to derivation / reactive context without accessing any observable.
    */
  var reactionRequiresObservable: js.UndefOr[Boolean] = js.undefined
  var reactionScheduler: js.UndefOr[js.Function1[/* f */ js.Function0[Unit], Unit]] = js.undefined
}

object AnonComputedConfigurable {
  @scala.inline
  def apply(
    computedConfigurable: js.UndefOr[Boolean] = js.undefined,
    computedRequiresReaction: js.UndefOr[Boolean] = js.undefined,
    disableErrorBoundaries: js.UndefOr[Boolean] = js.undefined,
    enforceActions: Boolean | strict | never | always | observed = null,
    isolateGlobalState: js.UndefOr[Boolean] = js.undefined,
    observableRequiresReaction: js.UndefOr[Boolean] = js.undefined,
    reactionRequiresObservable: js.UndefOr[Boolean] = js.undefined,
    reactionScheduler: /* f */ js.Function0[Unit] => Callback = null
  ): AnonComputedConfigurable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(computedConfigurable)) __obj.updateDynamic("computedConfigurable")(computedConfigurable.asInstanceOf[js.Any])
    if (!js.isUndefined(computedRequiresReaction)) __obj.updateDynamic("computedRequiresReaction")(computedRequiresReaction.asInstanceOf[js.Any])
    if (!js.isUndefined(disableErrorBoundaries)) __obj.updateDynamic("disableErrorBoundaries")(disableErrorBoundaries.asInstanceOf[js.Any])
    if (enforceActions != null) __obj.updateDynamic("enforceActions")(enforceActions.asInstanceOf[js.Any])
    if (!js.isUndefined(isolateGlobalState)) __obj.updateDynamic("isolateGlobalState")(isolateGlobalState.asInstanceOf[js.Any])
    if (!js.isUndefined(observableRequiresReaction)) __obj.updateDynamic("observableRequiresReaction")(observableRequiresReaction.asInstanceOf[js.Any])
    if (!js.isUndefined(reactionRequiresObservable)) __obj.updateDynamic("reactionRequiresObservable")(reactionRequiresObservable.asInstanceOf[js.Any])
    if (reactionScheduler != null) __obj.updateDynamic("reactionScheduler")(js.Any.fromFunction1((t0: /* f */ js.Function0[scala.Unit]) => reactionScheduler(t0).runNow()))
    __obj.asInstanceOf[AnonComputedConfigurable]
  }
}

