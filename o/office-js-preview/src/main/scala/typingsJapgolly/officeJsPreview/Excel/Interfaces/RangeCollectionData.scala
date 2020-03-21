package typingsJapgolly.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rangeCollection.toJSON()`. */
trait RangeCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[RangeData]] = js.undefined
}

object RangeCollectionData {
  @scala.inline
  def apply(items: js.Array[RangeData] = null): RangeCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeCollectionData]
  }
}

