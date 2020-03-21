package typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, `type`, owner, parent, remoteSourceDocument, remoteSourceDocumentQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationBase")
@js.native
abstract class AssociationBase protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsDomainModel")
  val containerAsDomainModel_FAssociationBase: IDomainModel = js.native
  @JSName("model")
  var model_FAssociationBase: IModel = js.native
  @JSName("name")
  val name_FAssociationBase: String = js.native
  @JSName("owner")
  val owner_FAssociationBase: AssociationOwner = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("parent")
  val parent_FAssociationBase: IEntity = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("remoteSourceDocumentQualifiedName")
  val remoteSourceDocumentQualifiedName_FAssociationBase: String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.3.0: introduced
    */
  @JSName("remoteSourceDocument")
  val remoteSourceDocument_FAssociationBase: IRemoteEntitySourceDocument | Null = js.native
  @JSName("type")
  val type_FAssociationBase: AssociationType = js.native
  def containerAsDomainModel(): DomainModel = js.native
  def dataStorageGuid(): String = js.native
  def dataStorageGuid(newValue: String): js.Any = js.native
  def deleteBehavior(): AssociationDeleteBehavior = js.native
  def deleteBehavior(newValue: AssociationDeleteBehavior): js.Any = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  def owner(): AssociationOwner = js.native
  def owner(newValue: AssociationOwner): js.Any = js.native
  def parent(): Entity = js.native
  def parent(newValue: Entity): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MAssociationBase(): String | Null = js.native
  def remoteSourceDocument(): js.Any = js.native
  def remoteSourceDocument(newValue: IRemoteEntitySourceDocument): js.Any = js.native
  def remoteSourceDocumentQualifiedName(): String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.3.0: introduced
    */
  @JSName("remoteSourceDocument")
  def remoteSourceDocument_Union(): IRemoteEntitySourceDocument | Null = js.native
  def `type`(): AssociationType = js.native
  def `type`(newValue: AssociationType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationBase")
@js.native
object AssociationBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

