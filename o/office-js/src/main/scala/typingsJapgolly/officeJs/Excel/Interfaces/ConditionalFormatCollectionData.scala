package typingsJapgolly.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalFormatCollection.toJSON()`. */
trait ConditionalFormatCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ConditionalFormatData]] = js.undefined
}

object ConditionalFormatCollectionData {
  @scala.inline
  def apply(items: js.Array[ConditionalFormatData] = null): ConditionalFormatCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormatCollectionData]
  }
}

