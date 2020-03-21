package typingsJapgolly.mendixmodelsdk.microflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase because Already inherited
- typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IServerSideMicroflow because var conflicts: containerAsFolderBase, id, isLoaded, microflowReturnType, model, returnType, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ServerSideMicroflow")
@js.native
abstract class ServerSideMicroflow protected () extends MicroflowBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FServerSideMicroflow: IModel = js.native
  def applyEntityAccess(): Boolean = js.native
  def applyEntityAccess(newValue: Boolean): js.Any = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MServerSideMicroflow(): FolderBase = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ServerSideMicroflow")
@js.native
object ServerSideMicroflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

