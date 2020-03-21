package typingsJapgolly.chartmogulNode.mod.Tag

import typingsJapgolly.chartmogulNode.commonMod.Entries
import typingsJapgolly.chartmogulNode.mod.Config
import typingsJapgolly.chartmogulNode.mod.Customer.Customer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Tag.add")
@js.native
object add extends js.Object {
  def apply(config: Config, uuid: String, data: Tags): js.Promise[Tags] = js.native
  def apply(config: Config, uuid: String, data: TagsWithEmail): js.Promise[Entries[Customer]] = js.native
}

