package typingsJapgolly.unsplashJs.mod

import org.scalajs.dom.experimental.Response
import typingsJapgolly.unsplashJs.AnonAccessKey
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

@JSImport("unsplash-js", JSImport.Default)
@js.native
class default protected () extends Unsplash {
  def this(options: AnonAccessKey) = this()
  /* CompleteClass */
  override var auth: Auth = js.native
  /* CompleteClass */
  override var collections: Collections = js.native
  /* CompleteClass */
  override var currentUser: CurrentUser = js.native
  /* CompleteClass */
  override var photos: Photo = js.native
  /* CompleteClass */
  override var search: Search = js.native
  /* CompleteClass */
  override var stats: Stats = js.native
  /* CompleteClass */
  override var users: Users = js.native
  /* CompleteClass */
  override def request(requestOptions: AnonBody): js.Promise[Response] = js.native
}

