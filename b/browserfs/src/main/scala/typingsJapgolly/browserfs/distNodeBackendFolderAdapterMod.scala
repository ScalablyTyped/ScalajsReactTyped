package typingsJapgolly.browserfs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError
import typingsJapgolly.browserfs.distNodeCoreFileFlagMod.FileFlag
import typingsJapgolly.browserfs.distNodeCoreFileMod.File
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.BFSOneArgCallback
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.BaseFileSystem
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeBackendFolderAdapterMod {
  
  @JSImport("browserfs/dist/node/backend/FolderAdapter", JSImport.Default)
  @js.native
  open class default protected () extends FolderAdapter {
    /**
      * Wraps a file system, and uses the given folder as its root.
      *
      * @param folder The folder to use as the root directory.
      * @param wrapped The file system to wrap.
      */
    def this(folder: String, wrapped: FileSystem) = this()
  }
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/backend/FolderAdapter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a FolderAdapter instance with the given options.
      */
    inline def Create(opts: FolderAdapterOptions, cb: BFSCallback[FolderAdapter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("browserfs/dist/node/backend/FolderAdapter", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/FolderAdapter", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait FolderAdapter
    extends BaseFileSystem
       with FileSystem {
    
    var _folder: String = js.native
    
    var _wrapped: FileSystem = js.native
    
    /* InferMemberOverrides */
    override def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, Any]): Unit = js.native
    
    /* InferMemberOverrides */
    override def exists(p: String, cb: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
    
    /* InferMemberOverrides */
    override def existsSync(p: String): Boolean = js.native
    
    /**
      * Initialize the file system. Ensures that the wrapped file system
      * has the given folder.
      */
    def initialize(cb: js.Function1[/* e */ js.UndefOr[ApiError], Unit]): Unit = js.native
    
    /* InferMemberOverrides */
    override def link(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def linkSync(srcpath: String, dstpath: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def mkdir(p: String, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def mkdirSync(p: String, mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def open(p: String, flag: FileFlag, mode: Double, cb: BFSCallback[File]): Unit = js.native
    
    /* InferMemberOverrides */
    override def openSync(p: String, flag: FileFlag, mode: Double): File = js.native
    
    /* InferMemberOverrides */
    override def readFile(fname: String, encoding: String, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
    /* InferMemberOverrides */
    override def readFile(fname: String, encoding: Null, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
    
    /* InferMemberOverrides */
    override def readFileSync(fname: String, encoding: String, flag: FileFlag): Any = js.native
    /* InferMemberOverrides */
    override def readFileSync(fname: String, encoding: Null, flag: FileFlag): Any = js.native
    
    /* InferMemberOverrides */
    override def readdir(p: String, cb: BFSCallback[js.Array[String]]): Unit = js.native
    
    /* InferMemberOverrides */
    override def readdirSync(p: String): js.Array[String] = js.native
    
    /* InferMemberOverrides */
    override def readlinkSync(p: String): String = js.native
    
    /* InferMemberOverrides */
    override def realpath(p: String, cache: StringDictionary[String], cb: BFSCallback[String]): Unit = js.native
    
    /* InferMemberOverrides */
    override def realpathSync(p: String, cache: StringDictionary[String]): String = js.native
    
    /* InferMemberOverrides */
    override def rename(oldPath: String, newPath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def renameSync(oldPath: String, newPath: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def rmdir(p: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def rmdirSync(p: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def stat(
      p: String,
      isLstat: Boolean,
      cb: BFSCallback[typingsJapgolly.browserfs.distNodeCoreNodeFsStatsMod.default]
    ): Unit = js.native
    /* InferMemberOverrides */
    override def stat(
      p: String,
      isLstat: Null,
      cb: BFSCallback[typingsJapgolly.browserfs.distNodeCoreNodeFsStatsMod.default]
    ): Unit = js.native
    
    /* InferMemberOverrides */
    override def statSync(p: String): typingsJapgolly.browserfs.distNodeCoreNodeFsStatsMod.default = js.native
    /* InferMemberOverrides */
    override def statSync(p: String, isLstat: Boolean): typingsJapgolly.browserfs.distNodeCoreNodeFsStatsMod.default = js.native
    
    /* InferMemberOverrides */
    override def supportsLinks(): Boolean = js.native
    
    /* InferMemberOverrides */
    override def symlink(srcpath: String, dstpath: String, `type`: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def truncate(p: String, len: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def truncateSync(p: String, len: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def unlink(p: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def unlinkSync(p: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimes(p: String, atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(p: String, atime: js.Date, mtime: js.Date): Unit = js.native
    
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  }
  
  trait FolderAdapterOptions extends StObject {
    
    var folder: String
    
    var wrapped: FileSystem
  }
  object FolderAdapterOptions {
    
    inline def apply(folder: String, wrapped: FileSystem): FolderAdapterOptions = {
      val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], wrapped = wrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[FolderAdapterOptions]
    }
    
    extension [Self <: FolderAdapterOptions](x: Self) {
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setWrapped(value: FileSystem): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
    }
  }
}
