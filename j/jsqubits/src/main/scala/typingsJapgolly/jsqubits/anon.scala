package typingsJapgolly.jsqubits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DecimalPlaces extends StObject {
    
    var decimalPlaces: js.UndefOr[Double] = js.undefined
  }
  object DecimalPlaces {
    
    inline def apply(): DecimalPlaces = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecimalPlaces]
    }
    
    extension [Self <: DecimalPlaces](x: Self) {
      
      inline def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
      
      inline def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
    }
  }
}
