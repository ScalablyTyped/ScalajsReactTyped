package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFMetadataStructureItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExportStructureItem extends js.Object {
  var StructureItemGUID: String
  var StructureItemID: Double
  var StructureItemType: MFMetadataStructureItem
  def Clone(): IExportStructureItem
}

object IExportStructureItem {
  @scala.inline
  def apply(
    Clone: CallbackTo[IExportStructureItem],
    StructureItemGUID: String,
    StructureItemID: Double,
    StructureItemType: MFMetadataStructureItem
  ): IExportStructureItem = {
    val __obj = js.Dynamic.literal(StructureItemGUID = StructureItemGUID.asInstanceOf[js.Any], StructureItemID = StructureItemID.asInstanceOf[js.Any], StructureItemType = StructureItemType.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IExportStructureItem]
  }
}

