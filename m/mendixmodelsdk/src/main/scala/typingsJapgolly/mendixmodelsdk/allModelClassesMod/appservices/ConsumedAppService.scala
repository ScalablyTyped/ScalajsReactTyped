package typingsJapgolly.mendixmodelsdk.allModelClassesMod.appservices

import typingsJapgolly.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/consumed-app-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.ConsumedAppService")
@js.native
class ConsumedAppService protected ()
  extends typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.ConsumedAppService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.ConsumedAppService")
@js.native
object ConsumedAppService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new ConsumedAppService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.ConsumedAppService = js.native
}

