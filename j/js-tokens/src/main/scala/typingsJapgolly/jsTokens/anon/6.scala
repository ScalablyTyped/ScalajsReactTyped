package typingsJapgolly.jsTokens.anon

import typingsJapgolly.jsTokens.jsTokensStrings.WhiteSpace
import typingsJapgolly.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`
  extends StObject
     with Token {
  
  var `type`: WhiteSpace
  
  var value: String
}
object `6` {
  
  inline def apply(value: String): `6` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhiteSpace")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setType(value: WhiteSpace): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
