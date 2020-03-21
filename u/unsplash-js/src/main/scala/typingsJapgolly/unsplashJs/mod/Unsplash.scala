package typingsJapgolly.unsplashJs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Response
import typingsJapgolly.unsplashJs.AnonBody
import typingsJapgolly.unsplashJs.mod.UnsplashApi.Auth
import typingsJapgolly.unsplashJs.mod.UnsplashApi.Collections
import typingsJapgolly.unsplashJs.mod.UnsplashApi.CurrentUser
import typingsJapgolly.unsplashJs.mod.UnsplashApi.Photo
import typingsJapgolly.unsplashJs.mod.UnsplashApi.Search
import typingsJapgolly.unsplashJs.mod.UnsplashApi.Stats
import typingsJapgolly.unsplashJs.mod.UnsplashApi.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsplash extends js.Object {
  var auth: Auth
  var collections: Collections
  var currentUser: CurrentUser
  var photos: Photo
  var search: Search
  var stats: Stats
  var users: Users
  def request(requestOptions: AnonBody): js.Promise[Response]
}

object Unsplash {
  @scala.inline
  def apply(
    auth: Auth,
    collections: Collections,
    currentUser: CurrentUser,
    photos: Photo,
    request: AnonBody => CallbackTo[js.Promise[Response]],
    search: Search,
    stats: Stats,
    users: Users
  ): Unsplash = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], currentUser = currentUser.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("request")(js.Any.fromFunction1((t0: typingsJapgolly.unsplashJs.AnonBody) => request(t0).runNow()))
    __obj.asInstanceOf[Unsplash]
  }
}

