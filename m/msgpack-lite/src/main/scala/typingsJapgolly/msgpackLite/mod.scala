package typingsJapgolly.msgpackLite

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("msgpack-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Decoder extends EventEmitter {
    
    var bufferish: Any = js.native
    
    def decode(chunk: Any): Unit = js.native
    
    def end(chunk: Any): Unit = js.native
    
    def fetch(): Unit = js.native
    
    def flush(): Unit = js.native
    
    var offset: Double = js.native
    
    def pull(): Double = js.native
    
    def push(chunk: Any): Unit = js.native
    
    def read(): Double = js.native
    
    def reserve(length: Double): Double = js.native
    
    def write(chunk: Any): Unit = js.native
  }
  object Decoder {
    
    @JSImport("msgpack-lite", "Decoder")
    @js.native
    def apply(): Decoder = js.native
    @JSImport("msgpack-lite", "Decoder")
    @js.native
    def apply(options: DecoderOptions): Decoder = js.native
  }
  
  object codec {
    
    @JSImport("msgpack-lite", "codec")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default built-in codec
      */
    @JSImport("msgpack-lite", "codec.preset")
    @js.native
    def preset: Codec_ = js.native
    inline def preset_=(x: Codec_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preset")(x.asInstanceOf[js.Any])
  }
  
  inline def createCodec(): Codec_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createCodec")().asInstanceOf[Codec_]
  inline def createCodec(options: CodecOptions): Codec_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createCodec")(options.asInstanceOf[js.Any]).asInstanceOf[Codec_]
  
  inline def createDecodeStream(): DecodeStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecodeStream")().asInstanceOf[DecodeStream]
  inline def createDecodeStream(options: DecoderOptions & TransformOptions): DecodeStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecodeStream")(options.asInstanceOf[js.Any]).asInstanceOf[DecodeStream]
  
  inline def createEncodeStream(): EncodeStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncodeStream")().asInstanceOf[EncodeStream]
  inline def createEncodeStream(options: EncoderOptions & TransformOptions): EncodeStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncodeStream")(options.asInstanceOf[js.Any]).asInstanceOf[EncodeStream]
  
  inline def decode(input: js.Array[Double]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(input: js.Array[Double], options: DecoderOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(input: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(input: js.typedarray.Uint8Array, options: DecoderOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(input: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(input: Buffer, options: DecoderOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encode(input: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def encode(input: Any, options: EncoderOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  trait CodecOptions extends StObject {
    
    /**
      * It ties msgpack's bin format with ArrayBuffer object, instead of Buffer object.
      * @default false
      */
    var binarraybuffer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * It decodes msgpack's int64/uint64 formats with int64-buffer object.
      * int64-buffer is a cutom integer type with 64 bits of precision instead
      * of the built-in IEEE-754 53 bits. See https://github.com/kawanet/int64-buffer
      * @default false
      */
    var int64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * It includes the preset extensions for JavaScript native objects.
      * @see https://github.com/kawanet/msgpack-lite#extension-types
      * @default false
      */
    var preset: js.UndefOr[Boolean] = js.undefined
    
    /**
      * It runs a validation of the value before writing it into buffer.
      * This is the default behavior for some old browsers which do not support ArrayBuffer object.
      * @default varies
      */
    var safe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * It returns Uint8Array object when encoding, instead of Buffer object.
      * @default false
      */
    var uint8array: js.UndefOr[Boolean] = js.undefined
    
    /**
      * It uses the global JavaScript Map type, if available, to unpack MessagePack map elements.
      * @default false
      */
    var usemap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * It uses raw formats instead of bin and str.
      * Set true for compatibility with msgpack's old spec.
      * @see https://github.com/kawanet/msgpack-lite#compatibility-mode
      * @default false
      */
    var useraw: js.UndefOr[Boolean] = js.undefined
  }
  object CodecOptions {
    
    inline def apply(): CodecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodecOptions]
    }
    
    extension [Self <: CodecOptions](x: Self) {
      
      inline def setBinarraybuffer(value: Boolean): Self = StObject.set(x, "binarraybuffer", value.asInstanceOf[js.Any])
      
      inline def setBinarraybufferUndefined: Self = StObject.set(x, "binarraybuffer", js.undefined)
      
      inline def setInt64(value: Boolean): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
      
      inline def setInt64Undefined: Self = StObject.set(x, "int64", js.undefined)
      
      inline def setPreset(value: Boolean): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      inline def setUint8array(value: Boolean): Self = StObject.set(x, "uint8array", value.asInstanceOf[js.Any])
      
      inline def setUint8arrayUndefined: Self = StObject.set(x, "uint8array", js.undefined)
      
      inline def setUsemap(value: Boolean): Self = StObject.set(x, "usemap", value.asInstanceOf[js.Any])
      
      inline def setUsemapUndefined: Self = StObject.set(x, "usemap", js.undefined)
      
      inline def setUseraw(value: Boolean): Self = StObject.set(x, "useraw", value.asInstanceOf[js.Any])
      
      inline def setUserawUndefined: Self = StObject.set(x, "useraw", js.undefined)
    }
  }
  
  trait Codec_ extends StObject {
    
    /**
      * Register a custom extension to serialize your own class instances
      *
      * @param etype an integer within the range of 0 and 127 (0x0 and 0x7F)
      * @param Class the constructor of the type you wish to serialize
      * @param packer a function that converts an instance of T to bytes
      */
    def addExtPacker[T](
      etype: Double,
      Class: Instantiable1[/* args (repeated) */ Any, T],
      packer: js.Function1[/* t */ T, Buffer | js.typedarray.Uint8Array]
    ): Unit
    
    /**
      * Register a custom extension to deserialize your own class instances
      *
      * @param etype an integer within the range of 0 and 127 (0x0 and 0x7F)
      * @param unpacker a function that converts bytes to an instance of T
      */
    def addExtUnpacker[T](etype: Double, unpacker: js.Function1[/* data */ Buffer | js.typedarray.Uint8Array, T]): Unit
  }
  object Codec_ {
    
    inline def apply(
      addExtPacker: (Double, Instantiable1[/* args (repeated) */ Any, Any], js.Function1[Any, Buffer | js.typedarray.Uint8Array]) => Callback,
      addExtUnpacker: (Double, js.Function1[/* data */ Buffer | js.typedarray.Uint8Array, Any]) => Callback
    ): Codec_ = {
      val __obj = js.Dynamic.literal(addExtPacker = js.Any.fromFunction3((t0: Double, t1: Instantiable1[/* args (repeated) */ Any, Any], t2: js.Function1[Any, Buffer | js.typedarray.Uint8Array]) => (addExtPacker(t0, t1, t2)).runNow()), addExtUnpacker = js.Any.fromFunction2((t0: Double, t1: js.Function1[/* data */ Buffer | js.typedarray.Uint8Array, Any]) => (addExtUnpacker(t0, t1)).runNow()))
      __obj.asInstanceOf[Codec_]
    }
    
    extension [Self <: Codec_](x: Self) {
      
      inline def setAddExtPacker(
        value: (Double, Instantiable1[/* args (repeated) */ Any, Any], js.Function1[Any, Buffer | js.typedarray.Uint8Array]) => Callback
      ): Self = StObject.set(x, "addExtPacker", js.Any.fromFunction3((t0: Double, t1: Instantiable1[/* args (repeated) */ Any, Any], t2: js.Function1[Any, Buffer | js.typedarray.Uint8Array]) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddExtUnpacker(value: (Double, js.Function1[/* data */ Buffer | js.typedarray.Uint8Array, Any]) => Callback): Self = StObject.set(x, "addExtUnpacker", js.Any.fromFunction2((t0: Double, t1: js.Function1[/* data */ Buffer | js.typedarray.Uint8Array, Any]) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait DecodeStream extends Transform {
    
    var decoder: Decoder = js.native
  }
  
  trait DecoderOptions extends StObject {
    
    var codec: js.UndefOr[Codec_] = js.undefined
  }
  object DecoderOptions {
    
    inline def apply(): DecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoderOptions]
    }
    
    extension [Self <: DecoderOptions](x: Self) {
      
      inline def setCodec(value: Codec_): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    }
  }
  
  @js.native
  trait EncodeStream extends Transform {
    
    var encoder: Encoder = js.native
  }
  
  trait Encoder extends StObject {
    
    var bufferish: Any
    
    def encode(chunk: Any): Unit
    
    def end(chunk: Any): Unit
    
    def fetch(): Unit
    
    def flush(): Unit
    
    var maxBufferSize: Double
    
    var minBufferSize: Double
    
    var offset: Double
    
    def pull(): Double
    
    def push(chunk: Any): Unit
    
    def read(): Double
    
    def reserve(length: Double): Double
    
    def send(buffer: Buffer): Unit
    
    var start: Double
    
    def write(chunk: Any): Unit
  }
  object Encoder {
    
    inline def apply(
      bufferish: Any,
      encode: Any => Callback,
      end: Any => Callback,
      fetch: Callback,
      flush: Callback,
      maxBufferSize: Double,
      minBufferSize: Double,
      offset: Double,
      pull: CallbackTo[Double],
      push: Any => Callback,
      read: CallbackTo[Double],
      reserve: Double => Double,
      send: Buffer => Callback,
      start: Double,
      write: Any => Callback
    ): Encoder = {
      val __obj = js.Dynamic.literal(bufferish = bufferish.asInstanceOf[js.Any], encode = js.Any.fromFunction1((t0: Any) => encode(t0).runNow()), end = js.Any.fromFunction1((t0: Any) => end(t0).runNow()), fetch = fetch.toJsFn, flush = flush.toJsFn, maxBufferSize = maxBufferSize.asInstanceOf[js.Any], minBufferSize = minBufferSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pull = pull.toJsFn, push = js.Any.fromFunction1((t0: Any) => push(t0).runNow()), read = read.toJsFn, reserve = js.Any.fromFunction1(reserve), send = js.Any.fromFunction1((t0: Buffer) => send(t0).runNow()), start = start.asInstanceOf[js.Any], write = js.Any.fromFunction1((t0: Any) => write(t0).runNow()))
      __obj.asInstanceOf[Encoder]
    }
    
    extension [Self <: Encoder](x: Self) {
      
      inline def setBufferish(value: Any): Self = StObject.set(x, "bufferish", value.asInstanceOf[js.Any])
      
      inline def setEncode(value: Any => Callback): Self = StObject.set(x, "encode", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setEnd(value: Any => Callback): Self = StObject.set(x, "end", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setFetch(value: Callback): Self = StObject.set(x, "fetch", value.toJsFn)
      
      inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
      
      inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMinBufferSize(value: Double): Self = StObject.set(x, "minBufferSize", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPull(value: CallbackTo[Double]): Self = StObject.set(x, "pull", value.toJsFn)
      
      inline def setPush(value: Any => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRead(value: CallbackTo[Double]): Self = StObject.set(x, "read", value.toJsFn)
      
      inline def setReserve(value: Double => Double): Self = StObject.set(x, "reserve", js.Any.fromFunction1(value))
      
      inline def setSend(value: Buffer => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: Buffer) => value(t0).runNow()))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Any => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  trait EncoderOptions extends StObject {
    
    var codec: js.UndefOr[Codec_] = js.undefined
  }
  object EncoderOptions {
    
    inline def apply(): EncoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncoderOptions]
    }
    
    extension [Self <: EncoderOptions](x: Self) {
      
      inline def setCodec(value: Codec_): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    }
  }
}
