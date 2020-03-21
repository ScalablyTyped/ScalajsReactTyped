package typingsJapgolly.mendixmodelsdk.projectsMod.projects

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsFolderBase, containerAsModule */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ModuleDocument")
@js.native
abstract class ModuleDocument protected () extends ModelUnit {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IModule
  ) = this()
  @JSName("containerAsFolderBase")
  val containerAsFolderBase_FModuleDocument: IFolderBase = js.native
  @JSName("containerAsModule")
  val containerAsModule_FModuleDocument: IModule = js.native
  @JSName("model")
  var model_FModuleDocument: IModel = js.native
  def containerAsFolderBase(): FolderBase = js.native
  def containerAsModule(): Module = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.ModuleDocument")
@js.native
object ModuleDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

