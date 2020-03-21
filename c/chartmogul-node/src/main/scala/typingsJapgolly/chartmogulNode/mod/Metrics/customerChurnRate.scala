package typingsJapgolly.chartmogulNode.mod.Metrics

import typingsJapgolly.chartmogulNode.commonMod.EntriesSummary
import typingsJapgolly.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics.customerChurnRate")
@js.native
object customerChurnRate extends js.Object {
  def apply(config: Config, params: ParamsNoInterval): js.Promise[EntriesSummary[CustomerChurnRate_]] = js.native
}

