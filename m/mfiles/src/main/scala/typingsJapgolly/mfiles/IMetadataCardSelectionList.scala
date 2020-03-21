package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardSelectionList extends js.Object {
  val Events: IEvents
  val Filter: String
  val FilteringValue: String
  val Items: js.Any
  val MoreResults: Boolean
  def AutoSelect(identifier: String): Unit
  def SetFilter(Filter: String, token: Double, maxResults: Double): Unit
}

object IMetadataCardSelectionList {
  @scala.inline
  def apply(
    AutoSelect: String => Callback,
    Events: IEvents,
    Filter: String,
    FilteringValue: String,
    Items: js.Any,
    MoreResults: Boolean,
    SetFilter: (String, Double, Double) => Callback
  ): IMetadataCardSelectionList = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FilteringValue = FilteringValue.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any])
    __obj.updateDynamic("AutoSelect")(js.Any.fromFunction1((t0: java.lang.String) => AutoSelect(t0).runNow()))
    __obj.updateDynamic("SetFilter")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => SetFilter(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IMetadataCardSelectionList]
  }
}

