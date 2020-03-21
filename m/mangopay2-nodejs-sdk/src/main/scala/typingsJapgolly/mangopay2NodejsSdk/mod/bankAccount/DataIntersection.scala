package typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import typingsJapgolly.mangopay2NodejsSdk.mod.address.AddressType
import typingsJapgolly.mangopay2NodejsSdk.mod.models.BankAccountDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.OtherData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.CAData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.GBData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.IBANData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.USData & {  Type  :never} */
trait DataIntersection extends js.Object {
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  var ABA: String
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  /**
    * The account number of the bank account. Must be numbers only. GB account numbers must be 8 digits long.
    */
  /**
    * The account number of the bank account. US account numbers must be digits only.
    */
  var AccountNumber: String
  /**
    * Whether the bank account is active or not
    */
  var Active: Boolean
  /**
    * The BIC of the bank account
    */
  var BIC: js.UndefOr[String] = js.undefined
  /**
    * The name of the bank where the account is held. Must be letters or numbers only and maximum 50 characters long.
    */
  var BankName: String
  /**
    * The branch code of the bank where the bank account. Must be numbers only, and 5 digits long
    */
  var BranchCode: String
  /**
    * The Country of the Address
    */
  var Country: String
  var CreationDate: Double
  /**
    * The type of account
    */
  var DepositAccountType: js.UndefOr[typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.DepositAccountType] = js.undefined
  /**
    * @deprecated
    */
  var Details: js.UndefOr[BankAccountDetails] = js.undefined
  /**
    * The IBAN of the bank account
    */
  var IBAN: String
  var Id: String
  /**
    * The institution number of the bank account. Must be numbers only, and 3 or 4 digits long
    */
  var InstitutionNumber: String
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  /**
    * The sort code of the bank account. Must be numbers only, and 6 digits long
    */
  var SortCode: String
  var Tag: String
  /**
    * The type of bank account
    */
  var Type: BankAccountType with OTHER with CA with GB with IBAN with US
  /**
    * The object owner's UserId
    */
  var UserId: String
}

object DataIntersection {
  @scala.inline
  def apply(
    ABA: String,
    AccountNumber: String,
    Active: Boolean,
    BankName: String,
    BranchCode: String,
    Country: String,
    CreationDate: Double,
    IBAN: String,
    Id: String,
    InstitutionNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    SortCode: String,
    Tag: String,
    Type: BankAccountType with OTHER with CA with GB with IBAN with US,
    UserId: String,
    BIC: String = null,
    DepositAccountType: DepositAccountType = null,
    Details: BankAccountDetails = null
  ): DataIntersection = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    if (BIC != null) __obj.updateDynamic("BIC")(BIC.asInstanceOf[js.Any])
    if (DepositAccountType != null) __obj.updateDynamic("DepositAccountType")(DepositAccountType.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIntersection]
  }
}

