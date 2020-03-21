package typingsJapgolly.mendixmodelsdk.mod.reports

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "reports.BasicReportAggregate")
@js.native
class BasicReportAggregate protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.reports.BasicReportAggregate {
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
@JSImport("mendixmodelsdk", "reports.BasicReportAggregate")
@js.native
object BasicReportAggregate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.reportsMod.reports.BasicReportAggregate = js.native
  /**
    * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
    * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
    * of the parent BasicReport element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.reportsMod.reports.BasicReport): typingsJapgolly.mendixmodelsdk.reportsMod.reports.BasicReportAggregate = js.native
}

