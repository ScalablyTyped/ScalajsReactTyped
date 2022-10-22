package typingsJapgolly.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoPoolMargin extends StObject {
  
  var denominator: String
  
  var numerator: String
}
object CardanoPoolMargin {
  
  inline def apply(denominator: String, numerator: String): CardanoPoolMargin = {
    val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoPoolMargin]
  }
  
  extension [Self <: CardanoPoolMargin](x: Self) {
    
    inline def setDenominator(value: String): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    inline def setNumerator(value: String): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
  }
}
