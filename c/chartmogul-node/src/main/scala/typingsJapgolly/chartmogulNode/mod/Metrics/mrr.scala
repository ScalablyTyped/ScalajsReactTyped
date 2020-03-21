package typingsJapgolly.chartmogulNode.mod.Metrics

import typingsJapgolly.chartmogulNode.commonMod.EntriesSummary
import typingsJapgolly.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics.mrr")
@js.native
object mrr extends js.Object {
  def apply(config: Config, params: Params): js.Promise[EntriesSummary[MRR_]] = js.native
}

