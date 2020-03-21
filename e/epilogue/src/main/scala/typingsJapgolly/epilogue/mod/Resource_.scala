package typingsJapgolly.epilogue.mod

import typingsJapgolly.epilogue.AnonModel
import typingsJapgolly.epilogue.AnonPlural
import typingsJapgolly.express.mod.Express
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.sequelize.mod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("epilogue", "Resource")
@js.native
class Resource_ protected () extends js.Object {
  def this(options: ResourceOptions) = this()
  var actions: js.Array[String] = js.native
  @JSName("app")
  var app_Original: Express = js.native
  var associationOptions: ResourceAssociationOptions = js.native
  var attributes: js.Array[String] = js.native
  var controllers: Controllers = js.native
  var endpoints: AnonPlural = js.native
  var excludeAttributes: js.Array[String] = js.native
  var include: js.Array[AnonModel | String] = js.native
  var model: js.Any = js.native
  var pagination: Boolean = js.native
  var readOnlyAttributes: js.Array[String] = js.native
  var reloadInstances: Boolean = js.native
  var search: ResourceSearchOption = js.native
  var sequelize: Sequelize = js.native
  var sort: ResourceSortOption = js.native
  var updateMethod: String = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

