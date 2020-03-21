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
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IGeneralizationBase because Already inherited
- typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IGeneralization because var conflicts: containerAsEntity, id, isLoaded, model, structureTypeName, unit. Inlined generalization, generalizationQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Generalization")
@js.native
class Generalization protected () extends GeneralizationBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("generalizationQualifiedName")
  val generalizationQualifiedName_FGeneralization: String = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("generalization")
  val generalization_FGeneralization: IEntity = js.native
  @JSName("model")
  var model_FGeneralization: IModel = js.native
  @JSName("containerAsEntity")
  def containerAsEntity_MGeneralization(): Entity = js.native
  def generalization(): IEntity = js.native
  def generalization(newValue: IEntity): js.Any = js.native
  def generalizationQualifiedName(): String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Generalization")
@js.native
object Generalization extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Generalization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Generalization = js.native
  /**
    * Creates and returns a new Generalization instance in the SDK and on the server.
    * The new Generalization will be automatically stored in the 'generalization' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: Entity): Generalization = js.native
}

