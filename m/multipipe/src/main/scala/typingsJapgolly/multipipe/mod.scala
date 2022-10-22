package typingsJapgolly.multipipe

import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.node.streamMod.PassThrough
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Pass a variable number of streams and each will be piped to the next one.
    *
    * A stream will be returned that wraps passed in streams in a way that errors will be forwarded and you can write to and/or read from it.
    *
    * Pass an object as the second to last or last argument to pass as options to the underlying stream constructors.
    *
    * Pass a function as last argument to be called on error or finish of the last stream.
    */
  inline def apply(): PassThrough = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[PassThrough]
  inline def apply(callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]): PassThrough = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[PassThrough]
  inline def apply(options: Unit, callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]): PassThrough = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[PassThrough]
  inline def apply(options: DuplexOptions): PassThrough = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[PassThrough]
  inline def apply(options: DuplexOptions, callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]): PassThrough = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[PassThrough]
  inline def apply(source: Readable, destination: Writable): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    destination: Writable,
    options: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(source: Readable, destination: Writable, options: DuplexOptions): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(source: Readable, t1: Duplex, t2: Duplex, destination: Writable): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(source: Readable, t1: Duplex, t2: Duplex, destination: Writable, options: DuplexOptions): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(source: Readable, t1: Duplex, t2: Duplex, t3: Duplex, destination: Writable): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    destination: Writable,
    options: DuplexOptions
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(source: Readable, t1: Duplex, t2: Duplex, t3: Duplex, t4: Duplex, destination: Writable): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    destination: Writable,
    options: DuplexOptions
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    destination: Writable
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    destination: Writable,
    options: DuplexOptions
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    destination: Writable
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    destination: Writable,
    options: DuplexOptions
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    t7: Duplex,
    destination: Writable
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], t7.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    t7: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], t7.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    t7: Duplex,
    destination: Writable,
    options: DuplexOptions
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], t7.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    t1: Duplex,
    t2: Duplex,
    t3: Duplex,
    t4: Duplex,
    t5: Duplex,
    t6: Duplex,
    t7: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], t7.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(source: Readable, transform: Duplex, destination: Writable): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    transform: Duplex,
    destination: Writable,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(source: Readable, transform: Duplex, destination: Writable, options: DuplexOptions): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    source: Readable,
    transform: Duplex,
    destination: Writable,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(stream: js.Array[Stream]): Duplex = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Duplex]
  inline def apply(stream: js.Array[Stream], callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]): Duplex = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    stream: js.Array[Stream],
    options: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(stream: js.Array[Stream], options: DuplexOptions): Duplex = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    stream: js.Array[Stream],
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(stream: Duplex): Duplex = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Duplex]
  inline def apply(stream: Duplex, callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]): Duplex = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(stream: Duplex, options: Unit, callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]): Duplex = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(stream: Duplex, options: DuplexOptions): Duplex = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(
    stream: Duplex,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): Duplex = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
