package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellPaneTabEvents extends IEvents {
  var OnHideTab: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnShowTab: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnTabSelected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnTabUnselected: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IShellPaneTabEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => CallbackTo[Double],
    Unregister: Double => Callback,
    OnHideTab: js.UndefOr[Callback] = js.undefined,
    OnShowTab: js.UndefOr[Callback] = js.undefined,
    OnStarted: js.UndefOr[Callback] = js.undefined,
    OnStop: js.UndefOr[Callback] = js.undefined,
    OnTabSelected: js.UndefOr[Callback] = js.undefined,
    OnTabUnselected: js.UndefOr[Callback] = js.undefined
  ): IShellPaneTabEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.Event, t1: js.Function) => Register(t0, t1).runNow()))
    __obj.updateDynamic("Unregister")(js.Any.fromFunction1((t0: scala.Double) => Unregister(t0).runNow()))
    OnHideTab.foreach(p => __obj.updateDynamic("OnHideTab")(p.toJsFn))
    OnShowTab.foreach(p => __obj.updateDynamic("OnShowTab")(p.toJsFn))
    OnStarted.foreach(p => __obj.updateDynamic("OnStarted")(p.toJsFn))
    OnStop.foreach(p => __obj.updateDynamic("OnStop")(p.toJsFn))
    OnTabSelected.foreach(p => __obj.updateDynamic("OnTabSelected")(p.toJsFn))
    OnTabUnselected.foreach(p => __obj.updateDynamic("OnTabUnselected")(p.toJsFn))
    __obj.asInstanceOf[IShellPaneTabEvents]
  }
}

