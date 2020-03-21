package typingsJapgolly.mendixmodelsdk.projectsMod.projects

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because var conflicts: containerAsFolderBase, containerAsModule, id, isLoaded, model, structureTypeName, unit. Inlined name */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Document")
@js.native
abstract class Document protected ()
  extends ModuleDocument
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FDocument: IModel = js.native
  @JSName("name")
  val name_FDocument: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MDocument(): FolderBase = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def excluded(): Boolean = js.native
  def excluded(newValue: Boolean): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MDocument(): String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.Document")
@js.native
object Document extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

