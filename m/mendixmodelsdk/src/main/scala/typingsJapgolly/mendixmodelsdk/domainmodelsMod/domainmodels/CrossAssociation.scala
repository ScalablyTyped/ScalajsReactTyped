package typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase because Already inherited
- typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.ICrossAssociation because var conflicts: containerAsDomainModel, id, isLoaded, model, name, owner, parent, qualifiedName, remoteSourceDocument, remoteSourceDocumentQualifiedName, structureTypeName, `type`, unit. Inlined child, childQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.CrossAssociation")
@js.native
class CrossAssociation protected () extends AssociationBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("childQualifiedName")
  val childQualifiedName_FCrossAssociation: String = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("child")
  val child_FCrossAssociation: IEntity = js.native
  @JSName("model")
  var model_FCrossAssociation: IModel = js.native
  def child(): IEntity = js.native
  def child(newValue: IEntity): js.Any = js.native
  def childQualifiedName(): String = js.native
  @JSName("containerAsDomainModel")
  def containerAsDomainModel_MCrossAssociation(): DomainModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.CrossAssociation")
@js.native
object CrossAssociation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CrossAssociation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CrossAssociation = js.native
  /**
    * Creates and returns a new CrossAssociation instance in the SDK and on the server.
    * The new CrossAssociation will be automatically stored in the 'crossAssociations' property
    * of the parent DomainModel element passed as argument.
    */
  def createIn(container: DomainModel): CrossAssociation = js.native
}

