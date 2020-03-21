package typingsJapgolly.scheduler.tracingMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscriber extends js.Object {
  /**
    * All scheduled async work for an interaction has finished.
    */
  def onInteractionScheduledWorkCompleted(interaction: Interaction): Unit
  /**
    * A new interaction has been created via the trace() method.
    */
  def onInteractionTraced(interaction: Interaction): Unit
  /**
    * A batch of scheduled work has been canceled.
    * Work is done by a "thread" which is identified by a unique ID.
    */
  def onWorkCanceled(interactions: Set[Interaction], threadID: Double): Unit
  /**
    * New async work has been scheduled for a set of interactions.
    * When this work is later run, onWorkStarted/onWorkStopped will be called.
    * A batch of async/yieldy work may be scheduled multiple times before completing.
    * In that case, onWorkScheduled may be called more than once before onWorkStopped.
    * Work is scheduled by a "thread" which is identified by a unique ID.
    */
  def onWorkScheduled(interactions: Set[Interaction], threadID: Double): Unit
  /**
    * A batch of work has started for a set of interactions.
    * When this work is complete, onWorkStopped will be called.
    * Work is not always completed synchronously; yielding may occur in between.
    * A batch of async/yieldy work may also be re-started before completing.
    * In that case, onWorkStarted may be called more than once before onWorkStopped.
    * Work is done by a "thread" which is identified by a unique ID.
    */
  def onWorkStarted(interactions: Set[Interaction], threadID: Double): Unit
  /**
    * A batch of work has completed for a set of interactions.
    * Work is done by a "thread" which is identified by a unique ID.
    */
  def onWorkStopped(interactions: Set[Interaction], threadID: Double): Unit
}

object Subscriber {
  @scala.inline
  def apply(
    onInteractionScheduledWorkCompleted: Interaction => Callback,
    onInteractionTraced: Interaction => Callback,
    onWorkCanceled: (Set[Interaction], Double) => Callback,
    onWorkScheduled: (Set[Interaction], Double) => Callback,
    onWorkStarted: (Set[Interaction], Double) => Callback,
    onWorkStopped: (Set[Interaction], Double) => Callback
  ): Subscriber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onInteractionScheduledWorkCompleted")(js.Any.fromFunction1((t0: typingsJapgolly.scheduler.tracingMod.Interaction) => onInteractionScheduledWorkCompleted(t0).runNow()))
    __obj.updateDynamic("onInteractionTraced")(js.Any.fromFunction1((t0: typingsJapgolly.scheduler.tracingMod.Interaction) => onInteractionTraced(t0).runNow()))
    __obj.updateDynamic("onWorkCanceled")(js.Any.fromFunction2((t0: typingsJapgolly.std.Set[typingsJapgolly.scheduler.tracingMod.Interaction], t1: scala.Double) => onWorkCanceled(t0, t1).runNow()))
    __obj.updateDynamic("onWorkScheduled")(js.Any.fromFunction2((t0: typingsJapgolly.std.Set[typingsJapgolly.scheduler.tracingMod.Interaction], t1: scala.Double) => onWorkScheduled(t0, t1).runNow()))
    __obj.updateDynamic("onWorkStarted")(js.Any.fromFunction2((t0: typingsJapgolly.std.Set[typingsJapgolly.scheduler.tracingMod.Interaction], t1: scala.Double) => onWorkStarted(t0, t1).runNow()))
    __obj.updateDynamic("onWorkStopped")(js.Any.fromFunction2((t0: typingsJapgolly.std.Set[typingsJapgolly.scheduler.tracingMod.Interaction], t1: scala.Double) => onWorkStopped(t0, t1).runNow()))
    __obj.asInstanceOf[Subscriber]
  }
}

