package typingsJapgolly.chance.Chance

import typingsJapgolly.chance.chanceStrings.lower
import typingsJapgolly.chance.chanceStrings.upper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringOptions
  extends StObject
     with CharacterOptions {
  
  var length: Double
}
object StringOptions {
  
  inline def apply(
    alpha: Boolean,
    casing: upper | lower,
    length: Double,
    numeric: Boolean,
    pool: String,
    symbols: Boolean
  ): StringOptions = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], casing = casing.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringOptions]
  }
  
  extension [Self <: StringOptions](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
