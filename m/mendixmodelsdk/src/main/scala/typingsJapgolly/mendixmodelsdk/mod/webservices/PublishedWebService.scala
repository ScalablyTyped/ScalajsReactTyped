package typingsJapgolly.mendixmodelsdk.mod.webservices

import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "webservices.PublishedWebService")
@js.native
class PublishedWebService protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.webservices.PublishedWebService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "webservices.PublishedWebService")
@js.native
object PublishedWebService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new PublishedWebService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.PublishedWebService = js.native
}

