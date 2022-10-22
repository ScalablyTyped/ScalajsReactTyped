package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.typingsBaseMod.base.BrowserInfoData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsBillingMod.billing.BillingData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsCardPreauthorizationMod.cardPreAuthorization.CardPreAuthorizationData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsCardPreauthorizationMod.cardPreAuthorization.PreAuthorizationExecutionType
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsCardPreauthorizationMod.cardPreAuthorization.PreAuthorizationStatus
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsCardPreauthorizationMod.cardPreAuthorization.UpdateCardPreAuthorization
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsSecurityInfoMod.securityInfo.SecurityInfoData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsShippingMod.shipping.ShippingData
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.CardPreAuthorization")
@js.native
open class CardPreAuthorization protected ()
  extends StObject
     with CardPreAuthorizationData {
  def this(data: CardPreAuthorizationData) = this()
  def this(data: UpdateCardPreAuthorization) = this()
  
  /**
    * A user's ID
    */
  /* CompleteClass */
  var AuthorId: String = js.native
  
  /**
    * Contains useful information related to the user billing
    */
  /* CompleteClass */
  var Billing: BillingData = js.native
  
  /**
    * This object describes the Browser being user by an end user
    */
  /* CompleteClass */
  var BrowserInfo: BrowserInfoData = js.native
  
  /**
    * The ID of a card
    */
  /* CompleteClass */
  var CardId: String = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The language to use for the payment page - needs to be the ISO code of the language
    */
  /* CompleteClass */
  var Culture: CountryISO = js.native
  
  /**
    * Information about the funds that are being debited
    */
  /* CompleteClass */
  var DebitedFunds: MoneyData = js.native
  
  /**
    * How the PreAuthorization has been executed
    */
  /* CompleteClass */
  var ExecutionType: PreAuthorizationExecutionType = js.native
  
  /**
    * The date when the payment is to be processed by
    */
  /* CompleteClass */
  var ExpirationDate: Timestamp = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * IP Address of the end user (format IPV4 or IPV6)
    */
  /* CompleteClass */
  var IpAddress: String = js.native
  
  /**
    * The Id of the associated PayIn
    */
  /* CompleteClass */
  var PayInId: String = js.native
  
  /**
    * The status of the payment after the PreAuthorization. You can pass the PaymentStatus from "WAITING" to "CANCELED" should you need/want to
    */
  /* CompleteClass */
  var PaymentStatus: typingsJapgolly.mangopay2NodejsSdk.typingsModelsCardPreauthorizationMod.cardPreAuthorization.PaymentStatus = js.native
  
  /**
    * Value of the funds remaining on a pre-authorization
    */
  /* CompleteClass */
  var RemainingFunds: MoneyData = js.native
  
  /**
    * The result code
    */
  /* CompleteClass */
  var ResultCode: String = js.native
  
  /**
    * A verbal explanation of the ResultCode
    */
  /* CompleteClass */
  var ResultMessage: String = js.native
  
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually.
    * The field lets you activate it automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ),
    * "FORCE" (if you wish to specifically force the secured mode).
    */
  /* CompleteClass */
  var SecureMode: typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.SecureMode = js.native
  
  /**
    * The value is 'true' if the SecureMode was used
    */
  /* CompleteClass */
  var SecureModeNeeded: Boolean = js.native
  
  /**
    * This is the URL where to redirect users to proceed to 3D secure validation
    */
  /* CompleteClass */
  var SecureModeRedirectURL: String = js.native
  
  /**
    * This is the URL where users are automatically redirected after 3D secure validation (if activated)
    */
  /* CompleteClass */
  var SecureModeReturnURL: String = js.native
  
  /**
    * Contains useful information related to security and fraud
    */
  /* CompleteClass */
  var SecurityInfo: SecurityInfoData = js.native
  
  /**
    * Contains every useful information's related to the user shipping
    */
  /* CompleteClass */
  var Shipping: ShippingData = js.native
  
  /**
    * A custom description to appear on the user's bank statement.
    * It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
    * See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  /* CompleteClass */
  var StatementDescriptor: String = js.native
  
  /**
    * Status of the PreAuthorization
    */
  /* CompleteClass */
  var Status: PreAuthorizationStatus = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
}
