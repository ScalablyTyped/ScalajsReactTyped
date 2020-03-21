package typingsJapgolly.mendixmodelsdk.mod.messagedefinitions

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
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk", "messagedefinitions.EntityElement")
@js.native
class EntityElement protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.messagedefinitions.EntityElement {
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
@JSImport("mendixmodelsdk", "messagedefinitions.EntityElement")
@js.native
object EntityElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityElement instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement = js.native
  /**
    * Creates and returns a new EntityElement instance in the SDK and on the server.
    * The new EntityElement will be automatically stored in the 'children' property
    * of the parent mappings.Element element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInElementUnderChildren(container: Element): typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement = js.native
  /**
    * Creates and returns a new EntityElement instance in the SDK and on the server.
    * The new EntityElement will be automatically stored in the 'elements' property
    * of the parent jsonstructures.JsonStructure element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInJsonStructureUnderElements(container: JsonStructure): typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement = js.native
}

