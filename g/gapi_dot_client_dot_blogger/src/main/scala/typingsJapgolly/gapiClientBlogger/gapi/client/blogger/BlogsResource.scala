package typingsJapgolly.gapiClientBlogger.gapi.client.blogger

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBlogger.AnonBlogId
import typingsJapgolly.gapiClientBlogger.AnonFetchUserInfo
import typingsJapgolly.gapiClientBlogger.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogsResource extends js.Object {
  /** Gets one blog by ID. */
  def get(request: AnonBlogId): Request_[Blog]
  /** Retrieve a Blog by URL. */
  def getByUrl(request: AnonFields): Request_[Blog]
  /** Retrieves a list of blogs, possibly filtered. */
  def listByUser(request: AnonFetchUserInfo): Request_[BlogList]
}

object BlogsResource {
  @scala.inline
  def apply(
    get: AnonBlogId => CallbackTo[Request_[Blog]],
    getByUrl: AnonFields => CallbackTo[Request_[Blog]],
    listByUser: AnonFetchUserInfo => CallbackTo[Request_[BlogList]]
  ): BlogsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonBlogId) => get(t0).runNow()))
    __obj.updateDynamic("getByUrl")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonFields) => getByUrl(t0).runNow()))
    __obj.updateDynamic("listByUser")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonFetchUserInfo) => listByUser(t0).runNow()))
    __obj.asInstanceOf[BlogsResource]
  }
}

