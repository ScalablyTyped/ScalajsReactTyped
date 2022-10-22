package typingsJapgolly.fsExtra.mod

import typingsJapgolly.fsExtra.anon.BufferBigInt64Array
import typingsJapgolly.fsExtra.anon.BufferBigInt64ArrayBytesWrittenNumber
import typingsJapgolly.fsExtra.anon.BufferBigUint64Array
import typingsJapgolly.fsExtra.anon.BufferBigUint64ArrayBytesWrittenNumber
import typingsJapgolly.fsExtra.anon.BufferBytesRead
import typingsJapgolly.fsExtra.anon.BufferBytesWritten
import typingsJapgolly.fsExtra.anon.BufferDataView
import typingsJapgolly.fsExtra.anon.BufferDataViewBytesWrittenNumber
import typingsJapgolly.fsExtra.anon.BufferFloat32Array
import typingsJapgolly.fsExtra.anon.BufferFloat32ArrayBytesWrittenNumber
import typingsJapgolly.fsExtra.anon.BufferFloat64Array
import typingsJapgolly.fsExtra.anon.BufferFloat64ArrayBytesWrittenNumber
import typingsJapgolly.fsExtra.anon.BufferInt16Array
import typingsJapgolly.fsExtra.anon.BufferInt16ArrayBytesWrittenNumber
import typingsJapgolly.fsExtra.anon.BufferInt32Array
import typingsJapgolly.fsExtra.anon.BufferInt32ArrayBytesWrittenNumber
import typingsJapgolly.fsExtra.anon.BufferInt8Array
import typingsJapgolly.fsExtra.anon.BufferInt8ArrayBytesWrittenNumber
import typingsJapgolly.fsExtra.anon.BufferString
import typingsJapgolly.fsExtra.anon.BufferUint16Array
import typingsJapgolly.fsExtra.anon.BufferUint32Array
import typingsJapgolly.fsExtra.anon.BytesRead
import typingsJapgolly.fsExtra.anon.BytesWritten
import typingsJapgolly.fsExtra.anon.BytesWrittenNumber
import typingsJapgolly.fsExtra.anon.Encoding
import typingsJapgolly.fsExtra.anon.EncodingFlag
import typingsJapgolly.fsExtra.anon.EncodingWithFileTypes
import typingsJapgolly.fsExtra.anon.Flag
import typingsJapgolly.fsExtra.anon.Force
import typingsJapgolly.fsExtra.anon.WithFileTypes
import typingsJapgolly.fsExtra.anon.`0`
import typingsJapgolly.fsExtra.anon.`1`
import typingsJapgolly.fsExtra.fsExtraStrings.buffer
import typingsJapgolly.fsExtra.mod.^
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.NodeJS.TypedArray
import typingsJapgolly.node.anon.MakeDirectoryOptionsrecur
import typingsJapgolly.node.anon.MakeDirectoryOptionsrecurMode
import typingsJapgolly.node.anon.ObjectEncodingOptionsflag
import typingsJapgolly.node.anon.ObjectEncodingOptionsflagEncoding
import typingsJapgolly.node.anon.ObjectEncodingOptionswith
import typingsJapgolly.node.anon.ObjectEncodingOptionswithEncoding
import typingsJapgolly.node.anon.StatOptionsbigintfalseund
import typingsJapgolly.node.anon.StatOptionsbiginttrue
import typingsJapgolly.node.anon.WatchFileOptionsbigintfal
import typingsJapgolly.node.anon.WatchFileOptionsbiginttru
import typingsJapgolly.node.anon.WatchOptionsencodingbuffe
import typingsJapgolly.node.anon.encodingBufferEncodingflaEncoding
import typingsJapgolly.node.anon.encodingnullundefinedflagEncoding
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.fsMod.BigIntStats
import typingsJapgolly.node.fsMod.BufferEncodingOption
import typingsJapgolly.node.fsMod.CopySyncOptions
import typingsJapgolly.node.fsMod.EncodingOption
import typingsJapgolly.node.fsMod.FSWatcher
import typingsJapgolly.node.fsMod.MakeDirectoryOptions
import typingsJapgolly.node.fsMod.NoParamCallback
import typingsJapgolly.node.fsMod.OpenDirOptions
import typingsJapgolly.node.fsMod.OpenMode
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.PathOrFileDescriptor
import typingsJapgolly.node.fsMod.ReadAsyncOptions
import typingsJapgolly.node.fsMod.ReadPosition
import typingsJapgolly.node.fsMod.ReadStreamOptions
import typingsJapgolly.node.fsMod.ReadSyncOptions
import typingsJapgolly.node.fsMod.RmDirOptions
import typingsJapgolly.node.fsMod.RmOptions
import typingsJapgolly.node.fsMod.StatOptions
import typingsJapgolly.node.fsMod.StatSyncFn
import typingsJapgolly.node.fsMod.StatWatcher
import typingsJapgolly.node.fsMod.StreamOptions
import typingsJapgolly.node.fsMod.TimeLike
import typingsJapgolly.node.fsMod.WatchListener
import typingsJapgolly.node.fsMod.WatchOptions
import typingsJapgolly.node.fsMod.symlink.Type
import typingsJapgolly.node.nodeColonurlMod.URL
import typingsJapgolly.std.BigInt64Array
import typingsJapgolly.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def access(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def access(path: PathLike, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def access(path: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def access(
  path: PathLike,
  mode: Double,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def access(path: PathLike, mode: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def accessSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def accessSync(path: PathLike, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def appendFile(file: Double, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def appendFile(file: Double, data: Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFile(file: Double, data: Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def appendFile(file: Double, data: Any, options: Encoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def appendFile(file: Double, data: Any, options: Encoding, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFile(file: Double, data: Any, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def appendFile(file: PathLike, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def appendFile(file: PathLike, data: Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFile(file: PathLike, data: Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def appendFile(file: PathLike, data: Any, options: Encoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def appendFile(
  file: PathLike,
  data: Any,
  options: Encoding,
  callback: js.Function1[/* err */ ErrnoException, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFile(file: PathLike, data: Any, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def appendFile(file: PathOrFileDescriptor, data: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFile(file: PathOrFileDescriptor, data: js.typedarray.Uint8Array, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFile(
  path: PathOrFileDescriptor,
  data: String,
  options: typingsJapgolly.node.fsMod.WriteFileOptions,
  callback: NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFile(
  path: PathOrFileDescriptor,
  data: js.typedarray.Uint8Array,
  options: typingsJapgolly.node.fsMod.WriteFileOptions,
  callback: NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def appendFileSync(path: PathOrFileDescriptor, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFileSync(path: PathOrFileDescriptor, data: String, options: typingsJapgolly.node.fsMod.WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFileSync(
  path: PathOrFileDescriptor,
  data: js.typedarray.Uint8Array,
  options: typingsJapgolly.node.fsMod.WriteFileOptions
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def chmod(
  path: PathLike,
  mode: typingsJapgolly.node.fsMod.Mode | Mode,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def chmodSync(path: PathLike, mode: typingsJapgolly.node.fsMod.Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def chown(
  path: PathLike,
  uid: Double,
  gid: Double,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def chownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def close(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def close(fd: Double, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def closeSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def close_Promise(fd: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def copy(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def copy(src: String, dest: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def copy(src: String, dest: String, options: typingsJapgolly.node.fsMod.CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def copy(
  src: String,
  dest: String,
  options: typingsJapgolly.node.fsMod.CopyOptions,
  callback: js.Function1[/* err */ js.Error, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def copyFile(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def copyFile(src: String, dest: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def copyFile(src: String, dest: String, flags: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def copyFile(src: String, dest: String, flags: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def copyFile(src: PathLike, dest: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def copyFile(src: PathLike, dest: PathLike, mode: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def copyFileSync(src: PathLike, dest: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def copyFileSync(src: PathLike, dest: PathLike, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def copySync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def copySync(src: String, dest: String, options: CopyOptionsSync): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def cp(source: String, destination: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(
  source: String,
  destination: String,
  opts: typingsJapgolly.node.fsMod.CopyOptions,
  callback: js.Function1[/* err */ ErrnoException | Null, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(source: String, destination: URL, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(
  source: String,
  destination: URL,
  opts: typingsJapgolly.node.fsMod.CopyOptions,
  callback: js.Function1[/* err */ ErrnoException | Null, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(source: URL, destination: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(
  source: URL,
  destination: String,
  opts: typingsJapgolly.node.fsMod.CopyOptions,
  callback: js.Function1[/* err */ ErrnoException | Null, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(source: URL, destination: URL, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(
  source: URL,
  destination: URL,
  opts: typingsJapgolly.node.fsMod.CopyOptions,
  callback: js.Function1[/* err */ ErrnoException | Null, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def cpSync(source: String, destination: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: String, destination: String, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: String, destination: URL): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: String, destination: URL, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: URL, destination: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: URL, destination: String, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: URL, destination: URL): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: URL, destination: URL, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def createFile(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def createFile(file: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def createFileSync(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSync")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def createLink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def createLink(src: String, dest: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def createLinkSync: js.Function2[/* src */ String, /* dest */ String, Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("createLinkSync").asInstanceOf[js.Function2[/* src */ String, /* dest */ String, Unit]]

inline def createReadStream(path: PathLike): typingsJapgolly.node.fsMod.ReadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.fsMod.ReadStream]
inline def createReadStream(path: PathLike, options: BufferEncoding): typingsJapgolly.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.ReadStream]
inline def createReadStream(path: PathLike, options: ReadStreamOptions): typingsJapgolly.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.ReadStream]

inline def createSymlink(src: String, dest: String, `type`: SymlinkType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def createSymlink(src: String, dest: String, `type`: SymlinkType, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def createSymlinkSync(src: String, dest: String, `type`: SymlinkType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def createSymlink_Promise(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def createWriteStream(path: PathLike): typingsJapgolly.node.fsMod.WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.fsMod.WriteStream]
inline def createWriteStream(path: PathLike, options: BufferEncoding): typingsJapgolly.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.WriteStream]
inline def createWriteStream(path: PathLike, options: StreamOptions): typingsJapgolly.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.WriteStream]

inline def emptyDirSync_(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def emptyDir_(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def emptyDir_(path: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def emptydir(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def emptydir(path: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def emptydirSync: js.Function1[/* path */ String, Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("emptydirSync").asInstanceOf[js.Function1[/* path */ String, Unit]]

inline def ensureDir(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ensureDir(path: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ensureDir(path: String, options: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ensureDir(path: String, options: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ensureDir(path: String, options: Unit, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ensureDir(path: String, options: EnsureOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ensureDir(path: String, options: EnsureOptions, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ensureDirSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ensureDirSync(path: String, options: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ensureDirSync(path: String, options: EnsureOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ensureDir_Promise(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def ensureDir_Promise(path: String, options: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ensureDir_Promise(path: String, options: EnsureOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def ensureFile(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def ensureFile(path: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ensureFileSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ensureLink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ensureLink(src: String, dest: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ensureLinkSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ensureSymlink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ensureSymlink(src: String, dest: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ensureSymlink(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ensureSymlink(src: String, dest: String, `type`: SymlinkType, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ensureSymlinkSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ensureSymlinkSync(src: String, dest: String, `type`: SymlinkType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def exists(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def existsSync(path: PathLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def fchmod(
  fd: Double,
  mode: typingsJapgolly.node.fsMod.Mode | Mode,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def fchmod(fd: Double, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def fchmodSync(fd: Double, mode: typingsJapgolly.node.fsMod.Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fchown(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def fchown(
  fd: Double,
  uid: Double,
  gid: Double,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fchownSync(fd: Double, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fdatasync(fd: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def fdatasync(fd: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def fdatasync(fd: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fdatasyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fdatasyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def fstat(fd: Double): js.Promise[typingsJapgolly.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.node.fsMod.Stats]]
inline def fstat(
  fd: Double,
  callback: js.Function2[
  (/* err */ ErrnoException) | Null, 
  /* stats */ typingsJapgolly.node.fsMod.Stats, 
  Any | Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def fstat(
  fd: Double,
  options: Unit,
  callback: js.Function2[ErrnoException | Null, BigIntStats | typingsJapgolly.node.fsMod.Stats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def fstat(
  fd: Double,
  options: StatOptionsbigintfalseund,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typingsJapgolly.node.fsMod.Stats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def fstat(
  fd: Double,
  options: StatOptionsbiginttrue,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def fstat(
  fd: Double,
  options: StatOptions,
  callback: js.Function2[
  /* err */ ErrnoException | Null, 
  /* stats */ typingsJapgolly.node.fsMod.Stats | BigIntStats, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fstatSync(fd: Double): typingsJapgolly.node.fsMod.Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.fsMod.Stats]
inline def fstatSync(fd: Double, options: StatOptionsbigintfalseund): typingsJapgolly.node.fsMod.Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.Stats]
inline def fstatSync(fd: Double, options: StatOptionsbiginttrue): BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BigIntStats]
inline def fstatSync(fd: Double, options: StatOptions): typingsJapgolly.node.fsMod.Stats | BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.Stats | BigIntStats]

inline def fstatSync_Union(fd: Double): typingsJapgolly.node.fsMod.Stats | BigIntStats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.fsMod.Stats | BigIntStats]

inline def fsync(fd: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def fsync(fd: Double, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fsyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ftruncate(fd: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def ftruncate(fd: Double, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ftruncate(fd: Double, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ftruncate(
  fd: Double,
  len: Double,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ftruncate(fd: Double, len: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ftruncate(fd: Double, len: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ftruncateSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ftruncateSync(fd: Double, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def futimes(fd: Double, atime: js.Date, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def futimes(fd: Double, atime: js.Date, mtime: js.Date, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def futimes(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def futimes(fd: Double, atime: Double, mtime: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def futimes(fd: Double, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def futimesSync(fd: Double, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lchmod(path: PathLike, mode: typingsJapgolly.node.fsMod.Mode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lchmodSync(path: PathLike, mode: typingsJapgolly.node.fsMod.Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def lchown(
  path: PathLike,
  uid: Double,
  gid: Double,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def link(
  existingPath: PathLike,
  newPath: PathLike,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def linkSync(existingPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lstat(path: PathLike): js.Promise[typingsJapgolly.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.node.fsMod.Stats]]
inline def lstat(
  path: PathLike,
  callback: js.Function2[
  (/* err */ ErrnoException) | Null, 
  /* stats */ typingsJapgolly.node.fsMod.Stats, 
  Any | Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lstat(
  path: PathLike,
  options: Unit,
  callback: js.Function2[ErrnoException | Null, BigIntStats | typingsJapgolly.node.fsMod.Stats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lstat(
  path: PathLike,
  options: StatOptionsbigintfalseund,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typingsJapgolly.node.fsMod.Stats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lstat(
  path: PathLike,
  options: StatOptionsbiginttrue,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lstat(
  path: PathLike,
  options: StatOptions,
  callback: js.Function2[
  /* err */ ErrnoException | Null, 
  /* stats */ typingsJapgolly.node.fsMod.Stats | BigIntStats, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lstatSync: StatSyncFn = ^.asInstanceOf[js.Dynamic].selectDynamic("lstatSync").asInstanceOf[StatSyncFn]

inline def lutimes(path: PathLike, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lutimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mkdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def mkdir(path: PathLike, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: typingsJapgolly.node.fsMod.Mode | Mode,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: Null,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: Null,
  callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: Unit,
  callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(path: PathLike, options: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(path: PathLike, options: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: MakeDirectoryOptionsrecur,
  callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def mkdir(
  path: PathLike,
  options: MakeDirectoryOptions,
  callback: js.Function1[/* err */ ErrnoException, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: MakeDirectoryOptions,
  callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: typingsJapgolly.node.fsMod.Mode,
  callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mkdirSync(path: PathLike): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def mkdirSync(path: PathLike, options: typingsJapgolly.node.fsMod.Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]

inline def mkdirSync_Unit(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def mkdirSync_Unit(path: PathLike, options: typingsJapgolly.node.fsMod.Mode | Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdirSync_Unit(path: PathLike, options: MakeDirectoryOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mkdirp(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def mkdirp(dir: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mkdirpSync(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpSync")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def mkdirs(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def mkdirs(dir: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mkdirsSync(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirsSync")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def mkdtemp(prefix: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def mkdtemp(
  prefix: String,
  callback: js.Function2[(/* err */ ErrnoException) | Null, /* folder */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdtemp(
  prefix: String,
  options: buffer,
  callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdtemp(
  prefix: String,
  options: typingsJapgolly.node.anon.Encoding,
  callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdtemp(
  prefix: String,
  options: EncodingOption,
  callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mkdtempSync(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
inline def mkdtempSync(prefix: String, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def mkdtempSync(prefix: String, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def mkdtempSync_Union(prefix: String): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
inline def mkdtempSync_Union(prefix: String, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]

inline def move(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def move(src: String, dest: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def move(src: String, dest: String, options: MoveOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def move(src: String, dest: String, options: MoveOptions, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def moveSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def moveSync(src: String, dest: String, options: MoveOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def open(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(path: PathLike, flags: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
inline def open(
  path: PathLike,
  flags: String,
  callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(path: PathLike, flags: String, mode: Mode): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
inline def open(
  path: PathLike,
  flags: String,
  mode: Mode,
  callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(path: PathLike, flags: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
inline def open(
  path: PathLike,
  flags: Double,
  callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(path: PathLike, flags: Double, mode: Mode): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
inline def open(
  path: PathLike,
  flags: Double,
  mode: Mode,
  callback: js.Function2[/* err */ ErrnoException, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: Unit,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: Unit,
  mode: Null,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: Unit,
  mode: Unit,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: Unit,
  mode: typingsJapgolly.node.fsMod.Mode,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: OpenMode,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: OpenMode,
  mode: Null,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: OpenMode,
  mode: Unit,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: OpenMode,
  mode: typingsJapgolly.node.fsMod.Mode,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def openSync(path: PathLike, flags: OpenMode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def openSync(path: PathLike, flags: OpenMode, mode: typingsJapgolly.node.fsMod.Mode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def opendir(path: String): js.Promise[typingsJapgolly.node.fsMod.Dir] = ^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.node.fsMod.Dir]]
inline def opendir(
  path: String,
  cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typingsJapgolly.node.fsMod.Dir, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def opendir(path: String, options: OpenDirOptions): js.Promise[typingsJapgolly.node.fsMod.Dir] = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.node.fsMod.Dir]]
inline def opendir(
  path: String,
  options: OpenDirOptions,
  cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typingsJapgolly.node.fsMod.Dir, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def opendir(
  path: PathLike,
  cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typingsJapgolly.node.fsMod.Dir, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def opendir(
  path: PathLike,
  options: OpenDirOptions,
  cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typingsJapgolly.node.fsMod.Dir, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def opendirSync(path: PathLike): typingsJapgolly.node.fsMod.Dir = ^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.fsMod.Dir]
inline def opendirSync(path: PathLike, options: OpenDirOptions): typingsJapgolly.node.fsMod.Dir = (^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.Dir]

inline def outputFile(file: String, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputFile(file: String, data: Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputFile(file: String, data: Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputFile(file: String, data: Any, options: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputFile(file: String, data: Any, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputFile(file: String, data: Any, options: typingsJapgolly.node.fsMod.WriteFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputFile(
  file: String,
  data: Any,
  options: typingsJapgolly.node.fsMod.WriteFileOptions,
  callback: js.Function1[/* err */ js.Error, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def outputFileSync(file: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputFileSync(file: String, data: Any, options: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputFileSync(file: String, data: Any, options: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputFileSync(file: String, data: Any, options: typingsJapgolly.node.fsMod.WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def outputJSONSync_(file: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJSONSync_(file: String, data: Any, options: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJSONSync_(file: String, data: Any, options: WriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJSONSync_(file: String, data: Any, options: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def outputJSON_(file: String, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputJSON_(file: String, data: Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJSON_(file: String, data: Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputJSON_(file: String, data: Any, options: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJSON_(file: String, data: Any, options: WriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputJSON_(file: String, data: Any, options: WriteOptions, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJSON_(file: String, data: Any, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputJSON_(file: String, data: Any, options: BufferEncoding, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def outputJson(file: String, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputJson(file: String, data: Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJson(file: String, data: Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputJson(file: String, data: Any, options: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJson(file: String, data: Any, options: WriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputJson(file: String, data: Any, options: WriteOptions, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJson(file: String, data: Any, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def outputJson(file: String, data: Any, options: BufferEncoding, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def outputJsonSync(file: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJsonSync(file: String, data: Any, options: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJsonSync(file: String, data: Any, options: WriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def outputJsonSync(file: String, data: Any, options: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def pathExists(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
inline def pathExists(path: String, callback: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def pathExistsSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExistsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def read(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double): js.Promise[BufferDataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataView]]
inline def read(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataView]]
inline def read(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32Array]]
inline def read(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32Array]]
inline def read(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64Array]]
inline def read(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64Array]]
inline def read(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double): js.Promise[BufferInt16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16Array]]
inline def read(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16Array]]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double): js.Promise[BufferInt32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32Array]]
inline def read(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32Array]]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double): js.Promise[BufferInt8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8Array]]
inline def read(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8Array]]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double): js.Promise[BufferBytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesRead]]
inline def read(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferBytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesRead]]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double): js.Promise[BufferUint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint32Array]]
inline def read(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint32Array]]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[typingsJapgolly.fsExtra.anon.Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.fsExtra.anon.Buffer]]
inline def read(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[typingsJapgolly.fsExtra.anon.Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.fsExtra.anon.Buffer]]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Double): js.Promise[BytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesRead]]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: Double
): js.Promise[BytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesRead]]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(fd: Double, buffer: BigInt64Array, offset: Double, length: Double): js.Promise[BufferBigInt64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigInt64Array]]
inline def read(fd: Double, buffer: BigInt64Array, offset: Double, length: Double, position: Double): js.Promise[BufferBigInt64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigInt64Array]]
inline def read(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ BigInt64Array, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(fd: Double, buffer: BigUint64Array, offset: Double, length: Double): js.Promise[BufferBigUint64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigUint64Array]]
inline def read(fd: Double, buffer: BigUint64Array, offset: Double, length: Double, position: Double): js.Promise[BufferBigUint64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigUint64Array]]
inline def read(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ BigUint64Array, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* bytesRead */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ typingsJapgolly.node.NodeJS.ArrayBufferView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read[TBuffer /* <: typingsJapgolly.node.NodeJS.ArrayBufferView */](
  fd: Double,
  options: ReadAsyncOptions[TBuffer],
  callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ TBuffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readFile(file: Double): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
inline def readFile(file: Double, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(file: Double, encoding: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def readFile(
  file: Double,
  encoding: String,
  callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(file: Double, encoding: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def readFile(
  file: Double,
  encoding: BufferEncoding,
  callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(file: Double, options: EncodingFlag): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def readFile(
  file: Double,
  options: EncodingFlag,
  callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(file: Double, options: Flag): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def readFile(
  file: Double,
  options: Flag,
  callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(file: PathLike): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
inline def readFile(file: PathLike, encoding: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def readFile(
  file: PathLike,
  encoding: String,
  callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(file: PathLike, encoding: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def readFile(file: PathLike, options: EncodingFlag): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def readFile(
  file: PathLike,
  options: EncodingFlag,
  callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(file: PathLike, options: Flag): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def readFile(
  file: PathLike,
  options: Flag,
  callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathLike | PathOrFileDescriptor,
  callback: js.Function2[(/* err */ ErrnoException) | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathLike | PathOrFileDescriptor,
  options: BufferEncoding,
  callback: js.Function2[(/* err */ ErrnoException) | Null, Buffer | (/* data */ String), Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathOrFileDescriptor,
  options: Null,
  callback: js.Function2[ErrnoException | Null, Buffer | String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathOrFileDescriptor,
  options: Unit,
  callback: js.Function2[ErrnoException | Null, Buffer | String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathOrFileDescriptor,
  options: ObjectEncodingOptionsflag,
  callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathOrFileDescriptor,
  options: encodingBufferEncodingflaEncoding,
  callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathOrFileDescriptor,
  options: encodingnullundefinedflagEncoding,
  callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readFileSync(path: PathOrFileDescriptor): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
inline def readFileSync(path: PathOrFileDescriptor, options: typingsJapgolly.node.anon.EncodingFlag): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def readFileSync(path: PathOrFileDescriptor, options: typingsJapgolly.node.anon.Flag): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def readFileSync(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
inline def readFileSync(path: PathOrFileDescriptor, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def readFileSync_Buffer(path: PathOrFileDescriptor): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Buffer]

inline def readFileSync_Union(path: PathOrFileDescriptor, options: BufferEncoding): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]

inline def readJSONSync_(file: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def readJSONSync_(file: String, options: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def readJSONSync_(file: String, options: ReadOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def readJSONSync_(file: String, options: BufferEncoding): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def readJSON_(file: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
inline def readJSON_(file: String, callback: js.Function2[/* err */ js.Error, /* jsonObject */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readJSON_(file: String, options: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
inline def readJSON_(
  file: String,
  options: String,
  callback: js.Function2[/* err */ js.Error, /* jsonObject */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readJSON_(file: String, options: ReadOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
inline def readJSON_(
  file: String,
  options: ReadOptions,
  callback: js.Function2[/* err */ js.Error, /* jsonObject */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readJSON_(file: String, options: BufferEncoding): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
inline def readJSON_(
  file: String,
  options: BufferEncoding,
  callback: js.Function2[/* err */ js.Error, /* jsonObject */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readJson(file: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
inline def readJson(file: String, callback: js.Function2[/* err */ js.Error, /* jsonObject */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readJson(file: String, options: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
inline def readJson(
  file: String,
  options: String,
  callback: js.Function2[/* err */ js.Error, /* jsonObject */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readJson(file: String, options: ReadOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
inline def readJson(
  file: String,
  options: ReadOptions,
  callback: js.Function2[/* err */ js.Error, /* jsonObject */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readJson(file: String, options: BufferEncoding): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
inline def readJson(
  file: String,
  options: BufferEncoding,
  callback: js.Function2[/* err */ js.Error, /* jsonObject */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readJsonSync(file: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def readJsonSync(file: String, options: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def readJsonSync(file: String, options: ReadOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def readJsonSync(file: String, options: BufferEncoding): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def readSync(fd: Double, buffer: typingsJapgolly.node.NodeJS.ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def readSync(fd: Double, buffer: typingsJapgolly.node.NodeJS.ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def readSync(
  fd: Double,
  buffer: typingsJapgolly.node.NodeJS.ArrayBufferView,
  offset: Double,
  length: Double,
  position: ReadPosition
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def readSync(fd: Double, buffer: typingsJapgolly.node.NodeJS.ArrayBufferView, opts: ReadSyncOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def readdir(path: PathLike): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
inline def readdir(
  path: PathLike,
  callback: js.Function2[(/* err */ ErrnoException) | Null, /* files */ js.Array[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(path: PathLike, options: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
inline def readdir(
  path: PathLike,
  options: Null,
  callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: Unit,
  callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(path: PathLike, options: EncodingWithFileTypes): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
inline def readdir(path: PathLike, options: WithFileTypes): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
inline def readdir(path: PathLike, options: `0`): js.Promise[js.Array[Buffer | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer | String]]]
inline def readdir(path: PathLike, options: `1`): js.Promise[js.Array[typingsJapgolly.node.fsMod.Dirent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typingsJapgolly.node.fsMod.Dirent]]]
inline def readdir(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
inline def readdir(
  path: PathLike,
  options: buffer,
  callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: typingsJapgolly.node.anon.EncodingWithFileTypes,
  callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: ObjectEncodingOptionswithEncoding,
  callback: js.Function2[
  /* err */ ErrnoException | Null, 
  /* files */ js.Array[typingsJapgolly.node.fsMod.Dirent], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: ObjectEncodingOptionswith,
  callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: typingsJapgolly.node.anon.WithFileTypes,
  callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
inline def readdir(
  path: PathLike,
  options: BufferEncoding,
  callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readdirSync(path: PathLike): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
inline def readdirSync(path: PathLike, options: typingsJapgolly.node.anon.EncodingWithFileTypes): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
inline def readdirSync(path: PathLike, options: ObjectEncodingOptionswith): js.Array[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer | String]]
inline def readdirSync(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Array[typingsJapgolly.node.fsMod.Dirent] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.node.fsMod.Dirent]]
inline def readdirSync(path: PathLike, options: typingsJapgolly.node.anon.WithFileTypes): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
inline def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]

inline def readlink(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def readlink(
  path: PathLike,
  callback: js.Function2[(/* err */ ErrnoException) | Null, /* linkString */ String, Any | Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readlink(
  path: PathLike,
  options: BufferEncodingOption,
  callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readlink(
  path: PathLike,
  options: EncodingOption,
  callback: js.Function2[ErrnoException | Null, Buffer | (/* linkString */ String), Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readlinkSync(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
inline def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def readlinkSync(path: PathLike, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def readlinkSync_Union(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
inline def readlinkSync_Union(path: PathLike, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]

inline def readv(
  fd: Double,
  buffers: js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView],
  cb: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffers */ js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readv(
  fd: Double,
  buffers: js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView],
  position: Double,
  cb: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffers */ js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readvSync(fd: Double, buffers: js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def readvSync(fd: Double, buffers: js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def remove(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def remove(dir: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeSync(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSync")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def remove_Promise(dir: String, callback: js.Function1[/* err */ js.Error, Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def rename(
  oldPath: PathLike,
  newPath: PathLike,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def renameSync(oldPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def rm(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def rm(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def rm(path: PathLike, options: Force): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def rm(path: PathLike, options: RmOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def rmSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def rmSync(path: PathLike, options: RmOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def rmdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def rmdir(path: PathLike, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def rmdir(path: PathLike, options: RmDirOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def rmdirSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def rmdirSync(path: PathLike, options: RmDirOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def stat(path: PathLike): js.Promise[typingsJapgolly.node.fsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.node.fsMod.Stats]]
inline def stat(
  path: PathLike,
  callback: js.Function2[
  (/* err */ ErrnoException) | Null, 
  /* stats */ typingsJapgolly.node.fsMod.Stats, 
  Any | Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def stat(
  path: PathLike,
  options: Unit,
  callback: js.Function2[ErrnoException | Null, BigIntStats | typingsJapgolly.node.fsMod.Stats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def stat(
  path: PathLike,
  options: StatOptionsbigintfalseund,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typingsJapgolly.node.fsMod.Stats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def stat(
  path: PathLike,
  options: StatOptionsbiginttrue,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def stat(
  path: PathLike,
  options: StatOptions,
  callback: js.Function2[
  /* err */ ErrnoException | Null, 
  /* stats */ typingsJapgolly.node.fsMod.Stats | BigIntStats, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def statSync: StatSyncFn = ^.asInstanceOf[js.Dynamic].selectDynamic("statSync").asInstanceOf[StatSyncFn]

inline def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def symlink(
  target: PathLike,
  path: PathLike,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def symlink(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def symlink(
  target: PathLike,
  path: PathLike,
  `type`: Unit,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def symlink(target: PathLike, path: PathLike, `type`: SymlinkType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def symlink(
  target: PathLike,
  path: PathLike,
  `type`: SymlinkType,
  callback: js.Function1[/* err */ ErrnoException, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def symlink(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def symlinkSync(target: PathLike, path: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def truncate(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def truncate(path: PathLike, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def truncate(path: PathLike, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def truncate(
  path: PathLike,
  len: Double,
  callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def truncate(path: PathLike, len: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def truncate(path: PathLike, len: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def truncateSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def truncateSync(path: PathLike, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unlink(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def unlink(path: PathLike, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unlinkSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def unwatchFile(filename: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def unwatchFile(
  filename: PathLike,
  listener: js.Function2[
  /* curr */ typingsJapgolly.node.fsMod.Stats, 
  /* prev */ typingsJapgolly.node.fsMod.Stats, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def utimes(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def utimes(
  path: PathLike,
  atime: js.Date,
  mtime: js.Date,
  callback: js.Function1[/* err */ ErrnoException, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def utimes(
  path: PathLike,
  atime: Double,
  mtime: Double,
  callback: js.Function1[/* err */ ErrnoException, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def utimes(path: PathLike, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def utimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def watch(filename: PathLike): FSWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: String): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: String, listener: WatchListener[String | Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: Null, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: Unit, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: WatchOptionsencodingbuffe): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: WatchOptionsencodingbuffe, listener: WatchListener[Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: BufferEncoding): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: BufferEncoding, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: WatchOptions): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: WatchOptions, listener: WatchListener[Buffer | String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]

inline def watchFile(
  filename: PathLike,
  listener: js.Function2[
  /* curr */ typingsJapgolly.node.fsMod.Stats, 
  /* prev */ typingsJapgolly.node.fsMod.Stats, 
  Unit
]
): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
inline def watchFile(
  filename: PathLike,
  options: Unit,
  listener: js.Function2[
  (/* curr */ BigIntStats) | (/* curr */ typingsJapgolly.node.fsMod.Stats), 
  (/* prev */ BigIntStats) | (/* prev */ typingsJapgolly.node.fsMod.Stats), 
  Unit
]
): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
inline def watchFile(
  filename: PathLike,
  options: WatchFileOptionsbigintfal,
  listener: js.Function2[
  /* curr */ typingsJapgolly.node.fsMod.Stats, 
  /* prev */ typingsJapgolly.node.fsMod.Stats, 
  Unit
]
): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
inline def watchFile(
  filename: PathLike,
  options: WatchFileOptionsbiginttru,
  listener: js.Function2[/* curr */ BigIntStats, /* prev */ BigIntStats, Unit]
): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]

inline def watch_buffer(filename: PathLike, options: buffer): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch_buffer(filename: PathLike, options: buffer, listener: WatchListener[Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]

inline def write(fd: Double, buffer: js.typedarray.DataView): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.DataView, offset: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.DataView, offset: Double, length: Unit, position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.DataView, offset: Unit, length: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.DataView, offset: Unit, length: Double, position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.DataView, offset: Unit, length: Unit, position: Double): js.Promise[BufferDataViewBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferDataViewBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float32Array): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float32Array, offset: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float32Array, offset: Double, length: Unit, position: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float32Array, offset: Unit, length: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float32Array, offset: Unit, length: Double, position: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float32Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferFloat32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float64Array): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float64Array, offset: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float64Array, offset: Double, length: Unit, position: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float64Array, offset: Unit, length: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float64Array, offset: Unit, length: Double, position: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Float64Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferFloat64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferFloat64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int16Array): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int16Array, offset: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int16Array, offset: Double, length: Unit, position: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int16Array, offset: Unit, length: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int16Array, offset: Unit, length: Double, position: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int16Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferInt16ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt16ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int32Array): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int32Array, offset: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int32Array, offset: Double, length: Unit, position: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int32Array, offset: Unit, length: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int32Array, offset: Unit, length: Double, position: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int32Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferInt32ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt32ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int8Array): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int8Array, offset: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int8Array, offset: Double, length: Unit, position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int8Array, offset: Unit, length: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int8Array, offset: Unit, length: Double, position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Int8Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferInt8ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferInt8ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint16Array): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint16Array, offset: Double, length: Unit, position: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint16Array, offset: Unit, length: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint16Array, offset: Unit, length: Double, position: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint16Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferUint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferUint16Array]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint32Array): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint32Array, offset: Double, length: Unit, position: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint32Array, offset: Unit, length: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint32Array, offset: Unit, length: Double, position: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint32Array, offset: Unit, length: Unit, position: Double): js.Promise[BytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8Array): js.Promise[BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double): js.Promise[BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Unit, position: Double): js.Promise[BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8Array, offset: Unit, length: Double): js.Promise[BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8Array, offset: Unit, length: Double, position: Double): js.Promise[BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8Array, offset: Unit, length: Unit, position: Double): js.Promise[BytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8ClampedArray): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Double): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: Double
): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Unit,
  position: Double
): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Unit, length: Double): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Double,
  position: Double
): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: js.typedarray.Uint8ClampedArray, offset: Unit, length: Unit, position: Double): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigInt64Array): js.Promise[BufferBigInt64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigInt64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigInt64Array, offset: Double): js.Promise[BufferBigInt64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigInt64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigInt64Array, offset: Double, length: Double): js.Promise[BufferBigInt64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigInt64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigInt64Array, offset: Double, length: Double, position: Double): js.Promise[BufferBigInt64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigInt64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigInt64Array, offset: Double, length: Unit, position: Double): js.Promise[BufferBigInt64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigInt64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigInt64Array, offset: Unit, length: Double): js.Promise[BufferBigInt64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigInt64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigInt64Array, offset: Unit, length: Double, position: Double): js.Promise[BufferBigInt64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigInt64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigInt64Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferBigInt64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigInt64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigUint64Array): js.Promise[BufferBigUint64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigUint64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigUint64Array, offset: Double): js.Promise[BufferBigUint64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigUint64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigUint64Array, offset: Double, length: Double): js.Promise[BufferBigUint64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigUint64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigUint64Array, offset: Double, length: Double, position: Double): js.Promise[BufferBigUint64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigUint64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  (/* err */ ErrnoException) | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigUint64Array, offset: Double, length: Unit, position: Double): js.Promise[BufferBigUint64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigUint64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigUint64Array, offset: Unit, length: Double): js.Promise[BufferBigUint64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigUint64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigUint64Array, offset: Unit, length: Double, position: Double): js.Promise[BufferBigUint64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigUint64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, buffer: BigUint64Array, offset: Unit, length: Unit, position: Double): js.Promise[BufferBigUint64ArrayBytesWrittenNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBigUint64ArrayBytesWrittenNumber]]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, data: Any): js.Promise[BufferString] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferString]]
inline def write(
  fd: Double,
  data: Any,
  callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, data: Any, offset: Double): js.Promise[BufferString] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferString]]
inline def write(
  fd: Double,
  data: Any,
  offset: Double,
  callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, data: Any, offset: Double, encoding: String): js.Promise[BufferString] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferString]]
inline def write(
  fd: Double,
  data: Any,
  offset: Double,
  encoding: String,
  callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, data: Any, offset: Double, encoding: BufferEncoding): js.Promise[BufferString] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferString]]
inline def write(
  fd: Double,
  data: Any,
  offset: Double,
  encoding: BufferEncoding,
  callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(fd: Double, data: Any, offset: Unit, encoding: String): js.Promise[BufferString] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferString]]
inline def write(fd: Double, data: Any, offset: Unit, encoding: BufferEncoding): js.Promise[BufferString] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferString]]
inline def write(
  fd: Double,
  string: String,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Double,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Double,
  encoding: Null,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Double,
  encoding: Unit,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Double,
  encoding: BufferEncoding,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Null,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Null,
  encoding: Null,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Null,
  encoding: Unit,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Null,
  encoding: BufferEncoding,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Unit,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Unit,
  encoding: Null,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Unit,
  encoding: Unit,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Unit,
  encoding: BufferEncoding,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeFile(file: Double, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeFile(file: Double, data: Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(file: Double, data: Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeFile(file: Double, data: Any, options: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(file: Double, data: Any, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeFile(
  file: Double,
  data: Any,
  options: BufferEncoding,
  callback: js.Function1[/* err */ ErrnoException, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(file: Double, data: Any, options: typingsJapgolly.node.fsMod.WriteFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeFile(
  file: Double,
  data: Any,
  options: typingsJapgolly.node.fsMod.WriteFileOptions,
  callback: js.Function1[/* err */ ErrnoException, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(file: PathLike, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeFile(file: PathLike, data: Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(file: PathLike, data: Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeFile(file: PathLike, data: Any, options: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(file: PathLike, data: Any, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeFile(
  file: PathLike,
  data: Any,
  options: BufferEncoding,
  callback: js.Function1[/* err */ ErrnoException, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(file: PathLike, data: Any, options: typingsJapgolly.node.fsMod.WriteFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeFile(
  file: PathLike,
  data: Any,
  options: typingsJapgolly.node.fsMod.WriteFileOptions,
  callback: js.Function1[/* err */ ErrnoException, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(
  file: PathOrFileDescriptor,
  data: String,
  options: typingsJapgolly.node.fsMod.WriteFileOptions,
  callback: NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(
  file: PathOrFileDescriptor,
  data: typingsJapgolly.node.NodeJS.ArrayBufferView,
  options: typingsJapgolly.node.fsMod.WriteFileOptions,
  callback: NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(path: PathOrFileDescriptor, data: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(
  path: PathOrFileDescriptor,
  data: typingsJapgolly.node.NodeJS.ArrayBufferView,
  callback: NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeFileSync(file: PathOrFileDescriptor, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFileSync(file: PathOrFileDescriptor, data: String, options: typingsJapgolly.node.fsMod.WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFileSync(file: PathOrFileDescriptor, data: typingsJapgolly.node.NodeJS.ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFileSync(
  file: PathOrFileDescriptor,
  data: typingsJapgolly.node.NodeJS.ArrayBufferView,
  options: typingsJapgolly.node.fsMod.WriteFileOptions
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeJSONSync_(file: String, `object`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJSONSync_(file: String, `object`: Any, options: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJSONSync_(file: String, `object`: Any, options: WriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJSONSync_(file: String, `object`: Any, options: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeJSON_(file: String, `object`: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeJSON_(file: String, `object`: Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJSON_(file: String, `object`: Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeJSON_(file: String, `object`: Any, options: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJSON_(file: String, `object`: Any, options: WriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeJSON_(
  file: String,
  `object`: Any,
  options: WriteOptions,
  callback: js.Function1[/* err */ js.Error, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJSON_(file: String, `object`: Any, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeJSON_(
  file: String,
  `object`: Any,
  options: BufferEncoding,
  callback: js.Function1[/* err */ js.Error, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeJson(file: String, `object`: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeJson(file: String, `object`: Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJson(file: String, `object`: Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeJson(file: String, `object`: Any, options: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJson(file: String, `object`: Any, options: WriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeJson(
  file: String,
  `object`: Any,
  options: WriteOptions,
  callback: js.Function1[/* err */ js.Error, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJson(file: String, `object`: Any, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeJson(
  file: String,
  `object`: Any,
  options: BufferEncoding,
  callback: js.Function1[/* err */ js.Error, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeJsonSync(file: String, `object`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJsonSync(file: String, `object`: Any, options: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJsonSync(file: String, `object`: Any, options: WriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeJsonSync(file: String, `object`: Any, options: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeSync(fd: Double, buffer: typingsJapgolly.node.NodeJS.ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: typingsJapgolly.node.NodeJS.ArrayBufferView, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: typingsJapgolly.node.NodeJS.ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(
  fd: Double,
  buffer: typingsJapgolly.node.NodeJS.ArrayBufferView,
  offset: Double,
  length: Double,
  position: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(
  fd: Double,
  buffer: typingsJapgolly.node.NodeJS.ArrayBufferView,
  offset: Double,
  length: Null,
  position: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(
  fd: Double,
  buffer: typingsJapgolly.node.NodeJS.ArrayBufferView,
  offset: Double,
  length: Unit,
  position: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: typingsJapgolly.node.NodeJS.ArrayBufferView, offset: Null, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(
  fd: Double,
  buffer: typingsJapgolly.node.NodeJS.ArrayBufferView,
  offset: Null,
  length: Double,
  position: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(
  fd: Double,
  buffer: typingsJapgolly.node.NodeJS.ArrayBufferView,
  offset: Null,
  length: Null,
  position: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(
  fd: Double,
  buffer: typingsJapgolly.node.NodeJS.ArrayBufferView,
  offset: Null,
  length: Unit,
  position: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: typingsJapgolly.node.NodeJS.ArrayBufferView, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(
  fd: Double,
  buffer: typingsJapgolly.node.NodeJS.ArrayBufferView,
  offset: Unit,
  length: Double,
  position: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(
  fd: Double,
  buffer: typingsJapgolly.node.NodeJS.ArrayBufferView,
  offset: Unit,
  length: Null,
  position: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(
  fd: Double,
  buffer: typingsJapgolly.node.NodeJS.ArrayBufferView,
  offset: Unit,
  length: Unit,
  position: Double
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, string: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, string: String, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, string: String, position: Unit, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def writev(fd: Double, buffers: js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView]): js.Promise[WritevResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WritevResult]]
inline def writev(
  fd: Double,
  buffers: js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView],
  cb: js.Function3[
  ErrnoException | Null, 
  /* bytesWritten */ Double, 
  /* buffers */ js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writev(fd: Double, buffers: js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView], position: Double): js.Promise[WritevResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WritevResult]]
inline def writev(
  fd: Double,
  buffers: js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView],
  position: Double,
  cb: js.Function3[
  ErrnoException | Null, 
  /* bytesWritten */ Double, 
  /* buffers */ js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writevSync(fd: Double, buffers: js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writevSync(fd: Double, buffers: js.Array[typingsJapgolly.node.NodeJS.ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]

type ArrayBufferView = TypedArray | js.typedarray.DataView

type CopyFilterAsync = js.Function2[/* src */ String, /* dest */ String, js.Promise[Boolean]]

type CopyFilterSync = js.Function2[/* src */ String, /* dest */ String, Boolean]

type Mode = String | Double
