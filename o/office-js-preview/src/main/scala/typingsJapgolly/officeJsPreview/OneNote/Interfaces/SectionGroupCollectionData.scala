package typingsJapgolly.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "sectionGroupCollection.toJSON()". */
trait SectionGroupCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[SectionGroupData]] = js.undefined
}

object SectionGroupCollectionData {
  @scala.inline
  def apply(items: js.Array[SectionGroupData] = null): SectionGroupCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionGroupCollectionData]
  }
}

