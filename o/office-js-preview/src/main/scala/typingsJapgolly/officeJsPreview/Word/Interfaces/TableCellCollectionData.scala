package typingsJapgolly.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableCellCollection.toJSON()". */
trait TableCellCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[TableCellData]] = js.undefined
}

object TableCellCollectionData {
  @scala.inline
  def apply(items: js.Array[TableCellData] = null): TableCellCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellCollectionData]
  }
}

