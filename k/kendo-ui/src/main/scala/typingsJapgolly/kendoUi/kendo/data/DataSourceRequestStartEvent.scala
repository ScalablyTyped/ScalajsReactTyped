package typingsJapgolly.kendoUi.kendo.data

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceRequestStartEvent extends DataSourceEvent {
  var `type`: js.UndefOr[String] = js.undefined
  def preventDefault(): Unit
}

object DataSourceRequestStartEvent {
  @scala.inline
  def apply(preventDefault: Callback, sender: DataSource = null, `type`: String = null): DataSourceRequestStartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceRequestStartEvent]
  }
}

