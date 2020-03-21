package typingsJapgolly.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ParagraphCollection object, for use in "paragraphCollection.set({ ... })". */
trait ParagraphCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ParagraphData]] = js.undefined
}

object ParagraphCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ParagraphData] = null): ParagraphCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphCollectionUpdateData]
  }
}

