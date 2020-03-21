package typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.Document
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
- typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.ICodeAction because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined actionTypeParameters, actionReturnType, modelerActionInfo, actionParameters */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.CodeAction")
@js.native
abstract class CodeAction protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  /**
    * In version 7.21.0: introduced
    */
  @JSName("actionParameters")
  val actionParameters_FCodeAction: IList[ICodeActionParameter] = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: introduced
    */
  @JSName("actionReturnType")
  val actionReturnType_FCodeAction: IType = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("actionTypeParameters")
  val actionTypeParameters_FCodeAction: IList[ITypeParameter] = js.native
  @JSName("model")
  var model_FCodeAction: IModel = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("modelerActionInfo")
  val modelerActionInfo_FCodeAction: IMicroflowActionInfo | Null = js.native
  /**
    * In version 7.21.0: introduced
    */
  def actionParameters(): IList[CodeActionParameter] = js.native
  /**
    * In version 7.21.0: introduced
    */
  def actionReturnType(): Type = js.native
  def actionReturnType(newValue: Type): js.Any = js.native
  /**
    * In version 7.21.0: introduced
    */
  def actionTypeParameters(): IList[TypeParameter] = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MCodeAction(): FolderBase = js.native
  def modelerActionInfo(): js.Any = js.native
  def modelerActionInfo(newValue: MicroflowActionInfo): js.Any = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("modelerActionInfo")
  def modelerActionInfo_Union(): MicroflowActionInfo | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.CodeAction")
@js.native
object CodeAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

