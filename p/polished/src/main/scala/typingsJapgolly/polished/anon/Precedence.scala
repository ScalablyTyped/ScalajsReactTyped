package typingsJapgolly.polished.anon

import typingsJapgolly.polished.polishedInts.`0`
import typingsJapgolly.polished.polishedInts.`1`
import typingsJapgolly.polished.polishedInts.`3`
import typingsJapgolly.polished.polishedStrings.Plussign
import typingsJapgolly.polished.polishedStrings.prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Precedence extends StObject {
  
  var argCount: `1`
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ Any
  
  var notation: prefix
  
  var precedence: `3`
  
  var rightToLeft: `0`
  
  var symbol: Plussign
}
object Precedence {
  
  inline def apply(
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ Any
  ): Precedence = {
    val __obj = js.Dynamic.literal(argCount = 1, f = f.asInstanceOf[js.Any], notation = "prefix", precedence = 3, rightToLeft = 0, symbol = "+")
    __obj.asInstanceOf[Precedence]
  }
  
  extension [Self <: Precedence](x: Self) {
    
    inline def setArgCount(value: `1`): Self = StObject.set(x, "argCount", value.asInstanceOf[js.Any])
    
    inline def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ Any
    ): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setNotation(value: prefix): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setPrecedence(value: `3`): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    inline def setRightToLeft(value: `0`): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Plussign): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
