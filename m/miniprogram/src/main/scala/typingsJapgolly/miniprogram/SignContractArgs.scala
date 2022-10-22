package typingsJapgolly.miniprogram

import typingsJapgolly.miniprogram.anon.AuthCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignContractArgs
  extends StObject
     with AsyncCallback[AuthCode] {
  
  var signStr: String
}
object SignContractArgs {
  
  inline def apply(signStr: String): SignContractArgs = {
    val __obj = js.Dynamic.literal(signStr = signStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignContractArgs]
  }
  
  extension [Self <: SignContractArgs](x: Self) {
    
    inline def setSignStr(value: String): Self = StObject.set(x, "signStr", value.asInstanceOf[js.Any])
  }
}
