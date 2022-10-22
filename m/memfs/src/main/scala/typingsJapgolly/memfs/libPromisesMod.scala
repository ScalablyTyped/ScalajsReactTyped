package typingsJapgolly.memfs

import typingsJapgolly.memfs.libEncodingMod.TDataOut
import typingsJapgolly.memfs.libStatsMod.TStatNumber
import typingsJapgolly.memfs.libStatsMod.default
import typingsJapgolly.memfs.libVolumeMod.IAppendFileOptions
import typingsJapgolly.memfs.libVolumeMod.IFStatOptions
import typingsJapgolly.memfs.libVolumeMod.IMkdirOptions
import typingsJapgolly.memfs.libVolumeMod.IOptions
import typingsJapgolly.memfs.libVolumeMod.IReadFileOptions
import typingsJapgolly.memfs.libVolumeMod.IReaddirOptions
import typingsJapgolly.memfs.libVolumeMod.IRealpathOptions
import typingsJapgolly.memfs.libVolumeMod.IRmOptions
import typingsJapgolly.memfs.libVolumeMod.IStatOptions
import typingsJapgolly.memfs.libVolumeMod.IWriteFileOptions
import typingsJapgolly.memfs.libVolumeMod.TData
import typingsJapgolly.memfs.libVolumeMod.TFlags
import typingsJapgolly.memfs.libVolumeMod.TFlagsCopy
import typingsJapgolly.memfs.libVolumeMod.TMode
import typingsJapgolly.memfs.libVolumeMod.TTime
import typingsJapgolly.memfs.libVolumeMod.Volume
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.symlink.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPromisesMod {
  
  @JSImport("memfs/lib/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(vol: Volume): Null | IPromisesAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(vol.asInstanceOf[js.Any]).asInstanceOf[Null | IPromisesAPI]
  
  @JSImport("memfs/lib/promises", "FileHandle")
  @js.native
  open class FileHandle protected ()
    extends StObject
       with IFileHandle {
    def this(vol: Volume, fd: Double) = this()
    
    def stat(options: IFStatOptions): js.Promise[default[TStatNumber]] = js.native
    
    def sync(): js.Promise[Unit] = js.native
    
    /* private */ var vol: Any = js.native
  }
  
  @js.native
  trait IFileHandle extends StObject {
    
    def appendFile(data: TData): js.Promise[Unit] = js.native
    def appendFile(data: TData, options: String): js.Promise[Unit] = js.native
    def appendFile(data: TData, options: IAppendFileOptions): js.Promise[Unit] = js.native
    
    def chmod(mode: TMode): js.Promise[Unit] = js.native
    
    def chown(uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def datasync(): js.Promise[Unit] = js.native
    
    var fd: Double = js.native
    
    def read(buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[TFileHandleReadResult] = js.native
    def read(buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[TFileHandleReadResult] = js.native
    
    def readFile(): js.Promise[TDataOut] = js.native
    def readFile(options: String): js.Promise[TDataOut] = js.native
    def readFile(options: IReadFileOptions): js.Promise[TDataOut] = js.native
    
    def stat(): js.Promise[default[TStatNumber]] = js.native
    def stat(options: IStatOptions): js.Promise[default[TStatNumber]] = js.native
    
    def truncate(): js.Promise[Unit] = js.native
    def truncate(len: Double): js.Promise[Unit] = js.native
    
    def utimes(atime: TTime, mtime: TTime): js.Promise[Unit] = js.native
    
    def write(buffer: js.typedarray.Uint8Array): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: js.typedarray.Uint8Array, offset: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: js.typedarray.Uint8Array, offset: Double, length: Unit, position: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: js.typedarray.Uint8Array, offset: Unit, length: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: js.typedarray.Uint8Array, offset: Unit, length: Double, position: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: js.typedarray.Uint8Array, offset: Unit, length: Unit, position: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: Double, length: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: Double, length: Unit, position: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: Unit, length: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: Unit, length: Double, position: Double): js.Promise[TFileHandleWriteResult] = js.native
    def write(buffer: Buffer, offset: Unit, length: Unit, position: Double): js.Promise[TFileHandleWriteResult] = js.native
    
    def writeFile(data: TData): js.Promise[Unit] = js.native
    def writeFile(data: TData, options: IWriteFileOptions): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait IPromisesAPI extends StObject {
    
    var FileHandle: Any = js.native
    
    def access(path: PathLike): js.Promise[Unit] = js.native
    def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
    
    def appendFile(path: TFileHandle, data: TData): js.Promise[Unit] = js.native
    def appendFile(path: TFileHandle, data: TData, options: String): js.Promise[Unit] = js.native
    def appendFile(path: TFileHandle, data: TData, options: IAppendFileOptions): js.Promise[Unit] = js.native
    
    def chmod(path: PathLike, mode: TMode): js.Promise[Unit] = js.native
    
    def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = js.native
    def copyFile(src: PathLike, dest: PathLike, flags: TFlagsCopy): js.Promise[Unit] = js.native
    
    def lchmod(path: PathLike, mode: TMode): js.Promise[Unit] = js.native
    
    def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    
    def lstat(path: PathLike): js.Promise[default[TStatNumber]] = js.native
    def lstat(path: PathLike, options: IStatOptions): js.Promise[default[TStatNumber]] = js.native
    
    def mkdir(path: PathLike): js.Promise[Unit] = js.native
    def mkdir(path: PathLike, options: IMkdirOptions): js.Promise[Unit] = js.native
    def mkdir(path: PathLike, options: TMode): js.Promise[Unit] = js.native
    
    def mkdtemp(prefix: String): js.Promise[TDataOut] = js.native
    def mkdtemp(prefix: String, options: IOptions): js.Promise[TDataOut] = js.native
    
    def open(path: PathLike, flags: TFlags): js.Promise[FileHandle] = js.native
    def open(path: PathLike, flags: TFlags, mode: TMode): js.Promise[FileHandle] = js.native
    
    def readFile(id: TFileHandle): js.Promise[TDataOut] = js.native
    def readFile(id: TFileHandle, options: String): js.Promise[TDataOut] = js.native
    def readFile(id: TFileHandle, options: IReadFileOptions): js.Promise[TDataOut] = js.native
    
    def readdir(path: PathLike): js.Promise[js.Array[TDataOut | typingsJapgolly.memfs.libDirentMod.default]] = js.native
    def readdir(path: PathLike, options: String): js.Promise[js.Array[TDataOut | typingsJapgolly.memfs.libDirentMod.default]] = js.native
    def readdir(path: PathLike, options: IReaddirOptions): js.Promise[js.Array[TDataOut | typingsJapgolly.memfs.libDirentMod.default]] = js.native
    
    def readlink(path: PathLike): js.Promise[TDataOut] = js.native
    def readlink(path: PathLike, options: IOptions): js.Promise[TDataOut] = js.native
    
    def realpath(path: PathLike): js.Promise[TDataOut] = js.native
    def realpath(path: PathLike, options: String): js.Promise[TDataOut] = js.native
    def realpath(path: PathLike, options: IRealpathOptions): js.Promise[TDataOut] = js.native
    
    def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    
    def rm(path: PathLike): js.Promise[Unit] = js.native
    def rm(path: PathLike, options: IRmOptions): js.Promise[Unit] = js.native
    
    def rmdir(path: PathLike): js.Promise[Unit] = js.native
    
    def stat(path: PathLike): js.Promise[default[TStatNumber]] = js.native
    def stat(path: PathLike, options: IStatOptions): js.Promise[default[TStatNumber]] = js.native
    
    def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
    def symlink(target: PathLike, path: PathLike, `type`: Type): js.Promise[Unit] = js.native
    
    def truncate(path: PathLike): js.Promise[Unit] = js.native
    def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
    
    def unlink(path: PathLike): js.Promise[Unit] = js.native
    
    def utimes(path: PathLike, atime: TTime, mtime: TTime): js.Promise[Unit] = js.native
    
    def writeFile(id: TFileHandle, data: TData): js.Promise[Unit] = js.native
    def writeFile(id: TFileHandle, data: TData, options: IWriteFileOptions): js.Promise[Unit] = js.native
  }
  
  type TFileHandle = PathLike | IFileHandle
  
  trait TFileHandleReadResult extends StObject {
    
    var buffer: Buffer | js.typedarray.Uint8Array
    
    var bytesRead: Double
  }
  object TFileHandleReadResult {
    
    inline def apply(buffer: Buffer | js.typedarray.Uint8Array, bytesRead: Double): TFileHandleReadResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[TFileHandleReadResult]
    }
    
    extension [Self <: TFileHandleReadResult](x: Self) {
      
      inline def setBuffer(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
  
  trait TFileHandleWriteResult extends StObject {
    
    var buffer: Buffer | js.typedarray.Uint8Array
    
    var bytesWritten: Double
  }
  object TFileHandleWriteResult {
    
    inline def apply(buffer: Buffer | js.typedarray.Uint8Array, bytesWritten: Double): TFileHandleWriteResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[TFileHandleWriteResult]
    }
    
    extension [Self <: TFileHandleWriteResult](x: Self) {
      
      inline def setBuffer(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
}
