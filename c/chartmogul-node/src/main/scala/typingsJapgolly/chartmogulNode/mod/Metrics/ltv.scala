package typingsJapgolly.chartmogulNode.mod.Metrics

import typingsJapgolly.chartmogulNode.commonMod.EntriesSummary
import typingsJapgolly.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics.ltv")
@js.native
object ltv extends js.Object {
  def apply(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[LTV_]] = js.native
}

