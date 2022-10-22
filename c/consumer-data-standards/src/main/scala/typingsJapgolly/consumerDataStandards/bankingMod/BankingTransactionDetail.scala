package typingsJapgolly.consumerDataStandards.bankingMod

import typingsJapgolly.consumerDataStandards.anon.ExtensionUType
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DIRECT_DEBIT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.FEE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.INTEREST_CHARGED
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.INTEREST_PAID
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PAYMENT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PENDING
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.POSTED
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TRANSFER_INCOMING
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TRANSFER_OUTGOING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingTransactionDetail
  extends StObject
     with BankingTransaction {
  
  var extendedData: ExtensionUType
}
object BankingTransactionDetail {
  
  inline def apply(
    accountId: String,
    amount: String,
    description: String,
    extendedData: ExtensionUType,
    isDetailAvailable: Boolean,
    reference: String,
    status: PENDING | POSTED,
    `type`: DIRECT_DEBIT | FEE | INTEREST_CHARGED | INTEREST_PAID | OTHER | PAYMENT | TRANSFER_INCOMING | TRANSFER_OUTGOING
  ): BankingTransactionDetail = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], extendedData = extendedData.asInstanceOf[js.Any], isDetailAvailable = isDetailAvailable.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingTransactionDetail]
  }
  
  extension [Self <: BankingTransactionDetail](x: Self) {
    
    inline def setExtendedData(value: ExtensionUType): Self = StObject.set(x, "extendedData", value.asInstanceOf[js.Any])
  }
}
