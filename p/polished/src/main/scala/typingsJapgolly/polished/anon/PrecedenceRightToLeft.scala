package typingsJapgolly.polished.anon

import typingsJapgolly.polished.polishedInts.`0`
import typingsJapgolly.polished.polishedInts.`1`
import typingsJapgolly.polished.polishedStrings.func
import typingsJapgolly.polished.polishedStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrecedenceRightToLeft extends StObject {
  
  var argCount: `1`
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify min */ Any
  
  var notation: func
  
  var precedence: `0`
  
  var rightToLeft: `0`
  
  var symbol: min
}
object PrecedenceRightToLeft {
  
  inline def apply(f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify min */ Any): PrecedenceRightToLeft = {
    val __obj = js.Dynamic.literal(argCount = 1, f = f.asInstanceOf[js.Any], notation = "func", precedence = 0, rightToLeft = 0, symbol = "min")
    __obj.asInstanceOf[PrecedenceRightToLeft]
  }
  
  extension [Self <: PrecedenceRightToLeft](x: Self) {
    
    inline def setArgCount(value: `1`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    inline def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify min */ Any
    ): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setNotation(value: func): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setPrecedence(value: `0`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    inline def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: min): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
