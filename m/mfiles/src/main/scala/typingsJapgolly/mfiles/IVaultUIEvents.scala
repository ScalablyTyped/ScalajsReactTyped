package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultUIEvents extends IEvents {
  var OnNewVaultEntry: js.UndefOr[js.Function1[/* vaultEntry */ IVaultEntry, Unit | IVaultEntryEvents]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IVaultUIEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => CallbackTo[Double],
    Unregister: Double => Callback,
    OnNewVaultEntry: /* vaultEntry */ IVaultEntry => CallbackTo[Unit | IVaultEntryEvents] = null,
    OnStarted: js.UndefOr[Callback] = js.undefined,
    OnStop: js.UndefOr[Callback] = js.undefined
  ): IVaultUIEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.Event, t1: js.Function) => Register(t0, t1).runNow()))
    __obj.updateDynamic("Unregister")(js.Any.fromFunction1((t0: scala.Double) => Unregister(t0).runNow()))
    if (OnNewVaultEntry != null) __obj.updateDynamic("OnNewVaultEntry")(js.Any.fromFunction1((t0: /* vaultEntry */ typingsJapgolly.mfiles.IVaultEntry) => OnNewVaultEntry(t0).runNow()))
    OnStarted.foreach(p => __obj.updateDynamic("OnStarted")(p.toJsFn))
    OnStop.foreach(p => __obj.updateDynamic("OnStop")(p.toJsFn))
    __obj.asInstanceOf[IVaultUIEvents]
  }
}

