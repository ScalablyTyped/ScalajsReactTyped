package typingsJapgolly.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `groupShapeCollection.toJSON()`. */
trait GroupShapeCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ShapeData]] = js.undefined
}

object GroupShapeCollectionData {
  @scala.inline
  def apply(items: js.Array[ShapeData] = null): GroupShapeCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupShapeCollectionData]
  }
}

