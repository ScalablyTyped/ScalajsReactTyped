package typingsJapgolly.mendixmodelsdk.mod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.MicroflowCall")
@js.native
class MicroflowCall protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.microflows.MicroflowCall {
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
@JSImport("mendixmodelsdk", "microflows.MicroflowCall")
@js.native
object MicroflowCall extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowCall = js.native
  /**
    * Creates and returns a new MicroflowCall instance in the SDK and on the server.
    * The new MicroflowCall will be automatically stored in the 'microflowCall' property
    * of the parent MicroflowCallAction element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowCallAction): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowCall = js.native
}

