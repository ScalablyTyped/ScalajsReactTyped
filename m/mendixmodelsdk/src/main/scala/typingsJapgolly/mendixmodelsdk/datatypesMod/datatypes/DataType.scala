package typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes

import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.AppServiceAction
import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter
import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction
import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.IAppServiceActionParameter
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.constantsMod.constants.Constant
import typingsJapgolly.mendixmodelsdk.constantsMod.constants.IConstant
import typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetColumn
import typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetParameter
import typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter
import typingsJapgolly.mendixmodelsdk.datatypesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typingsJapgolly.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typingsJapgolly.mendixmodelsdk.importmappingsMod.importmappings.ImportMapping
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ValueMappingElement
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.CreateVariableAction
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameterBase
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowBase
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterBase
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterObject
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.ResultHandling
import typingsJapgolly.mendixmodelsdk.restMod.rest.RestOperationParameter
import typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.PublishedOperation
import typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.PublishedParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.IDataType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.DataType")
@js.native
abstract class DataType protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsAppServiceActionParameter")
  val containerAsAppServiceActionParameter_FDataType: IAppServiceActionParameter = js.native
  @JSName("containerAsAppServiceAction")
  val containerAsAppServiceAction_FDataType: IAppServiceAction = js.native
  @JSName("containerAsConstant")
  val containerAsConstant_FDataType: IConstant = js.native
  @JSName("containerAsDataSetParameter")
  val containerAsDataSetParameter_FDataType: IDataSetParameter = js.native
  @JSName("containerAsDocumentTemplateParameter")
  val containerAsDocumentTemplateParameter_FDataType: IDocumentTemplateParameter = js.native
  @JSName("containerAsImportMapping")
  val containerAsImportMapping_FDataType: IImportMapping = js.native
  @JSName("containerAsMicroflowBase")
  val containerAsMicroflowBase_FDataType: IMicroflowBase = js.native
  @JSName("containerAsMicroflowParameterBase")
  val containerAsMicroflowParameterBase_FDataType: IMicroflowParameterBase = js.native
  @JSName("model")
  var model_FDataType: IModel = js.native
  def containerAsAppServiceAction(): AppServiceAction = js.native
  def containerAsAppServiceActionParameter(): AppServiceActionParameter = js.native
  def containerAsConstant(): Constant = js.native
  def containerAsCreateVariableAction(): CreateVariableAction = js.native
  def containerAsDataSetColumn(): DataSetColumn = js.native
  def containerAsDataSetParameter(): DataSetParameter = js.native
  def containerAsDocumentTemplateParameter(): DocumentTemplateParameter = js.native
  def containerAsImportMapping(): ImportMapping = js.native
  def containerAsMicroflowBase(): MicroflowBase = js.native
  def containerAsMicroflowParameterBase(): MicroflowParameterBase = js.native
  def containerAsMicroflowParameterObject(): MicroflowParameterObject = js.native
  def containerAsPublishedOperation(): PublishedOperation = js.native
  def containerAsPublishedParameter(): PublishedParameter = js.native
  def containerAsRestOperationParameter(): RestOperationParameter = js.native
  def containerAsResultHandling(): ResultHandling = js.native
  def containerAsValueMappingElement(): ValueMappingElement = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.DataType")
@js.native
object DataType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

