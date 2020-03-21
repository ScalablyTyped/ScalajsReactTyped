package typingsJapgolly.mendixmodelsdk.restMod.rest

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.exportmappingsMod.exportmappings.IExportMapping
import typingsJapgolly.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.CommitEnum
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsJapgolly.mendixmodelsdk.restMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.servicesMod.services.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-rest-operation relevant section in reference guide}
  *
  * In version 7.11.0: removed experimental
  * In version 7.7.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestServiceOperation")
@js.native
class PublishedRestServiceOperation protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FPublishedRestServiceOperation: IModel = js.native
  /**
    * In version 7.14.0: introduced
    */
  def commit(): CommitEnum = js.native
  def commit(newValue: CommitEnum): js.Any = js.native
  def containerAsPublishedRestServiceResource(): PublishedRestServiceResource = js.native
  /**
    * In version 7.15.0: introduced
    */
  def deprecated(): Boolean = js.native
  def deprecated(newValue: Boolean): js.Any = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def exportMapping(): js.Any = js.native
  def exportMapping(newValue: IExportMapping): js.Any = js.native
  def exportMappingQualifiedName(): String | Null = js.native
  /**
    * In version 7.14.0: introduced
    */
  @JSName("exportMapping")
  def exportMapping_Union(): IExportMapping | Null = js.native
  def httpMethod(): HttpMethod = js.native
  def httpMethod(newValue: HttpMethod): js.Any = js.native
  def importMapping(): js.Any = js.native
  def importMapping(newValue: IImportMapping): js.Any = js.native
  def importMappingQualifiedName(): String | Null = js.native
  /**
    * In version 7.14.0: introduced
    */
  @JSName("importMapping")
  def importMapping_Union(): IImportMapping | Null = js.native
  def microflow(): js.Any = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName(): String | Null = js.native
  @JSName("microflow")
  def microflow_Union(): IMicroflow | Null = js.native
  /**
    * In version 7.17.0: introduced
    */
  def objectHandlingBackup(): ObjectHandlingBackupEnum = js.native
  def objectHandlingBackup(newValue: ObjectHandlingBackupEnum): js.Any = js.native
  /**
    * In version 7.17.0: introduced
    */
  def parameters(): IList[RestOperationParameter] = js.native
  def path(): String = js.native
  def path(newValue: String): js.Any = js.native
  def summary(): String = js.native
  def summary(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestServiceOperation")
@js.native
object PublishedRestServiceOperation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PublishedRestServiceOperation = js.native
  /**
    * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
    * The new PublishedRestServiceOperation will be automatically stored in the 'operations' property
    * of the parent PublishedRestServiceResource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 and higher
    */
  def createIn(container: PublishedRestServiceResource): PublishedRestServiceOperation = js.native
}

