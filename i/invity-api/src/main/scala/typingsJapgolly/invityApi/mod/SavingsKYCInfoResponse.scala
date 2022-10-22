package typingsJapgolly.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.invityApi.mod.SavingsKYCInfoSuccessResponse
  - typingsJapgolly.invityApi.mod.SavingsErrorResponse
*/
trait SavingsKYCInfoResponse extends StObject
object SavingsKYCInfoResponse {
  
  inline def SavingsErrorResponse(): typingsJapgolly.invityApi.mod.SavingsErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.invityApi.mod.SavingsErrorResponse]
  }
  
  inline def SavingsKYCInfoSuccessResponse(documentTypes: js.Array[SavingsTradeUserKYCStartDocumentType]): typingsJapgolly.invityApi.mod.SavingsKYCInfoSuccessResponse = {
    val __obj = js.Dynamic.literal(documentTypes = documentTypes.asInstanceOf[js.Any], status = "Success")
    __obj.asInstanceOf[typingsJapgolly.invityApi.mod.SavingsKYCInfoSuccessResponse]
  }
}
