package typingsJapgolly.mendixmodelsdk.webservicesMod.webservices

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.IPublishedServiceBase because Already inherited
- typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.IPublishedWebService because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedWebService")
@js.native
class PublishedWebService protected () extends PublishedServiceBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FPublishedWebService: IModel = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPublishedWebService(): FolderBase = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedWebService")
@js.native
object PublishedWebService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new PublishedWebService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): PublishedWebService = js.native
}

