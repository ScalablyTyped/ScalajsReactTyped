package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.IBANDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.BankAccountDetailsIBAN")
@js.native
open class BankAccountDetailsIBAN protected ()
  extends BankAccountDetails
     with IBANDetails {
  def this(data: Any) = this()
  
  /**
    * The IBAN of the bank account
    */
  /* CompleteClass */
  var IBAN: String = js.native
  
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
  var Type: IBAN = js.native
}
