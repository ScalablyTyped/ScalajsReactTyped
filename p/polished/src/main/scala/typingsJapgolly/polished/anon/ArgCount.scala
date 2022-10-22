package typingsJapgolly.polished.anon

import typingsJapgolly.polished.polishedInts.`0`
import typingsJapgolly.polished.polishedInts.`2`
import typingsJapgolly.polished.polishedInts.`4`
import typingsJapgolly.polished.polishedStrings.Asterisk
import typingsJapgolly.polished.polishedStrings.infix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgCount extends StObject {
  
  var argCount: `2`
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify multiplication */ Any
  
  var notation: infix
  
  var precedence: `4`
  
  var rightToLeft: `0`
  
  var symbol: Asterisk
}
object ArgCount {
  
  inline def apply(
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify multiplication */ Any
  ): ArgCount = {
    val __obj = js.Dynamic.literal(argCount = 2, f = f.asInstanceOf[js.Any], notation = "infix", precedence = 4, rightToLeft = 0, symbol = "*")
    __obj.asInstanceOf[ArgCount]
  }
  
  extension [Self <: ArgCount](x: Self) {
    
    inline def setArgCount(value: `2`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    inline def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify multiplication */ Any
    ): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setNotation(value: infix): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setPrecedence(value: `4`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    inline def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Asterisk): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
