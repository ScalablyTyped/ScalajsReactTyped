package typingsJapgolly.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "listCollection.toJSON()". */
trait ListCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ListData]] = js.undefined
}

object ListCollectionData {
  @scala.inline
  def apply(items: js.Array[ListData] = null): ListCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCollectionData]
  }
}

