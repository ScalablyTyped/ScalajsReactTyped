package typingsJapgolly.antDesignCssinjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenKey extends StObject {
  
  var _tokenKey: String
}
object TokenKey {
  
  inline def apply(_tokenKey: String): TokenKey = {
    val __obj = js.Dynamic.literal(_tokenKey = _tokenKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenKey]
  }
  
  extension [Self <: TokenKey](x: Self) {
    
    inline def set_tokenKey(value: String): Self = StObject.set(x, "_tokenKey", value.asInstanceOf[js.Any])
  }
}
