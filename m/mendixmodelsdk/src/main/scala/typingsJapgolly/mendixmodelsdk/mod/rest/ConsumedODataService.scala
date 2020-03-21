package typingsJapgolly.mendixmodelsdk.mod.rest

import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/consumed-odata-services relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.18.0: introduced
  */
@JSImport("mendixmodelsdk", "rest.ConsumedODataService")
@js.native
class ConsumedODataService protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.rest.ConsumedODataService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "rest.ConsumedODataService")
@js.native
object ConsumedODataService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new ConsumedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.restMod.rest.ConsumedODataService = js.native
}

