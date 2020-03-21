package typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes

import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.AppServiceAction
import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.constantsMod.constants.Constant
import typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetColumn
import typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetParameter
import typingsJapgolly.mendixmodelsdk.datatypesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typingsJapgolly.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration
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
- typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.IEnumerationType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, id, isLoaded, model, structureTypeName, unit. Inlined enumeration, enumerationQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.EnumerationType")
@js.native
class EnumerationType protected () extends DataType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("enumerationQualifiedName")
  val enumerationQualifiedName_FEnumerationType: String = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("enumeration")
  val enumeration_FEnumerationType: IEnumeration = js.native
  @JSName("model")
  var model_FEnumerationType: IModel = js.native
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MEnumerationType(): AppServiceActionParameter = js.native
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MEnumerationType(): AppServiceAction = js.native
  @JSName("containerAsConstant")
  def containerAsConstant_MEnumerationType(): Constant = js.native
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MEnumerationType(): DataSetParameter = js.native
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MEnumerationType(): DocumentTemplateParameter = js.native
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MEnumerationType(): ImportMapping = js.native
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MEnumerationType(): MicroflowBase = js.native
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MEnumerationType(): MicroflowParameterBase = js.native
  def enumeration(): IEnumeration = js.native
  def enumeration(newValue: IEnumeration): js.Any = js.native
  def enumerationQualifiedName(): String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.EnumerationType")
@js.native
object EnumerationType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConstantUnderType(container: Constant): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetColumnUnderColumnType(container: DataSetColumn): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetParameterUnderParameterType(container: DataSetParameter): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  def createInImportMappingUnderParameterType(container: ImportMapping): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedParameterUnderParameterType(container: PublishedParameter): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInRestOperationParameterUnderType(container: RestOperationParameter): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInResultHandlingUnderVariableType(container: ResultHandling): EnumerationType = js.native
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInValueMappingElementUnderType(container: ValueMappingElement): EnumerationType = js.native
}

