package typingsJapgolly.mendixmodelsdk.allModelClassesMod.messagedefinitions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.Element
import typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `MessageDefinitions`.
  */
/**
  * In version 7.10.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AssociationElement")
@js.native
class AssociationElement protected ()
  extends typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.AssociationElement")
@js.native
object AssociationElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AssociationElement instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement = js.native
  /**
    * Creates and returns a new AssociationElement instance in the SDK and on the server.
    * The new AssociationElement will be automatically stored in the 'children' property
    * of the parent mappings.Element element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.10.0 and higher
    */
  def createInElementUnderChildren(container: Element): typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement = js.native
  /**
    * Creates and returns a new AssociationElement instance in the SDK and on the server.
    * The new AssociationElement will be automatically stored in the 'elements' property
    * of the parent jsonstructures.JsonStructure element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.10.0 and higher
    */
  def createInJsonStructureUnderElements(container: JsonStructure): typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement = js.native
}

