package typingsJapgolly.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the NamedItemCollection object, for use in `namedItemCollection.set({ ... })`. */
trait NamedItemCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[NamedItemData]] = js.undefined
}

object NamedItemCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[NamedItemData] = null): NamedItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedItemCollectionUpdateData]
  }
}

