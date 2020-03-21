package typingsJapgolly.mendixmodelsdk.microflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.IMicroflowActionInfo
import typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.MicroflowActionInfo
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.securityMod.security.IModuleRole
import typingsJapgolly.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/microflows relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase because Already inherited
- typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IServerSideMicroflow because Already inherited
- typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflow because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined allowedModuleRoles, allowedModuleRolesQualifiedNames, microflowActionInfo */ @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Microflow")
@js.native
class Microflow protected () extends ServerSideMicroflow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("allowedModuleRolesQualifiedNames")
  val allowedModuleRolesQualifiedNames_FMicroflow: js.Array[String] = js.native
  /**
    * In version 7.23.0: added public
    */
  @JSName("allowedModuleRoles")
  val allowedModuleRoles_FMicroflow: IList[IModuleRole] = js.native
  /**
    * In version 8.0.0: introduced
    */
  @JSName("microflowActionInfo")
  val microflowActionInfo_FMicroflow: IMicroflowActionInfo | Null = js.native
  @JSName("model")
  var model_FMicroflow: IModel = js.native
  def allowConcurrentExecution(): Boolean = js.native
  def allowConcurrentExecution(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.23.0: added public
    */
  def allowedModuleRoles(): IList[IModuleRole] = js.native
  def allowedModuleRolesQualifiedNames(): js.Array[String] = js.native
  def concurrencyErrorMessage(): Text = js.native
  def concurrencyErrorMessage(newValue: Text): js.Any = js.native
  def concurrencyErrorMicroflow(): js.Any = js.native
  def concurrencyErrorMicroflow(newValue: IMicroflow): js.Any = js.native
  def concurrencyErrorMicroflowQualifiedName(): String | Null = js.native
  @JSName("concurrencyErrorMicroflow")
  def concurrencyErrorMicroflow_Union(): IMicroflow | Null = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMicroflow(): FolderBase = js.native
  def microflowActionInfo(): js.Any = js.native
  def microflowActionInfo(newValue: MicroflowActionInfo): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  @JSName("microflowActionInfo")
  def microflowActionInfo_Union(): MicroflowActionInfo | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Microflow")
@js.native
object Microflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Microflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Microflow = js.native
}

