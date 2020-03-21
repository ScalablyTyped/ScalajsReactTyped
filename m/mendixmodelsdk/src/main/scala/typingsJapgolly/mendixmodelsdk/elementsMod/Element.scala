package typingsJapgolly.mendixmodelsdk.elementsMod

import typingsJapgolly.mendixmodelsdk.AnonCopy
import typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/elements", "Element")
@js.native
abstract class Element protected () extends AbstractElement {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var _deepCopyElement: js.Any = js.native
  @JSName("container")
  val container_FElement: AbstractElement = js.native
  /**
    * Creates a deep copy of this element and its children.
    */
  def deepCopy(targetModel: IAbstractModel): this.type = js.native
  /**
    * Creates a deep copy of this element and its children. Also returns a map from original to new IDs.
    */
  def deepCopyWithIdMap(targetModel: IAbstractModel): AnonCopy = js.native
  /**
    * Detaches this element from the model, so that it can be attached in a different place.
    */
  def detach(): this.type = js.native
  /**
    * Checks whether all attributes are available ATM
    *  -  if false, a load is required to access these properties.
    */
  @JSName("isLoaded")
  def isLoaded_MElement(): Boolean = js.native
  @JSName("unit")
  def unit_MElement(): ModelUnit = js.native
}

