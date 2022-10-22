package typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount

import typingsJapgolly.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.OtherData
  - typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.CAData
  - typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.GBData
  - typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.IBANData
  - typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.USData
*/
trait Data extends StObject
object Data {
  
  inline def CAData(
    AccountNumber: String,
    Active: Boolean,
    BankName: String,
    BranchCode: String,
    CreationDate: Double,
    Id: String,
    InstitutionNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Tag: String,
    Type: BankAccountType,
    UserId: String
  ): typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.CAData = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.CAData]
  }
  
  inline def GBData(
    AccountNumber: String,
    Active: Boolean,
    CreationDate: Double,
    Id: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    SortCode: String,
    Tag: String,
    Type: BankAccountType,
    UserId: String
  ): typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.GBData = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.GBData]
  }
  
  inline def IBANData(
    Active: Boolean,
    CreationDate: Double,
    IBAN: String,
    Id: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Tag: String,
    Type: BankAccountType,
    UserId: String
  ): typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.IBANData = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.IBANData]
  }
  
  inline def OtherData(
    AccountNumber: String,
    Active: Boolean,
    BIC: String,
    Country: CountryISO,
    CreationDate: Double,
    Id: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Tag: String,
    Type: BankAccountType,
    UserId: String
  ): typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.OtherData = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.OtherData]
  }
  
  inline def USData(
    ABA: String,
    AccountNumber: String,
    Active: Boolean,
    CreationDate: Double,
    Id: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Tag: String,
    Type: BankAccountType,
    UserId: String
  ): typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.USData = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.USData]
  }
}
