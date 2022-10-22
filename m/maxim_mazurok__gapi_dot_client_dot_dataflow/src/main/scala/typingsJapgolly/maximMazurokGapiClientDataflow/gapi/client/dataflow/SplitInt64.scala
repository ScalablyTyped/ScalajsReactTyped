package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitInt64 extends StObject {
  
  /** The high order bits, including the sign: n >> 32. */
  var highBits: js.UndefOr[Double] = js.undefined
  
  /** The low order bits: n & 0xffffffff. */
  var lowBits: js.UndefOr[Double] = js.undefined
}
object SplitInt64 {
  
  inline def apply(): SplitInt64 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitInt64]
  }
  
  extension [Self <: SplitInt64](x: Self) {
    
    inline def setHighBits(value: Double): Self = StObject.set(x, "highBits", value.asInstanceOf[js.Any])
    
    inline def setHighBitsUndefined: Self = StObject.set(x, "highBits", js.undefined)
    
    inline def setLowBits(value: Double): Self = StObject.set(x, "lowBits", value.asInstanceOf[js.Any])
    
    inline def setLowBitsUndefined: Self = StObject.set(x, "lowBits", js.undefined)
  }
}
