package typingsJapgolly.restIo.authorizedResourceMod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.restIo.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizedResource extends Resource {
  var maxDays: Double = js.native
  var methodAccess: IMethodAccess = js.native
  var permissions: IMethodAccess = js.native
  def baseCreate(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
  def baseDel(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
  def baseGetAll(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
  def baseGetById(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
  def baseUpdate(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
  def getRoles(id: String): js.Any = js.native
  def hasAccessRightsDefined(req: Request_[ParamsDictionary], authorizedRoles: js.Array[String]): js.Any = js.native
  def hasAuthorizedRole(roles: js.Array[_], authorizedRoles: js.Array[String]): Boolean = js.native
  def isAuthorized(req: Request_[ParamsDictionary], authorizedRoles: js.Array[String]): js.Any = js.native
  def isTokenExpired(createdAt: js.Date): Boolean = js.native
  def sendUnauthorized(error: js.Error, res: Response_): Unit = js.native
}

