package typingsJapgolly.ethereumjsUtil

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ethereumjsUtil.distAddressMod.Address
import typingsJapgolly.ethereumjsUtil.distBytesMod.ToBufferInputTypes
import typingsJapgolly.ethereumjsUtil.distBytesMod._ToBufferInputTypes
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("@ethereumjs/util/dist/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait TypeOutput extends StObject
  @JSImport("@ethereumjs/util/dist/types", "TypeOutput")
  @js.native
  object TypeOutput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TypeOutput & Double] = js.native
    
    @js.native
    sealed trait BigInt
      extends StObject
         with TypeOutput
    /* 1 */ val BigInt: typingsJapgolly.ethereumjsUtil.distTypesMod.TypeOutput.BigInt & Double = js.native
    
    @js.native
    sealed trait Buffer
      extends StObject
         with TypeOutput
    /* 2 */ val Buffer: typingsJapgolly.ethereumjsUtil.distTypesMod.TypeOutput.Buffer & Double = js.native
    
    @js.native
    sealed trait Number
      extends StObject
         with TypeOutput
    /* 0 */ val Number: typingsJapgolly.ethereumjsUtil.distTypesMod.TypeOutput.Number & Double = js.native
    
    @js.native
    sealed trait PrefixedHexString
      extends StObject
         with TypeOutput
    /* 3 */ val PrefixedHexString: typingsJapgolly.ethereumjsUtil.distTypesMod.TypeOutput.PrefixedHexString & Double = js.native
  }
  
  inline def toType[T /* <: TypeOutput */](input: Null, outputType: T): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("toType")(input.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any])).asInstanceOf[Null]
  inline def toType[T /* <: TypeOutput */](input: Unit, outputType: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toType")(input.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toType[T /* <: TypeOutput */](input: ToBufferInputTypes, outputType: T): /* import warning: importer.ImportType#apply Failed type conversion: @ethereumjs/util.@ethereumjs/util/dist/types.TypeOutputReturnType[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toType")(input.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @ethereumjs/util.@ethereumjs/util/dist/types.TypeOutputReturnType[T] */ js.Any]
  
  type AddressLike = Address | Buffer | PrefixedHexString
  
  type BigIntLike = js.BigInt | PrefixedHexString | Double | Buffer
  
  type BufferLike = Buffer | js.typedarray.Uint8Array | js.Array[Double] | Double | js.BigInt | TransformableToBuffer | PrefixedHexString
  
  @js.native
  trait NestedBufferArray
    extends StObject
       with Array[Buffer | NestedBufferArray]
  
  @js.native
  trait NestedUint8Array
    extends StObject
       with Array[js.typedarray.Uint8Array | NestedUint8Array]
  
  type PrefixedHexString = String
  
  trait TransformableToArray
    extends StObject
       with _ToBufferInputTypes {
    
    def toArray(): js.typedarray.Uint8Array
    
    var toBuffer: js.UndefOr[js.Function0[Buffer]] = js.undefined
  }
  object TransformableToArray {
    
    inline def apply(toArray: CallbackTo[js.typedarray.Uint8Array]): TransformableToArray = {
      val __obj = js.Dynamic.literal(toArray = toArray.toJsFn)
      __obj.asInstanceOf[TransformableToArray]
    }
    
    extension [Self <: TransformableToArray](x: Self) {
      
      inline def setToArray(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "toArray", value.toJsFn)
      
      inline def setToBuffer(value: CallbackTo[Buffer]): Self = StObject.set(x, "toBuffer", value.toJsFn)
      
      inline def setToBufferUndefined: Self = StObject.set(x, "toBuffer", js.undefined)
    }
  }
  
  trait TransformableToBuffer
    extends StObject
       with _ToBufferInputTypes {
    
    var toArray: js.UndefOr[js.Function0[js.typedarray.Uint8Array]] = js.undefined
    
    def toBuffer(): Buffer
  }
  object TransformableToBuffer {
    
    inline def apply(toBuffer: CallbackTo[Buffer]): TransformableToBuffer = {
      val __obj = js.Dynamic.literal(toBuffer = toBuffer.toJsFn)
      __obj.asInstanceOf[TransformableToBuffer]
    }
    
    extension [Self <: TransformableToBuffer](x: Self) {
      
      inline def setToArray(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "toArray", value.toJsFn)
      
      inline def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
      
      inline def setToBuffer(value: CallbackTo[Buffer]): Self = StObject.set(x, "toBuffer", value.toJsFn)
    }
  }
  
  @js.native
  trait TypeOutputReturnType extends StObject
}
