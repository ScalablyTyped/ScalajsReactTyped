package typingsJapgolly.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomMatcherResult extends StObject {
  
  var message: js.UndefOr[String] = js.undefined
  
  var pass: Boolean
}
object CustomMatcherResult {
  
  inline def apply(pass: Boolean): CustomMatcherResult = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMatcherResult]
  }
  
  extension [Self <: CustomMatcherResult](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
  }
}
