package typingsJapgolly.chartmogulNode.mod.CustomAttribute

import typingsJapgolly.chartmogulNode.AnonCustom
import typingsJapgolly.chartmogulNode.AnonCustomArray
import typingsJapgolly.chartmogulNode.commonMod.Entries
import typingsJapgolly.chartmogulNode.mod.Config
import typingsJapgolly.chartmogulNode.mod.Customer.Customer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "CustomAttribute.add")
@js.native
object add extends js.Object {
  def apply(config: Config, uuid: String, data: AnonCustom): js.Promise[Entries[Customer]] = js.native
  def apply(config: Config, uuid: String, data: AnonCustomArray): js.Promise[CustomAttributes] = js.native
}

