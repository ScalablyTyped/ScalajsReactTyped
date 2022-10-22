package typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount

import typingsJapgolly.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.OtherDetails
  - typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.CADetails
  - typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.GBDetails
  - typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.IBANDetails
  - typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.USDetails
*/
trait CreationDetails extends StObject
object CreationDetails {
  
  inline def CADetails(
    AccountNumber: String,
    BankName: String,
    BranchCode: String,
    InstitutionNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String
  ): typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.CADetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "CA")
    __obj.asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.CADetails]
  }
  
  inline def GBDetails(AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, SortCode: String): typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.GBDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Type = "GB")
    __obj.asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.GBDetails]
  }
  
  inline def IBANDetails(IBAN: String, OwnerAddress: AddressType, OwnerName: String): typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.IBANDetails = {
    val __obj = js.Dynamic.literal(IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "IBAN")
    __obj.asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.IBANDetails]
  }
  
  inline def OtherDetails(
    AccountNumber: String,
    BIC: String,
    Country: CountryISO,
    OwnerAddress: AddressType,
    OwnerName: String
  ): typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.OtherDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "OTHER")
    __obj.asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.OtherDetails]
  }
  
  inline def USDetails(ABA: String, AccountNumber: String, OwnerAddress: AddressType, OwnerName: String): typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.USDetails = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "US")
    __obj.asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.USDetails]
  }
}
