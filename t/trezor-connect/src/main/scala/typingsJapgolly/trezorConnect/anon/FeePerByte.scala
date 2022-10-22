package typingsJapgolly.trezorConnect.anon

import typingsJapgolly.trezorConnect.libTypescriptAccountMod.SelectFeeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeePerByte
  extends StObject
     with SelectFeeLevel {
  
  var fee: String
  
  var feePerByte: String
  
  var minutes: Double
  
  var name: String
  
  var total: String
}
object FeePerByte {
  
  inline def apply(fee: String, feePerByte: String, minutes: Double, name: String, total: String): FeePerByte = {
    val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any], feePerByte = feePerByte.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeePerByte]
  }
  
  extension [Self <: FeePerByte](x: Self) {
    
    inline def setFee(value: String): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFeePerByte(value: String): Self = StObject.set(x, "feePerByte", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
