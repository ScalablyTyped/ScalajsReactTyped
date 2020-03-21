package typingsJapgolly.handsontable.mod.Handsontable.ganttChart

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.handsontableStrings.monday
import typingsJapgolly.handsontable.handsontableStrings.sunday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var allowSplitWeeks: js.UndefOr[Boolean] = js.undefined
  var dataSource: HandsontableBindingInformation | js.Array[DataObject]
  var firstWeekDay: monday | sunday
  var hideDaysAfterFullWeeks: js.UndefOr[Boolean] = js.undefined
  var hideDaysBeforeFullWeeks: js.UndefOr[Boolean] = js.undefined
  var startYear: Double
  var weekHeaderGenerator: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, String]] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    dataSource: HandsontableBindingInformation | js.Array[DataObject],
    firstWeekDay: monday | sunday,
    startYear: Double,
    allowSplitWeeks: js.UndefOr[Boolean] = js.undefined,
    hideDaysAfterFullWeeks: js.UndefOr[Boolean] = js.undefined,
    hideDaysBeforeFullWeeks: js.UndefOr[Boolean] = js.undefined,
    weekHeaderGenerator: (/* start */ Double, /* end */ Double) => CallbackTo[String] = null
  ): Settings = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], firstWeekDay = firstWeekDay.asInstanceOf[js.Any], startYear = startYear.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSplitWeeks)) __obj.updateDynamic("allowSplitWeeks")(allowSplitWeeks.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDaysAfterFullWeeks)) __obj.updateDynamic("hideDaysAfterFullWeeks")(hideDaysAfterFullWeeks.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDaysBeforeFullWeeks)) __obj.updateDynamic("hideDaysBeforeFullWeeks")(hideDaysBeforeFullWeeks.asInstanceOf[js.Any])
    if (weekHeaderGenerator != null) __obj.updateDynamic("weekHeaderGenerator")(js.Any.fromFunction2((t0: /* start */ scala.Double, t1: /* end */ scala.Double) => weekHeaderGenerator(t0, t1).runNow()))
    __obj.asInstanceOf[Settings]
  }
}

