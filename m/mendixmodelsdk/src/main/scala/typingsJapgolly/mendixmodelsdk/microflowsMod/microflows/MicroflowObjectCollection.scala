package typingsJapgolly.mendixmodelsdk.microflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowObjectCollection")
@js.native
class MicroflowObjectCollection protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMicroflowObjectCollection: IModel = js.native
  def containerAsLoopedActivity(): LoopedActivity = js.native
  def containerAsMicroflowBase(): MicroflowBase = js.native
  def objects(): IList[MicroflowObject] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowObjectCollection")
@js.native
object MicroflowObjectCollection extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MicroflowObjectCollection = js.native
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
    * of the parent LoopedActivity element passed as argument.
    */
  def createInLoopedActivityUnderObjectCollection(container: LoopedActivity): MicroflowObjectCollection = js.native
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
    * of the parent MicroflowBase element passed as argument.
    */
  def createInMicroflowBaseUnderObjectCollection(container: MicroflowBase): MicroflowObjectCollection = js.native
}

