package typingsJapgolly.mendixmodelsdk.reportsMod.reports

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.IDataSet
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Widget
import typingsJapgolly.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/report-widgets relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportWidget")
@js.native
abstract class ReportWidget protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FReportWidget: IModel = js.native
  def dataSet(): js.Any = js.native
  def dataSet(newValue: IDataSet): js.Any = js.native
  def dataSetQualifiedName(): String | Null = js.native
  @JSName("dataSet")
  def dataSet_Union(): IDataSet | Null = js.native
  /**
    * In version 6.10.0: introduced
    */
  def generateOnLoad(): Boolean = js.native
  def generateOnLoad(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportWidget")
@js.native
object ReportWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

