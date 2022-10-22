package typingsJapgolly.invityApi.mod

import typingsJapgolly.invityApi.invityApiStrings.AppIDRequired
import typingsJapgolly.invityApi.invityApiStrings.ExchangeNotFound
import typingsJapgolly.invityApi.invityApiStrings.FlowStepDisabled
import typingsJapgolly.invityApi.invityApiStrings.GetUserInfoFailed
import typingsJapgolly.invityApi.invityApiStrings.SavingsTradeCountryRequired
import typingsJapgolly.invityApi.invityApiStrings.SavingsTransactionExists
import typingsJapgolly.invityApi.invityApiStrings.SavingsTransactionNotFound
import typingsJapgolly.invityApi.invityApiStrings.UnknownStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeErrorResponse
  extends StObject
     with SavingsErrorResponse {
  
  @JSName("code")
  var code_SavingsTradeErrorResponse: js.UndefOr[
    AppIDRequired | ExchangeNotFound | SavingsTradeCountryRequired | SavingsTransactionNotFound | SavingsTransactionExists | GetUserInfoFailed | FlowStepDisabled | UnknownStatus
  ] = js.undefined
}
object SavingsTradeErrorResponse {
  
  inline def apply(): SavingsTradeErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsTradeErrorResponse]
  }
  
  extension [Self <: SavingsTradeErrorResponse](x: Self) {
    
    inline def setCode(
      value: AppIDRequired | ExchangeNotFound | SavingsTradeCountryRequired | SavingsTransactionNotFound | SavingsTransactionExists | GetUserInfoFailed | FlowStepDisabled | UnknownStatus
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
