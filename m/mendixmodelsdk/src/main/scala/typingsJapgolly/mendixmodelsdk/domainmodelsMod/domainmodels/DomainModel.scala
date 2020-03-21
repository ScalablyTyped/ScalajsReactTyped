package typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModule
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.Module
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.ModuleDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/domain-model relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IDomainModel because var conflicts: containerAsFolderBase, containerAsModule, id, isLoaded, model, structureTypeName, unit. Inlined entities, associations, crossAssociations */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DomainModel")
@js.native
class DomainModel protected () extends ModuleDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IModule
  ) = this()
  @JSName("associations")
  val associations_FDomainModel: IList[IAssociation] = js.native
  @JSName("crossAssociations")
  val crossAssociations_FDomainModel: IList[ICrossAssociation] = js.native
  @JSName("entities")
  val entities_FDomainModel: IList[IEntity] = js.native
  @JSName("model")
  var model_FDomainModel: IModel = js.native
  def annotations(): IList[Annotation] = js.native
  def associations(): IList[Association] = js.native
  @JSName("containerAsModule")
  def containerAsModule_MDomainModel(): Module = js.native
  def crossAssociations(): IList[CrossAssociation] = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def entities(): IList[Entity] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DomainModel")
@js.native
object DomainModel extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new DomainModel unit in the SDK and on the server.
    * Expects one argument, the projects.IModule in which this unit is contained.
    */
  def createIn(container: IModule): DomainModel = js.native
}

