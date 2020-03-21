package typingsJapgolly.mendixmodelsdk.mod.webservices

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices.DataAttribute")
@js.native
class DataAttribute protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.webservices.DataAttribute {
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
@JSImport("mendixmodelsdk", "webservices.DataAttribute")
@js.native
object DataAttribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.DataAttribute = js.native
  /**
    * Creates and returns a new DataAttribute instance in the SDK and on the server.
    * The new DataAttribute will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.DataEntityBase): typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.DataAttribute = js.native
}

