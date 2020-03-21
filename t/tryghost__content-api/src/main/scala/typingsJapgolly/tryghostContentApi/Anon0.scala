package typingsJapgolly.tryghostContentApi

import typingsJapgolly.tryghostContentApi.mod.BrowseFunction
import typingsJapgolly.tryghostContentApi.mod.Nullable
import typingsJapgolly.tryghostContentApi.mod.Params
import typingsJapgolly.tryghostContentApi.mod.SettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[SettingsObject] = js.native
  def browse(): js.Promise[SettingsObject] = js.native
  def browse(options: Params): js.Promise[SettingsObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[SettingsObject] = js.native
}

