package typingsJapgolly.node

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.anon.PickReadableOptionsencodi
import typingsJapgolly.node.anon.PickWritableOptionsdecode
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.childProcessMod.StdioNull
import typingsJapgolly.node.nodeColonbufferMod.Blob
import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.node.streamMod.FinishedOptions
import typingsJapgolly.node.streamMod.PipelineCallback
import typingsJapgolly.node.streamMod.PipelineDestination
import typingsJapgolly.node.streamMod.PipelineOptions
import typingsJapgolly.node.streamMod.PipelinePromise
import typingsJapgolly.node.streamMod.PipelineSource
import typingsJapgolly.node.streamMod.PipelineTransform
import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.node.streamMod.TransformOptions
import typingsJapgolly.node.streamMod.WritableOptions
import typingsJapgolly.node.streamWebMod.ReadableStream
import typingsJapgolly.node.streamWebMod.WritableStream
import typingsJapgolly.std.AsyncGeneratorFunction
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonstreamMod {
  
  @JSImport("node:stream", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject
  @JSImport("node:stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Duplex streams are streams that implement both the `Readable` and `Writable` interfaces.
    *
    * Examples of `Duplex` streams include:
    *
    * * `TCP sockets`
    * * `zlib streams`
    * * `crypto streams`
    * @since v0.9.4
    */
  @JSImport("node:stream", "Duplex")
  @js.native
  open class Duplex () extends StObject {
    def this(opts: DuplexOptions) = this()
  }
  object Duplex {
    
    @JSImport("node:stream", "Duplex")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(src: String): typingsJapgolly.node.streamMod.Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Duplex]
    inline def from(src: js.Iterable[Any]): typingsJapgolly.node.streamMod.Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Duplex]
    inline def from(src: js.Object): typingsJapgolly.node.streamMod.Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Duplex]
    inline def from(src: js.Promise[Any]): typingsJapgolly.node.streamMod.Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Duplex]
    inline def from(src: js.typedarray.ArrayBuffer): typingsJapgolly.node.streamMod.Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Duplex]
    inline def from(src: Blob): typingsJapgolly.node.streamMod.Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Duplex]
    /**
      * A utility method for creating duplex streams.
      *
      * - `Stream` converts writable stream into writable `Duplex` and readable stream
      *   to `Duplex`.
      * - `Blob` converts into readable `Duplex`.
      * - `string` converts into readable `Duplex`.
      * - `ArrayBuffer` converts into readable `Duplex`.
      * - `AsyncIterable` converts into a readable `Duplex`. Cannot yield `null`.
      * - `AsyncGeneratorFunction` converts into a readable/writable transform
      *   `Duplex`. Must take a source `AsyncIterable` as first parameter. Cannot yield
      *   `null`.
      * - `AsyncFunction` converts into a writable `Duplex`. Must return
      *   either `null` or `undefined`
      * - `Object ({ writable, readable })` converts `readable` and
      *   `writable` into `Stream` and then combines them into `Duplex` where the
      *   `Duplex` will write to the `writable` and read from the `readable`.
      * - `Promise` converts into readable `Duplex`. Value `null` is ignored.
      *
      * @since v16.8.0
      */
    /* static member */
    inline def from(src: typingsJapgolly.node.streamMod.Stream): typingsJapgolly.node.streamMod.Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Duplex]
    inline def from(src: AsyncGeneratorFunction): typingsJapgolly.node.streamMod.Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Duplex]
    inline def from(src: AsyncIterable[Any]): typingsJapgolly.node.streamMod.Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Duplex]
  }
  
  /**
    * The `stream.PassThrough` class is a trivial implementation of a `Transform` stream that simply passes the input bytes across to the output. Its purpose is
    * primarily for examples and testing, but there are some use cases where`stream.PassThrough` is useful as a building block for novel sorts of streams.
    */
  @JSImport("node:stream", "PassThrough")
  @js.native
  open class PassThrough () extends StObject {
    def this(opts: TransformOptions) = this()
  }
  
  /**
    * @since v0.9.4
    */
  @JSImport("node:stream", "Readable")
  @js.native
  open class Readable () extends StObject {
    def this(opts: ReadableOptions) = this()
  }
  object Readable {
    
    @JSImport("node:stream", "Readable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A utility method for creating Readable Streams out of iterators.
      */
    /* static member */
    inline def from(iterable: js.Iterable[Any]): typingsJapgolly.node.streamMod.Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Readable]
    inline def from(iterable: js.Iterable[Any], options: ReadableOptions): typingsJapgolly.node.streamMod.Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.streamMod.Readable]
    inline def from(iterable: AsyncIterable[Any]): typingsJapgolly.node.streamMod.Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Readable]
    inline def from(iterable: AsyncIterable[Any], options: ReadableOptions): typingsJapgolly.node.streamMod.Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.streamMod.Readable]
    
    /**
      * A utility method for creating a `Readable` from a web `ReadableStream`.
      * @since v17.0.0
      * @experimental
      */
    /* static member */
    inline def fromWeb(readableStream: ReadableStream[Any]): typingsJapgolly.node.streamMod.Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWeb")(readableStream.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Readable]
    inline def fromWeb(readableStream: ReadableStream[Any], options: PickReadableOptionsencodi): typingsJapgolly.node.streamMod.Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWeb")(readableStream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.streamMod.Readable]
    
    inline def isDisturbed(stream: typingsJapgolly.node.NodeJS.ReadableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisturbed")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    /**
      * Returns whether the stream has been read from or cancelled.
      * @since v16.8.0
      */
    /* static member */
    inline def isDisturbed(stream: typingsJapgolly.node.streamMod.Readable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisturbed")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * A utility method for creating a web `ReadableStream` from a `Readable`.
      * @since v17.0.0
      * @experimental
      */
    /* static member */
    inline def toWeb(streamReadable: typingsJapgolly.node.streamMod.Readable): ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toWeb")(streamReadable.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Any]]
  }
  
  @JSImport("node:stream", "Stream")
  @js.native
  open class Stream ()
    extends StObject
       with StdioNull {
    def this(opts: ReadableOptions) = this()
  }
  
  /**
    * Transform streams are `Duplex` streams where the output is in some way
    * related to the input. Like all `Duplex` streams, `Transform` streams
    * implement both the `Readable` and `Writable` interfaces.
    *
    * Examples of `Transform` streams include:
    *
    * * `zlib streams`
    * * `crypto streams`
    * @since v0.9.4
    */
  @JSImport("node:stream", "Transform")
  @js.native
  open class Transform () extends StObject {
    def this(opts: TransformOptions) = this()
  }
  
  /**
    * @since v0.9.4
    */
  @JSImport("node:stream", "Writable")
  @js.native
  open class Writable () extends StObject {
    def this(opts: WritableOptions) = this()
  }
  object Writable {
    
    @JSImport("node:stream", "Writable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A utility method for creating a `Writable` from a web `WritableStream`.
      * @since v17.0.0
      * @experimental
      */
    /* static member */
    inline def fromWeb(writableStream: WritableStream[Any]): typingsJapgolly.node.streamMod.Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWeb")(writableStream.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.streamMod.Writable]
    inline def fromWeb(writableStream: WritableStream[Any], options: PickWritableOptionsdecode): typingsJapgolly.node.streamMod.Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWeb")(writableStream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.streamMod.Writable]
    
    /**
      * A utility method for creating a web `WritableStream` from a `Writable`.
      * @since v17.0.0
      * @experimental
      */
    /* static member */
    inline def toWeb(streamWritable: typingsJapgolly.node.streamMod.Writable): WritableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toWeb")(streamWritable.asInstanceOf[js.Any]).asInstanceOf[WritableStream[Any]]
  }
  
  /**
    * Attaches an AbortSignal to a readable or writeable stream. This lets code
    * control stream destruction using an `AbortController`.
    *
    * Calling `abort` on the `AbortController` corresponding to the passed`AbortSignal` will behave the same way as calling `.destroy(new AbortError())`on the stream.
    *
    * ```js
    * const fs = require('fs');
    *
    * const controller = new AbortController();
    * const read = addAbortSignal(
    *   controller.signal,
    *   fs.createReadStream(('object.json'))
    * );
    * // Later, abort the operation closing the stream
    * controller.abort();
    * ```
    *
    * Or using an `AbortSignal` with a readable stream as an async iterable:
    *
    * ```js
    * const controller = new AbortController();
    * setTimeout(() => controller.abort(), 10_000); // set a timeout
    * const stream = addAbortSignal(
    *   controller.signal,
    *   fs.createReadStream(('object.json'))
    * );
    * (async () => {
    *   try {
    *     for await (const chunk of stream) {
    *       await process(chunk);
    *     }
    *   } catch (e) {
    *     if (e.name === 'AbortError') {
    *       // The operation was cancelled
    *     } else {
    *       throw e;
    *     }
    *   }
    * })();
    * ```
    * @since v15.4.0
    * @param signal A signal representing possible cancellation
    * @param stream a stream to attach a signal to
    */
  inline def addAbortSignal[T /* <: typingsJapgolly.node.streamMod.Stream */](signal: AbortSignal, stream: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addAbortSignal")(signal.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[T]
  
  object consumers {
    
    @JSImport("node:stream", "consumers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def arrayBuffer(stream: typingsJapgolly.node.NodeJS.ReadableStream): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBuffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
    inline def arrayBuffer(stream: Readable): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBuffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
    inline def arrayBuffer(stream: AsyncIterator[Any, Any, Unit]): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBuffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
    
    inline def blob(stream: typingsJapgolly.node.NodeJS.ReadableStream): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blob")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
    inline def blob(stream: Readable): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blob")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
    inline def blob(stream: AsyncIterator[Any, Any, Unit]): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blob")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
    
    inline def buffer(stream: typingsJapgolly.node.NodeJS.ReadableStream): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def buffer(stream: Readable): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def buffer(stream: AsyncIterator[Any, Any, Unit]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    
    inline def json(stream: typingsJapgolly.node.NodeJS.ReadableStream): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def json(stream: Readable): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def json(stream: AsyncIterator[Any, Any, Unit]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def text(stream: typingsJapgolly.node.NodeJS.ReadableStream): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def text(stream: Readable): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def text(stream: AsyncIterator[Any, Any, Unit]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  inline def finished(stream: ReadWriteStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def finished(
    stream: ReadWriteStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def finished(
    stream: typingsJapgolly.node.NodeJS.ReadableStream,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  /**
    * A function to get notified when a stream is no longer readable, writable
    * or has experienced an error or a premature close event.
    *
    * ```js
    * const { finished } = require('stream');
    *
    * const rs = fs.createReadStream('archive.tar');
    *
    * finished(rs, (err) => {
    *   if (err) {
    *     console.error('Stream failed.', err);
    *   } else {
    *     console.log('Stream is done reading.');
    *   }
    * });
    *
    * rs.resume(); // Drain the stream.
    * ```
    *
    * Especially useful in error handling scenarios where a stream is destroyed
    * prematurely (like an aborted HTTP request), and will not emit `'end'`or `'finish'`.
    *
    * The `finished` API provides promise version:
    *
    * ```js
    * const { finished } = require('stream/promises');
    *
    * const rs = fs.createReadStream('archive.tar');
    *
    * async function run() {
    *   await finished(rs);
    *   console.log('Stream is done reading.');
    * }
    *
    * run().catch(console.error);
    * rs.resume(); // Drain the stream.
    * ```
    *
    * `stream.finished()` leaves dangling event listeners (in particular`'error'`, `'end'`, `'finish'` and `'close'`) after `callback` has been
    * invoked. The reason for this is so that unexpected `'error'` events (due to
    * incorrect stream implementations) do not cause unexpected crashes.
    * If this is unwanted behavior then the returned cleanup function needs to be
    * invoked in the callback:
    *
    * ```js
    * const cleanup = finished(rs, (err) => {
    *   cleanup();
    *   // ...
    * });
    * ```
    * @since v10.0.0
    * @param stream A readable and/or writable stream.
    * @param callback A callback function that takes an optional error argument.
    * @return A cleanup function which removes all registered listeners.
    */
  inline def finished(
    stream: typingsJapgolly.node.NodeJS.ReadableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def finished(
    stream: typingsJapgolly.node.NodeJS.WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def finished(
    stream: typingsJapgolly.node.NodeJS.WritableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def isErrored(stream: typingsJapgolly.node.NodeJS.ReadableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrored")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isErrored(stream: typingsJapgolly.node.NodeJS.WritableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrored")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  /**
    * Returns whether the stream has encountered an error.
    * @since v17.3.0
    */
  inline def isErrored(stream: typingsJapgolly.node.streamMod.Readable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrored")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isErrored(stream: typingsJapgolly.node.streamMod.Writable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrored")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isReadable(stream: typingsJapgolly.node.NodeJS.ReadableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  /**
    * Returns whether the stream is readable.
    * @since v17.4.0
    */
  inline def isReadable(stream: typingsJapgolly.node.streamMod.Readable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pipeline(
    stream1: typingsJapgolly.node.NodeJS.ReadableStream,
    stream2: ReadWriteStream,
    streams: (ReadWriteStream | typingsJapgolly.node.NodeJS.WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): typingsJapgolly.node.NodeJS.WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")((scala.List(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any])).`++`(streams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.node.NodeJS.WritableStream]
  inline def pipeline(
    stream1: typingsJapgolly.node.NodeJS.ReadableStream,
    stream2: typingsJapgolly.node.NodeJS.WritableStream,
    streams: (ReadWriteStream | typingsJapgolly.node.NodeJS.WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): typingsJapgolly.node.NodeJS.WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")((scala.List(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any])).`++`(streams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.node.NodeJS.WritableStream]
  inline def pipeline(
    streams: js.Array[
      typingsJapgolly.node.NodeJS.ReadableStream | typingsJapgolly.node.NodeJS.WritableStream | ReadWriteStream
    ]
  ): typingsJapgolly.node.NodeJS.WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.NodeJS.WritableStream]
  inline def pipeline(
    streams: js.Array[
      typingsJapgolly.node.NodeJS.ReadableStream | typingsJapgolly.node.NodeJS.WritableStream | ReadWriteStream
    ],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): typingsJapgolly.node.NodeJS.WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.NodeJS.WritableStream]
  /**
    * A module method to pipe between streams and generators forwarding errors and
    * properly cleaning up and provide a callback when the pipeline is complete.
    *
    * ```js
    * const { pipeline } = require('stream');
    * const fs = require('fs');
    * const zlib = require('zlib');
    *
    * // Use the pipeline API to easily pipe a series of streams
    * // together and get notified when the pipeline is fully done.
    *
    * // A pipeline to gzip a potentially huge tar file efficiently:
    *
    * pipeline(
    *   fs.createReadStream('archive.tar'),
    *   zlib.createGzip(),
    *   fs.createWriteStream('archive.tar.gz'),
    *   (err) => {
    *     if (err) {
    *       console.error('Pipeline failed.', err);
    *     } else {
    *       console.log('Pipeline succeeded.');
    *     }
    *   }
    * );
    * ```
    *
    * The `pipeline` API provides a promise version, which can also
    * receive an options argument as the last parameter with a`signal` `AbortSignal` property. When the signal is aborted,`destroy` will be called on the underlying pipeline, with
    * an`AbortError`.
    *
    * ```js
    * const { pipeline } = require('stream/promises');
    *
    * async function run() {
    *   await pipeline(
    *     fs.createReadStream('archive.tar'),
    *     zlib.createGzip(),
    *     fs.createWriteStream('archive.tar.gz')
    *   );
    *   console.log('Pipeline succeeded.');
    * }
    *
    * run().catch(console.error);
    * ```
    *
    * To use an `AbortSignal`, pass it inside an options object,
    * as the last argument:
    *
    * ```js
    * const { pipeline } = require('stream/promises');
    *
    * async function run() {
    *   const ac = new AbortController();
    *   const signal = ac.signal;
    *
    *   setTimeout(() => ac.abort(), 1);
    *   await pipeline(
    *     fs.createReadStream('archive.tar'),
    *     zlib.createGzip(),
    *     fs.createWriteStream('archive.tar.gz'),
    *     { signal },
    *   );
    * }
    *
    * run().catch(console.error); // AbortError
    * ```
    *
    * The `pipeline` API also supports async generators:
    *
    * ```js
    * const { pipeline } = require('stream/promises');
    * const fs = require('fs');
    *
    * async function run() {
    *   await pipeline(
    *     fs.createReadStream('lowercase.txt'),
    *     async function* (source, { signal }) {
    *       source.setEncoding('utf8');  // Work with strings rather than `Buffer`s.
    *       for await (const chunk of source) {
    *         yield await processChunk(chunk, { signal });
    *       }
    *     },
    *     fs.createWriteStream('uppercase.txt')
    *   );
    *   console.log('Pipeline succeeded.');
    * }
    *
    * run().catch(console.error);
    * ```
    *
    * Remember to handle the `signal` argument passed into the async generator.
    * Especially in the case where the async generator is the source for the
    * pipeline (i.e. first argument) or the pipeline will never complete.
    *
    * ```js
    * const { pipeline } = require('stream/promises');
    * const fs = require('fs');
    *
    * async function run() {
    *   await pipeline(
    *     async function* ({ signal }) {
    *       await someLongRunningfn({ signal });
    *       yield 'asd';
    *     },
    *     fs.createWriteStream('uppercase.txt')
    *   );
    *   console.log('Pipeline succeeded.');
    * }
    *
    * run().catch(console.error);
    * ```
    *
    * `stream.pipeline()` will call `stream.destroy(err)` on all streams except:
    *
    * * `Readable` streams which have emitted `'end'` or `'close'`.
    * * `Writable` streams which have emitted `'finish'` or `'close'`.
    *
    * `stream.pipeline()` leaves dangling event listeners on the streams
    * after the `callback` has been invoked. In the case of reuse of streams after
    * failure, this can cause event listener leaks and swallowed errors. If the last
    * stream is readable, dangling event listeners will be removed so that the last
    * stream can be consumed later.
    *
    * `stream.pipeline()` closes all the streams when an error is raised.
    * The `IncomingRequest` usage with `pipeline` could lead to an unexpected behavior
    * once it would destroy the socket without sending the expected response.
    * See the example below:
    *
    * ```js
    * const fs = require('fs');
    * const http = require('http');
    * const { pipeline } = require('stream');
    *
    * const server = http.createServer((req, res) => {
    *   const fileStream = fs.createReadStream('./fileNotExist.txt');
    *   pipeline(fileStream, res, (err) => {
    *     if (err) {
    *       console.log(err); // No such file
    *       // this message can't be sent once `pipeline` already destroyed the socket
    *       return res.end('error!!!');
    *     }
    *   });
    * });
    * ```
    * @since v10.0.0
    * @param callback Called when the pipeline is fully done.
    */
  inline def pipeline[A /* <: PipelineSource[Any] */, B /* <: PipelineDestination[A, Any] */](source: A, destination: B): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, B /* <: PipelineDestination[A, Any] */](source: A, destination: B, callback: PipelineCallback[B]): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, B /* <: PipelineDestination[T1, Any] */](source: A, transform1: T1, destination: B): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, B /* <: PipelineDestination[T1, Any] */](source: A, transform1: T1, destination: B, callback: PipelineCallback[B]): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, B /* <: PipelineDestination[T2, Any] */](source: A, transform1: T1, transform2: T2, destination: B): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, B /* <: PipelineDestination[T2, Any] */](source: A, transform1: T1, transform2: T2, destination: B, callback: PipelineCallback[B]): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, B /* <: PipelineDestination[T3, Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, destination: B): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, B /* <: PipelineDestination[T3, Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    destination: B,
    callback: PipelineCallback[B]
  ): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, T4 /* <: PipelineTransform[T3, Any] */, B /* <: PipelineDestination[T4, Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, transform4: T4, destination: B): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, T4 /* <: PipelineTransform[T3, Any] */, B /* <: PipelineDestination[T4, Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    transform4: T4,
    destination: B,
    callback: PipelineCallback[B]
  ): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  
  object promises {
    
    @JSImport("node:stream", "promises")
    @js.native
    val ^ : js.Any = js.native
    
    inline def finished(stream: ReadWriteStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def finished(stream: ReadWriteStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def finished(stream: typingsJapgolly.node.NodeJS.ReadableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def finished(stream: typingsJapgolly.node.NodeJS.ReadableStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def finished(stream: typingsJapgolly.node.NodeJS.WritableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def finished(stream: typingsJapgolly.node.NodeJS.WritableStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def pipeline(
      stream1: typingsJapgolly.node.NodeJS.ReadableStream,
      stream2: ReadWriteStream,
      streams: (ReadWriteStream | typingsJapgolly.node.NodeJS.WritableStream | PipelineOptions)*
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")((scala.List(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any])).`++`(streams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
    inline def pipeline(
      stream1: typingsJapgolly.node.NodeJS.ReadableStream,
      stream2: typingsJapgolly.node.NodeJS.WritableStream,
      streams: (ReadWriteStream | typingsJapgolly.node.NodeJS.WritableStream | PipelineOptions)*
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")((scala.List(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any])).`++`(streams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
    inline def pipeline(
      streams: js.Array[
          typingsJapgolly.node.NodeJS.ReadableStream | typingsJapgolly.node.NodeJS.WritableStream | ReadWriteStream
        ]
    ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def pipeline(
      streams: js.Array[
          typingsJapgolly.node.NodeJS.ReadableStream | typingsJapgolly.node.NodeJS.WritableStream | ReadWriteStream
        ],
      options: PipelineOptions
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def pipeline[A /* <: PipelineSource[Any] */, B /* <: PipelineDestination[A, Any] */](source: A, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    inline def pipeline[A /* <: PipelineSource[Any] */, B /* <: PipelineDestination[A, Any] */](source: A, destination: B, options: PipelineOptions): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, B /* <: PipelineDestination[T1, Any] */](source: A, transform1: T1, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, B /* <: PipelineDestination[T1, Any] */](source: A, transform1: T1, destination: B, options: PipelineOptions): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, B /* <: PipelineDestination[T2, Any] */](source: A, transform1: T1, transform2: T2, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, B /* <: PipelineDestination[T2, Any] */](source: A, transform1: T1, transform2: T2, destination: B, options: PipelineOptions): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, B /* <: PipelineDestination[T3, Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, B /* <: PipelineDestination[T3, Any] */](
      source: A,
      transform1: T1,
      transform2: T2,
      transform3: T3,
      destination: B,
      options: PipelineOptions
    ): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, T4 /* <: PipelineTransform[T3, Any] */, B /* <: PipelineDestination[T4, Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, transform4: T4, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, T4 /* <: PipelineTransform[T3, Any] */, B /* <: PipelineDestination[T4, Any] */](
      source: A,
      transform1: T1,
      transform2: T2,
      transform3: T3,
      transform4: T4,
      destination: B,
      options: PipelineOptions
    ): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
  }
}
