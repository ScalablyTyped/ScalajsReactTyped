package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneEvents extends IEvents {
  var OnHidePane: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnShowPane: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ISearchPaneEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => CallbackTo[Double],
    Unregister: Double => Callback,
    OnHidePane: js.UndefOr[Callback] = js.undefined,
    OnShowPane: js.UndefOr[Callback] = js.undefined,
    OnStarted: js.UndefOr[Callback] = js.undefined,
    OnStop: js.UndefOr[Callback] = js.undefined
  ): ISearchPaneEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.Event, t1: js.Function) => Register(t0, t1).runNow()))
    __obj.updateDynamic("Unregister")(js.Any.fromFunction1((t0: scala.Double) => Unregister(t0).runNow()))
    OnHidePane.foreach(p => __obj.updateDynamic("OnHidePane")(p.toJsFn))
    OnShowPane.foreach(p => __obj.updateDynamic("OnShowPane")(p.toJsFn))
    OnStarted.foreach(p => __obj.updateDynamic("OnStarted")(p.toJsFn))
    OnStop.foreach(p => __obj.updateDynamic("OnStop")(p.toJsFn))
    __obj.asInstanceOf[ISearchPaneEvents]
  }
}

