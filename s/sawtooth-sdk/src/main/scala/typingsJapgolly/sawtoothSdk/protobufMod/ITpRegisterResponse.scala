package typingsJapgolly.sawtoothSdk.protobufMod

import typingsJapgolly.sawtoothSdk.protobufMod.TpRegisterResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpRegisterResponse extends StObject {
  
  /** TpRegisterResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object ITpRegisterResponse {
  
  inline def apply(): ITpRegisterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpRegisterResponse]
  }
  
  extension [Self <: ITpRegisterResponse](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
