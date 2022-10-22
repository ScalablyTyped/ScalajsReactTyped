package typingsJapgolly.mendixmodelsdk.srcGenCodeactionsMod.codeactions

import typingsJapgolly.mendixmodelsdk.srcGenCodeactionsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenCodeactionsMod.codeactions.ICodeAction because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined actionTypeParameters, actionReturnType, modelerActionInfo, actionParameters */ @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.CodeAction")
@js.native
open class CodeAction protected () extends Document {
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
  def actionParameters: IList[CodeActionParameter] = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("actionParameters")
  val actionParameters_FCodeAction: IList[ICodeActionParameter] = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def actionReturnType: Type = js.native
  def actionReturnType_=(newValue: Type): Unit = js.native
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
  def actionTypeParameters: IList[TypeParameter] = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("actionTypeParameters")
  val actionTypeParameters_FCodeAction: IList[ITypeParameter] = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MCodeAction: FolderBase = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def modelerActionInfo: MicroflowActionInfo | Null = js.native
  def modelerActionInfo_=(newValue: MicroflowActionInfo | Null): Unit = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("modelerActionInfo")
  val modelerActionInfo_FCodeAction: IMicroflowActionInfo | Null = js.native
}
object CodeAction {
  
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.CodeAction")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.CodeAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.CodeAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
