package typingsJapgolly.mendixmodelsdk.allModelClassesMod.microflows

import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/microflows relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.Microflow")
@js.native
class Microflow protected ()
  extends typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.Microflow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.Microflow")
@js.native
object Microflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Microflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.Microflow = js.native
}

