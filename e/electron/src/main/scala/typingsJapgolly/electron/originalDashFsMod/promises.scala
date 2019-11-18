package typingsJapgolly.electron.originalDashFsMod

import typingsJapgolly.electron.electronStrings.buffer
import typingsJapgolly.node.Anon_BufferBytesReadNumberTBuffer
import typingsJapgolly.node.Anon_BufferBytesWrittenNumberString
import typingsJapgolly.node.Anon_BufferBytesWrittenNumberTBuffer
import typingsJapgolly.node.Anon_BufferEncoding
import typingsJapgolly.node.Anon_BufferEncodingFalse
import typingsJapgolly.node.Anon_EncodingBufferEncoding
import typingsJapgolly.node.Anon_EncodingFalseWithFileTypes
import typingsJapgolly.node.Anon_EncodingFalseWithFileTypesBufferEncoding
import typingsJapgolly.node.Anon_EncodingFlagBufferEncoding
import typingsJapgolly.node.Anon_EncodingFlagModeNull
import typingsJapgolly.node.Anon_EncodingFlagNullNumber
import typingsJapgolly.node.Anon_EncodingFlagNullNumberString
import typingsJapgolly.node.Anon_EncodingNull
import typingsJapgolly.node.Anon_EncodingTrue
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.fsMod.MakeDirectoryOptions
import typingsJapgolly.node.fsMod.OpenDirOptions
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.RmDirAsyncOptions
import typingsJapgolly.node.fsMod.promises.FileHandle
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "promises")
@js.native
object promises extends js.Object {
  /**
    * Asynchronously tests a user's permissions for the file specified by path.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def access(path: PathLike): js.Promise[Unit] = js.native
  def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronously append data to a file, creating the file if it does not exist.
    * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'a'` is used.
    */
  def appendFile(path: PathLike, data: js.Any): js.Promise[Unit] = js.native
  def appendFile(path: PathLike, data: js.Any, options: String): js.Promise[Unit] = js.native
  def appendFile(path: PathLike, data: js.Any, options: Anon_EncodingFlagModeNull): js.Promise[Unit] = js.native
  def appendFile(path: FileHandle, data: js.Any): js.Promise[Unit] = js.native
  def appendFile(path: FileHandle, data: js.Any, options: String): js.Promise[Unit] = js.native
  def appendFile(path: FileHandle, data: js.Any, options: Anon_EncodingFlagModeNull): js.Promise[Unit] = js.native
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def chmod(path: PathLike, mode: String): js.Promise[Unit] = js.native
  def chmod(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it already exists.
    * Node.js makes no guarantees about the atomicity of the copy operation.
    * If an error occurs after the destination file has been opened for writing, Node.js will attempt
    * to remove the destination.
    * @param src A path to the source file.
    * @param dest A path to the destination file.
    * @param flags An optional integer that specifies the behavior of the copy operation. The only
    * supported flag is `fs.constants.COPYFILE_EXCL`, which causes the copy operation to fail if
    * `dest` already exists.
    */
  def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = js.native
  def copyFile(src: PathLike, dest: PathLike, flags: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param handle A `FileHandle`.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def fchmod(handle: FileHandle, mode: String): js.Promise[Unit] = js.native
  def fchmod(handle: FileHandle, mode: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param handle A `FileHandle`.
    */
  def fchown(handle: FileHandle, uid: Double, gid: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
    * @param handle A `FileHandle`.
    */
  def fdatasync(handle: FileHandle): js.Promise[Unit] = js.native
  /**
    * Asynchronous fstat(2) - Get file status.
    * @param handle A `FileHandle`.
    */
  def fstat(handle: FileHandle): js.Promise[typingsJapgolly.node.fsMod.Stats] = js.native
  /**
    * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param handle A `FileHandle`.
    */
  def fsync(handle: FileHandle): js.Promise[Unit] = js.native
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param handle A `FileHandle`.
    * @param len If not specified, defaults to `0`.
    */
  def ftruncate(handle: FileHandle): js.Promise[Unit] = js.native
  def ftruncate(handle: FileHandle, len: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied `FileHandle`.
    * @param handle A `FileHandle`.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def futimes(handle: FileHandle, atime: String, mtime: String): js.Promise[Unit] = js.native
  def futimes(handle: FileHandle, atime: String, mtime: Double): js.Promise[Unit] = js.native
  def futimes(handle: FileHandle, atime: String, mtime: Date): js.Promise[Unit] = js.native
  def futimes(handle: FileHandle, atime: Double, mtime: String): js.Promise[Unit] = js.native
  def futimes(handle: FileHandle, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def futimes(handle: FileHandle, atime: Double, mtime: Date): js.Promise[Unit] = js.native
  def futimes(handle: FileHandle, atime: Date, mtime: String): js.Promise[Unit] = js.native
  def futimes(handle: FileHandle, atime: Date, mtime: Double): js.Promise[Unit] = js.native
  def futimes(handle: FileHandle, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  /**
    * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def lchmod(path: PathLike, mode: String): js.Promise[Unit] = js.native
  def lchmod(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  /**
    * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lstat(path: PathLike): js.Promise[typingsJapgolly.node.fsMod.Stats] = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def mkdir(path: PathLike): js.Promise[Unit] = js.native
  def mkdir(path: PathLike, options: String): js.Promise[Unit] = js.native
  def mkdir(path: PathLike, options: Double): js.Promise[Unit] = js.native
  def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[Unit] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def mkdtemp(prefix: String): js.Promise[String] = js.native
  def mkdtemp(prefix: String, options: String): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def mkdtemp(prefix: String, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def mkdtemp(prefix: String, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
  def mkdtemp(prefix: String, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
  def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
  @JSName("mkdtemp")
  def mkdtemp_buffer(prefix: String, options: buffer): js.Promise[Buffer] = js.native
  /**
    * Asynchronous open(2) - open and possibly create a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not
    * supplied, defaults to `0o666`.
    */
  def open(path: PathLike, flags: String): js.Promise[FileHandle] = js.native
  def open(path: PathLike, flags: String, mode: String): js.Promise[FileHandle] = js.native
  def open(path: PathLike, flags: String, mode: Double): js.Promise[FileHandle] = js.native
  def open(path: PathLike, flags: Double): js.Promise[FileHandle] = js.native
  def open(path: PathLike, flags: Double, mode: String): js.Promise[FileHandle] = js.native
  def open(path: PathLike, flags: Double, mode: Double): js.Promise[FileHandle] = js.native
  def opendir(path: String): js.Promise[typingsJapgolly.node.fsMod.Dir] = js.native
  def opendir(path: String, options: OpenDirOptions): js.Promise[typingsJapgolly.node.fsMod.Dir] = js.native
  /**
    * Asynchronously reads data from the file referenced by the supplied `FileHandle`.
    * @param handle A `FileHandle`.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If
    * `null`, data will be read from the current position.
    */
  def read[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
  def read[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
  def read[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
  def read[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
  def read[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
  def read[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
  def read[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
  def read[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def readFile(path: PathLike): js.Promise[Buffer] = js.native
  def readFile(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def readFile(path: PathLike, options: Anon_EncodingFlagBufferEncoding): js.Promise[String] = js.native
  def readFile(path: PathLike, options: Anon_EncodingFlagNullNumber): js.Promise[Buffer] = js.native
  def readFile(path: PathLike, options: Anon_EncodingFlagNullNumberString): js.Promise[String | Buffer] = js.native
  def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  def readFile(path: FileHandle): js.Promise[Buffer] = js.native
  def readFile(path: FileHandle, options: String): js.Promise[String | Buffer] = js.native
  def readFile(path: FileHandle, options: Anon_EncodingFlagBufferEncoding): js.Promise[String] = js.native
  def readFile(path: FileHandle, options: Anon_EncodingFlagNullNumber): js.Promise[Buffer] = js.native
  def readFile(path: FileHandle, options: Anon_EncodingFlagNullNumberString): js.Promise[String | Buffer] = js.native
  def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdir(path: PathLike): js.Promise[js.Array[String]] = js.native
  def readdir(path: PathLike, options: String): js.Promise[js.Array[Buffer | String]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdir(path: PathLike, options: Anon_BufferEncodingFalse): js.Promise[js.Array[Buffer]] = js.native
  def readdir(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Promise[js.Array[Buffer | String]] = js.native
  def readdir(path: PathLike, options: Anon_EncodingFalseWithFileTypesBufferEncoding): js.Promise[js.Array[String]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def readdir(path: PathLike, options: Anon_EncodingTrue): js.Promise[js.Array[typingsJapgolly.node.fsMod.Dirent]] = js.native
  def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
  @JSName("readdir")
  def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlink(path: PathLike): js.Promise[String] = js.native
  def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlink(path: PathLike, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def readlink(path: PathLike, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
  def readlink(path: PathLike, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
  def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  @JSName("readlink")
  def readlink_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpath(path: PathLike): js.Promise[String] = js.native
  def realpath(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpath(path: PathLike, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def realpath(path: PathLike, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
  def realpath(path: PathLike, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
  def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  @JSName("realpath")
  def realpath_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  /**
    * Asynchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def rmdir(path: PathLike): js.Promise[Unit] = js.native
  def rmdir(path: PathLike, options: RmDirAsyncOptions): js.Promise[Unit] = js.native
  /**
    * Asynchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def stat(path: PathLike): js.Promise[typingsJapgolly.node.fsMod.Stats] = js.native
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
  def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = js.native
  /**
    * Asynchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param len If not specified, defaults to `0`.
    */
  def truncate(path: PathLike): js.Promise[Unit] = js.native
  def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def unlink(path: PathLike): js.Promise[Unit] = js.native
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def utimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  /**
    * Asynchronously writes `string` to the file referenced by the supplied `FileHandle`.
    * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
    * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
    * @param handle A `FileHandle`.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  def write(handle: FileHandle, string: js.Any): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
  def write(handle: FileHandle, string: js.Any, position: Double): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
  def write(handle: FileHandle, string: js.Any, position: Double, encoding: String): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
  def write(handle: FileHandle, string: js.Any, position: Null, encoding: String): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied `FileHandle`.
    * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
    * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
    * @param handle A `FileHandle`.
    * @param buffer The buffer that the data will be written to.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def write[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
  def write[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
  def write[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
  def write[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
  def write[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
  def write[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
  def write[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
  def write[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.
    * It is unsafe to call `fsPromises.writeFile()` multiple times on the same file without waiting for the `Promise` to be resolved (or rejected).
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'w'` is used.
    */
  def writeFile(path: PathLike, data: js.Any): js.Promise[Unit] = js.native
  def writeFile(path: PathLike, data: js.Any, options: String): js.Promise[Unit] = js.native
  def writeFile(path: PathLike, data: js.Any, options: Anon_EncodingFlagModeNull): js.Promise[Unit] = js.native
  def writeFile(path: FileHandle, data: js.Any): js.Promise[Unit] = js.native
  def writeFile(path: FileHandle, data: js.Any, options: String): js.Promise[Unit] = js.native
  def writeFile(path: FileHandle, data: js.Any, options: Anon_EncodingFlagModeNull): js.Promise[Unit] = js.native
}

