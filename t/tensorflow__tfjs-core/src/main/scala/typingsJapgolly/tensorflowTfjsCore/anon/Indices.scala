package typingsJapgolly.tensorflowTfjsCore.anon

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indices[T /* <: Tensor[Rank] */] extends StObject {
  
  var indices: T
  
  var values: T
}
object Indices {
  
  inline def apply[T /* <: Tensor[Rank] */](indices: T, values: T): Indices[T] = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices[T]]
  }
  
  extension [Self <: Indices[?], T /* <: Tensor[Rank] */](x: Self & Indices[T]) {
    
    inline def setIndices(value: T): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setValues(value: T): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
