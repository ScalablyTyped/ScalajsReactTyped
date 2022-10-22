package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMatrixLike extends StObject {
  
  def toArray(): DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]
  
  var updateFlag: int
}
object IMatrixLike {
  
  inline def apply(toArray: CallbackTo[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]], updateFlag: int): IMatrixLike = {
    val __obj = js.Dynamic.literal(toArray = toArray.toJsFn, updateFlag = updateFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMatrixLike]
  }
  
  extension [Self <: IMatrixLike](x: Self) {
    
    inline def setToArray(value: CallbackTo[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]): Self = StObject.set(x, "toArray", value.toJsFn)
    
    inline def setUpdateFlag(value: int): Self = StObject.set(x, "updateFlag", value.asInstanceOf[js.Any])
  }
}
