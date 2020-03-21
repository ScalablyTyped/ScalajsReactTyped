package typingsJapgolly.mendixmodelsdk.restMod.rest

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.Document
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.restMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.securityMod.security.IModuleRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-rest-services relevant section in reference guide}
  *
  * In version 7.11.0: removed experimental
  * In version 7.6.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.restMod.rest.IPublishedRestService because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestService")
@js.native
class PublishedRestService protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FPublishedRestService: IModel = js.native
  def allowedRoles(): IList[IModuleRole] = js.native
  def allowedRolesQualifiedNames(): js.Array[String] = js.native
  def authenticationMicroflow(): js.Any = js.native
  def authenticationMicroflow(newValue: IMicroflow): js.Any = js.native
  def authenticationMicroflowQualifiedName(): String | Null = js.native
  /**
    * In version 7.17.0: introduced
    */
  @JSName("authenticationMicroflow")
  def authenticationMicroflow_Union(): IMicroflow | Null = js.native
  /**
    * In version 7.13.0: deleted
    * In version 7.11.0: introduced
    */
  def authenticationType(): RestAuthenticationType = js.native
  def authenticationType(newValue: RestAuthenticationType): js.Any = js.native
  /**
    * In version 7.13.0: introduced
    */
  def authenticationTypes(): IList[RestAuthenticationType] = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPublishedRestService(): FolderBase = js.native
  def corsConfiguration(): js.Any = js.native
  def corsConfiguration(newValue: CorsConfiguration): js.Any = js.native
  /**
    * In version 7.18.0: introduced
    */
  @JSName("corsConfiguration")
  def corsConfiguration_Union(): CorsConfiguration | Null = js.native
  /**
    * In version 7.17.0: introduced
    */
  def parameters(): IList[RestOperationParameter] = js.native
  def path(): String = js.native
  def path(newValue: String): js.Any = js.native
  /**
    * In version 7.7.0: introduced
    */
  def resources(): IList[PublishedRestServiceResource] = js.native
  /**
    * In version 7.12.0: introduced
    */
  def serviceName(): String = js.native
  def serviceName(newValue: String): js.Any = js.native
  /**
    * In version 7.12.0: introduced
    */
  def version(): String = js.native
  def version(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestService")
@js.native
object PublishedRestService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new PublishedRestService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): PublishedRestService = js.native
}

