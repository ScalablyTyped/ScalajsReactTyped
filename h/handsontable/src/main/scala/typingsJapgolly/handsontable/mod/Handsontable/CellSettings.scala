package typingsJapgolly.handsontable.mod.Handsontable

import typingsJapgolly.handsontable.mod.Handsontable.comments.CommentObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSettings extends CellMeta {
  var col: Double
  var row: Double
}

object CellSettings {
  @scala.inline
  def apply(
    col: Double,
    row: Double,
    comment: CommentObject = null,
    data: String | Double | ColumnDataGetterSetterFunction = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isSearchResult: js.UndefOr[Boolean] = js.undefined,
    skipRowOnPaste: js.UndefOr[Boolean] = js.undefined,
    valid: js.UndefOr[Boolean] = js.undefined
  ): CellSettings = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearchResult)) __obj.updateDynamic("isSearchResult")(isSearchResult.asInstanceOf[js.Any])
    if (!js.isUndefined(skipRowOnPaste)) __obj.updateDynamic("skipRowOnPaste")(skipRowOnPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellSettings]
  }
}

