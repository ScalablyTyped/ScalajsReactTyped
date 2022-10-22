package typingsJapgolly.jsrsasign.jsrsasign

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigInteger extends StObject {
  
  def abs(): BigInteger
  
  def bitLength(): Double
  
  def compareTo(a: BigInteger): Double
  
  def mod(a: BigInteger): BigInteger
  
  def modPowInt(e: Double, m: BigInteger): BigInteger
  
  def negate(): BigInteger
  
  def toString(b: Double): String
}
object BigInteger {
  
  inline def apply(
    abs: CallbackTo[BigInteger],
    bitLength: CallbackTo[Double],
    compareTo: BigInteger => Double,
    mod: BigInteger => BigInteger,
    modPowInt: (Double, BigInteger) => BigInteger,
    negate: CallbackTo[BigInteger],
    toString_ : Double => String
  ): BigInteger = {
    val __obj = js.Dynamic.literal(abs = abs.toJsFn, bitLength = bitLength.toJsFn, compareTo = js.Any.fromFunction1(compareTo), mod = js.Any.fromFunction1(mod), modPowInt = js.Any.fromFunction2(modPowInt), negate = negate.toJsFn)
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[BigInteger]
  }
  
  extension [Self <: BigInteger](x: Self) {
    
    inline def setAbs(value: CallbackTo[BigInteger]): Self = StObject.set(x, "abs", value.toJsFn)
    
    inline def setBitLength(value: CallbackTo[Double]): Self = StObject.set(x, "bitLength", value.toJsFn)
    
    inline def setCompareTo(value: BigInteger => Double): Self = StObject.set(x, "compareTo", js.Any.fromFunction1(value))
    
    inline def setMod(value: BigInteger => BigInteger): Self = StObject.set(x, "mod", js.Any.fromFunction1(value))
    
    inline def setModPowInt(value: (Double, BigInteger) => BigInteger): Self = StObject.set(x, "modPowInt", js.Any.fromFunction2(value))
    
    inline def setNegate(value: CallbackTo[BigInteger]): Self = StObject.set(x, "negate", value.toJsFn)
    
    inline def setToString_(value: Double => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
  }
}
