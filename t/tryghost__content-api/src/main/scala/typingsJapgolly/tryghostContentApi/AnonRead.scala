package typingsJapgolly.tryghostContentApi

import typingsJapgolly.tryghostContentApi.mod.Author
import typingsJapgolly.tryghostContentApi.mod.AuthorsObject
import typingsJapgolly.tryghostContentApi.mod.BrowseFunction
import typingsJapgolly.tryghostContentApi.mod.GhostData
import typingsJapgolly.tryghostContentApi.mod.Nullable
import typingsJapgolly.tryghostContentApi.mod.Params
import typingsJapgolly.tryghostContentApi.mod.ReadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRead extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[AuthorsObject] = js.native
  @JSName("read")
  var read_Original: ReadFunction[Author] = js.native
  def browse(): js.Promise[AuthorsObject] = js.native
  def browse(options: Params): js.Promise[AuthorsObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[AuthorsObject] = js.native
  def read(data: GhostData): js.Promise[Author] = js.native
  def read(data: GhostData, options: Params): js.Promise[Author] = js.native
  def read(data: GhostData, options: Params, memberToken: Nullable[String]): js.Promise[Author] = js.native
}

