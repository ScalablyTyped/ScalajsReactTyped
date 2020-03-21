package typingsJapgolly.mendixmodelsdk.projectsMod.projects

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IDomainModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.projectsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.securityMod.security.IModuleSecurity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModule because var conflicts: containerAsFolderBase, containerAsProject, documents, folders, id, isLoaded, model, structureTypeName, unit. Inlined sortIndex, name, domainModel, moduleSecurity, fromAppStore, isReusableComponent, appStoreGuid, appStoreVersionGuid, appStoreVersion */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Module")
@js.native
class Module protected () extends FolderBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  @JSName("appStoreGuid")
  var appStoreGuid_FModule: String = js.native
  @JSName("appStoreVersionGuid")
  var appStoreVersionGuid_FModule: String = js.native
  @JSName("appStoreVersion")
  var appStoreVersion_FModule: String = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("domainModel")
  var domainModel_FModule: IDomainModel = js.native
  @JSName("fromAppStore")
  var fromAppStore_FModule: Boolean = js.native
  /**
    * In version 8.5.0: introduced
    */
  @JSName("isReusableComponent")
  var isReusableComponent_FModule: Boolean = js.native
  @JSName("model")
  var model_FModule: IModel = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("moduleSecurity")
  var moduleSecurity_FModule: IModuleSecurity = js.native
  @JSName("name")
  var name_FModule: String = js.native
  /**
    * The index of where this Module appears in the project.
    * This property is <em>required</em>, and of type double.
    * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
    * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
    */
  @JSName("sortIndex")
  var sortIndex_FModule: Double = js.native
  def appStoreGuid(): String = js.native
  def appStoreGuid(newValue: String): js.Any = js.native
  def appStoreVersion(): String = js.native
  def appStoreVersion(newValue: String): js.Any = js.native
  def appStoreVersionGuid(): String = js.native
  def appStoreVersionGuid(newValue: String): js.Any = js.native
  @JSName("containerAsProject")
  def containerAsProject_MModule(): Project = js.native
  def domainModel(): IDomainModel = js.native
  def domainModel(newValue: IDomainModel): js.Any = js.native
  def fromAppStore(): Boolean = js.native
  def fromAppStore(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.5.0: introduced
    */
  def isReusableComponent(): Boolean = js.native
  def isReusableComponent(newValue: Boolean): js.Any = js.native
  def moduleSecurity(): IModuleSecurity = js.native
  def moduleSecurity(newValue: IModuleSecurity): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  /**
    * The index of where this Module appears in the project.
    * This property is <em>required</em>, and of type double.
    * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
    * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
    */
  def sortIndex(): Double = js.native
  def sortIndex(newValue: Double): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.Module")
@js.native
object Module extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Module unit in the SDK and on the server.
    * Expects one argument, the IProject in which this unit is contained.
    */
  def createIn(container: IProject): Module = js.native
}

