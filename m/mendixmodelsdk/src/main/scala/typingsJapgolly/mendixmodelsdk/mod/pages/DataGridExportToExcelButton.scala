package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/export-to-excel-button relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.DataGridExportToExcelButton")
@js.native
class DataGridExportToExcelButton protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.DataGridExportToExcelButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "pages.DataGridExportToExcelButton")
@js.native
object DataGridExportToExcelButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataGridExportToExcelButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataGridExportToExcelButton = js.native
  /**
    * Creates and returns a new DataGridExportToExcelButton instance in the SDK and on the server.
    * The new DataGridExportToExcelButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ControlBar): typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataGridExportToExcelButton = js.native
}

