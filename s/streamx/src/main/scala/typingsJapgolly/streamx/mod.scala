package typingsJapgolly.streamx

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Parameters
import typingsJapgolly.streamx.anon.Map
import typingsJapgolly.streamx.anon.MapMapFunction
import typingsJapgolly.streamx.anon.MapWritable
import typingsJapgolly.streamx.anon.`0`
import typingsJapgolly.streamx.streamxBooleans.`false`
import typingsJapgolly.streamx.streamxBooleans.`true`
import typingsJapgolly.streamx.streamxStrings.abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("streamx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
  - typingsJapgolly.node.eventsMod.EventEmitter because Already inherited
  - typingsJapgolly.streamx.mod.Stream because Already inherited
  - typingsJapgolly.streamx.mod.Writable because Inheritance from two classes. Inlined _writev, _write, _final, write, end, end, end */ @JSImport("streamx", "Duplex")
  @js.native
  open class Duplex[TWriteType, TReadType, TInternal, TByteType, TReadable /* <: Boolean */, TWritable /* <: Boolean */, TEvents /* <: DuplexEvents[TWriteType, TReadType] */] () extends Readable[TInternal, TReadType, TByteType, TReadable, TWritable, TEvents] {
    def this(opts: DuplexOptions[
            Duplex[
              TWriteType, 
              TReadType, 
              TInternal, 
              TByteType, 
              TReadable, 
              TWritable, 
              DuplexEvents[TWriteType, TReadType]
            ], 
            TWriteType, 
            TReadType, 
            TInternal, 
            TByteType, 
            TReadable, 
            TWritable
          ]) = this()
    
    def _final(cb: Callback): Unit = js.native
    
    def _write(data: TInternal, cb: Callback): Unit = js.native
    
    def _writev(batch: js.Array[TInternal], cb: Callback): Unit = js.native
    
    def end(): Unit = js.native
    def end(data: TWriteType): Unit = js.native
    def end(data: Callback): Unit = js.native
    
    def write(data: TWriteType): Boolean = js.native
  }
  
  @JSImport("streamx", "PassThrough")
  @js.native
  open class PassThrough[TRead, TWrite] () extends Transform[TRead, TWrite, TRead, TRead | TWrite, `true`, `true`] {
    def this(opts: TransformOptions[
            Transform[TRead, TWrite, TRead, TRead | TWrite, `true`, `true`], 
            TRead, 
            TWrite, 
            TRead, 
            TRead | TWrite, 
            `true`, 
            `true`
          ]) = this()
  }
  
  @JSImport("streamx", "Readable")
  @js.native
  open class Readable[TType, TMapType, TByteType, TReadable /* <: Boolean */, TWritable /* <: Boolean */, TEvents /* <: ReadableEvents[TMapType] */] () extends Stream[TByteType, TReadable, TWritable, TEvents] {
    def this(opts: ReadableOptions[
            Readable[TType, TMapType, TMapType, `true`, `false`, ReadableEvents[TMapType]], 
            TType, 
            TMapType, 
            TByteType, 
            Any
          ]) = this()
    
    def _read(cb: ResultCallback[TType]): Unit = js.native
    
    def pause(): this.type = js.native
    
    def pipe[TTarget /* <: AnyWritable[TMapType, Any, Any] */](dest: TTarget): TTarget = js.native
    def pipe[TTarget /* <: AnyWritable[TMapType, Any, Any] */](dest: TTarget, cb: Callback): TTarget = js.native
    
    def push(): Boolean = js.native
    def push(data: TType): Boolean = js.native
    
    def read(): TMapType = js.native
    
    def resume(): this.type = js.native
    
    def unshift(): Unit = js.native
    def unshift(data: TType): Unit = js.native
  }
  /* static members */
  object Readable {
    
    @JSImport("streamx", "Readable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from[TInput](): FromType[TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[FromType[TInput]]
    inline def from[TInput](input: TInput): FromType[TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[FromType[TInput]]
    
    inline def isBackpressured(rs: Readable[Any, Any, Any, `true`, `false`, ReadableEvents[Any]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBackpressured")(rs.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isPaused(rs: Readable[Any, Any, Any, `true`, `false`, ReadableEvents[Any]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPaused")(rs.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("streamx", "Stream")
  @js.native
  open class Stream[TByteType, TReadable /* <: Boolean */, TWritable /* <: Boolean */, TEvents /* <: StreamEvents */] () extends EventEmitter {
    def this(opts: StreamOptions[Stream[TByteType, `false`, `false`, StreamEvents], TByteType]) = this()
    
    def _destroy(cb: Callback): Unit = js.native
    
    def _open(cb: Callback): Unit = js.native
    
    def _predestroy(cb: Callback): Unit = js.native
    
    def addListener[TEvent /* <: EventName[TEvents] */](event: TEvent, listener: EventListener[TEvents, TEvent]): this.type = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: js.Error): Unit = js.native
    
    val destroyed: Boolean = js.native
    
    val destroying: Boolean = js.native
    
    def emit[TEvent /* <: EventName[TEvents] */](
      event: TEvent,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type Parameters<EventListener<TEvents, TEvent>> is not an array type */ rest: Parameters[EventListener[TEvents, TEvent]]
    ): Boolean = js.native
    
    def listenerCount(event: EventName[TEvents]): Double = js.native
    
    def listeners[TEvent /* <: EventName[TEvents] */](event: TEvent): js.Array[EventListener[TEvents, TEvent]] = js.native
    
    def off[TEvent /* <: EventName[TEvents] */](event: TEvent, listener: EventListener[TEvents, TEvent]): this.type = js.native
    
    def on[TEvent /* <: EventName[TEvents] */](event: TEvent, listener: EventListener[TEvents, TEvent]): this.type = js.native
    
    def once[TEvent /* <: EventName[TEvents] */](event: TEvent, listener: EventListener[TEvents, TEvent]): this.type = js.native
    
    // Added in Node 6...
    def prependListener[TEvent /* <: EventName[TEvents] */](event: TEvent, listener: EventListener[TEvents, TEvent]): this.type = js.native
    
    def prependOnceListener[TEvent /* <: EventName[TEvents] */](event: TEvent, listener: EventListener[TEvents, TEvent]): this.type = js.native
    
    def rawListeners[TEvent /* <: EventName[TEvents] */](event: TEvent): js.Array[EventListener[TEvents, TEvent]] = js.native
    
    val readable: TReadable = js.native
    
    def removeAllListeners(event: EventName[TEvents]): this.type = js.native
    
    def removeListener[TEvent /* <: EventName[TEvents] */](event: TEvent, listener: EventListener[TEvents, TEvent]): this.type = js.native
    
    val writable: TWritable = js.native
  }
  
  @JSImport("streamx", "Transform")
  @js.native
  open class Transform[TWriteType, TReadType, TInternal, TByteType, TReadable /* <: Boolean */, TWritable /* <: Boolean */] () extends Duplex[
          TWriteType, 
          TReadType, 
          TInternal, 
          TByteType, 
          TReadable, 
          TWritable, 
          DuplexEvents[TWriteType, TReadType]
        ] {
    def this(opts: TransformOptions[
            Transform[TWriteType, TReadType, TInternal, TByteType, TReadable, TWritable], 
            TWriteType, 
            TReadType, 
            TInternal, 
            TByteType, 
            TReadable, 
            TWritable
          ]) = this()
    
    def _flush(cb: Callback): Unit = js.native
    
    def _transform(data: TWriteType, cb: ResultCallback[TReadType]): Unit = js.native
  }
  
  @JSImport("streamx", "Writable")
  @js.native
  open class Writable[TType, TMapType, TByteType, TReadable /* <: Boolean */, TWritable /* <: Boolean */, TEvents /* <: WritableEvents[TType] */] () extends Stream[TByteType, TReadable, TWritable, TEvents] {
    def this(opts: WritableOptions[
            Writable[TType, TMapType, TByteType, `false`, `true`, WritableEvents[TType]], 
            TType, 
            TMapType, 
            TByteType, 
            Any
          ]) = this()
    
    def _final(cb: Callback): Unit = js.native
    
    def _write(data: TMapType, cb: Callback): Unit = js.native
    
    def _writev(batch: js.Array[TMapType], cb: Callback): Unit = js.native
    
    def end(): Unit = js.native
    def end(data: TType): Unit = js.native
    def end(data: Callback): Unit = js.native
    
    def write(data: TType): Boolean = js.native
  }
  /* static members */
  object Writable {
    
    @JSImport("streamx", "Writable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isBackpressured(ws: Writable[Any, Any, Any, `false`, `true`, WritableEvents[Any]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBackpressured")(ws.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def isStream(input: js.Object): /* is streamx.streamx.AnyStream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStream")(input.asInstanceOf[js.Any]).asInstanceOf[/* is streamx.streamx.AnyStream */ Boolean]
  
  inline def isStreamx(input: js.Object): /* is streamx.streamx.Stream<any, false, false, streamx.streamx.StreamEvents> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStreamx")(input.asInstanceOf[js.Any]).asInstanceOf[/* is streamx.streamx.Stream<any, false, false, streamx.streamx.StreamEvents> */ Boolean]
  
  trait AbortSignalLike extends StObject {
    
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any]): Unit
  }
  object AbortSignalLike {
    
    inline def apply(
      addEventListener: (abort, js.ThisFunction1[AbortSignalLike, /* event */ Any, Any]) => japgolly.scalajs.react.Callback
    ): AbortSignalLike = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: abort, t1: js.ThisFunction1[AbortSignalLike, /* event */ Any, Any]) => (addEventListener(t0, t1)).runNow()))
      __obj.asInstanceOf[AbortSignalLike]
    }
    
    extension [Self <: AbortSignalLike](x: Self) {
      
      inline def setAddEventListener(
        value: (abort, js.ThisFunction1[AbortSignalLike, /* event */ Any, Any]) => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: abort, t1: js.ThisFunction1[AbortSignalLike, /* event */ Any, Any]) => (value(t0, t1)).runNow()))
    }
  }
  
  type AnyReadable[TType, TMap, TByte] = typingsJapgolly.node.streamMod.Readable | (Readable[TType, TMap, TByte, `true`, `false`, ReadableEvents[TMap]])
  
  type AnyStream = typingsJapgolly.node.streamMod.Stream | (Stream[Any, `false`, `false`, StreamEvents])
  
  type AnyWritable[TType, TMap, TByte] = typingsJapgolly.node.streamMod.Writable | (Writable[TType, TMap, TByte, `false`, `true`, WritableEvents[TType]]) | (Duplex[TType, TByte, TMap, TByte, `true`, `true`, DuplexEvents[TType, TByte]])
  
  trait BaseReadableOptions[TStream /* <: Readable[TType, TMapType, TByteType, Any, Any, ReadableEvents[TMapType]] */, TType, TMapType, TByteType]
    extends StObject
       with StreamOptions[TStream, TByteType] {
    
    var byteLengthReadable: js.UndefOr[ByteLengthFunction[TStream, TByteType]] = js.undefined
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ TStream, /* cb */ ResultCallback[TType], Unit]] = js.undefined
  }
  object BaseReadableOptions {
    
    inline def apply[TStream /* <: Readable[TType, TMapType, TByteType, Any, Any, ReadableEvents[TMapType]] */, TType, TMapType, TByteType](): BaseReadableOptions[TStream, TType, TMapType, TByteType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseReadableOptions[TStream, TType, TMapType, TByteType]]
    }
    
    extension [Self <: BaseReadableOptions[?, ?, ?, ?], TStream /* <: Readable[TType, TMapType, TByteType, Any, Any, ReadableEvents[TMapType]] */, TType, TMapType, TByteType](x: Self & (BaseReadableOptions[TStream, TType, TMapType, TByteType])) {
      
      inline def setByteLengthReadable(value: ByteLengthFunction[TStream, TByteType]): Self = StObject.set(x, "byteLengthReadable", value.asInstanceOf[js.Any])
      
      inline def setByteLengthReadableNull: Self = StObject.set(x, "byteLengthReadable", null)
      
      inline def setByteLengthReadableUndefined: Self = StObject.set(x, "byteLengthReadable", js.undefined)
      
      inline def setRead(value: js.ThisFunction1[/* this */ TStream, /* cb */ ResultCallback[TType], Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    }
  }
  
  trait BaseWritableOptions[TStream /* <: Writable[TType, TMapType, TByteType, Any, Any, WritableEvents[TType]] */, TType, TMapType, TByteType]
    extends StObject
       with StreamOptions[TStream, TByteType] {
    
    var byteLengthWritable: js.UndefOr[ByteLengthFunction[TStream, TByteType]] = js.undefined
    
    var `final`: js.UndefOr[js.ThisFunction1[/* this */ TStream, /* cb */ Callback, Unit]] = js.undefined
    
    var write: js.UndefOr[
        js.ThisFunction2[/* this */ TStream, /* data */ TMapType, /* cb */ Callback, Unit]
      ] = js.undefined
    
    var writev: js.UndefOr[
        js.ThisFunction2[/* this */ TStream, /* batch */ js.Array[TMapType], /* cb */ Callback, Unit]
      ] = js.undefined
  }
  object BaseWritableOptions {
    
    inline def apply[TStream /* <: Writable[TType, TMapType, TByteType, Any, Any, WritableEvents[TType]] */, TType, TMapType, TByteType](): BaseWritableOptions[TStream, TType, TMapType, TByteType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseWritableOptions[TStream, TType, TMapType, TByteType]]
    }
    
    extension [Self <: BaseWritableOptions[?, ?, ?, ?], TStream /* <: Writable[TType, TMapType, TByteType, Any, Any, WritableEvents[TType]] */, TType, TMapType, TByteType](x: Self & (BaseWritableOptions[TStream, TType, TMapType, TByteType])) {
      
      inline def setByteLengthWritable(value: ByteLengthFunction[TStream, TByteType]): Self = StObject.set(x, "byteLengthWritable", value.asInstanceOf[js.Any])
      
      inline def setByteLengthWritableNull: Self = StObject.set(x, "byteLengthWritable", null)
      
      inline def setByteLengthWritableUndefined: Self = StObject.set(x, "byteLengthWritable", js.undefined)
      
      inline def setFinal(value: js.ThisFunction1[/* this */ TStream, /* cb */ Callback, Unit]): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      inline def setWrite(value: js.ThisFunction2[/* this */ TStream, /* data */ TMapType, /* cb */ Callback, Unit]): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      inline def setWritev(
        value: js.ThisFunction2[/* this */ TStream, /* batch */ js.Array[TMapType], /* cb */ Callback, Unit]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      inline def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  type ByteLengthFunction[TThis, TData] = js.UndefOr[(js.ThisFunction1[/* this */ TThis, /* data */ TData, Double]) | Null]
  
  type Callback = js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  
  trait DuplexEvents[TWriteType, TReadType]
    extends StObject
       with ReadableEvents[TReadType]
       with WritableEvents[TWriteType]
  object DuplexEvents {
    
    inline def apply[TWriteType, TReadType](
      close: japgolly.scalajs.react.Callback,
      data: TReadType => japgolly.scalajs.react.Callback,
      drain: japgolly.scalajs.react.Callback,
      end: japgolly.scalajs.react.Callback,
      error: js.Error => japgolly.scalajs.react.Callback,
      finish: japgolly.scalajs.react.Callback,
      open: japgolly.scalajs.react.Callback,
      pipe: Readable[Any, TWriteType, TWriteType, `true`, `false`, ReadableEvents[TWriteType]] => japgolly.scalajs.react.Callback,
      piping: Writable[TReadType, TReadType, TReadType, `false`, `true`, WritableEvents[TReadType]] => japgolly.scalajs.react.Callback,
      readable: japgolly.scalajs.react.Callback
    ): DuplexEvents[TWriteType, TReadType] = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, data = js.Any.fromFunction1((t0: TReadType) => data(t0).runNow()), drain = drain.toJsFn, end = end.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), finish = finish.toJsFn, open = open.toJsFn, pipe = js.Any.fromFunction1((t0: Readable[Any, TWriteType, TWriteType, `true`, `false`, ReadableEvents[TWriteType]]) => pipe(t0).runNow()), piping = js.Any.fromFunction1((t0: Writable[TReadType, TReadType, TReadType, `false`, `true`, WritableEvents[TReadType]]) => piping(t0).runNow()), readable = readable.toJsFn)
      __obj.asInstanceOf[DuplexEvents[TWriteType, TReadType]]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.streamx.mod.StreamOptions because Already inherited
  - typingsJapgolly.streamx.mod.BaseWritableOptions because var conflicts: byteLength, destroy, highWaterMark, open, predestroy, signal. Inlined writev, write, `final`, byteLengthWritable */ trait DuplexOptions[TStream /* <: Duplex[
    TWriteType, 
    TReadType, 
    TInternal, 
    TByteType, 
    TReadable, 
    TWritable, 
    DuplexEvents[TWriteType, TReadType]
  ] */, TWriteType, TReadType, TInternal, TByteType, TReadable /* <: Boolean */, TWritable /* <: Boolean */]
    extends StObject
       with BaseReadableOptions[TStream, TInternal, TReadType, TByteType] {
    
    var byteLengthWritable: js.UndefOr[ByteLengthFunction[TStream, TInternal]] = js.undefined
    
    var `final`: js.UndefOr[js.ThisFunction1[TStream, /* cb */ Callback, Unit]] = js.undefined
    
    var map: js.UndefOr[MapFunction[TStream, TByteType, TByteType]] = js.undefined
    
    var mapReadable: js.UndefOr[MapFunction[TStream, TInternal, TReadType]] = js.undefined
    
    var mapWritable: js.UndefOr[MapFunction[TStream, TWriteType, TInternal]] = js.undefined
    
    var write: js.UndefOr[js.ThisFunction2[TStream, TInternal, /* cb */ Callback, Unit]] = js.undefined
    
    var writev: js.UndefOr[
        js.ThisFunction2[TStream, /* batch */ js.Array[TInternal], /* cb */ Callback, Unit]
      ] = js.undefined
  }
  object DuplexOptions {
    
    inline def apply[TStream /* <: Duplex[
        TWriteType, 
        TReadType, 
        TInternal, 
        TByteType, 
        TReadable, 
        TWritable, 
        DuplexEvents[TWriteType, TReadType]
      ] */, TWriteType, TReadType, TInternal, TByteType, TReadable /* <: Boolean */, TWritable /* <: Boolean */](): DuplexOptions[TStream, TWriteType, TReadType, TInternal, TByteType, TReadable, TWritable] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplexOptions[TStream, TWriteType, TReadType, TInternal, TByteType, TReadable, TWritable]]
    }
    
    extension [Self <: DuplexOptions[?, ?, ?, ?, ?, ?, ?], TStream /* <: Duplex[
        TWriteType, 
        TReadType, 
        TInternal, 
        TByteType, 
        TReadable, 
        TWritable, 
        DuplexEvents[TWriteType, TReadType]
      ] */, TWriteType, TReadType, TInternal, TByteType, TReadable /* <: Boolean */, TWritable /* <: Boolean */](x: Self & (DuplexOptions[TStream, TWriteType, TReadType, TInternal, TByteType, TReadable, TWritable])) {
      
      inline def setByteLengthWritable(value: ByteLengthFunction[TStream, TInternal]): Self = StObject.set(x, "byteLengthWritable", value.asInstanceOf[js.Any])
      
      inline def setByteLengthWritableNull: Self = StObject.set(x, "byteLengthWritable", null)
      
      inline def setByteLengthWritableUndefined: Self = StObject.set(x, "byteLengthWritable", js.undefined)
      
      inline def setFinal(value: js.ThisFunction1[TStream, /* cb */ Callback, Unit]): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      inline def setMap(value: MapFunction[TStream, TByteType, TByteType]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapReadable(value: MapFunction[TStream, TInternal, TReadType]): Self = StObject.set(x, "mapReadable", value.asInstanceOf[js.Any])
      
      inline def setMapReadableNull: Self = StObject.set(x, "mapReadable", null)
      
      inline def setMapReadableUndefined: Self = StObject.set(x, "mapReadable", js.undefined)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMapWritable(value: MapFunction[TStream, TWriteType, TInternal]): Self = StObject.set(x, "mapWritable", value.asInstanceOf[js.Any])
      
      inline def setMapWritableNull: Self = StObject.set(x, "mapWritable", null)
      
      inline def setMapWritableUndefined: Self = StObject.set(x, "mapWritable", js.undefined)
      
      inline def setWrite(value: js.ThisFunction2[TStream, TInternal, /* cb */ Callback, Unit]): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      inline def setWritev(value: js.ThisFunction2[TStream, /* batch */ js.Array[TInternal], /* cb */ Callback, Unit]): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      inline def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TEvents extends undefined ? (args : ...any): void : TEvent extends keyof TEvents ? TEvents[TEvent] : (args : ...any): void
    }}}
    */
  @js.native
  trait EventListener[TEvents /* <: Events */, TEvent /* <: String | js.Symbol | Double */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TEvents extends undefined ? string | symbol : keyof TEvents
    }}}
    */
  @js.native
  trait EventName[TEvents /* <: Events */] extends StObject
  
  type Events = js.UndefOr[StringDictionary[js.Function1[/* repeated */ Any, Unit]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TData extends streamx.streamx.Readable<any, any, any, true, false, streamx.streamx.ReadableEvents<any>> ? TData : TData extends std.Iterable<infer TType> ? streamx.streamx.Readable<TType, TType, TType, true, false, streamx.streamx.ReadableEvents<TType>> : TData extends std.AsyncIterable<infer TType> ? streamx.streamx.Readable<TType, TType, TType, true, false, streamx.streamx.ReadableEvents<TType>> : streamx.streamx.Readable<TData, TData, TData, true, false, streamx.streamx.ReadableEvents<TData>>
    }}}
    */
  @js.native
  trait FromType[TData] extends StObject
  
  type MapFunction[TThis, TIn, TOut] = js.UndefOr[(js.ThisFunction1[/* this */ TThis, /* input */ TIn, TOut]) | Null]
  
  trait ReadableEvents[TMapType]
    extends StObject
       with StreamEvents {
    
    def data(data: TMapType): Unit
    
    def end(): Unit
    
    def piping(writable: Writable[TMapType, TMapType, TMapType, `false`, `true`, WritableEvents[TMapType]]): Unit
    
    def readable(): Unit
  }
  object ReadableEvents {
    
    inline def apply[TMapType](
      close: japgolly.scalajs.react.Callback,
      data: TMapType => japgolly.scalajs.react.Callback,
      end: japgolly.scalajs.react.Callback,
      error: js.Error => japgolly.scalajs.react.Callback,
      open: japgolly.scalajs.react.Callback,
      piping: Writable[TMapType, TMapType, TMapType, `false`, `true`, WritableEvents[TMapType]] => japgolly.scalajs.react.Callback,
      readable: japgolly.scalajs.react.Callback
    ): ReadableEvents[TMapType] = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, data = js.Any.fromFunction1((t0: TMapType) => data(t0).runNow()), end = end.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), open = open.toJsFn, piping = js.Any.fromFunction1((t0: Writable[TMapType, TMapType, TMapType, `false`, `true`, WritableEvents[TMapType]]) => piping(t0).runNow()), readable = readable.toJsFn)
      __obj.asInstanceOf[ReadableEvents[TMapType]]
    }
    
    extension [Self <: ReadableEvents[?], TMapType](x: Self & ReadableEvents[TMapType]) {
      
      inline def setData(value: TMapType => japgolly.scalajs.react.Callback): Self = StObject.set(x, "data", js.Any.fromFunction1((t0: TMapType) => value(t0).runNow()))
      
      inline def setEnd(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setPiping(
        value: Writable[TMapType, TMapType, TMapType, `false`, `true`, WritableEvents[TMapType]] => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "piping", js.Any.fromFunction1((t0: Writable[TMapType, TMapType, TMapType, `false`, `true`, WritableEvents[TMapType]]) => value(t0).runNow()))
      
      inline def setReadable(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "readable", value.toJsFn)
    }
  }
  
  type ReadableOptions[TStream /* <: Readable[TType, TMapType, TByteType, Any, Any, ReadableEvents[TMapType]] */, TType, TMapType, TByteType, TMapFallback] = (js.Object & (BaseReadableOptions[TStream, TType, TMapType, TByteType])) | ((Map[TMapFallback, TStream, TType, TMapType, TByteType]) & (BaseReadableOptions[TStream, TType, TMapType, TByteType])) | ((MapMapFunction[TStream, TType, TMapType, TByteType]) & (BaseReadableOptions[TStream, TType, TMapType, TByteType]))
  
  type ResultCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[T], Unit]
  
  trait StreamEvents extends StObject {
    
    def close(): Unit
    
    def error(error: js.Error): Unit
    
    def open(): Unit
  }
  object StreamEvents {
    
    inline def apply(
      close: japgolly.scalajs.react.Callback,
      error: js.Error => japgolly.scalajs.react.Callback,
      open: japgolly.scalajs.react.Callback
    ): StreamEvents = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), open = open.toJsFn)
      __obj.asInstanceOf[StreamEvents]
    }
    
    extension [Self <: StreamEvents](x: Self) {
      
      inline def setClose(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setError(value: js.Error => japgolly.scalajs.react.Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setOpen(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "open", value.toJsFn)
    }
  }
  
  trait StreamOptions[TStream /* <: Stream[TByteType, `false`, `false`, StreamEvents] */, TByteType] extends StObject {
    
    var byteLength: js.UndefOr[ByteLengthFunction[TStream, TByteType]] = js.undefined
    
    var destroy: js.UndefOr[js.ThisFunction1[/* this */ TStream, /* cb */ Callback, Unit]] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var open: js.UndefOr[js.ThisFunction1[/* this */ TStream, /* cb */ Callback, Unit]] = js.undefined
    
    var predestroy: js.UndefOr[js.ThisFunction1[/* this */ TStream, /* cb */ Callback, Unit]] = js.undefined
    
    var signal: js.UndefOr[AbortSignalLike] = js.undefined
  }
  object StreamOptions {
    
    inline def apply[TStream /* <: Stream[TByteType, `false`, `false`, StreamEvents] */, TByteType](): StreamOptions[TStream, TByteType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOptions[TStream, TByteType]]
    }
    
    extension [Self <: StreamOptions[?, ?], TStream /* <: Stream[TByteType, `false`, `false`, StreamEvents] */, TByteType](x: Self & (StreamOptions[TStream, TByteType])) {
      
      inline def setByteLength(value: ByteLengthFunction[TStream, TByteType]): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
      
      inline def setByteLengthNull: Self = StObject.set(x, "byteLength", null)
      
      inline def setByteLengthUndefined: Self = StObject.set(x, "byteLength", js.undefined)
      
      inline def setDestroy(value: js.ThisFunction1[/* this */ TStream, /* cb */ Callback, Unit]): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setOpen(value: js.ThisFunction1[/* this */ TStream, /* cb */ Callback, Unit]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPredestroy(value: js.ThisFunction1[/* this */ TStream, /* cb */ Callback, Unit]): Self = StObject.set(x, "predestroy", value.asInstanceOf[js.Any])
      
      inline def setPredestroyUndefined: Self = StObject.set(x, "predestroy", js.undefined)
      
      inline def setSignal(value: AbortSignalLike): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  trait TransformOptions[TStream /* <: Transform[TWriteType, TReadType, TInternal, TByteType, TReadable, TWritable] */, TWriteType, TReadType, TInternal, TByteType, TReadable /* <: Boolean */, TWritable /* <: Boolean */]
    extends StObject
       with DuplexOptions[TStream, TWriteType, TReadType, TInternal, TByteType, TReadable, TWritable] {
    
    var flush: js.UndefOr[js.ThisFunction1[/* this */ TStream, /* cb */ Callback, Unit]] = js.undefined
    
    var transform: js.UndefOr[
        js.ThisFunction2[/* this */ TStream, /* data */ TWriteType, /* cb */ ResultCallback[TReadType], Unit]
      ] = js.undefined
  }
  object TransformOptions {
    
    inline def apply[TStream /* <: Transform[TWriteType, TReadType, TInternal, TByteType, TReadable, TWritable] */, TWriteType, TReadType, TInternal, TByteType, TReadable /* <: Boolean */, TWritable /* <: Boolean */](): TransformOptions[TStream, TWriteType, TReadType, TInternal, TByteType, TReadable, TWritable] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions[TStream, TWriteType, TReadType, TInternal, TByteType, TReadable, TWritable]]
    }
    
    extension [Self <: TransformOptions[?, ?, ?, ?, ?, ?, ?], TStream /* <: Transform[TWriteType, TReadType, TInternal, TByteType, TReadable, TWritable] */, TWriteType, TReadType, TInternal, TByteType, TReadable /* <: Boolean */, TWritable /* <: Boolean */](x: Self & (TransformOptions[TStream, TWriteType, TReadType, TInternal, TByteType, TReadable, TWritable])) {
      
      inline def setFlush(value: js.ThisFunction1[/* this */ TStream, /* cb */ Callback, Unit]): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      inline def setTransform(
        value: js.ThisFunction2[/* this */ TStream, /* data */ TWriteType, /* cb */ ResultCallback[TReadType], Unit]
      ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait WritableEvents[TType]
    extends StObject
       with StreamEvents {
    
    def drain(): Unit
    
    def finish(): Unit
    
    /* tslint:disable-next-line use-default-type-parameter */
    def pipe(readable: Readable[Any, TType, TType, `true`, `false`, ReadableEvents[TType]]): Unit
  }
  object WritableEvents {
    
    inline def apply[TType](
      close: japgolly.scalajs.react.Callback,
      drain: japgolly.scalajs.react.Callback,
      error: js.Error => japgolly.scalajs.react.Callback,
      finish: japgolly.scalajs.react.Callback,
      open: japgolly.scalajs.react.Callback,
      pipe: Readable[Any, TType, TType, `true`, `false`, ReadableEvents[TType]] => japgolly.scalajs.react.Callback
    ): WritableEvents[TType] = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, drain = drain.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), finish = finish.toJsFn, open = open.toJsFn, pipe = js.Any.fromFunction1((t0: Readable[Any, TType, TType, `true`, `false`, ReadableEvents[TType]]) => pipe(t0).runNow()))
      __obj.asInstanceOf[WritableEvents[TType]]
    }
    
    extension [Self <: WritableEvents[?], TType](x: Self & WritableEvents[TType]) {
      
      inline def setDrain(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "drain", value.toJsFn)
      
      inline def setFinish(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "finish", value.toJsFn)
      
      inline def setPipe(
        value: Readable[Any, TType, TType, `true`, `false`, ReadableEvents[TType]] => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "pipe", js.Any.fromFunction1((t0: Readable[Any, TType, TType, `true`, `false`, ReadableEvents[TType]]) => value(t0).runNow()))
    }
  }
  
  type WritableOptions[TStream /* <: Writable[TType, TMapType, TByteType, Any, Any, WritableEvents[TType]] */, TType, TMapType, TByteType, TMapFallback] = (js.Object & (BaseWritableOptions[TStream, TType, TMapType, TByteType])) | ((MapWritable[TMapFallback, TStream, TType, TMapType, TByteType]) & (BaseWritableOptions[TStream, TType, TMapType, TByteType])) | ((`0`[TStream, TType, TMapType, TByteType]) & (BaseWritableOptions[TStream, TType, TMapType, TByteType]))
}
