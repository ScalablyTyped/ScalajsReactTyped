package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.DERInteger
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issuer extends StObject {
  
  var issuer: StringParam
  
  var serial: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double
}
object Issuer {
  
  inline def apply(issuer: StringParam, serial: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double): Issuer = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issuer]
  }
  
  extension [Self <: Issuer](x: Self) {
    
    inline def setIssuer(value: StringParam): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
  }
}
