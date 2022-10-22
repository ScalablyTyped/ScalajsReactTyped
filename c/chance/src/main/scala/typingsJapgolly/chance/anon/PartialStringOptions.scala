package typingsJapgolly.chance.anon

import typingsJapgolly.chance.chanceStrings.lower
import typingsJapgolly.chance.chanceStrings.upper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.StringOptions> */
trait PartialStringOptions extends StObject {
  
  var alpha: js.UndefOr[Boolean] = js.undefined
  
  var casing: js.UndefOr[upper | lower] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var numeric: js.UndefOr[Boolean] = js.undefined
  
  var pool: js.UndefOr[String] = js.undefined
  
  var symbols: js.UndefOr[Boolean] = js.undefined
}
object PartialStringOptions {
  
  inline def apply(): PartialStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStringOptions]
  }
  
  extension [Self <: PartialStringOptions](x: Self) {
    
    inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setCasing(value: upper | lower): Self = StObject.set(x, "casing", value.asInstanceOf[js.Any])
    
    inline def setCasingUndefined: Self = StObject.set(x, "casing", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
  }
}
