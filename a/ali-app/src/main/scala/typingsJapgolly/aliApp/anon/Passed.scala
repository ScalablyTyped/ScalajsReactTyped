package typingsJapgolly.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Passed extends StObject {
  
  // 认证标识
  var passed: String
  
  // 认证是否通过
  var reason: js.UndefOr[String] = js.undefined
  
  var token: String
}
object Passed {
  
  inline def apply(passed: String, token: String): Passed = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passed]
  }
  
  extension [Self <: Passed](x: Self) {
    
    inline def setPassed(value: String): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
