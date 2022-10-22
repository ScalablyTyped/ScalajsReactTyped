package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.typingsModelsRefundMod.refund.CreatePayInRefund
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsRefundMod.refund.CreateTransferRefund
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.Refund")
@js.native
open class Refund protected () extends EntityBase[RefundData] {
  def this(data: CreatePayInRefund) = this()
  def this(data: CreateTransferRefund) = this()
}
