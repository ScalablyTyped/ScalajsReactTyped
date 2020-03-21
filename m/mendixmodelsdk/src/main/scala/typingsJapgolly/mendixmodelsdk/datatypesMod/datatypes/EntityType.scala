package typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes

import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.AppServiceAction
import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.constantsMod.constants.Constant
import typingsJapgolly.mendixmodelsdk.datasetsMod.datasets.DataSetParameter
import typingsJapgolly.mendixmodelsdk.datatypesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsJapgolly.mendixmodelsdk.importmappingsMod.importmappings.ImportMapping
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowBase
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterBase
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
- typingsJapgolly.mendixmodelsdk.datatypesMod.datatypes.IEntityType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.EntityType")
@js.native
abstract class EntityType protected () extends DataType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("entityQualifiedName")
  val entityQualifiedName_FEntityType: String = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("entity")
  val entity_FEntityType: IEntity = js.native
  @JSName("model")
  var model_FEntityType: IModel = js.native
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MEntityType(): AppServiceActionParameter = js.native
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MEntityType(): AppServiceAction = js.native
  @JSName("containerAsConstant")
  def containerAsConstant_MEntityType(): Constant = js.native
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MEntityType(): DataSetParameter = js.native
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MEntityType(): DocumentTemplateParameter = js.native
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MEntityType(): ImportMapping = js.native
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MEntityType(): MicroflowBase = js.native
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MEntityType(): MicroflowParameterBase = js.native
  def entity(): IEntity = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName(): String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.EntityType")
@js.native
object EntityType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

