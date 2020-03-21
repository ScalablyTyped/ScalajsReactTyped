package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellUIEvents extends IEvents {
  var OnNewCommonDialogShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  var OnNewEmbeddedShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  var OnNewNormalShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  var OnNewShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IShellUIEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => CallbackTo[Double],
    Unregister: Double => Callback,
    OnNewCommonDialogShellFrame: /* shellFrame */ IShellFrame => CallbackTo[Unit | IShellFrameEvents] = null,
    OnNewEmbeddedShellFrame: /* shellFrame */ IShellFrame => CallbackTo[Unit | IShellFrameEvents] = null,
    OnNewNormalShellFrame: /* shellFrame */ IShellFrame => CallbackTo[Unit | IShellFrameEvents] = null,
    OnNewShellFrame: /* shellFrame */ IShellFrame => CallbackTo[Unit | IShellFrameEvents] = null,
    OnStarted: js.UndefOr[Callback] = js.undefined,
    OnStop: js.UndefOr[Callback] = js.undefined
  ): IShellUIEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.Event, t1: js.Function) => Register(t0, t1).runNow()))
    __obj.updateDynamic("Unregister")(js.Any.fromFunction1((t0: scala.Double) => Unregister(t0).runNow()))
    if (OnNewCommonDialogShellFrame != null) __obj.updateDynamic("OnNewCommonDialogShellFrame")(js.Any.fromFunction1((t0: /* shellFrame */ typingsJapgolly.mfiles.IShellFrame) => OnNewCommonDialogShellFrame(t0).runNow()))
    if (OnNewEmbeddedShellFrame != null) __obj.updateDynamic("OnNewEmbeddedShellFrame")(js.Any.fromFunction1((t0: /* shellFrame */ typingsJapgolly.mfiles.IShellFrame) => OnNewEmbeddedShellFrame(t0).runNow()))
    if (OnNewNormalShellFrame != null) __obj.updateDynamic("OnNewNormalShellFrame")(js.Any.fromFunction1((t0: /* shellFrame */ typingsJapgolly.mfiles.IShellFrame) => OnNewNormalShellFrame(t0).runNow()))
    if (OnNewShellFrame != null) __obj.updateDynamic("OnNewShellFrame")(js.Any.fromFunction1((t0: /* shellFrame */ typingsJapgolly.mfiles.IShellFrame) => OnNewShellFrame(t0).runNow()))
    OnStarted.foreach(p => __obj.updateDynamic("OnStarted")(p.toJsFn))
    OnStop.foreach(p => __obj.updateDynamic("OnStop")(p.toJsFn))
    __obj.asInstanceOf[IShellUIEvents]
  }
}

