package typingsJapgolly.tensorflowTfjsCore.anon

import typingsJapgolly.tensorflowTfjsCore.distBackendsBackendMod.KernelBackend
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backend extends StObject {
  
  var backend: KernelBackend
  
  var bytes: Double
  
  var dtype: DataType
  
  var shape: js.Array[Double]
}
object Backend {
  
  inline def apply(backend: KernelBackend, bytes: Double, dtype: DataType, shape: js.Array[Double]): Backend = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
  
  extension [Self <: Backend](x: Self) {
    
    inline def setBackend(value: KernelBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
  }
}
