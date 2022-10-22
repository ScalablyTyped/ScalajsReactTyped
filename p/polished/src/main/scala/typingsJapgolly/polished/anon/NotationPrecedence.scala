package typingsJapgolly.polished.anon

import typingsJapgolly.polished.polishedInts.`0`
import typingsJapgolly.polished.polishedInts.`1`
import typingsJapgolly.polished.polishedStrings.postfix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotationPrecedence extends StObject {
  
  var argCount: `1`
  
  var f: Unit
  
  var notation: postfix
  
  var precedence: `0`
  
  var rightToLeft: `0`
  
  var symbol: /* ) */ String
}
object NotationPrecedence {
  
  inline def apply(f: Unit): NotationPrecedence = {
    val __obj = js.Dynamic.literal(argCount = 1, f = f.asInstanceOf[js.Any], notation = "postfix", precedence = 0, rightToLeft = 0, symbol = ")")
    __obj.asInstanceOf[NotationPrecedence]
  }
  
  extension [Self <: NotationPrecedence](x: Self) {
    
    inline def setArgCount(value: `1`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    inline def setF(value: Unit): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setNotation(value: postfix): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setPrecedence(value: `0`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    inline def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: /* ) */ String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
