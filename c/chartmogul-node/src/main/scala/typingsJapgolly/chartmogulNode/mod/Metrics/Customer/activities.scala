package typingsJapgolly.chartmogulNode.mod.Metrics.Customer

import typingsJapgolly.chartmogulNode.commonMod.CursorParams
import typingsJapgolly.chartmogulNode.commonMod.Entries
import typingsJapgolly.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics.Customer.activities")
@js.native
object activities extends js.Object {
  def apply(config: Config, uuid: String): js.Promise[Entries[MetricsActivity]] = js.native
  def apply(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsActivity]] = js.native
}

