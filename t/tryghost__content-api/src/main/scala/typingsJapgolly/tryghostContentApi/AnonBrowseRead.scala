package typingsJapgolly.tryghostContentApi

import typingsJapgolly.tryghostContentApi.mod.BrowseFunction
import typingsJapgolly.tryghostContentApi.mod.GhostData
import typingsJapgolly.tryghostContentApi.mod.Nullable
import typingsJapgolly.tryghostContentApi.mod.Params
import typingsJapgolly.tryghostContentApi.mod.ReadFunction
import typingsJapgolly.tryghostContentApi.mod.Tag
import typingsJapgolly.tryghostContentApi.mod.TagsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrowseRead extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[TagsObject] = js.native
  @JSName("read")
  var read_Original: ReadFunction[Tag] = js.native
  def browse(): js.Promise[TagsObject] = js.native
  def browse(options: Params): js.Promise[TagsObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[TagsObject] = js.native
  def read(data: GhostData): js.Promise[Tag] = js.native
  def read(data: GhostData, options: Params): js.Promise[Tag] = js.native
  def read(data: GhostData, options: Params, memberToken: Nullable[String]): js.Promise[Tag] = js.native
}

