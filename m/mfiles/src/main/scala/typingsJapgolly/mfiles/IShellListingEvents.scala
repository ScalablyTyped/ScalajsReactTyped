package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellListingEvents extends IEvents {
  var OnContentChanged: js.UndefOr[js.Function1[/* items */ IShellItems, Unit]] = js.undefined
  var OnListingActivated: js.UndefOr[js.Function1[/* oldListing */ Null | IShellListing, Unit]] = js.undefined
  var OnListingDeactivated: js.UndefOr[js.Function1[/* newListing */ Null | IShellListing, Unit]] = js.undefined
  var OnSelectedItemsChanged: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.undefined
  var OnSelectionChanged: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.undefined
  var OnShowContextMenu: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.undefined
  var OnShowMainMenu: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IShellListingEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => CallbackTo[Double],
    Unregister: Double => Callback,
    OnContentChanged: /* items */ IShellItems => Callback = null,
    OnListingActivated: /* oldListing */ Null | IShellListing => Callback = null,
    OnListingDeactivated: /* newListing */ Null | IShellListing => Callback = null,
    OnSelectedItemsChanged: /* selectedItems */ IShellItems => Callback = null,
    OnSelectionChanged: /* selectedItems */ IShellItems => Callback = null,
    OnShowContextMenu: /* selectedItems */ IShellItems => Callback = null,
    OnShowMainMenu: /* selectedItems */ IShellItems => Callback = null,
    OnStarted: js.UndefOr[Callback] = js.undefined,
    OnStop: js.UndefOr[Callback] = js.undefined
  ): IShellListingEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.Event, t1: js.Function) => Register(t0, t1).runNow()))
    __obj.updateDynamic("Unregister")(js.Any.fromFunction1((t0: scala.Double) => Unregister(t0).runNow()))
    if (OnContentChanged != null) __obj.updateDynamic("OnContentChanged")(js.Any.fromFunction1((t0: /* items */ typingsJapgolly.mfiles.IShellItems) => OnContentChanged(t0).runNow()))
    if (OnListingActivated != null) __obj.updateDynamic("OnListingActivated")(js.Any.fromFunction1((t0: /* oldListing */ scala.Null | typingsJapgolly.mfiles.IShellListing) => OnListingActivated(t0).runNow()))
    if (OnListingDeactivated != null) __obj.updateDynamic("OnListingDeactivated")(js.Any.fromFunction1((t0: /* newListing */ scala.Null | typingsJapgolly.mfiles.IShellListing) => OnListingDeactivated(t0).runNow()))
    if (OnSelectedItemsChanged != null) __obj.updateDynamic("OnSelectedItemsChanged")(js.Any.fromFunction1((t0: /* selectedItems */ typingsJapgolly.mfiles.IShellItems) => OnSelectedItemsChanged(t0).runNow()))
    if (OnSelectionChanged != null) __obj.updateDynamic("OnSelectionChanged")(js.Any.fromFunction1((t0: /* selectedItems */ typingsJapgolly.mfiles.IShellItems) => OnSelectionChanged(t0).runNow()))
    if (OnShowContextMenu != null) __obj.updateDynamic("OnShowContextMenu")(js.Any.fromFunction1((t0: /* selectedItems */ typingsJapgolly.mfiles.IShellItems) => OnShowContextMenu(t0).runNow()))
    if (OnShowMainMenu != null) __obj.updateDynamic("OnShowMainMenu")(js.Any.fromFunction1((t0: /* selectedItems */ typingsJapgolly.mfiles.IShellItems) => OnShowMainMenu(t0).runNow()))
    OnStarted.foreach(p => __obj.updateDynamic("OnStarted")(p.toJsFn))
    OnStop.foreach(p => __obj.updateDynamic("OnStop")(p.toJsFn))
    __obj.asInstanceOf[IShellListingEvents]
  }
}

