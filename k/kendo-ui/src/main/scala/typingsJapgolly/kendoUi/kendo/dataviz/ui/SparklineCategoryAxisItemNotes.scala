package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineCategoryAxisItemNotes extends js.Object {
  var data: js.UndefOr[js.Array[SparklineCategoryAxisItemNotesDataItem]] = js.undefined
  var icon: js.UndefOr[SparklineCategoryAxisItemNotesIcon] = js.undefined
  var label: js.UndefOr[SparklineCategoryAxisItemNotesLabel] = js.undefined
  var line: js.UndefOr[SparklineCategoryAxisItemNotesLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object SparklineCategoryAxisItemNotes {
  @scala.inline
  def apply(
    data: js.Array[SparklineCategoryAxisItemNotesDataItem] = null,
    icon: SparklineCategoryAxisItemNotesIcon = null,
    label: SparklineCategoryAxisItemNotesLabel = null,
    line: SparklineCategoryAxisItemNotesLine = null,
    position: String = null
  ): SparklineCategoryAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineCategoryAxisItemNotes]
  }
}

