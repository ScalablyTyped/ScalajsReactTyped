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
- typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IAttributeType because Already inherited
- typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IBooleanAttributeType because var conflicts: containerAsAttribute, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.BooleanAttributeType")
@js.native
class BooleanAttributeType protected () extends AttributeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FBooleanAttributeType: IModel = js.native
  @JSName("containerAsAttribute")
  def containerAsAttribute_MBooleanAttributeType(): Attribute = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.BooleanAttributeType")
@js.native
object BooleanAttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BooleanAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): BooleanAttributeType = js.native
  /**
    * Creates and returns a new BooleanAttributeType instance in the SDK and on the server.
    * The new BooleanAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createIn(container: Attribute): BooleanAttributeType = js.native
}

