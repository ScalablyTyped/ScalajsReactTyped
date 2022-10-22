package typingsJapgolly.sjcl.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclEllipticalPoint extends StObject {
  
  def isValid(): Boolean
  
  def mult(k: BigNumber): SjclEllipticalPoint
  
  def mult2(k: BigNumber, k2: BigNumber, affine2: SjclEllipticalPoint): SjclEllipticalPoint
  
  def multiples(): js.Array[SjclEllipticalPoint]
  
  def negate(): SjclEllipticalPoint
  
  def toBits(): BitArray_
  
  def toJac(): SjclPointJacobian
}
object SjclEllipticalPoint {
  
  inline def apply(
    isValid: CallbackTo[Boolean],
    mult: BigNumber => SjclEllipticalPoint,
    mult2: (BigNumber, BigNumber, SjclEllipticalPoint) => SjclEllipticalPoint,
    multiples: CallbackTo[js.Array[SjclEllipticalPoint]],
    negate: CallbackTo[SjclEllipticalPoint],
    toBits: CallbackTo[BitArray_],
    toJac: CallbackTo[SjclPointJacobian]
  ): SjclEllipticalPoint = {
    val __obj = js.Dynamic.literal(isValid = isValid.toJsFn, mult = js.Any.fromFunction1(mult), mult2 = js.Any.fromFunction3(mult2), multiples = multiples.toJsFn, negate = negate.toJsFn, toBits = toBits.toJsFn, toJac = toJac.toJsFn)
    __obj.asInstanceOf[SjclEllipticalPoint]
  }
  
  extension [Self <: SjclEllipticalPoint](x: Self) {
    
    inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setMult(value: BigNumber => SjclEllipticalPoint): Self = StObject.set(x, "mult", js.Any.fromFunction1(value))
    
    inline def setMult2(value: (BigNumber, BigNumber, SjclEllipticalPoint) => SjclEllipticalPoint): Self = StObject.set(x, "mult2", js.Any.fromFunction3(value))
    
    inline def setMultiples(value: CallbackTo[js.Array[SjclEllipticalPoint]]): Self = StObject.set(x, "multiples", value.toJsFn)
    
    inline def setNegate(value: CallbackTo[SjclEllipticalPoint]): Self = StObject.set(x, "negate", value.toJsFn)
    
    inline def setToBits(value: CallbackTo[BitArray_]): Self = StObject.set(x, "toBits", value.toJsFn)
    
    inline def setToJac(value: CallbackTo[SjclPointJacobian]): Self = StObject.set(x, "toJac", value.toJsFn)
  }
}
