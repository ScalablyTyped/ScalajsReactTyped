package typingsJapgolly.restIo.resourceMod

import typingsJapgolly.express.mod.Application_
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.express.mod.Router
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.mongoose.mod.Document
import typingsJapgolly.mongoose.mod.Model_
import typingsJapgolly.mongoose.mod.Mongoose
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
class Resource protected () extends js.Object {
  def this(resDef: IResource) = this()
  @JSName("app")
  var app_Original: Application_ = js.native
  var baseUrl: String = js.native
  var db: Mongoose = js.native
  var model: Model_[Document, js.Object] = js.native
  var paramId: String = js.native
  var parameterizedUrl: String = js.native
  var parentRef: String = js.native
  var parentResource: Resource = js.native
  var populate: String = js.native
  var resDef: IResource = js.native
  var router: Router = js.native
  var url: String = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def buildParentSearch(req: Request_[ParamsDictionary], query: js.Any): js.Any = js.native
  def buildPopulateQuery(req: Request_[ParamsDictionary]): js.Any = js.native
  def buildSearchQuery(req: Request_[ParamsDictionary]): js.Object = js.native
  def create(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
  def createModel(resDef: IResource): Model_[Document, js.Object] = js.native
  def createQuery(query: String): js.Any = js.native
  def createRegex(query: String): js.RegExp = js.native
  def del(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
  def errorHandler(err: js.Error, res: Response_): Unit = js.native
  def getAll(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
  def getById(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
  def setupRecursiveRoutes(): Unit = js.native
  def setupRoutes(): Unit = js.native
  def toClassName(name: String): String = js.native
  def update(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
}

/* static members */
@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
object Resource extends js.Object {
  var BASE_URL: String = js.native
}

