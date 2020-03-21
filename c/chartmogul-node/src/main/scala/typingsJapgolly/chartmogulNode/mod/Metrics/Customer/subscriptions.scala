package typingsJapgolly.chartmogulNode.mod.Metrics.Customer

import typingsJapgolly.chartmogulNode.commonMod.CursorParams
import typingsJapgolly.chartmogulNode.commonMod.Entries
import typingsJapgolly.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics.Customer.subscriptions")
@js.native
object subscriptions extends js.Object {
  def apply(config: Config, uuid: String): js.Promise[Entries[MetricsSubscription]] = js.native
  def apply(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsSubscription]] = js.native
}

