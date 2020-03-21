package typingsJapgolly.promClient.mod

import typingsJapgolly.promClient.FnCall
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prom-client", "collectDefaultMetrics")
@js.native
object collectDefaultMetrics extends js.Object {
  def apply(): ReturnType[FnCall] = js.native
  def apply(config: DefaultMetricsCollectorConfiguration): ReturnType[FnCall] = js.native
  def apply(timeout: Double): Double = js.native
}

