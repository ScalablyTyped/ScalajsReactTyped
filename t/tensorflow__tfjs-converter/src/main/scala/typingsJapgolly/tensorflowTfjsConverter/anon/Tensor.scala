package typingsJapgolly.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tensor extends StObject {
  
  var tensor: Dtype
}
object Tensor {
  
  inline def apply(tensor: Dtype): Tensor = {
    val __obj = js.Dynamic.literal(tensor = tensor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tensor]
  }
  
  extension [Self <: Tensor](x: Self) {
    
    inline def setTensor(value: Dtype): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
  }
}
