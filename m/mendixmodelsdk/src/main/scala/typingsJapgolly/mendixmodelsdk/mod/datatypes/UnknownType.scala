package typingsJapgolly.mendixmodelsdk.mod.datatypes

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
@JSImport("mendixmodelsdk", "datatypes.UnknownType")
@js.native
class UnknownType protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.datatypes.UnknownType {
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
@JSImport("mendixmodelsdk", "datatypes.UnknownType")
@js.native
object UnknownType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConstantUnderType(container: Constant): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetColumnUnderColumnType(container: DataSetColumn): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetParameterUnderParameterType(container: DataSetParameter): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  def createInImportMappingUnderParameterType(container: ImportMapping): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedParameterUnderParameterType(container: PublishedParameter): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInRestOperationParameterUnderType(container: RestOperationParameter): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInResultHandlingUnderVariableType(container: ResultHandling): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInValueMappingElementUnderType(container: ValueMappingElement): typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
}

