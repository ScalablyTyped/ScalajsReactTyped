package typingsJapgolly.jsTokens.anon

import typingsJapgolly.jsTokens.jsTokensStrings.IdentifierName
import typingsJapgolly.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with Token {
  
  var `type`: IdentifierName
  
  var value: String
}
object `2` {
  
  inline def apply(value: String): `2` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IdentifierName")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setType(value: IdentifierName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
