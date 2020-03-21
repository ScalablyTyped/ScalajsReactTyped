package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellPaneContainerEvents extends IEvents {
  var OnHidePane: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnMinimizedStateChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnNewTab: js.UndefOr[js.Function1[/* tab */ IShellPaneTab, Unit]] = js.undefined
  var OnPaneResized: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnShowPane: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnTabSelected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnTabUnselected: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IShellPaneContainerEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => CallbackTo[Double],
    Unregister: Double => Callback,
    OnHidePane: js.UndefOr[Callback] = js.undefined,
    OnMinimizedStateChanged: js.UndefOr[Callback] = js.undefined,
    OnNewTab: /* tab */ IShellPaneTab => Callback = null,
    OnPaneResized: js.UndefOr[Callback] = js.undefined,
    OnShowPane: js.UndefOr[Callback] = js.undefined,
    OnStarted: js.UndefOr[Callback] = js.undefined,
    OnStop: js.UndefOr[Callback] = js.undefined,
    OnTabSelected: js.UndefOr[Callback] = js.undefined,
    OnTabUnselected: js.UndefOr[Callback] = js.undefined
  ): IShellPaneContainerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.Event, t1: js.Function) => Register(t0, t1).runNow()))
    __obj.updateDynamic("Unregister")(js.Any.fromFunction1((t0: scala.Double) => Unregister(t0).runNow()))
    OnHidePane.foreach(p => __obj.updateDynamic("OnHidePane")(p.toJsFn))
    OnMinimizedStateChanged.foreach(p => __obj.updateDynamic("OnMinimizedStateChanged")(p.toJsFn))
    if (OnNewTab != null) __obj.updateDynamic("OnNewTab")(js.Any.fromFunction1((t0: /* tab */ typingsJapgolly.mfiles.IShellPaneTab) => OnNewTab(t0).runNow()))
    OnPaneResized.foreach(p => __obj.updateDynamic("OnPaneResized")(p.toJsFn))
    OnShowPane.foreach(p => __obj.updateDynamic("OnShowPane")(p.toJsFn))
    OnStarted.foreach(p => __obj.updateDynamic("OnStarted")(p.toJsFn))
    OnStop.foreach(p => __obj.updateDynamic("OnStop")(p.toJsFn))
    OnTabSelected.foreach(p => __obj.updateDynamic("OnTabSelected")(p.toJsFn))
    OnTabUnselected.foreach(p => __obj.updateDynamic("OnTabUnselected")(p.toJsFn))
    __obj.asInstanceOf[IShellPaneContainerEvents]
  }
}

