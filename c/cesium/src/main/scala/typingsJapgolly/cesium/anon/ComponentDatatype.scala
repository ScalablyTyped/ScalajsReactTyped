package typingsJapgolly.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDatatype extends StObject {
  
  var componentDatatype: js.UndefOr[typingsJapgolly.cesium.mod.ComponentDatatype] = js.undefined
  
  var componentsPerAttribute: js.UndefOr[Double] = js.undefined
  
  var normalize: js.UndefOr[Boolean] = js.undefined
  
  var values: js.UndefOr[
    js.Array[Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  ] = js.undefined
}
object ComponentDatatype {
  
  inline def apply(): ComponentDatatype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentDatatype]
  }
  
  extension [Self <: ComponentDatatype](x: Self) {
    
    inline def setComponentDatatype(value: typingsJapgolly.cesium.mod.ComponentDatatype): Self = StObject.set(x, "componentDatatype", value.asInstanceOf[js.Any])
    
    inline def setComponentDatatypeUndefined: Self = StObject.set(x, "componentDatatype", js.undefined)
    
    inline def setComponentsPerAttribute(value: Double): Self = StObject.set(x, "componentsPerAttribute", value.asInstanceOf[js.Any])
    
    inline def setComponentsPerAttributeUndefined: Self = StObject.set(x, "componentsPerAttribute", js.undefined)
    
    inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    inline def setValues(
      value: js.Array[Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
    ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
