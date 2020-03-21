package typingsJapgolly.mendixmodelsdk.allModelClassesMod.webservices

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataEntity")
@js.native
class DataEntity protected ()
  extends typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.DataEntity {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataEntity")
@js.native
object DataEntity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  def createInDataEntityBaseUnderChildMembers(container: typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.DataEntityBase): typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedParameter element passed as argument.
    */
  def createInPublishedParameterUnderDataEntity(container: typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.PublishedParameter): typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedResource element passed as argument.
    */
  def createInPublishedResourceUnderDataEntity(container: typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.PublishedResource): typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
}

