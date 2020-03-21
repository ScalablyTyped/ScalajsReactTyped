package typingsJapgolly.mendixmodelsdk.allModelClassesMod.webservices

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.ServiceInfo")
@js.native
class ServiceInfo protected ()
  extends typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.ServiceInfo {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.ServiceInfo")
@js.native
object ServiceInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ServiceInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.ServiceInfo = js.native
  /**
    * Creates and returns a new ServiceInfo instance in the SDK and on the server.
    * The new ServiceInfo will be automatically stored in the 'services' property
    * of the parent WsdlDescription element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.WsdlDescription): typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.ServiceInfo = js.native
}

