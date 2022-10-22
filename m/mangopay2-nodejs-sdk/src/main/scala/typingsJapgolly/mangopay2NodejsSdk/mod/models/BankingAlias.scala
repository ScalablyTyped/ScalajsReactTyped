package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.anon.PartialBankingAliasData
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankingAliasMod.bankingAlias.BankingAliasType
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsBankingAliasMod.bankingAlias.IBANBankingAliasData
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.BankingAlias")
@js.native
open class BankingAlias protected ()
  extends EntityBase[IBANBankingAliasData]
     with IBANBankingAliasData {
  def this(data: PartialBankingAliasData) = this()
  
  /**
    * Whether the banking alias is active or not
    */
  /* CompleteClass */
  var Active: Boolean = js.native
  
  /**
    * The BIC of the banking alias
    */
  /* CompleteClass */
  var BIC: String = js.native
  
  /**
    * The Country of the Address
    */
  /* CompleteClass */
  var Country: CountryISO = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  /* CompleteClass */
  var CreditedUserId: String = js.native
  
  /**
    * The IBAN of the banking alias
    */
  /* CompleteClass */
  var IBAN: String = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * The owner of the wallet/banking alias
    */
  /* CompleteClass */
  var OwnerName: String = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * The type of banking alias (note that only IBAN is available at present)
    */
  /* CompleteClass */
  var Type: BankingAliasType = js.native
  /**
    * The type of banking alias (note that only IBAN is available at present)
    */
  /* CompleteClass */
  @JSName("Type")
  var Type_IBANBankingAliasData: IBAN = js.native
  
  /**
    * The ID of a wallet
    */
  /* CompleteClass */
  var WalletId: String = js.native
}
