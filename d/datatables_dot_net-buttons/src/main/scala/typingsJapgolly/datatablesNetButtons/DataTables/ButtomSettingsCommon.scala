package typingsJapgolly.datatablesNetButtons.DataTables

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.datatablesNet.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtomSettingsCommon extends js.Object {
  /**
    * Action to take when the button is activated
    */
  var action: js.UndefOr[FunctionButtonAction] = js.undefined
  /**
    * Ensure that any requirements have been satisfied before initialising a button
    */
  var available: js.UndefOr[FunctionButtonAvailable] = js.undefined
  /**
    * Set the class name for the button
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Function that is called when the button is destroyed
    */
  var destroy: js.UndefOr[FunctionButtonInit] = js.undefined
  /**
    * Set a button's initial enabled state
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Define which button type the button should be based on
    */
  var extend: js.UndefOr[String] = js.undefined
  /**
    * Initialisation function that can be used to add events specific to this button
    */
  var init: js.UndefOr[FunctionButtonInit] = js.undefined
  /**
    * Define an activation key for a button
    */
  var key: js.UndefOr[String | ButtonKey] = js.undefined
  /**
    * Set a name for each selection
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Unique namespace for every button
    */
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * The text to show in the button
    */
  var text: js.UndefOr[String | FunctionButtonText] = js.undefined
  /**
    * Button 'title' attribute text
    */
  var titleAttr: js.UndefOr[String] = js.undefined
}

object ButtomSettingsCommon {
  @scala.inline
  def apply(
    action: (/* e */ js.Any, /* dt */ Api, /* node */ JQuery, /* config */ ButtonSettings) => Callback = null,
    available: (/* dt */ Api, /* config */ js.Any) => CallbackTo[Boolean] = null,
    className: String = null,
    destroy: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => Callback = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    init: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => Callback = null,
    key: String | ButtonKey = null,
    name: String = null,
    namespace: String = null,
    text: String | FunctionButtonText = null,
    titleAttr: String = null
  ): ButtomSettingsCommon = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction4((t0: /* e */ js.Any, t1: /* dt */ typingsJapgolly.datatablesNetButtons.DataTables.Api, t2: /* node */ typingsJapgolly.datatablesNet.JQuery, t3: /* config */ typingsJapgolly.datatablesNetButtons.DataTables.ButtonSettings) => action(t0, t1, t2, t3).runNow()))
    if (available != null) __obj.updateDynamic("available")(js.Any.fromFunction2((t0: /* dt */ typingsJapgolly.datatablesNetButtons.DataTables.Api, t1: /* config */ js.Any) => available(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction3((t0: /* dt */ typingsJapgolly.datatablesNetButtons.DataTables.Api, t1: /* node */ typingsJapgolly.datatablesNet.JQuery, t2: /* config */ js.Any) => destroy(t0, t1, t2).runNow()))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction3((t0: /* dt */ typingsJapgolly.datatablesNetButtons.DataTables.Api, t1: /* node */ typingsJapgolly.datatablesNet.JQuery, t2: /* config */ js.Any) => init(t0, t1, t2).runNow()))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (titleAttr != null) __obj.updateDynamic("titleAttr")(titleAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtomSettingsCommon]
  }
}

