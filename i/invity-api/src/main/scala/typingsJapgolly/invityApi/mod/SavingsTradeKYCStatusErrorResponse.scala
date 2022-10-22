package typingsJapgolly.invityApi.mod

import typingsJapgolly.invityApi.invityApiStrings.ExchangeNotFound
import typingsJapgolly.invityApi.invityApiStrings.GetIdentityInfoFailed
import typingsJapgolly.invityApi.invityApiStrings.GetUserInfoFailed
import typingsJapgolly.invityApi.invityApiStrings.SavingsTransactionNotFound
import typingsJapgolly.invityApi.invityApiStrings.UserNotFoundInPartnerSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeKYCStatusErrorResponse
  extends StObject
     with SavingsErrorResponse {
  
  @JSName("code")
  var code_SavingsTradeKYCStatusErrorResponse: js.UndefOr[
    GetIdentityInfoFailed | SavingsTransactionNotFound | ExchangeNotFound | GetUserInfoFailed | UserNotFoundInPartnerSystem
  ] = js.undefined
}
object SavingsTradeKYCStatusErrorResponse {
  
  inline def apply(): SavingsTradeKYCStatusErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsTradeKYCStatusErrorResponse]
  }
  
  extension [Self <: SavingsTradeKYCStatusErrorResponse](x: Self) {
    
    inline def setCode(
      value: GetIdentityInfoFailed | SavingsTransactionNotFound | ExchangeNotFound | GetUserInfoFailed | UserNotFoundInPartnerSystem
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
