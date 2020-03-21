package typingsJapgolly.mendixmodelsdk.allModelClassesMod.reports

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomMapping")
@js.native
class ReportZoomMapping protected ()
  extends typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportZoomMapping {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomMapping")
@js.native
object ReportZoomMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportZoomMapping = js.native
  /**
    * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
    * The new ReportZoomMapping will be automatically stored in the 'mappings' property
    * of the parent ReportZoomInfo element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportZoomInfo): typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportZoomMapping = js.native
}

