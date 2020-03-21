package typingsJapgolly.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `slicerCollection.toJSON()`. */
trait SlicerCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[SlicerData]] = js.undefined
}

object SlicerCollectionData {
  @scala.inline
  def apply(items: js.Array[SlicerData] = null): SlicerCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicerCollectionData]
  }
}

