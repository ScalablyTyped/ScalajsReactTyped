package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFMetadataStructureItem
import typingsJapgolly.mfiles.MFiles.MFMetadataStructureSelectorFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataStructureSelector extends js.Object {
  var Flags: MFMetadataStructureSelectorFlags
  var ID: String
  var Name: String
  var StructureItemGUID: String
  var StructureItemID: Double
  var StructureItemSemanticAlias: String
  var StructureItemType: MFMetadataStructureItem
  def Clone(): IMetadataStructureSelector
}

object IMetadataStructureSelector {
  @scala.inline
  def apply(
    Clone: CallbackTo[IMetadataStructureSelector],
    Flags: MFMetadataStructureSelectorFlags,
    ID: String,
    Name: String,
    StructureItemGUID: String,
    StructureItemID: Double,
    StructureItemSemanticAlias: String,
    StructureItemType: MFMetadataStructureItem
  ): IMetadataStructureSelector = {
    val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], StructureItemGUID = StructureItemGUID.asInstanceOf[js.Any], StructureItemID = StructureItemID.asInstanceOf[js.Any], StructureItemSemanticAlias = StructureItemSemanticAlias.asInstanceOf[js.Any], StructureItemType = StructureItemType.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IMetadataStructureSelector]
  }
}

