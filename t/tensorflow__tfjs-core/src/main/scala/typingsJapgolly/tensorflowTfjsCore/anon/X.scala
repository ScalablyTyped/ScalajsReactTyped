package typingsJapgolly.tensorflowTfjsCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  def x(): Tensor[Rank]
}
object X {
  
  inline def apply(x: CallbackTo[Tensor[Rank]]): X = {
    val __obj = js.Dynamic.literal(x = x.toJsFn)
    __obj.asInstanceOf[X]
  }
  
  extension [Self <: X](x: Self) {
    
    inline def setX(value: CallbackTo[Tensor[Rank]]): Self = StObject.set(x, "x", value.toJsFn)
  }
}
