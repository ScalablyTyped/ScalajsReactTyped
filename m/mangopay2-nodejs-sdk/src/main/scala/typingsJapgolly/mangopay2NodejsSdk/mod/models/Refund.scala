package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.mod.refund.CreatePayInRefund
import typingsJapgolly.mangopay2NodejsSdk.mod.refund.CreateTransferRefund
import typingsJapgolly.mangopay2NodejsSdk.mod.refund.RefundData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Refund")
@js.native
class Refund protected () extends EntityBase[RefundData] {
  def this(data: CreatePayInRefund) = this()
  def this(data: CreateTransferRefund) = this()
}

