package typingsJapgolly.electron.originalDashFsMod

import typingsJapgolly.electron.electronStrings.buffer
import typingsJapgolly.node.Anon_BufferEncoding
import typingsJapgolly.node.Anon_EncodingBufferEncoding
import typingsJapgolly.node.Anon_EncodingNull
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("original-fs", "realpath")
@js.native
object realpath extends js.Object {
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    path: PathLike,
    options: Anon_BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    path: PathLike,
    options: Anon_EncodingBufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    path: PathLike,
    options: Anon_EncodingNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(path: PathLike): js.Promise[String] = js.native
  def __promisify__(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(path: PathLike, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def __promisify__(path: PathLike, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
  def __promisify__(path: PathLike, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
  def __promisify__(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  def native(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: Anon_BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: Anon_EncodingBufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: Anon_EncodingNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  @JSName("native")
  def native_buffer(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
}

