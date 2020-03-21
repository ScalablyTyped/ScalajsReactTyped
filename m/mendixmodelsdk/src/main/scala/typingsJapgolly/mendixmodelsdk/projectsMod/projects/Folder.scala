package typingsJapgolly.mendixmodelsdk.projectsMod.projects

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://world.mendix.com/display/howto50/Add+documents+to+a+module relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolder because var conflicts: containerAsFolderBase, containerAsProject, documents, folders, id, isLoaded, model, structureTypeName, unit. Inlined name */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Folder")
@js.native
class Folder protected () extends FolderBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FFolder: IModel = js.native
  @JSName("name")
  var name_FFolder: String = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MFolder(): FolderBase = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.Folder")
@js.native
object Folder extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Folder unit in the SDK and on the server.
    * Expects one argument, the IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Folder = js.native
}

