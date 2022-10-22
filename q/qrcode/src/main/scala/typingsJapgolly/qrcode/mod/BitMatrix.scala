package typingsJapgolly.qrcode.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitMatrix extends StObject {
  
  var data: js.typedarray.Uint8Array
  
  /**
    * @return Bit value at specified location.
    */
  def get(row: Double, col: Double): Double
  
  /**
    * Check if bit at specified location is reserved.
    */
  def isReserved(row: Double, col: Double): Double
  
  var reservedBit: js.typedarray.Uint8Array
  
  /**
    * Set bit value at specified location
    * If reserved flag is set, this bit will be ignored during masking process.
    */
  def set(row: Double, col: Double, value: Double, reserved: Boolean): Unit
  
  /**
    * Symbol size.
    */
  var size: Double
  
  /**
    * Applies xor operator at specified location (used during masking process).
    */
  def xor(row: Double, col: Double, value: Double): Unit
}
object BitMatrix {
  
  inline def apply(
    data: js.typedarray.Uint8Array,
    get: (Double, Double) => Double,
    isReserved: (Double, Double) => Double,
    reservedBit: js.typedarray.Uint8Array,
    set: (Double, Double, Double, Boolean) => Callback,
    size: Double,
    xor: (Double, Double, Double) => Callback
  ): BitMatrix = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), isReserved = js.Any.fromFunction2(isReserved), reservedBit = reservedBit.asInstanceOf[js.Any], set = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Boolean) => (set(t0, t1, t2, t3)).runNow()), size = size.asInstanceOf[js.Any], xor = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (xor(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[BitMatrix]
  }
  
  extension [Self <: BitMatrix](x: Self) {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGet(value: (Double, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setIsReserved(value: (Double, Double) => Double): Self = StObject.set(x, "isReserved", js.Any.fromFunction2(value))
    
    inline def setReservedBit(value: js.typedarray.Uint8Array): Self = StObject.set(x, "reservedBit", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (Double, Double, Double, Boolean) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setXor(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "xor", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
