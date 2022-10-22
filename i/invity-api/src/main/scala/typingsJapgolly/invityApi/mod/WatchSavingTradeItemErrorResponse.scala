package typingsJapgolly.invityApi.mod

import typingsJapgolly.invityApi.invityApiStrings.SavingsTradeIdRequired
import typingsJapgolly.invityApi.invityApiStrings.SavingsTradeItemIdRequired
import typingsJapgolly.invityApi.invityApiStrings.SavingsTradeItemNotFound
import typingsJapgolly.invityApi.invityApiStrings.SavingsTransactionNotFound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchSavingTradeItemErrorResponse
  extends StObject
     with SavingsErrorResponse {
  
  @JSName("code")
  var code_WatchSavingTradeItemErrorResponse: js.UndefOr[
    SavingsTradeIdRequired | SavingsTradeItemIdRequired | SavingsTradeItemNotFound | SavingsTransactionNotFound
  ] = js.undefined
}
object WatchSavingTradeItemErrorResponse {
  
  inline def apply(): WatchSavingTradeItemErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchSavingTradeItemErrorResponse]
  }
  
  extension [Self <: WatchSavingTradeItemErrorResponse](x: Self) {
    
    inline def setCode(
      value: SavingsTradeIdRequired | SavingsTradeItemIdRequired | SavingsTradeItemNotFound | SavingsTransactionNotFound
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
