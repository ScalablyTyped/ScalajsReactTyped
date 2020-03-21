package typingsJapgolly.jodata.jo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettings extends ISettings {
  var CapturedFilter: js.Array[FilterClause]
  var DefaultFilters: js.Array[FilterClause]
  var Filters: js.Array[FilterClause]
  def fullReset(): Unit
  def loadFromJson(filterSettings: js.Any): Unit
}

object FilterSettings {
  @scala.inline
  def apply(
    CapturedFilter: js.Array[FilterClause],
    DefaultFilters: js.Array[FilterClause],
    Filters: js.Array[FilterClause],
    fullReset: Callback,
    isSet: CallbackTo[Boolean],
    loadFromJson: js.Any => Callback,
    reset: Callback
  ): FilterSettings = {
    val __obj = js.Dynamic.literal(CapturedFilter = CapturedFilter.asInstanceOf[js.Any], DefaultFilters = DefaultFilters.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any])
    __obj.updateDynamic("fullReset")(fullReset.toJsFn)
    __obj.updateDynamic("isSet")(isSet.toJsFn)
    __obj.updateDynamic("loadFromJson")(js.Any.fromFunction1((t0: js.Any) => loadFromJson(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[FilterSettings]
  }
}

