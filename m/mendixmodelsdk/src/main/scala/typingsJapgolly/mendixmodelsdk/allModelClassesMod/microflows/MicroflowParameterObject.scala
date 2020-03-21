package typingsJapgolly.mendixmodelsdk.allModelClassesMod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowParameterObject")
@js.native
class MicroflowParameterObject protected ()
  extends typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterObject {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowParameterObject")
@js.native
object MicroflowParameterObject extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowParameterObject instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterObject = js.native
  /**
    * Creates and returns a new MicroflowParameterObject instance in the SDK and on the server.
    * The new MicroflowParameterObject will be automatically stored in the 'objects' property
    * of the parent MicroflowObjectCollection element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowObjectCollection): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterObject = js.native
}

