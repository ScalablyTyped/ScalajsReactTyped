package typingsJapgolly.sjcl.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclPointJacobian extends StObject {
  
  def add(T: SjclEllipticalPoint): SjclPointJacobian
  
  def doubl(): SjclPointJacobian
  
  def isValid(): Boolean
  
  def mult(k: BigNumber, affine: SjclEllipticalPoint): SjclPointJacobian
  
  def mult2(k1: BigNumber, affine: SjclEllipticalPoint, k2: BigNumber, affine2: SjclEllipticalPoint): SjclPointJacobian
  
  def negate(): SjclPointJacobian
  
  def toAffine(): SjclEllipticalPoint
}
object SjclPointJacobian {
  
  inline def apply(
    add: SjclEllipticalPoint => SjclPointJacobian,
    doubl: CallbackTo[SjclPointJacobian],
    isValid: CallbackTo[Boolean],
    mult: (BigNumber, SjclEllipticalPoint) => SjclPointJacobian,
    mult2: (BigNumber, SjclEllipticalPoint, BigNumber, SjclEllipticalPoint) => SjclPointJacobian,
    negate: CallbackTo[SjclPointJacobian],
    toAffine: CallbackTo[SjclEllipticalPoint]
  ): SjclPointJacobian = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), doubl = doubl.toJsFn, isValid = isValid.toJsFn, mult = js.Any.fromFunction2(mult), mult2 = js.Any.fromFunction4(mult2), negate = negate.toJsFn, toAffine = toAffine.toJsFn)
    __obj.asInstanceOf[SjclPointJacobian]
  }
  
  extension [Self <: SjclPointJacobian](x: Self) {
    
    inline def setAdd(value: SjclEllipticalPoint => SjclPointJacobian): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setDoubl(value: CallbackTo[SjclPointJacobian]): Self = StObject.set(x, "doubl", value.toJsFn)
    
    inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setMult(value: (BigNumber, SjclEllipticalPoint) => SjclPointJacobian): Self = StObject.set(x, "mult", js.Any.fromFunction2(value))
    
    inline def setMult2(value: (BigNumber, SjclEllipticalPoint, BigNumber, SjclEllipticalPoint) => SjclPointJacobian): Self = StObject.set(x, "mult2", js.Any.fromFunction4(value))
    
    inline def setNegate(value: CallbackTo[SjclPointJacobian]): Self = StObject.set(x, "negate", value.toJsFn)
    
    inline def setToAffine(value: CallbackTo[SjclEllipticalPoint]): Self = StObject.set(x, "toAffine", value.toJsFn)
  }
}
