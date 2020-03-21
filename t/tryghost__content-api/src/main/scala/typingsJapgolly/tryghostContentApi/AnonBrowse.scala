package typingsJapgolly.tryghostContentApi

import typingsJapgolly.tryghostContentApi.mod.BrowseFunction
import typingsJapgolly.tryghostContentApi.mod.GhostData
import typingsJapgolly.tryghostContentApi.mod.Nullable
import typingsJapgolly.tryghostContentApi.mod.Params
import typingsJapgolly.tryghostContentApi.mod.PostObject
import typingsJapgolly.tryghostContentApi.mod.PostOrPage
import typingsJapgolly.tryghostContentApi.mod.ReadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrowse extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[PostObject] = js.native
  @JSName("read")
  var read_Original: ReadFunction[PostOrPage] = js.native
  def browse(): js.Promise[PostObject] = js.native
  def browse(options: Params): js.Promise[PostObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[PostObject] = js.native
  def read(data: GhostData): js.Promise[PostOrPage] = js.native
  def read(data: GhostData, options: Params): js.Promise[PostOrPage] = js.native
  def read(data: GhostData, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
}

