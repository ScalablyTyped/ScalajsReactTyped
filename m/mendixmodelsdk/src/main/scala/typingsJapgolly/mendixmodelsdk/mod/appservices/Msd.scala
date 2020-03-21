package typingsJapgolly.mendixmodelsdk.mod.appservices

import typingsJapgolly.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.Msd")
@js.native
class Msd protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.appservices.Msd {
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
@JSImport("mendixmodelsdk", "appservices.Msd")
@js.native
object Msd extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Msd instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.Msd = js.native
  /**
    * Creates and returns a new Msd instance in the SDK and on the server.
    * The new Msd will be automatically stored in the 'msd' property
    * of the parent ConsumedAppService element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.ConsumedAppService): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.Msd = js.native
}

