package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tabs //////////////////////////////////////////////////
trait TabsOptions extends TabsEvents {
  var active: js.UndefOr[js.Any] = js.undefined
   // boolean or number
  var classes: js.UndefOr[TabClasses] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[js.Any] = js.undefined
   // boolean or []
  var event: js.UndefOr[String] = js.undefined
  var heightStyle: js.UndefOr[String] = js.undefined
  var hide: js.UndefOr[js.Any] = js.undefined
   // boolean, number, string or object
  var show: js.UndefOr[js.Any] = js.undefined
}

object TabsOptions {
  @scala.inline
  def apply(
    activate: (/* event */ JQueryEventObject, TabsActivationUIParams) => Callback = null,
    active: js.Any = null,
    beforeActivate: (/* event */ JQueryEventObject, TabsActivationUIParams) => Callback = null,
    beforeLoad: (/* event */ JQueryEventObject, TabsBeforeLoadUIParams) => Callback = null,
    classes: TabClasses = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    create: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Callback = null,
    disabled: js.Any = null,
    event: String = null,
    heightStyle: String = null,
    hide: js.Any = null,
    load: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Callback = null,
    show: js.Any = null
  ): TabsOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.TabsActivationUIParams) => activate(t0, t1).runNow()))
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.TabsActivationUIParams) => beforeActivate(t0, t1).runNow()))
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.TabsBeforeLoadUIParams) => beforeLoad(t0, t1).runNow()))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.TabsCreateOrLoadUIParams) => create(t0, t1).runNow()))
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (heightStyle != null) __obj.updateDynamic("heightStyle")(heightStyle.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.TabsCreateOrLoadUIParams) => load(t0, t1).runNow()))
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsOptions]
  }
}

