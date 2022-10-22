package typingsJapgolly.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenCardDetailOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var passId: String
}
object OpenCardDetailOptions {
  
  inline def apply(passId: String): OpenCardDetailOptions = {
    val __obj = js.Dynamic.literal(passId = passId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardDetailOptions]
  }
  
  extension [Self <: OpenCardDetailOptions](x: Self) {
    
    inline def setPassId(value: String): Self = StObject.set(x, "passId", value.asInstanceOf[js.Any])
  }
}
