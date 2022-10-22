package typingsJapgolly.vectorious

import typingsJapgolly.std.Float32ArrayConstructor
import typingsJapgolly.std.Float64ArrayConstructor
import typingsJapgolly.std.Int16ArrayConstructor
import typingsJapgolly.std.Int32ArrayConstructor
import typingsJapgolly.std.Int8ArrayConstructor
import typingsJapgolly.std.Uint16ArrayConstructor
import typingsJapgolly.std.Uint32ArrayConstructor
import typingsJapgolly.std.Uint8ArrayConstructor
import typingsJapgolly.std.Uint8ClampedArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vectorious.vectoriousStrings.int8
    - typingsJapgolly.vectorious.vectoriousStrings.uint8
    - typingsJapgolly.vectorious.vectoriousStrings.int16
    - typingsJapgolly.vectorious.vectoriousStrings.uint16
    - typingsJapgolly.vectorious.vectoriousStrings.int32
    - typingsJapgolly.vectorious.vectoriousStrings.uint32
    - typingsJapgolly.vectorious.vectoriousStrings.uint8c
    - typingsJapgolly.vectorious.vectoriousStrings.float32
    - typingsJapgolly.vectorious.vectoriousStrings.float64
    - typingsJapgolly.vectorious.vectoriousStrings.complex64
    - typingsJapgolly.vectorious.vectoriousStrings.complex128
  */
  trait DType extends StObject
  object DType {
    
    inline def complex128: typingsJapgolly.vectorious.vectoriousStrings.complex128 = "complex128".asInstanceOf[typingsJapgolly.vectorious.vectoriousStrings.complex128]
    
    inline def complex64: typingsJapgolly.vectorious.vectoriousStrings.complex64 = "complex64".asInstanceOf[typingsJapgolly.vectorious.vectoriousStrings.complex64]
    
    inline def float32: typingsJapgolly.vectorious.vectoriousStrings.float32 = "float32".asInstanceOf[typingsJapgolly.vectorious.vectoriousStrings.float32]
    
    inline def float64: typingsJapgolly.vectorious.vectoriousStrings.float64 = "float64".asInstanceOf[typingsJapgolly.vectorious.vectoriousStrings.float64]
    
    inline def int16: typingsJapgolly.vectorious.vectoriousStrings.int16 = "int16".asInstanceOf[typingsJapgolly.vectorious.vectoriousStrings.int16]
    
    inline def int32: typingsJapgolly.vectorious.vectoriousStrings.int32 = "int32".asInstanceOf[typingsJapgolly.vectorious.vectoriousStrings.int32]
    
    inline def int8: typingsJapgolly.vectorious.vectoriousStrings.int8 = "int8".asInstanceOf[typingsJapgolly.vectorious.vectoriousStrings.int8]
    
    inline def uint16: typingsJapgolly.vectorious.vectoriousStrings.uint16 = "uint16".asInstanceOf[typingsJapgolly.vectorious.vectoriousStrings.uint16]
    
    inline def uint32: typingsJapgolly.vectorious.vectoriousStrings.uint32 = "uint32".asInstanceOf[typingsJapgolly.vectorious.vectoriousStrings.uint32]
    
    inline def uint8: typingsJapgolly.vectorious.vectoriousStrings.uint8 = "uint8".asInstanceOf[typingsJapgolly.vectorious.vectoriousStrings.uint8]
    
    inline def uint8c: typingsJapgolly.vectorious.vectoriousStrings.uint8c = "uint8c".asInstanceOf[typingsJapgolly.vectorious.vectoriousStrings.uint8c]
  }
  
  trait INDArray extends StObject {
    
    var data: TypedArray
    
    var dtype: DType
    
    var length: Double
    
    var shape: js.Array[Double]
    
    var strides: js.Array[Double]
  }
  object INDArray {
    
    inline def apply(data: TypedArray, dtype: DType, length: Double, shape: js.Array[Double], strides: js.Array[Double]): INDArray = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
      __obj.asInstanceOf[INDArray]
    }
    
    extension [Self <: INDArray](x: Self) {
      
      inline def setData(value: TypedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDtype(value: DType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setStrides(value: js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
    }
  }
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  type TypedArrayConstructor = Int8ArrayConstructor | Uint8ArrayConstructor | Int16ArrayConstructor | Uint16ArrayConstructor | Int32ArrayConstructor | Uint32ArrayConstructor | Uint8ClampedArrayConstructor | Float32ArrayConstructor | Float64ArrayConstructor
}
