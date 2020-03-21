package typingsJapgolly.mendixmodelsdk.allModelClassesMod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.NanoflowCall")
@js.native
class NanoflowCall protected ()
  extends typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.NanoflowCall {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.NanoflowCall")
@js.native
object NanoflowCall extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NanoflowCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.NanoflowCall = js.native
  /**
    * Creates and returns a new NanoflowCall instance in the SDK and on the server.
    * The new NanoflowCall will be automatically stored in the 'nanoflowCall' property
    * of the parent NanoflowCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.NanoflowCallAction): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.NanoflowCall = js.native
}

