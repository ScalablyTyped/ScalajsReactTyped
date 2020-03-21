package typingsJapgolly.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PageCollection object, for use in "pageCollection.set({ ... })". */
trait PageCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[PageData]] = js.undefined
}

object PageCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[PageData] = null): PageCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageCollectionUpdateData]
  }
}

