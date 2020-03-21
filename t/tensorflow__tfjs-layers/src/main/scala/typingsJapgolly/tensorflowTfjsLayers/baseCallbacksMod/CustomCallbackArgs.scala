package typingsJapgolly.tensorflowTfjsLayers.baseCallbacksMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsLayers.logsMod.Logs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomCallbackArgs extends js.Object {
  var onBatchBegin: js.UndefOr[
    js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.undefined
  var onBatchEnd: js.UndefOr[
    js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.undefined
  var onEpochBegin: js.UndefOr[
    js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.undefined
  var onEpochEnd: js.UndefOr[
    js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.undefined
  var onTrainBegin: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.undefined
  var onTrainEnd: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.undefined
  var onYield: js.UndefOr[
    js.Function3[/* epoch */ Double, /* batch */ Double, /* logs */ Logs, Unit | js.Promise[Unit]]
  ] = js.undefined
}

object CustomCallbackArgs {
  @scala.inline
  def apply(
    onBatchBegin: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => CallbackTo[Unit | js.Promise[Unit]] = null,
    onBatchEnd: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => CallbackTo[Unit | js.Promise[Unit]] = null,
    onEpochBegin: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => CallbackTo[Unit | js.Promise[Unit]] = null,
    onEpochEnd: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => CallbackTo[Unit | js.Promise[Unit]] = null,
    onTrainBegin: /* logs */ js.UndefOr[Logs] => CallbackTo[Unit | js.Promise[Unit]] = null,
    onTrainEnd: /* logs */ js.UndefOr[Logs] => CallbackTo[Unit | js.Promise[Unit]] = null,
    onYield: (/* epoch */ Double, /* batch */ Double, /* logs */ Logs) => CallbackTo[Unit | js.Promise[Unit]] = null
  ): CustomCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (onBatchBegin != null) __obj.updateDynamic("onBatchBegin")(js.Any.fromFunction2((t0: /* batch */ scala.Double, t1: /* logs */ js.UndefOr[typingsJapgolly.tensorflowTfjsLayers.logsMod.Logs]) => onBatchBegin(t0, t1).runNow()))
    if (onBatchEnd != null) __obj.updateDynamic("onBatchEnd")(js.Any.fromFunction2((t0: /* batch */ scala.Double, t1: /* logs */ js.UndefOr[typingsJapgolly.tensorflowTfjsLayers.logsMod.Logs]) => onBatchEnd(t0, t1).runNow()))
    if (onEpochBegin != null) __obj.updateDynamic("onEpochBegin")(js.Any.fromFunction2((t0: /* epoch */ scala.Double, t1: /* logs */ js.UndefOr[typingsJapgolly.tensorflowTfjsLayers.logsMod.Logs]) => onEpochBegin(t0, t1).runNow()))
    if (onEpochEnd != null) __obj.updateDynamic("onEpochEnd")(js.Any.fromFunction2((t0: /* epoch */ scala.Double, t1: /* logs */ js.UndefOr[typingsJapgolly.tensorflowTfjsLayers.logsMod.Logs]) => onEpochEnd(t0, t1).runNow()))
    if (onTrainBegin != null) __obj.updateDynamic("onTrainBegin")(js.Any.fromFunction1((t0: /* logs */ js.UndefOr[typingsJapgolly.tensorflowTfjsLayers.logsMod.Logs]) => onTrainBegin(t0).runNow()))
    if (onTrainEnd != null) __obj.updateDynamic("onTrainEnd")(js.Any.fromFunction1((t0: /* logs */ js.UndefOr[typingsJapgolly.tensorflowTfjsLayers.logsMod.Logs]) => onTrainEnd(t0).runNow()))
    if (onYield != null) __obj.updateDynamic("onYield")(js.Any.fromFunction3((t0: /* epoch */ scala.Double, t1: /* batch */ scala.Double, t2: /* logs */ typingsJapgolly.tensorflowTfjsLayers.logsMod.Logs) => onYield(t0, t1, t2).runNow()))
    __obj.asInstanceOf[CustomCallbackArgs]
  }
}

