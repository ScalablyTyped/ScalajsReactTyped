package typingsJapgolly.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `tableScopedCollection.toJSON()`. */
trait TableScopedCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[TableData]] = js.undefined
}

object TableScopedCollectionData {
  @scala.inline
  def apply(items: js.Array[TableData] = null): TableScopedCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableScopedCollectionData]
  }
}

