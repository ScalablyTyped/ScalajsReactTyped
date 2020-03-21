package typingsJapgolly.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `commentCollection.toJSON()`. */
trait CommentCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[CommentData]] = js.undefined
}

object CommentCollectionData {
  @scala.inline
  def apply(items: js.Array[CommentData] = null): CommentCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentCollectionData]
  }
}

