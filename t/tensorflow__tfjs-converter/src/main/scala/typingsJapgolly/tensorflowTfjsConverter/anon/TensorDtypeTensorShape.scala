package typingsJapgolly.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TensorDtypeTensorShape extends StObject {
  
  var tensor: DtypeTensorShape
}
object TensorDtypeTensorShape {
  
  inline def apply(tensor: DtypeTensorShape): TensorDtypeTensorShape = {
    val __obj = js.Dynamic.literal(tensor = tensor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorDtypeTensorShape]
  }
  
  extension [Self <: TensorDtypeTensorShape](x: Self) {
    
    inline def setTensor(value: DtypeTensorShape): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
  }
}
