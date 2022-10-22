package typingsJapgolly.invityApi.mod

import typingsJapgolly.invityApi.invityApiStrings.Success_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsAMLAnswersSuccessResponse
  extends StObject
     with SavingsAMLAnswersResponse {
  
  var status: Success_
}
object SavingsAMLAnswersSuccessResponse {
  
  inline def apply(): SavingsAMLAnswersSuccessResponse = {
    val __obj = js.Dynamic.literal(status = "Success")
    __obj.asInstanceOf[SavingsAMLAnswersSuccessResponse]
  }
  
  extension [Self <: SavingsAMLAnswersSuccessResponse](x: Self) {
    
    inline def setStatus(value: Success_): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
