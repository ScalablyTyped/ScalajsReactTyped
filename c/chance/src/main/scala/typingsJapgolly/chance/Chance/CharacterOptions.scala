package typingsJapgolly.chance.Chance

import typingsJapgolly.chance.chanceStrings.lower
import typingsJapgolly.chance.chanceStrings.upper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterOptions extends StObject {
  
  var alpha: Boolean
  
  var casing: upper | lower
  
  var numeric: Boolean
  
  var pool: String
  
  var symbols: Boolean
}
object CharacterOptions {
  
  inline def apply(alpha: Boolean, casing: upper | lower, numeric: Boolean, pool: String, symbols: Boolean): CharacterOptions = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], casing = casing.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterOptions]
  }
  
  extension [Self <: CharacterOptions](x: Self) {
    
    inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setCasing(value: upper | lower): Self = StObject.set(x, "casing", value.asInstanceOf[js.Any])
    
    inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
  }
}
