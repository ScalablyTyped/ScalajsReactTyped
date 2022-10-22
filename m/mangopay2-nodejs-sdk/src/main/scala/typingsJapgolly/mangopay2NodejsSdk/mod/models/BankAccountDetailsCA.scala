package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.CADetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.BankAccountDetailsCA")
@js.native
open class BankAccountDetailsCA protected ()
  extends BankAccountDetails
     with CADetails {
  def this(data: Any) = this()
  
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  /* CompleteClass */
  var AccountNumber: String = js.native
  
  /**
    * The name of the bank where the account is held. Must be letters or numbers only and maximum 50 characters long.
    */
  /* CompleteClass */
  var BankName: String = js.native
  
  /**
    * The branch code of the bank where the bank account. Must be numbers only, and 5 digits long
    */
  /* CompleteClass */
  var BranchCode: String = js.native
  
  /**
    * The institution number of the bank account. Must be numbers only, and 3 or 4 digits long
    */
  /* CompleteClass */
  var InstitutionNumber: String = js.native
  
  /**
    * The address of the owner of the bank account
    */
  /* CompleteClass */
  var OwnerAddress: AddressType = js.native
  
  /**
    * The name of the owner of the bank account
    */
  /* CompleteClass */
  var OwnerName: String = js.native
  
  /* CompleteClass */
  var Type: CA = js.native
}
