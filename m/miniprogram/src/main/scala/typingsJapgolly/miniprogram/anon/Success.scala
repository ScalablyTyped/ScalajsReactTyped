package typingsJapgolly.miniprogram.anon

import typingsJapgolly.miniprogram.miniprogramBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success extends StObject {
  
  var success: `true`
}
object Success {
  
  inline def apply(): Success = {
    val __obj = js.Dynamic.literal(success = true)
    __obj.asInstanceOf[Success]
  }
  
  extension [Self <: Success](x: Self) {
    
    inline def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
