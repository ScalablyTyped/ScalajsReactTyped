package typingsJapgolly.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  需要获取权限的 scope，详见 scope 列表
  var scope: Scope
}
object AuthorizeOptions {
  
  inline def apply(scope: Scope): AuthorizeOptions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  extension [Self <: AuthorizeOptions](x: Self) {
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
