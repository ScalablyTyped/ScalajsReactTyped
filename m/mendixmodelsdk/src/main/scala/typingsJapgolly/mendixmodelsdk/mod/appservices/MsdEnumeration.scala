package typingsJapgolly.mendixmodelsdk.mod.appservices

import typingsJapgolly.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.MsdEnumeration")
@js.native
class MsdEnumeration protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.appservices.MsdEnumeration {
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
@JSImport("mendixmodelsdk", "appservices.MsdEnumeration")
@js.native
object MsdEnumeration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdEnumeration = js.native
  /**
    * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
    * The new MsdEnumeration will be automatically stored in the 'enumerations' property
    * of the parent MsdEnumerationContainer element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.MsdEnumeration = js.native
}

