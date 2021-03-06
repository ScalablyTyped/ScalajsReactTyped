package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Current Thread IScheduler
trait ICurrentThreadScheduler extends IScheduler {
  def scheduleRequired(): Boolean
}

object ICurrentThreadScheduler {
  @scala.inline
  def apply(
    isScheduler: js.Any => CallbackTo[Boolean],
    now: CallbackTo[Double],
    schedule: js.Function0[Unit] => CallbackTo[IDisposable],
    schedulePeriodic: (Double, js.Function0[Unit]) => CallbackTo[IDisposable],
    schedulePeriodicWithState: (js.Any, Double, js.Function1[js.Any, js.Any]) => CallbackTo[IDisposable],
    scheduleRecursive: js.Function1[/* action */ js.Function0[Unit], Unit] => CallbackTo[IDisposable],
    scheduleRecursiveWithAbsolute: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => CallbackTo[IDisposable],
    scheduleRecursiveWithAbsoluteAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => CallbackTo[IDisposable],
    scheduleRecursiveWithRelative: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => CallbackTo[IDisposable],
    scheduleRecursiveWithRelativeAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => CallbackTo[IDisposable],
    scheduleRecursiveWithState: (js.Any, js.Function2[js.Any, /* action */ js.Function1[js.Any, Unit], Unit]) => CallbackTo[IDisposable],
    scheduleRequired: CallbackTo[Boolean],
    scheduleWithAbsolute: (Double, js.Function0[Unit]) => CallbackTo[IDisposable],
    scheduleWithAbsoluteAndState: (js.Any, Double, js.Function2[ICurrentThreadScheduler, js.Any, IDisposable]) => CallbackTo[IDisposable],
    scheduleWithRelative: (Double, js.Function0[Unit]) => CallbackTo[IDisposable],
    scheduleWithRelativeAndState: (js.Any, Double, js.Function2[ICurrentThreadScheduler, js.Any, IDisposable]) => CallbackTo[IDisposable],
    scheduleWithState: (js.Any, js.Function2[ICurrentThreadScheduler, js.Any, IDisposable]) => CallbackTo[IDisposable]
  ): ICurrentThreadScheduler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isScheduler")(js.Any.fromFunction1((t0: js.Any) => isScheduler(t0).runNow()))
    __obj.updateDynamic("now")(now.toJsFn)
    __obj.updateDynamic("schedule")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => schedule(t0).runNow()))
    __obj.updateDynamic("schedulePeriodic")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function0[scala.Unit]) => schedulePeriodic(t0, t1).runNow()))
    __obj.updateDynamic("schedulePeriodicWithState")(js.Any.fromFunction3((t0: js.Any, t1: scala.Double, t2: js.Function1[js.Any, js.Any]) => schedulePeriodicWithState(t0, t1, t2).runNow()))
    __obj.updateDynamic("scheduleRecursive")(js.Any.fromFunction1((t0: js.Function1[/* action */ js.Function0[scala.Unit], scala.Unit]) => scheduleRecursive(t0).runNow()))
    __obj.updateDynamic("scheduleRecursiveWithAbsolute")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]) => scheduleRecursiveWithAbsolute(t0, t1).runNow()))
    __obj.updateDynamic("scheduleRecursiveWithAbsoluteAndState")(js.Any.fromFunction3((t0: js.Any, t1: scala.Double, t2: js.Function2[
  js.Any, 
  /* action */ js.Function2[js.Any, /* dueTime */ scala.Double, scala.Unit], 
  scala.Unit]) => scheduleRecursiveWithAbsoluteAndState(t0, t1, t2).runNow()))
    __obj.updateDynamic("scheduleRecursiveWithRelative")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]) => scheduleRecursiveWithRelative(t0, t1).runNow()))
    __obj.updateDynamic("scheduleRecursiveWithRelativeAndState")(js.Any.fromFunction3((t0: js.Any, t1: scala.Double, t2: js.Function2[
  js.Any, 
  /* action */ js.Function2[js.Any, /* dueTime */ scala.Double, scala.Unit], 
  scala.Unit]) => scheduleRecursiveWithRelativeAndState(t0, t1, t2).runNow()))
    __obj.updateDynamic("scheduleRecursiveWithState")(js.Any.fromFunction2((t0: js.Any, t1: js.Function2[js.Any, /* action */ js.Function1[js.Any, scala.Unit], scala.Unit]) => scheduleRecursiveWithState(t0, t1).runNow()))
    __obj.updateDynamic("scheduleRequired")(scheduleRequired.toJsFn)
    __obj.updateDynamic("scheduleWithAbsolute")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function0[scala.Unit]) => scheduleWithAbsolute(t0, t1).runNow()))
    __obj.updateDynamic("scheduleWithAbsoluteAndState")(js.Any.fromFunction3((t0: js.Any, t1: scala.Double, t2: js.Function2[
  typingsJapgolly.rxLite.Rx.ICurrentThreadScheduler, 
  js.Any, 
  typingsJapgolly.rxCore.Rx.IDisposable]) => scheduleWithAbsoluteAndState(t0, t1, t2).runNow()))
    __obj.updateDynamic("scheduleWithRelative")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function0[scala.Unit]) => scheduleWithRelative(t0, t1).runNow()))
    __obj.updateDynamic("scheduleWithRelativeAndState")(js.Any.fromFunction3((t0: js.Any, t1: scala.Double, t2: js.Function2[
  typingsJapgolly.rxLite.Rx.ICurrentThreadScheduler, 
  js.Any, 
  typingsJapgolly.rxCore.Rx.IDisposable]) => scheduleWithRelativeAndState(t0, t1, t2).runNow()))
    __obj.updateDynamic("scheduleWithState")(js.Any.fromFunction2((t0: js.Any, t1: js.Function2[
  typingsJapgolly.rxLite.Rx.ICurrentThreadScheduler, 
  js.Any, 
  typingsJapgolly.rxCore.Rx.IDisposable]) => scheduleWithState(t0, t1).runNow()))
    __obj.asInstanceOf[ICurrentThreadScheduler]
  }
}

