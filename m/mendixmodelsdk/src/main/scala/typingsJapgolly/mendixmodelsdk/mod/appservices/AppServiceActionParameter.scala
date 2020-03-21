package typingsJapgolly.mendixmodelsdk.mod.appservices

import typingsJapgolly.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.AppServiceActionParameter")
@js.native
class AppServiceActionParameter protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.appservices.AppServiceActionParameter {
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
@JSImport("mendixmodelsdk", "appservices.AppServiceActionParameter")
@js.native
object AppServiceActionParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter = js.native
  /**
    * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
    * The new AppServiceActionParameter will be automatically stored in the 'parameters' property
    * of the parent AppServiceAction element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.AppServiceAction): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter = js.native
}

