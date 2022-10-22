package typingsJapgolly.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appid extends StObject {
  
  var app_id: String
  
  // 应用id
  var auth_code: String
  
  // 会员卡表单信息请求Id
  var out_string: String
  
  // 会员卡模板Id
  var request_id: String
  
  // 授权的state
  var scope: String
  
  // 授权码，用于换取authtoken
  var state: String
  
  // 授权scope
  var template_id: String
}
object Appid {
  
  inline def apply(
    app_id: String,
    auth_code: String,
    out_string: String,
    request_id: String,
    scope: String,
    state: String,
    template_id: String
  ): Appid = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], auth_code = auth_code.asInstanceOf[js.Any], out_string = out_string.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appid]
  }
  
  extension [Self <: Appid](x: Self) {
    
    inline def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setAuth_code(value: String): Self = StObject.set(x, "auth_code", value.asInstanceOf[js.Any])
    
    inline def setOut_string(value: String): Self = StObject.set(x, "out_string", value.asInstanceOf[js.Any])
    
    inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
  }
}
