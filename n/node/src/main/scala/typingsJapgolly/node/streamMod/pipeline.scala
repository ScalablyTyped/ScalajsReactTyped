package typingsJapgolly.node.streamMod

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "pipeline")
@js.native
object pipeline extends js.Object {
  def apply(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = js.native
  def apply(
    stream1: ReadableStream,
    stream2: WritableStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = js.native
  def apply(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): WritableStream = js.native
  def apply(
    streams: js.Array[ReadableStream | WritableStream | ReadWriteStream],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): WritableStream = js.native
  def apply[T /* <: WritableStream */](stream1: ReadableStream, stream2: T): T = js.native
  def apply[T /* <: WritableStream */](stream1: ReadableStream, stream2: T, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): T = js.native
  def apply[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: T): T = js.native
  def apply[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  def apply[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: ReadWriteStream, stream4: T): T = js.native
  def apply[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  def apply[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T
  ): T = js.native
  def apply[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  @JSName("__promisify__")
  def promisify(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: WritableStream
  ): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: WritableStream
  ): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(stream1: ReadableStream, stream2: ReadWriteStream, stream3: WritableStream): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(stream1: ReadableStream, stream2: ReadWriteStream, streams: (ReadWriteStream | WritableStream)*): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(stream1: ReadableStream, stream2: WritableStream): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(stream1: ReadableStream, stream2: WritableStream, streams: (ReadWriteStream | WritableStream)*): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): js.Promise[Unit] = js.native
}

