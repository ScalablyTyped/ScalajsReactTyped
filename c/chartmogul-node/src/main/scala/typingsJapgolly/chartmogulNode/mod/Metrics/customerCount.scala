package typingsJapgolly.chartmogulNode.mod.Metrics

import typingsJapgolly.chartmogulNode.commonMod.EntriesSummary
import typingsJapgolly.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics.customerCount")
@js.native
object customerCount extends js.Object {
  def apply(config: Config, params: Params): js.Promise[EntriesSummary[CustomerCount_]] = js.native
}

