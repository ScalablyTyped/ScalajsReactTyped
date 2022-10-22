package typingsJapgolly.flutterwaveNode.mod

import typingsJapgolly.flutterwaveNode.anon.DataStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranferAccountVerificationResponse extends StObject {
  
  var data: DataStatus
}
object TranferAccountVerificationResponse {
  
  inline def apply(data: DataStatus): TranferAccountVerificationResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranferAccountVerificationResponse]
  }
  
  extension [Self <: TranferAccountVerificationResponse](x: Self) {
    
    inline def setData(value: DataStatus): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
