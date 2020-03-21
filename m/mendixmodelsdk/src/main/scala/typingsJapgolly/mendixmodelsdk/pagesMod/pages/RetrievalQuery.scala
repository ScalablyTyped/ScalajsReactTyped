package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.securityMod.security.IUserRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.12.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.RetrievalQuery")
@js.native
class RetrievalQuery protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRetrievalQuery: IModel = js.native
  def allowedUserRoles(): IList[IUserRole] = js.native
  def allowedUserRolesQualifiedNames(): js.Array[String] = js.native
  /**
    * In version 7.21.0: introduced
    */
  def entityPath(): String = js.native
  def entityPath(newValue: String): js.Any = js.native
  def microflow(): js.Any = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName(): String | Null = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("microflow")
  def microflow_Union(): IMicroflow | Null = js.native
  /**
    * In version 7.14.0: introduced
    */
  def pageName(): String = js.native
  def pageName(newValue: String): js.Any = js.native
  /**
    * In version 8.6.0: introduced
    */
  def parameters(): IList[RetrievalQueryParameter] = js.native
  def queryId(): String = js.native
  def queryId(newValue: String): js.Any = js.native
  /**
    * In version 8.4.0: deleted
    */
  def schemaId(): String = js.native
  def schemaId(newValue: String): js.Any = js.native
  /**
    * In version 8.4.0: introduced
    */
  def usedAssociations(): IList[String] = js.native
  /**
    * In version 8.4.0: introduced
    */
  def widgetName(): String = js.native
  def widgetName(newValue: String): js.Any = js.native
  def xPath(): String = js.native
  def xPath(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.RetrievalQuery")
@js.native
object RetrievalQuery extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RetrievalQuery instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RetrievalQuery = js.native
}

