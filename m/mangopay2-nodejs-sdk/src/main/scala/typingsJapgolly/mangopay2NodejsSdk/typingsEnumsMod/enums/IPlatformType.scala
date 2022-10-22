package typingsJapgolly.mangopay2NodejsSdk.typingsEnumsMod.enums

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlatformType extends StObject {
  
  var CROWDFUNDING_DONATION: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_DONATION
  
  var CROWDFUNDING_EQUITY: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_EQUITY
  
  var CROWDFUNDING_LOAN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_LOAN
  
  var CROWDFUNDING_REWARD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CROWDFUNDING_REWARD
  
  var MARKETPLACE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MARKETPLACE
  
  var NotSpecified: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
  
  var OTHER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  
  var P2P_PAYMENT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P2P_PAYMENT
}
object IPlatformType {
  
  inline def apply(): IPlatformType = {
    val __obj = js.Dynamic.literal(CROWDFUNDING_DONATION = "CROWDFUNDING_DONATION", CROWDFUNDING_EQUITY = "CROWDFUNDING_EQUITY", CROWDFUNDING_LOAN = "CROWDFUNDING_LOAN", CROWDFUNDING_REWARD = "CROWDFUNDING_REWARD", MARKETPLACE = "MARKETPLACE", NotSpecified = "NotSpecified", OTHER = "OTHER", P2P_PAYMENT = "P2P_PAYMENT")
    __obj.asInstanceOf[IPlatformType]
  }
  
  extension [Self <: IPlatformType](x: Self) {
    
    inline def setCROWDFUNDING_DONATION(value: CROWDFUNDING_DONATION): Self = StObject.set(x, "CROWDFUNDING_DONATION", value.asInstanceOf[js.Any])
    
    inline def setCROWDFUNDING_EQUITY(value: CROWDFUNDING_EQUITY): Self = StObject.set(x, "CROWDFUNDING_EQUITY", value.asInstanceOf[js.Any])
    
    inline def setCROWDFUNDING_LOAN(value: CROWDFUNDING_LOAN): Self = StObject.set(x, "CROWDFUNDING_LOAN", value.asInstanceOf[js.Any])
    
    inline def setCROWDFUNDING_REWARD(value: CROWDFUNDING_REWARD): Self = StObject.set(x, "CROWDFUNDING_REWARD", value.asInstanceOf[js.Any])
    
    inline def setMARKETPLACE(value: MARKETPLACE): Self = StObject.set(x, "MARKETPLACE", value.asInstanceOf[js.Any])
    
    inline def setNotSpecified(value: NotSpecified): Self = StObject.set(x, "NotSpecified", value.asInstanceOf[js.Any])
    
    inline def setOTHER(value: OTHER): Self = StObject.set(x, "OTHER", value.asInstanceOf[js.Any])
    
    inline def setP2P_PAYMENT(value: P2P_PAYMENT): Self = StObject.set(x, "P2P_PAYMENT", value.asInstanceOf[js.Any])
  }
}
