package typingsJapgolly.rxLiteVirtualtime.Rx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxCore.Rx.IDisposable
import typingsJapgolly.rxLite.Rx.IScheduler
import typingsJapgolly.rxLite.Rx.internals.ScheduledItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualTimeScheduler[TAbsolute, TRelative] extends IScheduler {
  var isEnabled: Boolean
  /* protected abstract */ def add(from: TAbsolute, by: TRelative): TAbsolute
  // protected constructor(initialClock: TAbsolute, comparer: (first: TAbsolute, second: TAbsolute) => number);
  def advanceBy(time: TRelative): Unit
  def advanceTo(time: TAbsolute): Unit
  /* protected */ def getNext(): ScheduledItem[TAbsolute]
  def scheduleAbsolute(dueTime: TAbsolute, action: js.Function0[Unit]): IDisposable
  def scheduleAbsoluteWithState[TState](
    state: TState,
    dueTime: TAbsolute,
    action: js.Function2[
      /* scheduler */ typingsJapgolly.rxCore.Rx.IScheduler, 
      /* state */ TState, 
      IDisposable
    ]
  ): IDisposable
  def scheduleRelative(dueTime: TRelative, action: js.Function0[Unit]): IDisposable
  def scheduleRelativeWithState[TState](
    state: TState,
    dueTime: TRelative,
    action: js.Function2[
      /* scheduler */ typingsJapgolly.rxCore.Rx.IScheduler, 
      /* state */ TState, 
      IDisposable
    ]
  ): IDisposable
  def sleep(time: TRelative): Unit
  def start(): IDisposable
  def stop(): Unit
  /* protected abstract */ def toDateTimeOffset(duetime: TAbsolute): Double
  /* protected abstract */ def toRelative(duetime: Double): TRelative
}

object VirtualTimeScheduler {
  @scala.inline
  def apply[TAbsolute, TRelative](
    add: (TAbsolute, TRelative) => CallbackTo[TAbsolute],
    advanceBy: TRelative => Callback,
    advanceTo: TAbsolute => Callback,
    getNext: CallbackTo[ScheduledItem[TAbsolute]],
    isEnabled: Boolean,
    isScheduler: js.Any => CallbackTo[Boolean],
    now: CallbackTo[Double],
    schedule: js.Function0[Unit] => CallbackTo[IDisposable],
    scheduleAbsolute: (TAbsolute, js.Function0[Unit]) => CallbackTo[IDisposable],
    scheduleAbsoluteWithState: (js.Any, TAbsolute, js.Function2[/* scheduler */ typingsJapgolly.rxCore.Rx.IScheduler, js.Any, IDisposable]) => CallbackTo[IDisposable],
    schedulePeriodic: (Double, js.Function0[Unit]) => CallbackTo[IDisposable],
    schedulePeriodicWithState: (js.Any, Double, js.Function1[js.Any, js.Any]) => CallbackTo[IDisposable],
    scheduleRecursive: js.Function1[/* action */ js.Function0[Unit], Unit] => CallbackTo[IDisposable],
    scheduleRecursiveWithAbsolute: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => CallbackTo[IDisposable],
    scheduleRecursiveWithAbsoluteAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => CallbackTo[IDisposable],
    scheduleRecursiveWithRelative: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => CallbackTo[IDisposable],
    scheduleRecursiveWithRelativeAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => CallbackTo[IDisposable],
    scheduleRecursiveWithState: (js.Any, js.Function2[js.Any, /* action */ js.Function1[js.Any, Unit], Unit]) => CallbackTo[IDisposable],
    scheduleRelative: (TRelative, js.Function0[Unit]) => CallbackTo[IDisposable],
    scheduleRelativeWithState: (js.Any, TRelative, js.Function2[/* scheduler */ typingsJapgolly.rxCore.Rx.IScheduler, js.Any, IDisposable]) => CallbackTo[IDisposable],
    scheduleWithAbsolute: (Double, js.Function0[Unit]) => CallbackTo[IDisposable],
    scheduleWithAbsoluteAndState: (js.Any, Double, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, IDisposable]) => CallbackTo[IDisposable],
    scheduleWithRelative: (Double, js.Function0[Unit]) => CallbackTo[IDisposable],
    scheduleWithRelativeAndState: (js.Any, Double, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, IDisposable]) => CallbackTo[IDisposable],
    scheduleWithState: (js.Any, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, IDisposable]) => CallbackTo[IDisposable],
    sleep: TRelative => Callback,
    start: CallbackTo[IDisposable],
    stop: Callback,
    toDateTimeOffset: TAbsolute => CallbackTo[Double],
    toRelative: Double => CallbackTo[TRelative]
  ): VirtualTimeScheduler[TAbsolute, TRelative] = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: TAbsolute, t1: TRelative) => add(t0, t1).runNow()))
    __obj.updateDynamic("advanceBy")(js.Any.fromFunction1((t0: TRelative) => advanceBy(t0).runNow()))
    __obj.updateDynamic("advanceTo")(js.Any.fromFunction1((t0: TAbsolute) => advanceTo(t0).runNow()))
    __obj.updateDynamic("getNext")(getNext.toJsFn)
    __obj.updateDynamic("isScheduler")(js.Any.fromFunction1((t0: js.Any) => isScheduler(t0).runNow()))
    __obj.updateDynamic("now")(now.toJsFn)
    __obj.updateDynamic("schedule")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => schedule(t0).runNow()))
    __obj.updateDynamic("scheduleAbsolute")(js.Any.fromFunction2((t0: TAbsolute, t1: js.Function0[scala.Unit]) => scheduleAbsolute(t0, t1).runNow()))
    __obj.updateDynamic("scheduleAbsoluteWithState")(js.Any.fromFunction3((t0: js.Any, t1: TAbsolute, t2: js.Function2[
  /* scheduler */ typingsJapgolly.rxCore.Rx.IScheduler, 
  js.Any, 
  typingsJapgolly.rxCore.Rx.IDisposable]) => scheduleAbsoluteWithState(t0, t1, t2).runNow()))
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
    __obj.updateDynamic("scheduleRelative")(js.Any.fromFunction2((t0: TRelative, t1: js.Function0[scala.Unit]) => scheduleRelative(t0, t1).runNow()))
    __obj.updateDynamic("scheduleRelativeWithState")(js.Any.fromFunction3((t0: js.Any, t1: TRelative, t2: js.Function2[
  /* scheduler */ typingsJapgolly.rxCore.Rx.IScheduler, 
  js.Any, 
  typingsJapgolly.rxCore.Rx.IDisposable]) => scheduleRelativeWithState(t0, t1, t2).runNow()))
    __obj.updateDynamic("scheduleWithAbsolute")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function0[scala.Unit]) => scheduleWithAbsolute(t0, t1).runNow()))
    __obj.updateDynamic("scheduleWithAbsoluteAndState")(js.Any.fromFunction3((t0: js.Any, t1: scala.Double, t2: js.Function2[
  typingsJapgolly.rxLiteVirtualtime.Rx.VirtualTimeScheduler[TAbsolute, TRelative], 
  js.Any, 
  typingsJapgolly.rxCore.Rx.IDisposable]) => scheduleWithAbsoluteAndState(t0, t1, t2).runNow()))
    __obj.updateDynamic("scheduleWithRelative")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function0[scala.Unit]) => scheduleWithRelative(t0, t1).runNow()))
    __obj.updateDynamic("scheduleWithRelativeAndState")(js.Any.fromFunction3((t0: js.Any, t1: scala.Double, t2: js.Function2[
  typingsJapgolly.rxLiteVirtualtime.Rx.VirtualTimeScheduler[TAbsolute, TRelative], 
  js.Any, 
  typingsJapgolly.rxCore.Rx.IDisposable]) => scheduleWithRelativeAndState(t0, t1, t2).runNow()))
    __obj.updateDynamic("scheduleWithState")(js.Any.fromFunction2((t0: js.Any, t1: js.Function2[
  typingsJapgolly.rxLiteVirtualtime.Rx.VirtualTimeScheduler[TAbsolute, TRelative], 
  js.Any, 
  typingsJapgolly.rxCore.Rx.IDisposable]) => scheduleWithState(t0, t1).runNow()))
    __obj.updateDynamic("sleep")(js.Any.fromFunction1((t0: TRelative) => sleep(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.updateDynamic("toDateTimeOffset")(js.Any.fromFunction1((t0: TAbsolute) => toDateTimeOffset(t0).runNow()))
    __obj.updateDynamic("toRelative")(js.Any.fromFunction1((t0: scala.Double) => toRelative(t0).runNow()))
    __obj.asInstanceOf[VirtualTimeScheduler[TAbsolute, TRelative]]
  }
}

