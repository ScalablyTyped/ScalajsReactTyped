package typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
  *
  * In version 7.6.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinition because Already inherited
- typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IEntityMessageDefinition because var conflicts: containerAsMessageDefinitionCollection, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition")
@js.native
class EntityMessageDefinition protected () extends MessageDefinition {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEntityMessageDefinition: IModel = js.native
  @JSName("containerAsMessageDefinitionCollection")
  def containerAsMessageDefinitionCollection_MEntityMessageDefinition(): MessageDefinitionCollection = js.native
  def exposedEntity(): js.Any = js.native
  def exposedEntity(newValue: ExposedEntity): js.Any = js.native
  @JSName("exposedEntity")
  def exposedEntity_Union(): ExposedEntity | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition")
@js.native
object EntityMessageDefinition extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityMessageDefinition = js.native
  /**
    * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
    * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
    * of the parent MessageDefinitionCollection element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createIn(container: MessageDefinitionCollection): EntityMessageDefinition = js.native
}

