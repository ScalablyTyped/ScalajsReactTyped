package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HexParam extends StObject {
  
  var hex: String
}
object HexParam {
  
  inline def apply(hex: String): HexParam = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexParam]
  }
  
  extension [Self <: HexParam](x: Self) {
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
  }
}
