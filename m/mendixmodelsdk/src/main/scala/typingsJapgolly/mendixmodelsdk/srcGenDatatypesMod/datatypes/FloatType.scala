package typingsJapgolly.mendixmodelsdk.srcGenDatatypesMod.datatypes

import typingsJapgolly.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceAction
import typingsJapgolly.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceActionParameter
import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenConstantsMod.constants.Constant
import typingsJapgolly.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetColumn
import typingsJapgolly.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter
import typingsJapgolly.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typingsJapgolly.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportMapping
import typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.ValueMappingElement
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.CreateVariableAction
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MLModelCallParameterMapping
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowBase
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowParameterBase
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowParameterObject
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageParameter
import typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.RestOperationParameter
import typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedOperation
import typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedParameter
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.9.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenDatatypesMod.datatypes.IDataType because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenDatatypesMod.datatypes.IFloatType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, containerAsPageParameter, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.FloatType")
@js.native
open class FloatType protected () extends DataType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MFloatType: AppServiceActionParameter = js.native
  
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MFloatType: AppServiceAction = js.native
  
  @JSName("containerAsConstant")
  def containerAsConstant_MFloatType: Constant = js.native
  
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MFloatType: DataSetParameter = js.native
  
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MFloatType: DocumentTemplateParameter = js.native
  
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MFloatType: ImportMapping = js.native
  
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MFloatType: MicroflowBase = js.native
  
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MFloatType: MicroflowParameterBase = js.native
  
  @JSName("containerAsPageParameter")
  def containerAsPageParameter_MFloatType: PageParameter = js.native
}
object FloatType {
  
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.FloatType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.0.1
    */
  /* static member */
  inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.0.1
    */
  /* static member */
  inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInConstantUnderType(container: Constant): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  /* static member */
  inline def createInImportMappingUnderParameterType(container: ImportMapping): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MLModelCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.10.0 to 9.17.0
    */
  /* static member */
  inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent pages.PageParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.4.0 and higher
    */
  /* static member */
  inline def createInPageParameterUnderParameterType(container: PageParameter): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInRestOperationParameterUnderType(container: RestOperationParameter): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInResultHandlingUnderVariableType(container: ResultHandling): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInValueMappingElementUnderType(container: ValueMappingElement): FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[FloatType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.FloatType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.FloatType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
