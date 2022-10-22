package typingsJapgolly.polished.anon

import typingsJapgolly.polished.polishedStrings.Exclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostfixRegSymbol extends StObject {
  
  var postfix: ArgCountFNotation
  
  var regSymbol: Exclamationmark
  
  var symbol: Exclamationmark
}
object PostfixRegSymbol {
  
  inline def apply(postfix: ArgCountFNotation): PostfixRegSymbol = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = "!", symbol = "!")
    __obj.asInstanceOf[PostfixRegSymbol]
  }
  
  extension [Self <: PostfixRegSymbol](x: Self) {
    
    inline def setPostfix(value: ArgCountFNotation): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: Exclamationmark): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Exclamationmark): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
