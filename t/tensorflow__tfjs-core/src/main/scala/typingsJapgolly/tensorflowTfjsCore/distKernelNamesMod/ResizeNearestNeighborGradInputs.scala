package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'images' | 'dy'> */
trait ResizeNearestNeighborGradInputs extends StObject {
  
  var dy: js.UndefOr[scala.Any] = js.undefined
  
  var images: js.UndefOr[scala.Any] = js.undefined
}
object ResizeNearestNeighborGradInputs {
  
  inline def apply(): ResizeNearestNeighborGradInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeNearestNeighborGradInputs]
  }
  
  extension [Self <: ResizeNearestNeighborGradInputs](x: Self) {
    
    inline def setDy(value: scala.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setImages(value: scala.Any): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
  }
}
