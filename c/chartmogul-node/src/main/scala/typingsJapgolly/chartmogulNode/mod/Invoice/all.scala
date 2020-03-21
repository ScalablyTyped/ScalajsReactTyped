package typingsJapgolly.chartmogulNode.mod.Invoice

import typingsJapgolly.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Invoice.all")
@js.native
object all extends js.Object {
  def apply(config: Config): js.Promise[Invoices] = js.native
  def apply(config: Config, params: ListInvoicesParams): js.Promise[Invoices] = js.native
  def apply(config: Config, uuid: String): js.Promise[Invoices] = js.native
  def apply(config: Config, uuid: String, params: ListInvoicesParams): js.Promise[Invoices] = js.native
}

