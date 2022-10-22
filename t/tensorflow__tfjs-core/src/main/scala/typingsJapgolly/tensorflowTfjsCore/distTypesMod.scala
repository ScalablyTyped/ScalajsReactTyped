package typingsJapgolly.tensorflowTfjsCore

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Rank extends StObject
  @JSImport("@tensorflow/tfjs-core/dist/types", "Rank")
  @js.native
  object Rank extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Rank & String] = js.native
    
    @js.native
    sealed trait R0
      extends StObject
         with Rank
    /* "R0" */ val R0: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R0 & String = js.native
    
    @js.native
    sealed trait R1
      extends StObject
         with Rank
    /* "R1" */ val R1: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R1 & String = js.native
    
    @js.native
    sealed trait R2
      extends StObject
         with Rank
    /* "R2" */ val R2: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R2 & String = js.native
    
    @js.native
    sealed trait R3
      extends StObject
         with Rank
    /* "R3" */ val R3: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R3 & String = js.native
    
    @js.native
    sealed trait R4
      extends StObject
         with Rank
    /* "R4" */ val R4: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R4 & String = js.native
    
    @js.native
    sealed trait R5
      extends StObject
         with Rank
    /* "R5" */ val R5: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R5 & String = js.native
    
    @js.native
    sealed trait R6
      extends StObject
         with Rank
    /* "R6" */ val R6: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R6 & String = js.native
  }
  
  inline def sumOutType(`type`: DataType): DataType = ^.asInstanceOf[js.Dynamic].applyDynamic("sumOutType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DataType]
  
  inline def upcastType(typeA: DataType, typeB: DataType): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("upcastType")(typeA.asInstanceOf[js.Any], typeB.asInstanceOf[js.Any])).asInstanceOf[DataType]
  
  trait ArrayMap extends StObject {
    
    var R0: Double
    
    var R1: js.Array[Double]
    
    var R2: js.Array[js.Array[Double]]
    
    var R3: js.Array[js.Array[js.Array[Double]]]
    
    var R4: js.Array[js.Array[js.Array[js.Array[Double]]]]
    
    var R5: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]
    
    var R6: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]
  }
  object ArrayMap {
    
    inline def apply(
      R0: Double,
      R1: js.Array[Double],
      R2: js.Array[js.Array[Double]],
      R3: js.Array[js.Array[js.Array[Double]]],
      R4: js.Array[js.Array[js.Array[js.Array[Double]]]],
      R5: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]],
      R6: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]
    ): ArrayMap = {
      val __obj = js.Dynamic.literal(R0 = R0.asInstanceOf[js.Any], R1 = R1.asInstanceOf[js.Any], R2 = R2.asInstanceOf[js.Any], R3 = R3.asInstanceOf[js.Any], R4 = R4.asInstanceOf[js.Any], R5 = R5.asInstanceOf[js.Any], R6 = R6.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayMap]
    }
    
    extension [Self <: ArrayMap](x: Self) {
      
      inline def setR0(value: Double): Self = StObject.set(x, "R0", value.asInstanceOf[js.Any])
      
      inline def setR1(value: js.Array[Double]): Self = StObject.set(x, "R1", value.asInstanceOf[js.Any])
      
      inline def setR1Varargs(value: Double*): Self = StObject.set(x, "R1", js.Array(value*))
      
      inline def setR2(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "R2", value.asInstanceOf[js.Any])
      
      inline def setR2Varargs(value: js.Array[Double]*): Self = StObject.set(x, "R2", js.Array(value*))
      
      inline def setR3(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "R3", value.asInstanceOf[js.Any])
      
      inline def setR3Varargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "R3", js.Array(value*))
      
      inline def setR4(value: js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = StObject.set(x, "R4", value.asInstanceOf[js.Any])
      
      inline def setR4Varargs(value: js.Array[js.Array[js.Array[Double]]]*): Self = StObject.set(x, "R4", js.Array(value*))
      
      inline def setR5(value: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]): Self = StObject.set(x, "R5", value.asInstanceOf[js.Any])
      
      inline def setR5Varargs(value: js.Array[js.Array[js.Array[js.Array[Double]]]]*): Self = StObject.set(x, "R5", js.Array(value*))
      
      inline def setR6(value: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]): Self = StObject.set(x, "R6", value.asInstanceOf[js.Any])
      
      inline def setR6Varargs(value: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]*): Self = StObject.set(x, "R6", js.Array(value*))
    }
  }
  
  type BackendValues = js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.Array[js.typedarray.Uint8Array]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
  */
  trait DataType extends StObject
  
  trait DataTypeMap extends StObject {
    
    var bool: js.typedarray.Uint8Array
    
    var complex64: js.typedarray.Float32Array
    
    var float32: js.typedarray.Float32Array
    
    var int32: js.typedarray.Int32Array
    
    var string: js.Array[String]
  }
  object DataTypeMap {
    
    inline def apply(
      bool: js.typedarray.Uint8Array,
      complex64: js.typedarray.Float32Array,
      float32: js.typedarray.Float32Array,
      int32: js.typedarray.Int32Array,
      string: js.Array[String]
    ): DataTypeMap = {
      val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], complex64 = complex64.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTypeMap]
    }
    
    extension [Self <: DataTypeMap](x: Self) {
      
      inline def setBool(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setComplex64(value: js.typedarray.Float32Array): Self = StObject.set(x, "complex64", value.asInstanceOf[js.Any])
      
      inline def setFloat32(value: js.typedarray.Float32Array): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: js.typedarray.Int32Array): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setString(value: js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value*))
    }
  }
  
  /* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataType] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.map
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.length
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.entries
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.pop
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.set
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fill
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.join
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.copyWithin
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BYTES_PER_ELEMENT
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.buffer
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.keys
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sort
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.forEach
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.concat
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.includes
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.slice
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valueOf
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.shift
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.push
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reverse
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flat
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.splice
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.some
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.at
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.unshift
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.filter
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.subarray
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.toString
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.indexOf
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduceRight
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.findIndex
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduce
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteLength
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.values
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flatMap
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.toLocaleString
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.every
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.lastIndexOf
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteOffset
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.find
  */
  trait DataValues extends StObject
  object DataValues {
    
    inline def BYTES_PER_ELEMENT: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BYTES_PER_ELEMENT = "BYTES_PER_ELEMENT".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BYTES_PER_ELEMENT]
    
    inline def at: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.at = "at".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.at]
    
    inline def buffer: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.buffer = "buffer".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.buffer]
    
    inline def byteLength: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteLength = "byteLength".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteLength]
    
    inline def byteOffset: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteOffset = "byteOffset".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteOffset]
    
    inline def concat: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.concat = "concat".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.concat]
    
    inline def copyWithin: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.copyWithin = "copyWithin".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.copyWithin]
    
    inline def entries: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.entries = "entries".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.entries]
    
    inline def every: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.every = "every".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.every]
    
    inline def fill: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fill = "fill".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fill]
    
    inline def filter: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.filter = "filter".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.filter]
    
    inline def find: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.find = "find".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.find]
    
    inline def findIndex: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.findIndex = "findIndex".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.findIndex]
    
    inline def flat: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flat = "flat".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flat]
    
    inline def flatMap: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flatMap = "flatMap".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flatMap]
    
    inline def forEach: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.forEach = "forEach".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.forEach]
    
    inline def includes: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.includes = "includes".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.includes]
    
    inline def indexOf: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.indexOf = "indexOf".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.indexOf]
    
    inline def join: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.join = "join".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.join]
    
    inline def keys: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.keys = "keys".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.keys]
    
    inline def lastIndexOf: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.lastIndexOf = "lastIndexOf".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.lastIndexOf]
    
    inline def length: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.length = "length".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.length]
    
    inline def map: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.map = "map".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.map]
    
    inline def pop: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.pop = "pop".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.pop]
    
    inline def push: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.push = "push".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.push]
    
    inline def reduce: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduce = "reduce".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduce]
    
    inline def reduceRight: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduceRight = "reduceRight".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduceRight]
    
    inline def reverse: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reverse = "reverse".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reverse]
    
    inline def set: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.set = "set".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.set]
    
    inline def shift: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.shift = "shift".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.shift]
    
    inline def slice: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.slice = "slice".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.slice]
    
    inline def some: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.some = "some".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.some]
    
    inline def sort: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sort = "sort".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sort]
    
    inline def splice: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.splice = "splice".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.splice]
    
    inline def subarray: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.subarray = "subarray".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.subarray]
    
    inline def unshift: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.unshift = "unshift".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.unshift]
    
    inline def values: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.values = "values".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.values]
  }
  
  type FlatVector = (js.Array[Boolean | Double]) | TypedArray
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
  */
  trait NumericDataType extends StObject
  object NumericDataType {
    
    inline def bool: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool = "bool".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool]
    
    inline def complex64: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64 = "complex64".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64]
    
    inline def float32: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32 = "float32".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32]
    
    inline def int32: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32 = "int32".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32]
  }
  
  trait PixelData extends StObject {
    
    var data: js.typedarray.Uint8Array
    
    var height: Double
    
    var width: Double
  }
  object PixelData {
    
    inline def apply(data: js.typedarray.Uint8Array, height: Double, width: Double): PixelData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PixelData]
    }
    
    extension [Self <: PixelData](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecursiveArray[T /* <: Any */]
    extends StObject
       with /* index */ NumberDictionary[T | RecursiveArray[T]]
  object RecursiveArray {
    
    inline def apply[T /* <: Any */](): RecursiveArray[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecursiveArray[T]]
    }
  }
  
  type RegularArray[T] = js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]
  
  type ScalarLike = Double | Boolean | String | js.typedarray.Uint8Array
  
  trait ShapeMap extends StObject {
    
    var R0: js.Array[Double]
    
    var R1: js.Array[Double]
    
    var R2: js.Tuple2[Double, Double]
    
    var R3: js.Tuple3[Double, Double, Double]
    
    var R4: js.Tuple4[Double, Double, Double, Double]
    
    var R5: js.Tuple5[Double, Double, Double, Double, Double]
    
    var R6: js.Tuple6[Double, Double, Double, Double, Double, Double]
  }
  object ShapeMap {
    
    inline def apply(
      R0: js.Array[Double],
      R1: js.Array[Double],
      R2: js.Tuple2[Double, Double],
      R3: js.Tuple3[Double, Double, Double],
      R4: js.Tuple4[Double, Double, Double, Double],
      R5: js.Tuple5[Double, Double, Double, Double, Double],
      R6: js.Tuple6[Double, Double, Double, Double, Double, Double]
    ): ShapeMap = {
      val __obj = js.Dynamic.literal(R0 = R0.asInstanceOf[js.Any], R1 = R1.asInstanceOf[js.Any], R2 = R2.asInstanceOf[js.Any], R3 = R3.asInstanceOf[js.Any], R4 = R4.asInstanceOf[js.Any], R5 = R5.asInstanceOf[js.Any], R6 = R6.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShapeMap]
    }
    
    extension [Self <: ShapeMap](x: Self) {
      
      inline def setR0(value: js.Array[Double]): Self = StObject.set(x, "R0", value.asInstanceOf[js.Any])
      
      inline def setR0Varargs(value: Double*): Self = StObject.set(x, "R0", js.Array(value*))
      
      inline def setR1(value: js.Array[Double]): Self = StObject.set(x, "R1", value.asInstanceOf[js.Any])
      
      inline def setR1Varargs(value: Double*): Self = StObject.set(x, "R1", js.Array(value*))
      
      inline def setR2(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "R2", value.asInstanceOf[js.Any])
      
      inline def setR3(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "R3", value.asInstanceOf[js.Any])
      
      inline def setR4(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "R4", value.asInstanceOf[js.Any])
      
      inline def setR5(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "R5", value.asInstanceOf[js.Any])
      
      inline def setR6(value: js.Tuple6[Double, Double, Double, Double, Double, Double]): Self = StObject.set(x, "R6", value.asInstanceOf[js.Any])
    }
  }
  
  trait SingleValueMap extends StObject {
    
    var bool: Boolean
    
    var complex64: Double
    
    var float32: Double
    
    var int32: Double
    
    var string: String
  }
  object SingleValueMap {
    
    inline def apply(bool: Boolean, complex64: Double, float32: Double, int32: Double, string: String): SingleValueMap = {
      val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], complex64 = complex64.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleValueMap]
    }
    
    extension [Self <: SingleValueMap](x: Self) {
      
      inline def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setComplex64(value: Double): Self = StObject.set(x, "complex64", value.asInstanceOf[js.Any])
      
      inline def setFloat32(value: Double): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: Double): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  type TensorLike = TypedArray | Double | Boolean | String | (RecursiveArray[js.Array[Double] | Boolean | Double | String | TypedArray]) | js.Array[js.typedarray.Uint8Array]
  
  type TensorLike1D = TypedArray | (js.Array[Boolean | Double | String | js.typedarray.Uint8Array])
  
  type TensorLike2D = TypedArray | (js.Array[
    (js.Array[Boolean | Double | String | js.typedarray.Uint8Array]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike3D = TypedArray | (js.Array[
    (js.Array[js.Array[Boolean | Double | String | js.typedarray.Uint8Array]]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike4D = TypedArray | (js.Array[
    (js.Array[js.Array[js.Array[Boolean | Double | String | js.typedarray.Uint8Array]]]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike5D = TypedArray | (js.Array[
    (js.Array[
      js.Array[js.Array[js.Array[Boolean | Double | String | js.typedarray.Uint8Array]]]
    ]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike6D = TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[js.Array[(js.Array[Boolean | Double | String]) | js.typedarray.Uint8Array]]
      ]
    ]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TypedArray = js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.A
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.B
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.G
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.R
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BAG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BAR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GAB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GAR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RAB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RAG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABGR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABRG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGBR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGRB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARBG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARGB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BAGR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BARG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGAR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGRA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRAG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRGA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GABR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GARB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBAR
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBRA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRAB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRBA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RABG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RAGB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBAG
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBGA
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGAB
    - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGBA
  */
  trait WebGLChannels extends StObject
  object WebGLChannels {
    
    inline def A: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.A = "A".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.A]
    
    inline def AB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AB = "AB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AB]
    
    inline def ABG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABG = "ABG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABG]
    
    inline def ABGR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABGR = "ABGR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABGR]
    
    inline def ABR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABR = "ABR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABR]
    
    inline def ABRG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABRG = "ABRG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ABRG]
    
    inline def AG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AG = "AG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AG]
    
    inline def AGB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGB = "AGB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGB]
    
    inline def AGBR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGBR = "AGBR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGBR]
    
    inline def AGR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGR = "AGR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGR]
    
    inline def AGRB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGRB = "AGRB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AGRB]
    
    inline def AR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AR = "AR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.AR]
    
    inline def ARB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARB = "ARB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARB]
    
    inline def ARBG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARBG = "ARBG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARBG]
    
    inline def ARG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARG = "ARG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARG]
    
    inline def ARGB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARGB = "ARGB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ARGB]
    
    inline def B: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.B = "B".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.B]
    
    inline def BA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BA = "BA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BA]
    
    inline def BAG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BAG = "BAG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BAG]
    
    inline def BAGR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BAGR = "BAGR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BAGR]
    
    inline def BAR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BAR = "BAR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BAR]
    
    inline def BARG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BARG = "BARG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BARG]
    
    inline def BG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BG = "BG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BG]
    
    inline def BGA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGA = "BGA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGA]
    
    inline def BGAR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGAR = "BGAR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGAR]
    
    inline def BGR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGR = "BGR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGR]
    
    inline def BGRA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGRA = "BGRA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BGRA]
    
    inline def BR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BR = "BR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BR]
    
    inline def BRA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRA = "BRA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRA]
    
    inline def BRAG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRAG = "BRAG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRAG]
    
    inline def BRG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRG = "BRG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRG]
    
    inline def BRGA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRGA = "BRGA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BRGA]
    
    inline def G: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.G = "G".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.G]
    
    inline def GA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GA = "GA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GA]
    
    inline def GAB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GAB = "GAB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GAB]
    
    inline def GABR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GABR = "GABR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GABR]
    
    inline def GAR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GAR = "GAR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GAR]
    
    inline def GARB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GARB = "GARB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GARB]
    
    inline def GB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GB = "GB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GB]
    
    inline def GBA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBA = "GBA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBA]
    
    inline def GBAR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBAR = "GBAR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBAR]
    
    inline def GBR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBR = "GBR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBR]
    
    inline def GBRA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBRA = "GBRA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GBRA]
    
    inline def GR: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GR = "GR".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GR]
    
    inline def GRA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRA = "GRA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRA]
    
    inline def GRAB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRAB = "GRAB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRAB]
    
    inline def GRB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRB = "GRB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRB]
    
    inline def GRBA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRBA = "GRBA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.GRBA]
    
    inline def R: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.R = "R".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.R]
    
    inline def RA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RA = "RA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RA]
    
    inline def RAB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RAB = "RAB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RAB]
    
    inline def RABG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RABG = "RABG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RABG]
    
    inline def RAG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RAG = "RAG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RAG]
    
    inline def RAGB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RAGB = "RAGB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RAGB]
    
    inline def RB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RB = "RB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RB]
    
    inline def RBA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBA = "RBA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBA]
    
    inline def RBAG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBAG = "RBAG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBAG]
    
    inline def RBG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBG = "RBG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBG]
    
    inline def RBGA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBGA = "RBGA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RBGA]
    
    inline def RG: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RG = "RG".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RG]
    
    inline def RGA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGA = "RGA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGA]
    
    inline def RGAB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGAB = "RGAB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGAB]
    
    inline def RGB: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGB = "RGB".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGB]
    
    inline def RGBA: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGBA = "RGBA".asInstanceOf[typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.RGBA]
  }
  
  trait WebGLData extends StObject {
    
    var channels: WebGLChannels
    
    var height: Double
    
    var texture: WebGLTexture
    
    var width: Double
  }
  object WebGLData {
    
    inline def apply(channels: WebGLChannels, height: Double, texture: WebGLTexture, width: Double): WebGLData = {
      val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLData]
    }
    
    extension [Self <: WebGLData](x: Self) {
      
      inline def setChannels(value: WebGLChannels): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setTexture(value: WebGLTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
