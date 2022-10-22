package typingsJapgolly.hexoFs

import typingsJapgolly.chokidar.mod.FSWatcher
import typingsJapgolly.chokidar.mod.WatchOptions
import typingsJapgolly.hexoFs.anon.AutoClose
import typingsJapgolly.hexoFs.anon.BufferBytesWritten
import typingsJapgolly.hexoFs.anon.BytesRead
import typingsJapgolly.hexoFs.anon.BytesWritten
import typingsJapgolly.hexoFs.anon.DirectoryOptionsexcludeAr
import typingsJapgolly.hexoFs.anon.Encoding
import typingsJapgolly.hexoFs.anon.Flag
import typingsJapgolly.hexoFs.anon.`0`
import typingsJapgolly.hexoFs.anon.`1`
import typingsJapgolly.hexoFs.anon.`2`
import typingsJapgolly.hexoFs.anon.`3`
import typingsJapgolly.hexoFs.hexoFsStrings.buffer
import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.anon.EncodingWithFileTypes
import typingsJapgolly.node.anon.MakeDirectoryOptionsrecur
import typingsJapgolly.node.anon.MakeDirectoryOptionsrecurMode
import typingsJapgolly.node.anon.ObjectEncodingOptionswith
import typingsJapgolly.node.anon.ObjectEncodingOptionswithEncoding
import typingsJapgolly.node.anon.StatOptionsbigintfalseund
import typingsJapgolly.node.anon.StatOptionsbiginttrue
import typingsJapgolly.node.anon.WatchFileOptionsbigintfal
import typingsJapgolly.node.anon.WatchFileOptionsbiginttru
import typingsJapgolly.node.anon.WithFileTypes
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.fsMod.BigIntStats
import typingsJapgolly.node.fsMod.BufferEncodingOption
import typingsJapgolly.node.fsMod.Dirent
import typingsJapgolly.node.fsMod.EncodingOption
import typingsJapgolly.node.fsMod.MakeDirectoryOptions
import typingsJapgolly.node.fsMod.Mode
import typingsJapgolly.node.fsMod.OpenMode
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.ReadPosition
import typingsJapgolly.node.fsMod.ReadStreamOptions
import typingsJapgolly.node.fsMod.ReadSyncOptions
import typingsJapgolly.node.fsMod.StatOptions
import typingsJapgolly.node.fsMod.StatSyncFn
import typingsJapgolly.node.fsMod.StatWatcher
import typingsJapgolly.node.fsMod.StreamOptions
import typingsJapgolly.node.fsMod.TimeLike
import typingsJapgolly.node.fsMod.symlink.Type
import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hexo-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hexo-fs", "F_OK")
  @js.native
  def F_OK: js.UndefOr[Double] = js.native
  inline def F_OK_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("hexo-fs", "R_OK")
  @js.native
  def R_OK: js.UndefOr[Double] = js.native
  inline def R_OK_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("R_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("hexo-fs", "ReadStream")
  @js.native
  open class ReadStream ()
    extends typingsJapgolly.gracefulFs.mod.ReadStream {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("hexo-fs", "Stats")
  @js.native
  open class Stats ()
    extends typingsJapgolly.gracefulFs.mod.Stats
  
  @JSImport("hexo-fs", "W_OK")
  @js.native
  def W_OK: js.UndefOr[Double] = js.native
  inline def W_OK_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("W_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("hexo-fs", "WriteStream")
  @js.native
  open class WriteStream ()
    extends typingsJapgolly.gracefulFs.mod.WriteStream {
    def this(opts: WritableOptions) = this()
  }
  
  @JSImport("hexo-fs", "X_OK")
  @js.native
  def X_OK: js.UndefOr[Double] = js.native
  inline def X_OK_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("hexo-fs", "access")
  @js.native
  def access: js.UndefOr[
    js.Function2[
      /* path */ PathLike, 
      /* mode */ js.UndefOr[Double], 
      typingsJapgolly.bluebird.mod.^[Unit]
    ]
  ] = js.native
  
  @JSImport("hexo-fs", "accessSync")
  @js.native
  def accessSync: js.UndefOr[js.Function2[/* path */ PathLike, /* mode */ js.UndefOr[Double], Unit]] = js.native
  inline def accessSync_=(x: js.UndefOr[js.Function2[/* path */ PathLike, /* mode */ js.UndefOr[Double], Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessSync")(x.asInstanceOf[js.Any])
  
  inline def access_=(
    x: js.UndefOr[
      js.Function2[
        /* path */ PathLike, 
        /* mode */ js.UndefOr[Double], 
        typingsJapgolly.bluebird.mod.^[Unit]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("access")(x.asInstanceOf[js.Any])
  
  inline def appendFile(path: String, data: Any): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def appendFile(path: String, data: Any, callback: js.Function1[/* err */ Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def appendFile(path: String, data: Any, options: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def appendFile(path: String, data: Any, options: String, callback: js.Function1[/* err */ Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def appendFile(path: String, data: Any, options: AppendFileOptions): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def appendFile(path: String, data: Any, options: AppendFileOptions, callback: js.Function1[/* err */ Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def appendFileSync(path: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(path: String, data: Any, options: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(path: String, data: Any, options: AppendFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chmod(path: PathLike, mode: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def chmod(path: PathLike, mode: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def chmodSync(path: PathLike, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chown(path: PathLike, uid: Double, gid: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def chownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def close(fd: Double): typingsJapgolly.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def closeSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def copyDir(src: String, dest: String): typingsJapgolly.bluebird.mod.^[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDir")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  inline def copyDir(
    src: String,
    dest: String,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDir")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  inline def copyDir(
    src: String,
    dest: String,
    options: Unit,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDir")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  inline def copyDir(src: String, dest: String, options: DirectoryOptions): typingsJapgolly.bluebird.mod.^[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDir")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  inline def copyDir(
    src: String,
    dest: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDir")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  
  inline def copyFile(src: PathLike, dest: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def copyFile(src: PathLike, dest: String, callback: js.Function1[/* err */ Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def createReadStream(path: PathLike): typingsJapgolly.node.fsMod.ReadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.fsMod.ReadStream]
  inline def createReadStream(path: PathLike, options: BufferEncoding): typingsJapgolly.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.ReadStream]
  inline def createReadStream(path: PathLike, options: ReadStreamOptions): typingsJapgolly.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.ReadStream]
  
  inline def createWriteStream(path: PathLike): typingsJapgolly.node.fsMod.WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.fsMod.WriteStream]
  inline def createWriteStream(path: PathLike, options: BufferEncoding): typingsJapgolly.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.WriteStream]
  inline def createWriteStream(path: PathLike, options: StreamOptions): typingsJapgolly.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.WriteStream]
  
  inline def emptyDir(path: String): typingsJapgolly.bluebird.mod.^[String | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[String | js.Array[String]]]
  inline def emptyDir(
    path: String,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String | js.Array[String]]]
  inline def emptyDir(
    path: String,
    options: Unit,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String | js.Array[String]]]
  inline def emptyDir(path: String, options: DirectoryOptionsexcludeAr): typingsJapgolly.bluebird.mod.^[String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String | js.Array[String]]]
  inline def emptyDir(
    path: String,
    options: DirectoryOptionsexcludeAr,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[String | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String | js.Array[String]]]
  
  inline def emptyDirSync(path: String): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
  inline def emptyDirSync(path: String, options: Unit, parent: String): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def emptyDirSync(path: String, options: DirectoryOptionsexcludeAr): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def emptyDirSync(path: String, options: DirectoryOptionsexcludeAr, parent: String): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  
  inline def ensurePath(path: String): typingsJapgolly.bluebird.mod.^[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensurePath")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def ensurePath(path: String, callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[String], Unit]): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePath")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  
  inline def ensurePathSync(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensurePathSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ensureWriteStream(path: String): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream]]
  inline def ensureWriteStream(
    path: String,
    callback: js.Function2[
      /* err */ Any, 
      /* value */ js.UndefOr[typingsJapgolly.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureWriteStream")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream]]
  inline def ensureWriteStream(path: String, options: String): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream]]
  inline def ensureWriteStream(
    path: String,
    options: String,
    callback: js.Function2[
      /* err */ Any, 
      /* value */ js.UndefOr[typingsJapgolly.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream]]
  inline def ensureWriteStream(
    path: String,
    options: Unit,
    callback: js.Function2[
      /* err */ Any, 
      /* value */ js.UndefOr[typingsJapgolly.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream]]
  inline def ensureWriteStream(path: String, options: AutoClose): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream]]
  inline def ensureWriteStream(
    path: String,
    options: AutoClose,
    callback: js.Function2[
      /* err */ Any, 
      /* value */ js.UndefOr[typingsJapgolly.gracefulFs.mod.WriteStream], 
      Unit
    ]
  ): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.WriteStream]]
  
  inline def ensureWriteStreamSync(path: String): typingsJapgolly.gracefulFs.mod.WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureWriteStreamSync")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.gracefulFs.mod.WriteStream]
  inline def ensureWriteStreamSync(path: String, options: String): typingsJapgolly.gracefulFs.mod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureWriteStreamSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.gracefulFs.mod.WriteStream]
  inline def ensureWriteStreamSync(path: String, options: AutoClose): typingsJapgolly.gracefulFs.mod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureWriteStreamSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.gracefulFs.mod.WriteStream]
  
  inline def escapeBOM(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeBOM")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeEOL(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeEOL")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def exists(path: PathLike): typingsJapgolly.bluebird.mod.^[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[Boolean]]
  inline def exists(path: PathLike, callback: js.Function1[/* exist */ Boolean, Unit]): typingsJapgolly.bluebird.mod.^[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Boolean]]
  
  inline def existsSync(path: PathLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def fchmod(fd: Double, mode: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def fchmod(fd: Double, mode: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def fchmodSync(fd: Double, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fchown(fd: Double, uid: Double, gid: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def fchownSync(fd: Double, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fstat(fd: Double): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.Stats]]
  
  inline def fstatSync(fd: Double): typingsJapgolly.node.fsMod.Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.fsMod.Stats]
  inline def fstatSync(fd: Double, options: StatOptionsbigintfalseund): typingsJapgolly.node.fsMod.Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.Stats]
  inline def fstatSync(fd: Double, options: StatOptionsbiginttrue): BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BigIntStats]
  inline def fstatSync(fd: Double, options: StatOptions): typingsJapgolly.node.fsMod.Stats | BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.fsMod.Stats | BigIntStats]
  
  inline def fstatSync_Union(fd: Double): typingsJapgolly.node.fsMod.Stats | BigIntStats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.fsMod.Stats | BigIntStats]
  
  inline def fsync(fd: Double): typingsJapgolly.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def fsyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ftruncate(fd: Double): typingsJapgolly.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def ftruncate(fd: Double, len: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def ftruncateSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ftruncateSync(fd: Double, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def futimes(fd: Double, atime: String, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def futimes(fd: Double, atime: String, mtime: js.Date): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def futimes(fd: Double, atime: String, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def futimes(fd: Double, atime: js.Date, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def futimes(fd: Double, atime: js.Date, mtime: js.Date): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def futimes(fd: Double, atime: js.Date, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def futimes(fd: Double, atime: Double, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def futimes(fd: Double, atime: Double, mtime: js.Date): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def futimes(fd: Double, atime: Double, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def futimesSync(fd: Double, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lchmod(path: PathLike, mode: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def lchmod(path: PathLike, mode: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def lchmodSync(path: PathLike, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lchown(path: PathLike, uid: Double, gid: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def link(existingPath: PathLike, newPath: PathLike): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def linkSync(existingPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def listDir(path: String): typingsJapgolly.bluebird.mod.^[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listDir")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  inline def listDir(
    path: String,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listDir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  inline def listDir(
    path: String,
    options: Unit,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  inline def listDir(path: String, options: DirectoryOptions): typingsJapgolly.bluebird.mod.^[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  inline def listDir(
    path: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  
  inline def listDirSync(path: String): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
  inline def listDirSync(path: String, options: Unit, parent: String): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("listDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def listDirSync(path: String, options: DirectoryOptions): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("listDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def listDirSync(path: String, options: DirectoryOptions, parent: String): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("listDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  
  inline def lstat(path: PathLike): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.Stats]]
  
  @JSImport("hexo-fs", "lstatSync")
  @js.native
  val lstatSync: StatSyncFn = js.native
  
  inline def mkdir(path: PathLike): typingsJapgolly.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def mkdir(path: PathLike, mode: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def mkdir(path: PathLike, mode: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def mkdirSync(path: PathLike): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def mkdirSync_Unit(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mkdirSync_Unit(path: PathLike, options: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirs(path: PathLike): typingsJapgolly.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def mkdirs(path: PathLike, callback: js.Function1[/* err */ Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def mkdirsSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def open(path: PathLike, flags: String): typingsJapgolly.bluebird.mod.^[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Double]]
  inline def open(path: PathLike, flags: String, mode: String): typingsJapgolly.bluebird.mod.^[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Double]]
  inline def open(path: PathLike, flags: String, mode: Double): typingsJapgolly.bluebird.mod.^[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Double]]
  inline def open(path: PathLike, flags: Double): typingsJapgolly.bluebird.mod.^[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Double]]
  inline def open(path: PathLike, flags: Double, mode: String): typingsJapgolly.bluebird.mod.^[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Double]]
  inline def open(path: PathLike, flags: Double, mode: Double): typingsJapgolly.bluebird.mod.^[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Double]]
  
  inline def openSync(path: PathLike, flags: OpenMode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def openSync(path: PathLike, flags: OpenMode, mode: Mode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def read(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): typingsJapgolly.bluebird.mod.^[BytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesRead]]
  inline def read(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): typingsJapgolly.bluebird.mod.^[BytesRead] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesRead]]
  inline def read(fd: Double, buffer: Buffer, offset: Double, length: Double): typingsJapgolly.bluebird.mod.^[typingsJapgolly.hexoFs.anon.Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.hexoFs.anon.Buffer]]
  inline def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typingsJapgolly.bluebird.mod.^[typingsJapgolly.hexoFs.anon.Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.hexoFs.anon.Buffer]]
  
  inline def readFile(path: Double): typingsJapgolly.bluebird.mod.^[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def readFile(path: Double, callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[String], Unit]): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def readFile(
    path: Double,
    options: Unit,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[String], Unit]
  ): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def readFile(path: Double, options: Encoding): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def readFile(
    path: Double,
    options: Encoding,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[String], Unit]
  ): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def readFile(path: PathLike): typingsJapgolly.bluebird.mod.^[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def readFile(path: PathLike, callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[String], Unit]): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def readFile(
    path: PathLike,
    options: Unit,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[String], Unit]
  ): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def readFile(path: PathLike, options: Encoding): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def readFile(
    path: PathLike,
    options: Encoding,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[String], Unit]
  ): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  
  inline def readFileSync(path: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def readFileSync(path: Double, options: Encoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readFileSync(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def readFileSync(path: PathLike, options: Encoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: ReadPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readdir(path: PathLike): typingsJapgolly.bluebird.mod.^[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  inline def readdir(path: PathLike, options: String): typingsJapgolly.bluebird.mod.^[js.Array[String | Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String | Buffer]]]
  inline def readdir(path: PathLike, options: `0`): typingsJapgolly.bluebird.mod.^[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  inline def readdir(path: PathLike, options: `1`): typingsJapgolly.bluebird.mod.^[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[Buffer]]]
  inline def readdir(path: PathLike, options: `2`): typingsJapgolly.bluebird.mod.^[js.Array[String | Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String | Buffer]]]
  inline def readdir(path: PathLike, options: BufferEncoding): typingsJapgolly.bluebird.mod.^[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[String]]]
  
  inline def readdirSync(path: PathLike): js.Array[Buffer | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer | String]]
  inline def readdirSync(path: PathLike, options: EncodingWithFileTypes): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def readdirSync(path: PathLike, options: ObjectEncodingOptionswith): js.Array[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer | String]]
  inline def readdirSync(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Array[Dirent] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Dirent]]
  inline def readdirSync(path: PathLike, options: WithFileTypes): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  inline def readdirSync(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer | String]]
  
  inline def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  
  inline def readdir_buffer(path: PathLike, options: buffer): typingsJapgolly.bluebird.mod.^[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[js.Array[Buffer]]]
  
  inline def readlink(path: PathLike): typingsJapgolly.bluebird.mod.^[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def readlink(path: PathLike, options: String): typingsJapgolly.bluebird.mod.^[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String | Buffer]]
  inline def readlink(path: PathLike, options: `1`): typingsJapgolly.bluebird.mod.^[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Buffer]]
  inline def readlink(path: PathLike, options: `2`): typingsJapgolly.bluebird.mod.^[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String | Buffer]]
  inline def readlink(path: PathLike, options: `3`): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def readlink(path: PathLike, options: BufferEncoding): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  
  inline def readlinkSync(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def readlinkSync(path: PathLike, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readlinkSync_Union(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def readlinkSync_Union(path: PathLike, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  inline def readlink_buffer(path: PathLike, options: buffer): typingsJapgolly.bluebird.mod.^[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Buffer]]
  
  inline def realpath(path: PathLike): typingsJapgolly.bluebird.mod.^[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def realpath(path: PathLike, options: String): typingsJapgolly.bluebird.mod.^[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String | Buffer]]
  inline def realpath(path: PathLike, options: `1`): typingsJapgolly.bluebird.mod.^[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Buffer]]
  inline def realpath(path: PathLike, options: `2`): typingsJapgolly.bluebird.mod.^[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String | Buffer]]
  inline def realpath(path: PathLike, options: `3`): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  inline def realpath(path: PathLike, options: BufferEncoding): typingsJapgolly.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[String]]
  
  object realpathSync {
    
    inline def apply(path: PathLike): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(path: PathLike, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("hexo-fs", "realpathSync")
    @js.native
    val ^ : js.Any = js.native
    
    inline def native(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def native(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def native(path: PathLike, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def native_Union(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
    inline def native_Union(path: PathLike, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  }
  
  inline def realpath_buffer(path: PathLike, options: buffer): typingsJapgolly.bluebird.mod.^[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Buffer]]
  
  inline def rename(oldPath: PathLike, newPath: PathLike): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def renameSync(oldPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rmdir(path: String): typingsJapgolly.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def rmdir(path: String, callback: js.Function1[/* err */ Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def rmdirSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stat(path: PathLike): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.Stats]]
  
  @JSImport("hexo-fs", "statSync")
  @js.native
  val statSync: StatSyncFn = js.native
  
  inline def symlink(target: PathLike, path: PathLike): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def symlink(target: PathLike, path: PathLike, `type`: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def symlinkSync(target: PathLike, path: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def truncate(path: PathLike): typingsJapgolly.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def truncate(path: PathLike, len: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def truncateSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def truncateSync(path: PathLike, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unlink(path: PathLike): typingsJapgolly.bluebird.mod.^[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
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
  
  inline def utimes(path: PathLike, atime: String, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def utimes(path: PathLike, atime: String, mtime: js.Date): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def utimes(path: PathLike, atime: String, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def utimes(path: PathLike, atime: js.Date, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def utimes(path: PathLike, atime: js.Date, mtime: js.Date): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def utimes(path: PathLike, atime: js.Date, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def utimes(path: PathLike, atime: Double, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def utimes(path: PathLike, atime: Double, mtime: js.Date): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def utimes(path: PathLike, atime: Double, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def utimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def watch(path: String): typingsJapgolly.bluebird.mod.^[FSWatcher] = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[FSWatcher]]
  inline def watch(
    path: String,
    options: Unit,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsJapgolly.bluebird.mod.^[FSWatcher] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[FSWatcher]]
  inline def watch(path: String, options: WatchOptions): typingsJapgolly.bluebird.mod.^[FSWatcher] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[FSWatcher]]
  inline def watch(
    path: String,
    options: WatchOptions,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsJapgolly.bluebird.mod.^[FSWatcher] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[FSWatcher]]
  inline def watch(path: js.Array[String]): typingsJapgolly.bluebird.mod.^[FSWatcher] = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[FSWatcher]]
  inline def watch(
    path: js.Array[String],
    options: Unit,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsJapgolly.bluebird.mod.^[FSWatcher] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[FSWatcher]]
  inline def watch(path: js.Array[String], options: WatchOptions): typingsJapgolly.bluebird.mod.^[FSWatcher] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[FSWatcher]]
  inline def watch(
    path: js.Array[String],
    options: WatchOptions,
    callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsJapgolly.bluebird.mod.^[FSWatcher] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[FSWatcher]]
  
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
  
  inline def write(fd: Double, string: Any): typingsJapgolly.bluebird.mod.^[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BufferBytesWritten]]
  inline def write(fd: Double, string: Any, position: Double): typingsJapgolly.bluebird.mod.^[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BufferBytesWritten]]
  inline def write(fd: Double, string: Any, position: Double, encoding: String): typingsJapgolly.bluebird.mod.^[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BufferBytesWritten]]
  inline def write(fd: Double, string: Any, position: Null, encoding: String): typingsJapgolly.bluebird.mod.^[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BufferBytesWritten]]
  inline def write(fd: Double, string: Any, position: Unit, encoding: String): typingsJapgolly.bluebird.mod.^[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BufferBytesWritten]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: Double, length: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: Double, length: Double, position: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: Double, length: Unit, position: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: Unit, length: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: Unit, length: Double, position: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: Unit, length: Unit, position: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: Unit, offset: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: Unit, offset: Double, length: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: Unit, offset: Double, length: Double, position: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: Unit, offset: Double, length: Unit, position: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: Unit, offset: Unit, length: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: Unit, offset: Unit, length: Double, position: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: Unit, offset: Unit, length: Unit, position: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  
  inline def writeFile(path: String, data: Any): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def writeFile(path: String, data: Any, callback: js.Function1[/* err */ Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def writeFile(path: String, data: Any, options: String): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def writeFile(path: String, data: Any, options: String, callback: js.Function1[/* err */ Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def writeFile(path: String, data: Any, options: Unit, callback: js.Function1[/* err */ Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def writeFile(path: String, data: Any, options: Flag): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  inline def writeFile(path: String, data: Any, options: Flag, callback: js.Function1[/* err */ Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Unit]]
  
  inline def writeFileSync(path: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(path: String, data: Any, options: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(path: String, data: Any, options: Flag): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeSync(fd: Double, string: String, position: Unit, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def write_TBuffer[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  inline def write_TBuffer[TBuffer /* <: Buffer | js.typedarray.Uint8Array */](fd: Double, buffer: TBuffer, offset: Double): typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[BytesWritten[TBuffer]]]
  
  trait AppendFileOptions extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[String | Double] = js.undefined
  }
  object AppendFileOptions {
    
    inline def apply(): AppendFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppendFileOptions]
    }
    
    extension [Self <: AppendFileOptions](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      inline def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait DirectoryOptions extends StObject {
    
    var ignoreHidden: js.UndefOr[Boolean] = js.undefined
    
    var ignorePattern: js.UndefOr[js.RegExp] = js.undefined
  }
  object DirectoryOptions {
    
    inline def apply(): DirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryOptions]
    }
    
    extension [Self <: DirectoryOptions](x: Self) {
      
      inline def setIgnoreHidden(value: Boolean): Self = StObject.set(x, "ignoreHidden", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHiddenUndefined: Self = StObject.set(x, "ignoreHidden", js.undefined)
      
      inline def setIgnorePattern(value: js.RegExp): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
    }
  }
}
