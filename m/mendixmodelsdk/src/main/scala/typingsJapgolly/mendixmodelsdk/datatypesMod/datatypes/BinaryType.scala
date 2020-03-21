package typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes

import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.AppServiceAction
import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.constantsMod.constants.Constant
import typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetColumn
import typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetParameter
import typingsJapgolly.mendixmodelsdk.datatypesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typingsJapgolly.mendixmodelsdk.importmappingsMod.importmappings.ImportMapping
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ValueMappingElement
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.CreateVariableAction
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
  * In version 7.9.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.IDataType because Already inherited
- typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.IBinaryType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.BinaryType")
@js.native
class BinaryType protected () extends DataType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FBinaryType: IModel = js.native
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MBinaryType(): AppServiceActionParameter = js.native
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MBinaryType(): AppServiceAction = js.native
  @JSName("containerAsConstant")
  def containerAsConstant_MBinaryType(): Constant = js.native
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MBinaryType(): DataSetParameter = js.native
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MBinaryType(): DocumentTemplateParameter = js.native
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MBinaryType(): ImportMapping = js.native
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MBinaryType(): MicroflowBase = js.native
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MBinaryType(): MicroflowParameterBase = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.BinaryType")
@js.native
object BinaryType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConstantUnderType(container: Constant): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetColumnUnderColumnType(container: DataSetColumn): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetParameterUnderParameterType(container: DataSetParameter): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  def createInImportMappingUnderParameterType(container: ImportMapping): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedParameterUnderParameterType(container: PublishedParameter): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInRestOperationParameterUnderType(container: RestOperationParameter): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInResultHandlingUnderVariableType(container: ResultHandling): BinaryType = js.native
  /**
    * Creates and returns a new BinaryType instance in the SDK and on the server.
    * The new BinaryType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInValueMappingElementUnderType(container: ValueMappingElement): BinaryType = js.native
}

