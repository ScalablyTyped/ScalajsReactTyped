package typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/building-block relevant section in reference guide}
  *
  * In version 7.7.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.BuildingBlock")
@js.native
class BuildingBlock protected ()
  extends typingsJapgolly.mendixmodelsdk.pagesMod.pages.BuildingBlock {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.BuildingBlock")
@js.native
object BuildingBlock extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new BuildingBlock unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.pagesMod.pages.BuildingBlock = js.native
}

