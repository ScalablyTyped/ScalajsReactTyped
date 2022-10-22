package typingsJapgolly.av

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import typingsJapgolly.av.avStrings.buffer
import typingsJapgolly.av.avStrings.cookie
import typingsJapgolly.av.avStrings.data
import typingsJapgolly.av.avStrings.decodeStart
import typingsJapgolly.av.avStrings.duration
import typingsJapgolly.av.avStrings.end
import typingsJapgolly.av.avStrings.error
import typingsJapgolly.av.avStrings.format
import typingsJapgolly.av.avStrings.metadata
import typingsJapgolly.av.avStrings.progress
import typingsJapgolly.av.avStrings.ready
import typingsJapgolly.av.avStrings.refill
import typingsJapgolly.av.avStrings.timeUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AV {
  
  @js.native
  trait Asset extends StObject {
    
    var active: Boolean = js.native
    
    var buffered: Double = js.native
    
    def decodeToBuffer(callback: js.Function1[/* buffer */ js.typedarray.Float32Array, Unit]): Unit = js.native
    
    var decoder: Decoder | Null = js.native
    
    var demuxer: Demuxer | Null = js.native
    
    var duration: Double | Null = js.native
    
    @JSName("emit")
    def emit_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("emit")
    def emit_data(event: data, fn: js.Function1[/* data */ js.typedarray.Float32Array, Unit]): Unit = js.native
    @JSName("emit")
    def emit_decodeStart(event: decodeStart, fn: js.Function0[Unit]): Unit = js.native
    @JSName("emit")
    def emit_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("emit")
    def emit_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("emit")
    def emit_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("emit")
    def emit_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    var format: Format | Null = js.native
    
    @JSName("get")
    def get_duration(event: duration, callback: js.Function1[/* duration */ Double, Unit]): Unit = js.native
    @JSName("get")
    def get_format(event: format, callback: js.Function1[/* format */ Format, Unit]): Unit = js.native
    @JSName("get")
    def get_metadata(event: metadata, callback: js.Function1[/* metadata */ Metadata, Unit]): Unit = js.native
    
    var metadata: Metadata | Null = js.native
    
    @JSName("off")
    def off_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("off")
    def off_data(event: data, fn: js.Function1[/* data */ js.typedarray.Float32Array, Unit]): Unit = js.native
    @JSName("off")
    def off_decodeStart(event: decodeStart, fn: js.Function0[Unit]): Unit = js.native
    @JSName("off")
    def off_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("off")
    def off_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("off")
    def off_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("off")
    def off_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    @JSName("on")
    def on_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_data(event: data, fn: js.Function1[/* data */ js.typedarray.Float32Array, Unit]): Unit = js.native
    @JSName("on")
    def on_decodeStart(event: decodeStart, fn: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("on")
    def on_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("on")
    def on_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    @JSName("once")
    def once_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("once")
    def once_data(event: data, fn: js.Function1[/* data */ js.typedarray.Float32Array, Unit]): Unit = js.native
    @JSName("once")
    def once_decodeStart(event: decodeStart, fn: js.Function0[Unit]): Unit = js.native
    @JSName("once")
    def once_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("once")
    def once_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("once")
    def once_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("once")
    def once_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    var source: Source = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait AudioDevice extends StObject {
    
    var currentTime: Double = js.native
    
    @JSName("emit")
    def emit_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("emit")
    def emit_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    @JSName("off")
    def off_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("off")
    def off_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    @JSName("on")
    def on_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("on")
    def on_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    @JSName("once")
    def once_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("once")
    def once_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    var playing: Boolean = js.native
    
    def seek(time: Double): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  type BalanceFilter = Filter
  
  @js.native
  trait Bitstream extends StObject {
    
    def advance(bits: Double): Unit = js.native
    
    def align(): Unit = js.native
    
    def available(bits: Double): Boolean = js.native
    
    var bitposition: Double = js.native
    
    def copy(): Bitstream = js.native
    
    def offset(): Double = js.native
    
    def peek(bits: Double): Double = js.native
    def peek(bits: Double, signed: Boolean): Double = js.native
    
    def peekLSB(bits: Double): Double = js.native
    def peekLSB(bits: Double, signed: Boolean): Double = js.native
    
    def read(bits: Double): Double = js.native
    def read(bits: Double, signed: Boolean): Double = js.native
    
    def readLSB(bits: Double): Double = js.native
    def readLSB(bits: Double, signed: Boolean): Double = js.native
  }
  
  trait Buffer
    extends StObject
       with _BufferFormats {
    
    def copy(): Buffer
    
    var length: Double
    
    def slice(offset: Double, length: Double): Buffer
    
    def toBlob(): Blob
    
    def toBlobURL(): String
  }
  object Buffer {
    
    inline def apply(
      copy: CallbackTo[Buffer],
      length: Double,
      slice: (Double, Double) => Buffer,
      toBlob: CallbackTo[Blob],
      toBlobURL: CallbackTo[String]
    ): Buffer = {
      val __obj = js.Dynamic.literal(copy = copy.toJsFn, length = length.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice), toBlob = toBlob.toJsFn, toBlobURL = toBlobURL.toJsFn)
      __obj.asInstanceOf[Buffer]
    }
    
    extension [Self <: Buffer](x: Self) {
      
      inline def setCopy(value: CallbackTo[Buffer]): Self = StObject.set(x, "copy", value.toJsFn)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setSlice(value: (Double, Double) => Buffer): Self = StObject.set(x, "slice", js.Any.fromFunction2(value))
      
      inline def setToBlob(value: CallbackTo[Blob]): Self = StObject.set(x, "toBlob", value.toJsFn)
      
      inline def setToBlobURL(value: CallbackTo[String]): Self = StObject.set(x, "toBlobURL", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.av.AV.Buffer
    - typingsJapgolly.av.AV.TypedArray
    - js.typedarray.ArrayBuffer
    - typingsJapgolly.av.AV.BufferList
  */
  type BufferFormats = _BufferFormats | TypedArray | js.typedarray.ArrayBuffer
  
  trait BufferList
    extends StObject
       with _BufferFormats {
    
    def advance(): Boolean
    
    def append(buffer: Buffer): Unit
    
    var availableBuffers: Double
    
    var availableBytes: Double
    
    def copy(): BufferList
    
    var first: Buffer | Null
    
    var last: Buffer | Null
    
    var numBuffers: Double
    
    def reset(): Unit
    
    def rewind(): Boolean
  }
  object BufferList {
    
    inline def apply(
      advance: CallbackTo[Boolean],
      append: Buffer => Callback,
      availableBuffers: Double,
      availableBytes: Double,
      copy: CallbackTo[BufferList],
      numBuffers: Double,
      reset: Callback,
      rewind: CallbackTo[Boolean]
    ): BufferList = {
      val __obj = js.Dynamic.literal(advance = advance.toJsFn, append = js.Any.fromFunction1((t0: Buffer) => append(t0).runNow()), availableBuffers = availableBuffers.asInstanceOf[js.Any], availableBytes = availableBytes.asInstanceOf[js.Any], copy = copy.toJsFn, numBuffers = numBuffers.asInstanceOf[js.Any], reset = reset.toJsFn, rewind = rewind.toJsFn, first = null, last = null)
      __obj.asInstanceOf[BufferList]
    }
    
    extension [Self <: BufferList](x: Self) {
      
      inline def setAdvance(value: CallbackTo[Boolean]): Self = StObject.set(x, "advance", value.toJsFn)
      
      inline def setAppend(value: Buffer => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: Buffer) => value(t0).runNow()))
      
      inline def setAvailableBuffers(value: Double): Self = StObject.set(x, "availableBuffers", value.asInstanceOf[js.Any])
      
      inline def setAvailableBytes(value: Double): Self = StObject.set(x, "availableBytes", value.asInstanceOf[js.Any])
      
      inline def setCopy(value: CallbackTo[BufferList]): Self = StObject.set(x, "copy", value.toJsFn)
      
      inline def setFirst(value: Buffer): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstNull: Self = StObject.set(x, "first", null)
      
      inline def setLast(value: Buffer): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastNull: Self = StObject.set(x, "last", null)
      
      inline def setNumBuffers(value: Double): Self = StObject.set(x, "numBuffers", value.asInstanceOf[js.Any])
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setRewind(value: CallbackTo[Boolean]): Self = StObject.set(x, "rewind", value.toJsFn)
    }
  }
  
  @js.native
  trait Decoder extends StObject {
    
    var bitstream: Bitstream = js.native
    
    def decode(): Boolean = js.native
    
    @JSName("emit")
    def emit_data(event: data, fn: js.Function2[/* data */ TypedArray, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("emit")
    def emit_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("emit")
    def emit_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def init(): Unit = js.native
    
    @JSName("off")
    def off_data(event: data, fn: js.Function2[/* data */ TypedArray, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("off")
    def off_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("off")
    def off_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    @JSName("on")
    def on_data(event: data, fn: js.Function2[/* data */ TypedArray, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("on")
    def on_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    @JSName("once")
    def once_data(event: data, fn: js.Function2[/* data */ TypedArray, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("once")
    def once_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("once")
    def once_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def readChunk(): TypedArray = js.native
    
    var receivedFinalBuffer: Boolean = js.native
    
    def seek(timestamp: Double): Double = js.native
    
    def setCookie(cookie: Buffer): Unit = js.native
    
    var stream: Stream = js.native
  }
  
  @js.native
  trait Demuxer extends StObject {
    
    @JSName("emit")
    def emit_cookie(event: cookie, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("emit")
    def emit_data(event: data, fn: js.Function2[/* buffer */ Buffer, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("emit")
    def emit_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("emit")
    def emit_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("emit")
    def emit_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("emit")
    def emit_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    def init(): Unit = js.native
    
    @JSName("off")
    def off_cookie(event: cookie, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("off")
    def off_data(event: data, fn: js.Function2[/* buffer */ Buffer, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("off")
    def off_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("off")
    def off_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("off")
    def off_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("off")
    def off_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    @JSName("on")
    def on_cookie(event: cookie, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("on")
    def on_data(event: data, fn: js.Function2[/* buffer */ Buffer, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("on")
    def on_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("on")
    def on_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("on")
    def on_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    @JSName("once")
    def once_cookie(event: cookie, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("once")
    def once_data(event: data, fn: js.Function2[/* buffer */ Buffer, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("once")
    def once_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("once")
    def once_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("once")
    def once_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("once")
    def once_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    def readChunk(): Unit = js.native
    
    var stream: Stream = js.native
  }
  
  @js.native
  trait DemuxerConstructor
    extends StObject
       with Instantiable0[Demuxer] {
    
    def probe(stream: Stream): Boolean = js.native
  }
  
  @js.native
  trait Device extends StObject {
    
    def destroy(): Unit = js.native
    
    @JSName("emit")
    def emit_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("emit")
    def emit_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    def getDeviceTime(): Double = js.native
    
    @JSName("off")
    def off_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("off")
    def off_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    @JSName("on")
    def on_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("on")
    def on_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    @JSName("once")
    def once_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("once")
    def once_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    var supported: Boolean = js.native
  }
  
  @js.native
  trait DeviceConstructor
    extends StObject
       with Instantiable2[/* sampleRate */ Double, /* channels */ Double, Device]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.av.avStrings.ascii
    - typingsJapgolly.av.avStrings.utf8
    - typingsJapgolly.av.avStrings.`utf16-be`
    - typingsJapgolly.av.avStrings.`utf16-le`
    - typingsJapgolly.av.avStrings.`utf16-bom`
  */
  trait Encoding extends StObject
  object Encoding {
    
    inline def ascii: typingsJapgolly.av.avStrings.ascii = "ascii".asInstanceOf[typingsJapgolly.av.avStrings.ascii]
    
    inline def `utf16-be`: typingsJapgolly.av.avStrings.`utf16-be` = "utf16-be".asInstanceOf[typingsJapgolly.av.avStrings.`utf16-be`]
    
    inline def `utf16-bom`: typingsJapgolly.av.avStrings.`utf16-bom` = "utf16-bom".asInstanceOf[typingsJapgolly.av.avStrings.`utf16-bom`]
    
    inline def `utf16-le`: typingsJapgolly.av.avStrings.`utf16-le` = "utf16-le".asInstanceOf[typingsJapgolly.av.avStrings.`utf16-le`]
    
    inline def utf8: typingsJapgolly.av.avStrings.utf8 = "utf8".asInstanceOf[typingsJapgolly.av.avStrings.utf8]
  }
  
  trait EventEmitter extends StObject {
    
    def emit(event: String, args: Any*): Unit
    
    def off(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit
    
    def on(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit
    
    def once(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit
  }
  object EventEmitter {
    
    inline def apply(
      emit: (String, /* repeated */ Any) => Callback,
      off: (String, js.Function1[/* repeated */ Any, Unit]) => Callback,
      on: (String, js.Function1[/* repeated */ Any, Unit]) => Callback,
      once: (String, js.Function1[/* repeated */ Any, Unit]) => Callback
    ): EventEmitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (emit(t0, t1)).runNow()), off = js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (on(t0, t1)).runNow()), once = js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (once(t0, t1)).runNow()))
      __obj.asInstanceOf[EventEmitter]
    }
    
    extension [Self <: EventEmitter](x: Self) {
      
      inline def setEmit(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOff(value: (String, js.Function1[/* repeated */ Any, Unit]) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setOn(value: (String, js.Function1[/* repeated */ Any, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setOnce(value: (String, js.Function1[/* repeated */ Any, Unit]) => Callback): Self = StObject.set(x, "once", js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Filter extends StObject {
    
    def process(buffer: TypedArray): Unit
  }
  object Filter {
    
    inline def apply(process: TypedArray => Callback): Filter = {
      val __obj = js.Dynamic.literal(process = js.Any.fromFunction1((t0: TypedArray) => process(t0).runNow()))
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setProcess(value: TypedArray => Callback): Self = StObject.set(x, "process", js.Any.fromFunction1((t0: TypedArray) => value(t0).runNow()))
    }
  }
  
  trait Format extends StObject {
    
    var bitsPerChannel: Double
    
    var channelsPerFrame: Double
    
    var formatID: String
    
    var sampleRate: Double
  }
  object Format {
    
    inline def apply(bitsPerChannel: Double, channelsPerFrame: Double, formatID: String, sampleRate: Double): Format = {
      val __obj = js.Dynamic.literal(bitsPerChannel = bitsPerChannel.asInstanceOf[js.Any], channelsPerFrame = channelsPerFrame.asInstanceOf[js.Any], formatID = formatID.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setBitsPerChannel(value: Double): Self = StObject.set(x, "bitsPerChannel", value.asInstanceOf[js.Any])
      
      inline def setChannelsPerFrame(value: Double): Self = StObject.set(x, "channelsPerFrame", value.asInstanceOf[js.Any])
      
      inline def setFormatID(value: String): Self = StObject.set(x, "formatID", value.asInstanceOf[js.Any])
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpSourceOpts extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
  }
  object HttpSourceOpts {
    
    inline def apply(): HttpSourceOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpSourceOpts]
    }
    
    extension [Self <: HttpSourceOpts](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
  
  type Metadata = StringDictionary[Any]
  
  @js.native
  trait Player extends StObject {
    
    var asset: Asset = js.native
    
    var buffered: Double = js.native
    
    var currentTime: Double = js.native
    
    var duration: Double = js.native
    
    def emit(event: ready | end, fn: js.Function0[Unit]): Unit = js.native
    def emit(event: duration | progress, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("emit")
    def emit_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("emit")
    def emit_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("emit")
    def emit_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("emit")
    def emit_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    var filters: js.Array[Filter] = js.native
    
    var format: js.UndefOr[Format] = js.native
    
    var metadata: Metadata = js.native
    
    def off(event: ready | end, fn: js.Function0[Unit]): Unit = js.native
    def off(event: duration | progress, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("off")
    def off_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("off")
    def off_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("off")
    def off_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("off")
    def off_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    def on(event: ready | end, fn: js.Function0[Unit]): Unit = js.native
    def on(event: duration | progress, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("on")
    def on_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("on")
    def on_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    def once(event: ready | end, fn: js.Function0[Unit]): Unit = js.native
    def once(event: duration | progress, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("once")
    def once_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("once")
    def once_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("once")
    def once_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("once")
    def once_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    var pan: Double = js.native
    
    def pause(): Unit = js.native
    
    def play(): Unit = js.native
    
    var playing: Boolean = js.native
    
    def preload(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def togglePlayback(): Unit = js.native
    
    var volume: Double = js.native
  }
  
  @js.native
  trait Source extends StObject {
    
    @JSName("emit")
    def emit_data(event: data, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("emit")
    def emit_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("emit")
    def emit_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("emit")
    def emit_progress(event: progress, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    
    @JSName("off")
    def off_data(event: data, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("off")
    def off_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("off")
    def off_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("off")
    def off_progress(event: progress, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    
    @JSName("on")
    def on_data(event: data, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("on")
    def on_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("on")
    def on_progress(event: progress, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    
    @JSName("once")
    def once_data(event: data, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("once")
    def once_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("once")
    def once_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("once")
    def once_progress(event: progress, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    
    def pause(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def start(): Unit = js.native
  }
  
  @js.native
  trait Stream extends StObject {
    
    def advance(bytes: Double): Unit = js.native
    
    def available(bytes: Double): Boolean = js.native
    
    def copy(): Stream = js.native
    
    var offset: Double = js.native
    
    def peekBuffer(offset: Double, length: Double): Buffer = js.native
    
    def peekFloat32(): Double = js.native
    def peekFloat32(offset: Double): Double = js.native
    
    def peekFloat64(): Double = js.native
    def peekFloat64(offset: Double): Double = js.native
    
    def peekFloat80(): Double = js.native
    def peekFloat80(offset: Double): Double = js.native
    
    def peekInt16(): Double = js.native
    def peekInt16(offset: Double): Double = js.native
    
    def peekInt24(): Double = js.native
    def peekInt24(offset: Double): Double = js.native
    
    def peekInt32(): Double = js.native
    def peekInt32(offset: Double): Double = js.native
    
    def peekInt8(): Double = js.native
    def peekInt8(offset: Double): Double = js.native
    
    def peekString(offset: Double, length: Double): String = js.native
    def peekString(offset: Double, length: Double, encoding: Encoding): String = js.native
    
    def peekUInt16(): Double = js.native
    def peekUInt16(offset: Double): Double = js.native
    
    def peekUInt24(): Double = js.native
    def peekUInt24(offset: Double): Double = js.native
    
    def peekUInt32(): Double = js.native
    def peekUInt32(offset: Double): Double = js.native
    
    def peekUInt8(): Double = js.native
    def peekUInt8(offset: Double): Double = js.native
    
    def readBuffer(length: Double): Buffer = js.native
    
    def readFloat32(): Double = js.native
    
    def readFloat64(): Double = js.native
    
    def readFloat80(): Double = js.native
    
    def readInt16(): Double = js.native
    
    def readInt24(): Double = js.native
    
    def readInt32(): Double = js.native
    
    def readInt8(): Double = js.native
    
    def readString(length: Double): String = js.native
    def readString(length: Double, encoding: Encoding): String = js.native
    
    def readUInt16(): Double = js.native
    
    def readUInt24(): Double = js.native
    
    def readUInt32(): Double = js.native
    
    def readUInt8(): Double = js.native
    
    def remainingBytes(): Double = js.native
    
    def rewind(bytes: Double): Unit = js.native
    
    def seek(position: Double): Unit = js.native
  }
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  type UnderflowError = js.Error
  
  type VolumeFilter = Filter
  
  trait _BufferFormats extends StObject
  object _BufferFormats {
    
    inline def Buffer(
      copy: CallbackTo[typingsJapgolly.av.AV.Buffer],
      length: Double,
      slice: (Double, Double) => typingsJapgolly.av.AV.Buffer,
      toBlob: CallbackTo[Blob],
      toBlobURL: CallbackTo[String]
    ): typingsJapgolly.av.AV.Buffer = {
      val __obj = js.Dynamic.literal(copy = copy.toJsFn, length = length.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice), toBlob = toBlob.toJsFn, toBlobURL = toBlobURL.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.av.AV.Buffer]
    }
    
    inline def BufferList(
      advance: CallbackTo[Boolean],
      append: Buffer => Callback,
      availableBuffers: Double,
      availableBytes: Double,
      copy: CallbackTo[typingsJapgolly.av.AV.BufferList],
      numBuffers: Double,
      reset: Callback,
      rewind: CallbackTo[Boolean]
    ): typingsJapgolly.av.AV.BufferList = {
      val __obj = js.Dynamic.literal(advance = advance.toJsFn, append = js.Any.fromFunction1((t0: Buffer) => append(t0).runNow()), availableBuffers = availableBuffers.asInstanceOf[js.Any], availableBytes = availableBytes.asInstanceOf[js.Any], copy = copy.toJsFn, numBuffers = numBuffers.asInstanceOf[js.Any], reset = reset.toJsFn, rewind = rewind.toJsFn, first = null, last = null)
      __obj.asInstanceOf[typingsJapgolly.av.AV.BufferList]
    }
  }
}
