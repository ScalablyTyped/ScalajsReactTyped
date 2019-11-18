package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsEvents extends js.Object {
  var activate: js.UndefOr[TabsEvent[TabsActivationUIParams]] = js.undefined
  var beforeActivate: js.UndefOr[TabsEvent[TabsActivationUIParams]] = js.undefined
  var beforeLoad: js.UndefOr[TabsEvent[TabsBeforeLoadUIParams]] = js.undefined
  var create: js.UndefOr[TabsEvent[TabsCreateOrLoadUIParams]] = js.undefined
  var load: js.UndefOr[TabsEvent[TabsCreateOrLoadUIParams]] = js.undefined
}

object TabsEvents {
  @scala.inline
  def apply(
    activate: (/* event */ JQueryEventObject, TabsActivationUIParams) => Callback = null,
    beforeActivate: (/* event */ JQueryEventObject, TabsActivationUIParams) => Callback = null,
    beforeLoad: (/* event */ JQueryEventObject, TabsBeforeLoadUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Callback = null,
    load: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Callback = null
  ): TabsEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.TabsActivationUIParams) => activate(t0, t1).runNow()))
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.TabsActivationUIParams) => beforeActivate(t0, t1).runNow()))
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.TabsBeforeLoadUIParams) => beforeLoad(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.TabsCreateOrLoadUIParams) => create(t0, t1).runNow()))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.TabsCreateOrLoadUIParams) => load(t0, t1).runNow()))
    __obj.asInstanceOf[TabsEvents]
  }
}

