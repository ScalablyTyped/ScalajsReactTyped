package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellFrameEvents extends IEvents {
  var OnActiveListingChanged: js.UndefOr[
    js.Function2[/* oldListing */ Null | IShellListing, /* newListing */ IShellListing, Unit]
  ] = js.undefined
  var OnNewBottomPane: js.UndefOr[
    js.Function1[/* bottomPane */ IShellPaneContainer, Unit | IShellPaneContainerEvents]
  ] = js.undefined
  var OnNewCommands: js.UndefOr[js.Function1[/* commands */ ICommands, Unit | ICommandsEvents]] = js.undefined
  var OnNewRightPane: js.UndefOr[
    js.Function1[/* rightPane */ IShellPaneContainer, Unit | IShellPaneContainerEvents]
  ] = js.undefined
  var OnNewSearchPane: js.UndefOr[js.Function1[/* searchPane */ ISearchPane, Unit | ISearchPaneEvents]] = js.undefined
  var OnNewShellListing: js.UndefOr[js.Function1[/* shellListing */ IShellListing, Unit | IShellListingEvents]] = js.undefined
  var OnNewTaskPane: js.UndefOr[js.Function1[/* taskPane */ ITaskPane, Unit | ITaskPaneEvents]] = js.undefined
  var OnShowMainMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IShellFrameEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => CallbackTo[Double],
    Unregister: Double => Callback,
    OnActiveListingChanged: (/* oldListing */ Null | IShellListing, /* newListing */ IShellListing) => Callback = null,
    OnNewBottomPane: /* bottomPane */ IShellPaneContainer => CallbackTo[Unit | IShellPaneContainerEvents] = null,
    OnNewCommands: /* commands */ ICommands => CallbackTo[Unit | ICommandsEvents] = null,
    OnNewRightPane: /* rightPane */ IShellPaneContainer => CallbackTo[Unit | IShellPaneContainerEvents] = null,
    OnNewSearchPane: /* searchPane */ ISearchPane => CallbackTo[Unit | ISearchPaneEvents] = null,
    OnNewShellListing: /* shellListing */ IShellListing => CallbackTo[Unit | IShellListingEvents] = null,
    OnNewTaskPane: /* taskPane */ ITaskPane => CallbackTo[Unit | ITaskPaneEvents] = null,
    OnShowMainMenu: js.UndefOr[Callback] = js.undefined,
    OnStarted: js.UndefOr[Callback] = js.undefined,
    OnStop: js.UndefOr[Callback] = js.undefined
  ): IShellFrameEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.Event, t1: js.Function) => Register(t0, t1).runNow()))
    __obj.updateDynamic("Unregister")(js.Any.fromFunction1((t0: scala.Double) => Unregister(t0).runNow()))
    if (OnActiveListingChanged != null) __obj.updateDynamic("OnActiveListingChanged")(js.Any.fromFunction2((t0: /* oldListing */ scala.Null | typingsJapgolly.mfiles.IShellListing, t1: /* newListing */ typingsJapgolly.mfiles.IShellListing) => OnActiveListingChanged(t0, t1).runNow()))
    if (OnNewBottomPane != null) __obj.updateDynamic("OnNewBottomPane")(js.Any.fromFunction1((t0: /* bottomPane */ typingsJapgolly.mfiles.IShellPaneContainer) => OnNewBottomPane(t0).runNow()))
    if (OnNewCommands != null) __obj.updateDynamic("OnNewCommands")(js.Any.fromFunction1((t0: /* commands */ typingsJapgolly.mfiles.ICommands) => OnNewCommands(t0).runNow()))
    if (OnNewRightPane != null) __obj.updateDynamic("OnNewRightPane")(js.Any.fromFunction1((t0: /* rightPane */ typingsJapgolly.mfiles.IShellPaneContainer) => OnNewRightPane(t0).runNow()))
    if (OnNewSearchPane != null) __obj.updateDynamic("OnNewSearchPane")(js.Any.fromFunction1((t0: /* searchPane */ typingsJapgolly.mfiles.ISearchPane) => OnNewSearchPane(t0).runNow()))
    if (OnNewShellListing != null) __obj.updateDynamic("OnNewShellListing")(js.Any.fromFunction1((t0: /* shellListing */ typingsJapgolly.mfiles.IShellListing) => OnNewShellListing(t0).runNow()))
    if (OnNewTaskPane != null) __obj.updateDynamic("OnNewTaskPane")(js.Any.fromFunction1((t0: /* taskPane */ typingsJapgolly.mfiles.ITaskPane) => OnNewTaskPane(t0).runNow()))
    OnShowMainMenu.foreach(p => __obj.updateDynamic("OnShowMainMenu")(p.toJsFn))
    OnStarted.foreach(p => __obj.updateDynamic("OnStarted")(p.toJsFn))
    OnStop.foreach(p => __obj.updateDynamic("OnStop")(p.toJsFn))
    __obj.asInstanceOf[IShellFrameEvents]
  }
}

