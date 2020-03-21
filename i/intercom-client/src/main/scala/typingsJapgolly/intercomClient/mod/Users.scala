package typingsJapgolly.intercomClient.mod

import typingsJapgolly.intercomClient.AnonIdNumber
import typingsJapgolly.intercomClient.AnonSegmentid
import typingsJapgolly.intercomClient.PartialCreateUpdateUser
import typingsJapgolly.intercomClient.scrollMod.Scroll
import typingsJapgolly.intercomClient.userMod.List
import typingsJapgolly.intercomClient.userMod.User
import typingsJapgolly.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Users")
@js.native
class Users () extends js.Object {
  var scroll: Scroll[User] = js.native
  def archive(identifier: UserIdentifier): js.Promise[ApiResponse[User]] = js.native
  def archive(identifier: UserIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
  def create(user: PartialCreateUpdateUser): js.Promise[ApiResponse[User]] = js.native
  def create(user: PartialCreateUpdateUser, cb: callback[ApiResponse[User]]): Unit = js.native
  def find(identifier: UserIdentifier): js.Promise[ApiResponse[List]] = js.native
  def find(identifier: UserIdentifier, cb: callback[ApiResponse[List]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: AnonSegmentid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: AnonSegmentid, cb: callback[ApiResponse[List]]): Unit = js.native
  def requestPermanentDeletion(id: String): js.Promise[AnonIdNumber] = js.native
  def requestPermanentDeletion(id: String, cb: callback[AnonIdNumber]): Unit = js.native
  def requestPermanentDeletionByParams(identifier: UserIdentifier): js.Promise[AnonIdNumber] = js.native
  def requestPermanentDeletionByParams(identifier: UserIdentifier, cb: callback[AnonIdNumber]): Unit = js.native
  def update(user: UserIdentifier with PartialCreateUpdateUser): js.Promise[ApiResponse[User]] = js.native
  def update(user: UserIdentifier with PartialCreateUpdateUser, cb: callback[ApiResponse[User]]): Unit = js.native
}

