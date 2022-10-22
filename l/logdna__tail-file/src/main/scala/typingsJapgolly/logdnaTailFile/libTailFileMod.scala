package typingsJapgolly.logdnaTailFile

import japgolly.scalajs.react.Callback
import typingsJapgolly.logdnaTailFile.anon.Dictkey
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.ETAIL
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.close
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.data
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.end
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.error
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.flush
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.pause
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.readable
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.renamed
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.resume
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.retry
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.tail_error
import typingsJapgolly.logdnaTailFile.logdnaTailFileStrings.truncated
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTailFileMod {
  
  @JSImport("@logdna/tail-file/lib/tail-file", JSImport.Namespace)
  @js.native
  open class ^ protected () extends TailFile {
    /**
      * Instantiating `TailFile` will return a readable stream, but nothing will
      * happen until `start()` is called. After that, follow node's standard
      * procedure to get the stream into flowing mode. Typically, this means
      * using `pipe` or attaching `data` listeners to the readable stream.
      *
      * @param filename The filename to tail. Poll errors do not happen until `start` is called.
      * @param opts Optional options.
      * @throws {TypeError | RangeError} if parameter validation fails.
      */
    def this(filename: String) = this()
    def this(filename: String, opts: TailFileOptions) = this()
  }
  
  trait EventPayload extends StObject {
    
    /**
      * The filename that's being tailed.
      */
    var filename: String
    
    /**
      * A static message.
      */
    var message: String
    
    /**
      * The date/time when the event happened.
      */
    var when: js.Date
  }
  object EventPayload {
    
    inline def apply(filename: String, message: String, when: js.Date): EventPayload = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPayload]
    }
    
    extension [Self <: EventPayload](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setWhen(value: js.Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlushEventPayload extends StObject {
    
    /**
      * The `lastReadPosition` represents the `startPos` value at the time of flushing
      */
    var lastReadPosition: Double
  }
  object FlushEventPayload {
    
    inline def apply(lastReadPosition: Double): FlushEventPayload = {
      val __obj = js.Dynamic.literal(lastReadPosition = lastReadPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlushEventPayload]
    }
    
    extension [Self <: FlushEventPayload](x: Self) {
      
      inline def setLastReadPosition(value: Double): Self = StObject.set(x, "lastReadPosition", value.asInstanceOf[js.Any])
    }
  }
  
  type ReadStreamOpts = Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@logdna/tail-file.anon.FnCall>[1] */ js.Any, 
    js.UndefOr[String]
  ]
  
  // Events declared on Readable.
  trait ReadableEvents extends StObject {
    
    def close(): Unit
    
    def data(chunk: Any): Unit
    
    def end(): Unit
    
    def error(err: js.Error): Unit
    
    def pause(): Unit
    
    def readable(): Unit
    
    def resume(): Unit
  }
  object ReadableEvents {
    
    inline def apply(
      close: Callback,
      data: Any => Callback,
      end: Callback,
      error: js.Error => Callback,
      pause: Callback,
      readable: Callback,
      resume: Callback
    ): ReadableEvents = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, data = js.Any.fromFunction1((t0: Any) => data(t0).runNow()), end = end.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), pause = pause.toJsFn, readable = readable.toJsFn, resume = resume.toJsFn)
      __obj.asInstanceOf[ReadableEvents]
    }
    
    extension [Self <: ReadableEvents](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setData(value: Any => Callback): Self = StObject.set(x, "data", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setError(value: js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
      
      inline def setReadable(value: Callback): Self = StObject.set(x, "readable", value.toJsFn)
      
      inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    }
  }
  
  trait RetryEventPayload
    extends StObject
       with EventPayload {
    
    /**
      * The number of attempts to try and access the file.
      */
    var attempts: Double
  }
  object RetryEventPayload {
    
    inline def apply(attempts: Double, filename: String, message: String, when: js.Date): RetryEventPayload = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryEventPayload]
    }
    
    extension [Self <: RetryEventPayload](x: Self) {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    }
  }
  
  trait TailErrorEventPayload extends StObject {
    
    /**
      * A static error code.
      */
    var code: ETAIL
    
    /**
      * The error message as written by `TailFile`.
      */
    var message: String
    
    /**
      * Additional metadata added for context.
      */
    var meta: Dictkey
  }
  object TailErrorEventPayload {
    
    inline def apply(message: String, meta: Dictkey): TailErrorEventPayload = {
      val __obj = js.Dynamic.literal(code = "ETAIL", message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[TailErrorEventPayload]
    }
    
    extension [Self <: TailErrorEventPayload](x: Self) {
      
      inline def setCode(value: ETAIL): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Dictkey): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TailFile extends Readable {
    
    // Event emitter
    def addListener[U /* <: /* keyof @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents */ flush | renamed | retry | tail_error | truncated | close | data | end | error | pause | readable | resume */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents[U] */ js.Any
    ): this.type = js.native
    
    def emit[U /* <: /* keyof @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents */ flush | renamed | retry | tail_error | truncated | close | data | end | error | pause | readable | resume */](event: U): Boolean = js.native
    
    def on[U /* <: /* keyof @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents */ flush | renamed | retry | tail_error | truncated | close | data | end | error | pause | readable | resume */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents[U] */ js.Any
    ): this.type = js.native
    
    def once[U /* <: /* keyof @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents */ flush | renamed | retry | tail_error | truncated | close | data | end | error | pause | readable | resume */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents[U] */ js.Any
    ): this.type = js.native
    
    def prependListener[U /* <: /* keyof @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents */ flush | renamed | retry | tail_error | truncated | close | data | end | error | pause | readable | resume */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents[U] */ js.Any
    ): this.type = js.native
    
    def prependOnceListener[U /* <: /* keyof @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents */ flush | renamed | retry | tail_error | truncated | close | data | end | error | pause | readable | resume */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents[U] */ js.Any
    ): this.type = js.native
    
    /**
      * Closes all streams and exits cleanly. The parent `TailFile` stream will
      * be properly ended by pushing null, therefore an end event may be emitted
      * as well.
      *
      * @emits close when the parent `ReadStream` is ended.
      */
    def quit(): js.Promise[Unit] = js.native
    
    def removeListener[U /* <: /* keyof @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents */ flush | renamed | retry | tail_error | truncated | close | data | end | error | pause | readable | resume */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @logdna/tail-file.@logdna/tail-file/lib/tail-file.TailFileEvents[U] */ js.Any
    ): this.type = js.native
    
    /**
      * Beings the polling of `filename` to watch for added/changed bytes.
      * It may be called before or after data is set up to be consumed with a
      * `data` listener or a `pipe`. Standard node stream rules apply, which say
      * that data will not flow through the stream until it's consumed.
      *
      * @returns A Promise that resolves after the file is polled successfully,
      *   rejects if `filename` is not found.
      */
    def start(): js.Promise[Unit] = js.native
  }
  
  trait TailFileEvents
    extends StObject
       with ReadableEvents {
    
    def flush(payload: FlushEventPayload): Unit
    
    def renamed(payload: EventPayload): Unit
    
    def retry(payload: RetryEventPayload): Unit
    
    def tail_error(payload: TailErrorEventPayload): Unit
    
    def truncated(payload: EventPayload): Unit
  }
  object TailFileEvents {
    
    inline def apply(
      close: Callback,
      data: Any => Callback,
      end: Callback,
      error: js.Error => Callback,
      flush: FlushEventPayload => Callback,
      pause: Callback,
      readable: Callback,
      renamed: EventPayload => Callback,
      resume: Callback,
      retry: RetryEventPayload => Callback,
      tail_error: TailErrorEventPayload => Callback,
      truncated: EventPayload => Callback
    ): TailFileEvents = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, data = js.Any.fromFunction1((t0: Any) => data(t0).runNow()), end = end.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), flush = js.Any.fromFunction1((t0: FlushEventPayload) => flush(t0).runNow()), pause = pause.toJsFn, readable = readable.toJsFn, renamed = js.Any.fromFunction1((t0: EventPayload) => renamed(t0).runNow()), resume = resume.toJsFn, retry = js.Any.fromFunction1((t0: RetryEventPayload) => retry(t0).runNow()), tail_error = js.Any.fromFunction1((t0: TailErrorEventPayload) => tail_error(t0).runNow()), truncated = js.Any.fromFunction1((t0: EventPayload) => truncated(t0).runNow()))
      __obj.asInstanceOf[TailFileEvents]
    }
    
    extension [Self <: TailFileEvents](x: Self) {
      
      inline def setFlush(value: FlushEventPayload => Callback): Self = StObject.set(x, "flush", js.Any.fromFunction1((t0: FlushEventPayload) => value(t0).runNow()))
      
      inline def setRenamed(value: EventPayload => Callback): Self = StObject.set(x, "renamed", js.Any.fromFunction1((t0: EventPayload) => value(t0).runNow()))
      
      inline def setRetry(value: RetryEventPayload => Callback): Self = StObject.set(x, "retry", js.Any.fromFunction1((t0: RetryEventPayload) => value(t0).runNow()))
      
      inline def setTail_error(value: TailErrorEventPayload => Callback): Self = StObject.set(x, "tail_error", js.Any.fromFunction1((t0: TailErrorEventPayload) => value(t0).runNow()))
      
      inline def setTruncated(value: EventPayload => Callback): Self = StObject.set(x, "truncated", js.Any.fromFunction1((t0: EventPayload) => value(t0).runNow()))
    }
  }
  
  // NOTE: All types in this scope are implicitly exported.
  trait TailFileOptions
    extends StObject
       with ReadableOptions {
    
    /**
      * The number of times to retry a failed poll before exiting/erroring.
      * @default 10
      */
    var maxPollFailures: js.UndefOr[Double] = js.undefined
    
    /**
      * After a polling error (ENOENT?), how long to wait before retrying (in milliseconds).
      * @default 200
      */
    var pollFailureRetryMs: js.UndefOr[Double] = js.undefined
    
    /**
      * How often to poll filename for changes (in milliseconds).
      * @default 1000
      */
    var pollFileIntervalMs: js.UndefOr[Double] = js.undefined
    
    /**
      * Options to pass to the `fs.createReadStream` function.
      * This is used for reading bytes that have been added to filename between every poll.
      */
    var readStreamOpts: js.UndefOr[ReadStreamOpts] = js.undefined
    
    /**
      * An integer representing the initial read position in the file, or `null`
      * for start tailing from EOF.
      * Useful for reading from 0.
      *
      * @default null
      */
    var startPos: js.UndefOr[Double | Null] = js.undefined
  }
  object TailFileOptions {
    
    inline def apply(): TailFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TailFileOptions]
    }
    
    extension [Self <: TailFileOptions](x: Self) {
      
      inline def setMaxPollFailures(value: Double): Self = StObject.set(x, "maxPollFailures", value.asInstanceOf[js.Any])
      
      inline def setMaxPollFailuresUndefined: Self = StObject.set(x, "maxPollFailures", js.undefined)
      
      inline def setPollFailureRetryMs(value: Double): Self = StObject.set(x, "pollFailureRetryMs", value.asInstanceOf[js.Any])
      
      inline def setPollFailureRetryMsUndefined: Self = StObject.set(x, "pollFailureRetryMs", js.undefined)
      
      inline def setPollFileIntervalMs(value: Double): Self = StObject.set(x, "pollFileIntervalMs", value.asInstanceOf[js.Any])
      
      inline def setPollFileIntervalMsUndefined: Self = StObject.set(x, "pollFileIntervalMs", js.undefined)
      
      inline def setReadStreamOpts(value: ReadStreamOpts): Self = StObject.set(x, "readStreamOpts", value.asInstanceOf[js.Any])
      
      inline def setReadStreamOptsUndefined: Self = StObject.set(x, "readStreamOpts", js.undefined)
      
      inline def setStartPos(value: Double): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
      
      inline def setStartPosNull: Self = StObject.set(x, "startPos", null)
      
      inline def setStartPosUndefined: Self = StObject.set(x, "startPos", js.undefined)
    }
  }
}
