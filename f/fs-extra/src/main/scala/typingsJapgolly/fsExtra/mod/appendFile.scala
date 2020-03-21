package typingsJapgolly.fsExtra.mod

import typingsJapgolly.fsExtra.AnonEncoding
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.NoParamCallback
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-extra", "appendFile")
@js.native
object appendFile extends js.Object {
  def apply(file: String, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: AnonEncoding): js.Promise[Unit] = js.native
  def apply(
    file: String,
    data: js.Any,
    options: AnonEncoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: Double, data: js.Any): js.Promise[Unit] = js.native
  def apply(
    file: Double,
    data: js.Any,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
  def apply(file: Double, data: js.Any, options: AnonEncoding): js.Promise[Unit] = js.native
  def apply(
    file: Double,
    data: js.Any,
    options: AnonEncoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(
    file: Double,
    data: js.Any,
    options: typingsJapgolly.node.fsMod.WriteFileOptions,
    callback: NoParamCallback
  ): Unit = js.native
  def apply(file: Buffer, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: Buffer, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: Buffer, data: js.Any, options: AnonEncoding): js.Promise[Unit] = js.native
  def apply(
    file: Buffer,
    data: js.Any,
    options: AnonEncoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  /**
    * Asynchronously append data to a file, creating the file if it does not exist.
    * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    */
  def apply(file: PathLike, data: js.Any, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronously append data to a file, creating the file if it does not exist.
    * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'a'` is used.
    */
  def apply(
    file: PathLike,
    data: js.Any,
    options: typingsJapgolly.node.fsMod.WriteFileOptions,
    callback: NoParamCallback
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(file: Double, data: js.Any): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(file: Double, data: js.Any, options: typingsJapgolly.node.fsMod.WriteFileOptions): js.Promise[Unit] = js.native
  /**
    * Asynchronously append data to a file, creating the file if it does not exist.
    * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'a'` is used.
    */
  @JSName("__promisify__")
  def promisify(file: PathLike, data: js.Any): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(file: PathLike, data: js.Any, options: typingsJapgolly.node.fsMod.WriteFileOptions): js.Promise[Unit] = js.native
}

