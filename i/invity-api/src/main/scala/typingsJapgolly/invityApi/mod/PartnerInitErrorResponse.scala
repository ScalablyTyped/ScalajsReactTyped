package typingsJapgolly.invityApi.mod

import typingsJapgolly.invityApi.invityApiStrings.ExchangeNotFound
import typingsJapgolly.invityApi.invityApiStrings.MissingRequestBody
import typingsJapgolly.invityApi.invityApiStrings.PartnerInitFailed
import typingsJapgolly.invityApi.invityApiStrings.ReturnUrlRequired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerInitErrorResponse
  extends StObject
     with SavingsErrorResponse {
  
  @JSName("code")
  var code_PartnerInitErrorResponse: js.UndefOr[ReturnUrlRequired | ExchangeNotFound | PartnerInitFailed | MissingRequestBody] = js.undefined
}
object PartnerInitErrorResponse {
  
  inline def apply(): PartnerInitErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerInitErrorResponse]
  }
  
  extension [Self <: PartnerInitErrorResponse](x: Self) {
    
    inline def setCode(value: ReturnUrlRequired | ExchangeNotFound | PartnerInitFailed | MissingRequestBody): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
