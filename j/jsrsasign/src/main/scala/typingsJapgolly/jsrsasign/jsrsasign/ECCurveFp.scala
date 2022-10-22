package typingsJapgolly.jsrsasign.jsrsasign

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECCurveFp extends StObject {
  
  var a: ECFieldElementFp
  
  var b: ECFieldElementFp
  
  def decodePointHex(): ECPointFp | Null
  
  def equals(): Boolean
  
  def fromBigInteger(): ECFieldElementFp
  
  def getA(): ECFieldElementFp
  
  def getB(): ECFieldElementFp
  
  def getInfinity(): ECPointFp
  
  def getQ(): BigInteger
  
  var infinity: ECPointFp
  
  var q: BigInteger
}
object ECCurveFp {
  
  inline def apply(
    a: ECFieldElementFp,
    b: ECFieldElementFp,
    decodePointHex: CallbackTo[ECPointFp | Null],
    equals_ : CallbackTo[Boolean],
    fromBigInteger: CallbackTo[ECFieldElementFp],
    getA: CallbackTo[ECFieldElementFp],
    getB: CallbackTo[ECFieldElementFp],
    getInfinity: CallbackTo[ECPointFp],
    getQ: CallbackTo[BigInteger],
    infinity: ECPointFp,
    q: BigInteger
  ): ECCurveFp = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], decodePointHex = decodePointHex.toJsFn, fromBigInteger = fromBigInteger.toJsFn, getA = getA.toJsFn, getB = getB.toJsFn, getInfinity = getInfinity.toJsFn, getQ = getQ.toJsFn, infinity = infinity.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(equals_.toJsFn)
    __obj.asInstanceOf[ECCurveFp]
  }
  
  extension [Self <: ECCurveFp](x: Self) {
    
    inline def setA(value: ECFieldElementFp): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: ECFieldElementFp): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setDecodePointHex(value: CallbackTo[ECPointFp | Null]): Self = StObject.set(x, "decodePointHex", value.toJsFn)
    
    inline def setEquals_(value: CallbackTo[Boolean]): Self = StObject.set(x, "equals", value.toJsFn)
    
    inline def setFromBigInteger(value: CallbackTo[ECFieldElementFp]): Self = StObject.set(x, "fromBigInteger", value.toJsFn)
    
    inline def setGetA(value: CallbackTo[ECFieldElementFp]): Self = StObject.set(x, "getA", value.toJsFn)
    
    inline def setGetB(value: CallbackTo[ECFieldElementFp]): Self = StObject.set(x, "getB", value.toJsFn)
    
    inline def setGetInfinity(value: CallbackTo[ECPointFp]): Self = StObject.set(x, "getInfinity", value.toJsFn)
    
    inline def setGetQ(value: CallbackTo[BigInteger]): Self = StObject.set(x, "getQ", value.toJsFn)
    
    inline def setInfinity(value: ECPointFp): Self = StObject.set(x, "infinity", value.asInstanceOf[js.Any])
    
    inline def setQ(value: BigInteger): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}
