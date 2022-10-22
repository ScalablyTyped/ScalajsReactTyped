package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.GBDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.BankAccountDetailsGB")
@js.native
open class BankAccountDetailsGB protected ()
  extends BankAccountDetails
     with GBDetails {
  def this(data: Any) = this()
  
  /**
    * The account number of the bank account. Must be numbers only. GB account numbers must be 8 digits long.
    */
  /* CompleteClass */
  var AccountNumber: String = js.native
  
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
  
  /**
    * The sort code of the bank account. Must be numbers only, and 6 digits long
    */
  /* CompleteClass */
  var SortCode: String = js.native
  
  /* CompleteClass */
  var Type: GB = js.native
}
