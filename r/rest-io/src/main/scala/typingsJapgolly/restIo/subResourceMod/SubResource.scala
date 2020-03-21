package typingsJapgolly.restIo.subResourceMod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.restIo.AnonId
import typingsJapgolly.restIo.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubResource extends Resource {
  def createFindQuery(req: Request_[ParamsDictionary]): AnonId = js.native
  def createProjectionQuery(req: Request_[ParamsDictionary]): js.Object = js.native
  def createPullQuery(req: Request_[ParamsDictionary]): js.Object = js.native
  def createSubUpdateQuery(req: Request_[ParamsDictionary]): js.Object = js.native
}

