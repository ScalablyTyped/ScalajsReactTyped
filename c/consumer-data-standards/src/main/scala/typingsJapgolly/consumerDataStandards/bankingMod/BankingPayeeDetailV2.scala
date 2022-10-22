package typingsJapgolly.consumerDataStandards.bankingMod

import typingsJapgolly.consumerDataStandards.anon.Account
import typingsJapgolly.consumerDataStandards.anon.BankDetails
import typingsJapgolly.consumerDataStandards.anon.BillerCode
import typingsJapgolly.consumerDataStandards.anon.Name
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.BILLER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DIGITAL_WALLET
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DOMESTIC
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.INTERNATIONAL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.biller_
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.digitalWallet
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.domestic_
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.international_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingPayeeDetailV2
  extends StObject
     with BankingPayeeV2 {
  
  var biller: js.UndefOr[BillerCode] = js.undefined
  
  var digitalWallet: js.UndefOr[Name] = js.undefined
  
  var domestic: js.UndefOr[Account] = js.undefined
  
  var international: js.UndefOr[BankDetails] = js.undefined
  
  /**
    * Type of object included that describes the payee in detail
    */
  var payeeUType: biller_ | digitalWallet | domestic_ | international_
}
object BankingPayeeDetailV2 {
  
  inline def apply(
    nickname: String,
    payeeId: String,
    payeeUType: biller_ | digitalWallet | domestic_ | international_,
    `type`: BILLER | DIGITAL_WALLET | DOMESTIC | INTERNATIONAL
  ): BankingPayeeDetailV2 = {
    val __obj = js.Dynamic.literal(nickname = nickname.asInstanceOf[js.Any], payeeId = payeeId.asInstanceOf[js.Any], payeeUType = payeeUType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingPayeeDetailV2]
  }
  
  extension [Self <: BankingPayeeDetailV2](x: Self) {
    
    inline def setBiller(value: BillerCode): Self = StObject.set(x, "biller", value.asInstanceOf[js.Any])
    
    inline def setBillerUndefined: Self = StObject.set(x, "biller", js.undefined)
    
    inline def setDigitalWallet(value: Name): Self = StObject.set(x, "digitalWallet", value.asInstanceOf[js.Any])
    
    inline def setDigitalWalletUndefined: Self = StObject.set(x, "digitalWallet", js.undefined)
    
    inline def setDomestic(value: Account): Self = StObject.set(x, "domestic", value.asInstanceOf[js.Any])
    
    inline def setDomesticUndefined: Self = StObject.set(x, "domestic", js.undefined)
    
    inline def setInternational(value: BankDetails): Self = StObject.set(x, "international", value.asInstanceOf[js.Any])
    
    inline def setInternationalUndefined: Self = StObject.set(x, "international", js.undefined)
    
    inline def setPayeeUType(value: biller_ | digitalWallet | domestic_ | international_): Self = StObject.set(x, "payeeUType", value.asInstanceOf[js.Any])
  }
}
