package typingsJapgolly.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait N extends StObject {
  
  var N: Unit
  
  var T: Unit
  
  var Tidx: Unit
  
  var dtype: Type
  
  var shape: Unit
  
  var transpose_a: Unit
  
  var transpose_b: Unit
  
  var value: TensorDtypeString
}
object N {
  
  inline def apply(
    N: Unit,
    T: Unit,
    Tidx: Unit,
    dtype: Type,
    shape: Unit,
    transpose_a: Unit,
    transpose_b: Unit,
    value: TensorDtypeString
  ): N = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], Tidx = Tidx.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], transpose_a = transpose_a.asInstanceOf[js.Any], transpose_b = transpose_b.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[N]
  }
  
  extension [Self <: N](x: Self) {
    
    inline def setDtype(value: Type): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setN(value: Unit): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Unit): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setT(value: Unit): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    
    inline def setTidx(value: Unit): Self = StObject.set(x, "Tidx", value.asInstanceOf[js.Any])
    
    inline def setTranspose_a(value: Unit): Self = StObject.set(x, "transpose_a", value.asInstanceOf[js.Any])
    
    inline def setTranspose_b(value: Unit): Self = StObject.set(x, "transpose_b", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TensorDtypeString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
