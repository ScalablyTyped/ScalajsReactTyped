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
- typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.INumericAttributeTypeBase because Already inherited
- typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IIntegerAttributeTypeBase because Already inherited
- typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IAutoNumberAttributeType because var conflicts: containerAsAttribute, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AutoNumberAttributeType")
@js.native
class AutoNumberAttributeType protected () extends IntegerAttributeTypeBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FAutoNumberAttributeType: IModel = js.native
  @JSName("containerAsAttribute")
  def containerAsAttribute_MAutoNumberAttributeType(): Attribute = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AutoNumberAttributeType")
@js.native
object AutoNumberAttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): AutoNumberAttributeType = js.native
  /**
    * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
    * The new AutoNumberAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createIn(container: Attribute): AutoNumberAttributeType = js.native
}

