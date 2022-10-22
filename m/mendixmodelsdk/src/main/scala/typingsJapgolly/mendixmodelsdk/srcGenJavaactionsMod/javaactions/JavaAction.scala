package typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions

import typingsJapgolly.mendixmodelsdk.srcGenCodeactionsMod.codeactions.CodeAction
import typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/java-actions relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenCodeactionsMod.codeactions.ICodeAction because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IJavaAction because var conflicts: actionParameters, actionReturnType, actionTypeParameters, containerAsFolderBase, id, isLoaded, model, modelerActionInfo, structureTypeName, unit. Inlined typeParameters, parameters, returnType, javaReturnType, microflowActionInfo, useLegacyCodeGeneration */ @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.JavaAction")
@js.native
open class JavaAction protected () extends CodeAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MJavaAction: FolderBase = js.native
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  def javaReturnType: Type = js.native
  def javaReturnType_=(newValue: Type): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @JSName("javaReturnType")
  val javaReturnType_FJavaAction: IType = js.native
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  def microflowActionInfo: MicroflowActionInfo | Null = js.native
  def microflowActionInfo_=(newValue: MicroflowActionInfo | Null): Unit = js.native
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @JSName("microflowActionInfo")
  val microflowActionInfo_FJavaAction: IMicroflowActionInfo | Null = js.native
  
  /**
    * In version 7.21.0: deleted
    */
  def parameters: IList[JavaActionParameter] = js.native
  /**
    * In version 7.21.0: deleted
    */
  @JSName("parameters")
  val parameters_FJavaAction: IList[IJavaActionParameter] = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  def returnType: String = js.native
  def returnType_=(newValue: String): Unit = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  @JSName("returnType")
  val returnType_FJavaAction: String | Null = js.native
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  def typeParameters: IList[TypeParameter] = js.native
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @JSName("typeParameters")
  val typeParameters_FJavaAction: IList[ITypeParameter] = js.native
  
  /**
    * In version 9.0.3: deleted
    * In version 8.0.0: introduced
    */
  def useLegacyCodeGeneration: Boolean = js.native
  def useLegacyCodeGeneration_=(newValue: Boolean): Unit = js.native
  /**
    * In version 9.0.3: deleted
    * In version 8.0.0: introduced
    */
  @JSName("useLegacyCodeGeneration")
  val useLegacyCodeGeneration_FJavaAction: Boolean = js.native
}
object JavaAction {
  
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.JavaAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new JavaAction unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): JavaAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[JavaAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.JavaAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/javaactions", "javaactions.JavaAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
