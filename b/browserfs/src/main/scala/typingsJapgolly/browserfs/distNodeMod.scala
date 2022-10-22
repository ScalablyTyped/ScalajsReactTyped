package typingsJapgolly.browserfs

import org.scalajs.dom.Worker
import typingsJapgolly.browserfs.anon.TypeofAsyncMirror
import typingsJapgolly.browserfs.anon.TypeofBFSUtils
import typingsJapgolly.browserfs.anon.TypeofDropbox
import typingsJapgolly.browserfs.anon.TypeofEmscripten
import typingsJapgolly.browserfs.anon.TypeofFolderAdapter
import typingsJapgolly.browserfs.anon.TypeofHTML5FS
import typingsJapgolly.browserfs.anon.TypeofInMemory
import typingsJapgolly.browserfs.anon.TypeofIndexedDB
import typingsJapgolly.browserfs.anon.TypeofIsoFS
import typingsJapgolly.browserfs.anon.TypeofLocalStorage
import typingsJapgolly.browserfs.anon.TypeofMountableFileSystem
import typingsJapgolly.browserfs.anon.TypeofOverlayFS
import typingsJapgolly.browserfs.anon.TypeofWorkerFS
import typingsJapgolly.browserfs.anon.TypeofXmlHttpRequest
import typingsJapgolly.browserfs.anon.TypeofZipFS
import typingsJapgolly.browserfs.anon.Typeofbuffer
import typingsJapgolly.browserfs.browserfsStrings.bfs_utils
import typingsJapgolly.browserfs.browserfsStrings.buffer
import typingsJapgolly.browserfs.browserfsStrings.fs
import typingsJapgolly.browserfs.browserfsStrings.path
import typingsJapgolly.browserfs.browserfsStrings.process
import typingsJapgolly.browserfs.distNodeBackendIndexedDBMod.IndexedDBFileSystem
import typingsJapgolly.browserfs.distNodeBackendZipFSMod.ZipTOC
import typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode
import typingsJapgolly.browserfs.distNodeCoreBrowserfsMod.FileSystemConfiguration
import typingsJapgolly.browserfs.distNodeCoreFSMod.FSModule
import typingsJapgolly.browserfs.distNodeCoreFSMod.default
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.BFSOneArgCallback
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystemConstructor
import typingsJapgolly.dropboxjs.Dropbox.Client
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.pathMod.PlatformPath
import typingsJapgolly.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeMod {
  
  @JSImport("browserfs/dist/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BFSRequire(module: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def BFSRequire_bfsutils(module: bfs_utils): TypeofBFSUtils = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[TypeofBFSUtils]
  
  inline def BFSRequire_buffer(module: buffer): Typeofbuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[Typeofbuffer]
  
  inline def BFSRequire_fs(module: fs): FSModule = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[FSModule]
  
  inline def BFSRequire_path(module: path): PlatformPath = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[PlatformPath]
  
  inline def BFSRequire_process(module: process): Process = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[Process]
  
  @JSImport("browserfs/dist/node", "EmscriptenFS")
  @js.native
  open class EmscriptenFS ()
    extends typingsJapgolly.browserfs.distNodeCoreBrowserfsMod.EmscriptenFS {
    def this(_FS: Any) = this()
    def this(_FS: Any, _PATH: Any) = this()
    def this(_FS: Unit, _PATH: Any) = this()
    def this(_FS: Any, _PATH: Any, _ERRNO_CODES: Any) = this()
    def this(_FS: Any, _PATH: Unit, _ERRNO_CODES: Any) = this()
    def this(_FS: Unit, _PATH: Any, _ERRNO_CODES: Any) = this()
    def this(_FS: Unit, _PATH: Unit, _ERRNO_CODES: Any) = this()
    def this(_FS: Any, _PATH: Any, _ERRNO_CODES: Any, nodefs: default) = this()
    def this(_FS: Any, _PATH: Any, _ERRNO_CODES: Unit, nodefs: default) = this()
    def this(_FS: Any, _PATH: Unit, _ERRNO_CODES: Any, nodefs: default) = this()
    def this(_FS: Any, _PATH: Unit, _ERRNO_CODES: Unit, nodefs: default) = this()
    def this(_FS: Unit, _PATH: Any, _ERRNO_CODES: Any, nodefs: default) = this()
    def this(_FS: Unit, _PATH: Any, _ERRNO_CODES: Unit, nodefs: default) = this()
    def this(_FS: Unit, _PATH: Unit, _ERRNO_CODES: Any, nodefs: default) = this()
    def this(_FS: Unit, _PATH: Unit, _ERRNO_CODES: Unit, nodefs: default) = this()
  }
  
  object Errors {
    
    @JSImport("browserfs/dist/node", "Errors.ApiError")
    @js.native
    open class ApiError protected ()
      extends typingsJapgolly.browserfs.distNodeCoreBrowserfsMod.Errors.ApiError {
      /**
        * Represents a BrowserFS error. Passed back to applications after a failed
        * call to the BrowserFS API.
        *
        * Error codes mirror those returned by regular Unix file operations, which is
        * what Node returns.
        * @constructor ApiError
        * @param type The type of the error.
        * @param [message] A descriptive error message.
        */
      def this(`type`: ErrorCode) = this()
      def this(`type`: ErrorCode, message: String) = this()
      def this(`type`: ErrorCode, message: String, path: String) = this()
      def this(`type`: ErrorCode, message: Unit, path: String) = this()
    }
    /* static members */
    object ApiError {
      
      @JSImport("browserfs/dist/node", "Errors.ApiError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def EEXIST(path: String): typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("EEXIST")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError]
      
      inline def EISDIR(path: String): typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("EISDIR")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError]
      
      inline def ENOENT(path: String): typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("ENOENT")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError]
      
      inline def ENOTDIR(path: String): typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("ENOTDIR")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError]
      
      inline def ENOTEMPTY(path: String): typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("ENOTEMPTY")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError]
      
      inline def EPERM(path: String): typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("EPERM")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError]
      
      inline def FileError(code: ErrorCode, p: String): typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError = (^.asInstanceOf[js.Dynamic].applyDynamic("FileError")(code.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError]
      
      /**
        * Creates an ApiError object from a buffer.
        */
      inline def fromBuffer(buffer: Buffer): typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError]
      inline def fromBuffer(buffer: Buffer, i: Double): typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError]
      
      inline def fromJSON(json: Any): typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ApiError]
    }
    
    @JSImport("browserfs/dist/node", "Errors.ErrorCode")
    @js.native
    object ErrorCode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode & Double] = js.native
      
      /* 13 */ val EACCES: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.EACCES & Double = js.native
      
      /* 9 */ val EBADF: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.EBADF & Double = js.native
      
      /* 16 */ val EBUSY: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.EBUSY & Double = js.native
      
      /* 17 */ val EEXIST: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.EEXIST & Double = js.native
      
      /* 27 */ val EFBIG: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.EFBIG & Double = js.native
      
      /* 22 */ val EINVAL: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.EINVAL & Double = js.native
      
      /* 5 */ val EIO: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.EIO & Double = js.native
      
      /* 21 */ val EISDIR: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.EISDIR & Double = js.native
      
      /* 2 */ val ENOENT: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.ENOENT & Double = js.native
      
      /* 28 */ val ENOSPC: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.ENOSPC & Double = js.native
      
      /* 20 */ val ENOTDIR: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.ENOTDIR & Double = js.native
      
      /* 39 */ val ENOTEMPTY: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.ENOTEMPTY & Double = js.native
      
      /* 95 */ val ENOTSUP: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.ENOTSUP & Double = js.native
      
      /* 1 */ val EPERM: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.EPERM & Double = js.native
      
      /* 30 */ val EROFS: typingsJapgolly.browserfs.distNodeCoreApiErrorMod.ErrorCode.EROFS & Double = js.native
    }
  }
  
  /**
    * @hidden
    */
  /**
    * @hidden
    */
  object FileSystem {
    
    @JSImport("browserfs/dist/node", "FileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.AsyncMirror")
    @js.native
    open class AsyncMirror protected ()
      extends typingsJapgolly.browserfs.distNodeBackendAsyncMirrorMod.default {
      /**
        * **Deprecated; use AsyncMirror.Create() method instead.**
        *
        * Mirrors the synchronous file system into the asynchronous file system.
        *
        * **IMPORTANT**: You must call `initialize` on the file system before it can be used.
        * @param sync The synchronous file system to mirror the asynchronous file system to.
        * @param async The asynchronous file system to mirror.
        */
      def this(
        sync: typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem,
        async: typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem
      ) = this()
      def this(
        sync: typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem,
        async: typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem,
        deprecateMsg: Boolean
      ) = this()
    }
    @JSImport("browserfs/dist/node", "FileSystem.AsyncMirror")
    @js.native
    def AsyncMirror: TypeofAsyncMirror = js.native
    inline def AsyncMirror_=(x: TypeofAsyncMirror): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsyncMirror")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.Dropbox")
    @js.native
    open class Dropbox protected ()
      extends typingsJapgolly.browserfs.distNodeBackendDropboxMod.default {
      /**
        * **Deprecated. Please use Dropbox.Create() method instead.**
        *
        * Constructs a Dropbox-backed file system using the *authenticated* DropboxJS client.
        *
        * Note that you must use the old v0.10 version of the Dropbox JavaScript SDK.
        */
      def this(client: Client) = this()
      def this(client: Client, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node", "FileSystem.Dropbox")
    @js.native
    def Dropbox: TypeofDropbox = js.native
    inline def Dropbox_=(x: TypeofDropbox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dropbox")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.Emscripten")
    @js.native
    open class Emscripten protected ()
      extends typingsJapgolly.browserfs.distNodeBackendEmscriptenMod.default {
      /**
        * Creates a BrowserFS file system for the given Emscripten file system.
        * @param _FS The Emscripten file system (`FS`).
        */
      def this(_FS: Any) = this()
    }
    @JSImport("browserfs/dist/node", "FileSystem.Emscripten")
    @js.native
    def Emscripten: TypeofEmscripten = js.native
    inline def Emscripten_=(x: TypeofEmscripten): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Emscripten")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.FolderAdapter")
    @js.native
    open class FolderAdapter protected ()
      extends typingsJapgolly.browserfs.distNodeBackendFolderAdapterMod.default {
      /**
        * Wraps a file system, and uses the given folder as its root.
        *
        * @param folder The folder to use as the root directory.
        * @param wrapped The file system to wrap.
        */
      def this(folder: String, wrapped: typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem) = this()
    }
    @JSImport("browserfs/dist/node", "FileSystem.FolderAdapter")
    @js.native
    def FolderAdapter: TypeofFolderAdapter = js.native
    inline def FolderAdapter_=(x: TypeofFolderAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FolderAdapter")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.HTML5FS")
    @js.native
    /**
      * **Deprecated. Please use HTML5FS.Create() method instead.**
      *
      * Creates a new HTML5 FileSystem-backed BrowserFS file system of the given size
      * and storage type.
      *
      * **IMPORTANT**: You must call `allocate` on the resulting object before the file system
      * can be used.
      *
      * @param size storage quota to request, in megabytes. Allocated value may be less.
      * @param type window.PERSISTENT or window.TEMPORARY. Defaults to PERSISTENT.
      */
    open class HTML5FS ()
      extends typingsJapgolly.browserfs.distNodeBackendHtml5fsMod.default {
      def this(size: Double) = this()
      def this(size: Double, `type`: Double) = this()
      def this(size: Unit, `type`: Double) = this()
      def this(size: Double, `type`: Double, deprecateMsg: Boolean) = this()
      def this(size: Double, `type`: Unit, deprecateMsg: Boolean) = this()
      def this(size: Unit, `type`: Double, deprecateMsg: Boolean) = this()
      def this(size: Unit, `type`: Unit, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node", "FileSystem.HTML5FS")
    @js.native
    def HTML5FS: TypeofHTML5FS = js.native
    inline def HTML5FS_=(x: TypeofHTML5FS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTML5FS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.InMemory")
    @js.native
    open class InMemory ()
      extends typingsJapgolly.browserfs.distNodeBackendInMemoryMod.default
    @JSImport("browserfs/dist/node", "FileSystem.InMemory")
    @js.native
    def InMemory: TypeofInMemory = js.native
    inline def InMemory_=(x: TypeofInMemory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InMemory")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.IndexedDB")
    @js.native
    open class IndexedDB protected ()
      extends typingsJapgolly.browserfs.distNodeBackendIndexedDBMod.default {
      /**
        * **Deprecated. Use IndexedDB.Create() method instead.**
        *
        * Constructs an IndexedDB file system.
        * @param cb Called once the database is instantiated and ready for use.
        *   Passes an error if there was an issue instantiating the database.
        * @param storeName The name of this file system. You can have
        *   multiple IndexedDB file systems operating at once, but each must have
        *   a different name.
        */
      def this(cb: BFSCallback[IndexedDBFileSystem]) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String, deprecateMsg: Boolean) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: Unit, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node", "FileSystem.IndexedDB")
    @js.native
    def IndexedDB: TypeofIndexedDB = js.native
    inline def IndexedDB_=(x: TypeofIndexedDB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexedDB")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.IsoFS")
    @js.native
    open class IsoFS protected ()
      extends typingsJapgolly.browserfs.distNodeBackendIsoFSMod.default {
      /**
        * **Deprecated. Please use IsoFS.Create() method instead.**
        *
        * Constructs a read-only file system from the given ISO.
        * @param data The ISO file in a buffer.
        * @param name The name of the ISO (optional; used for debug messages / identification via getName()).
        */
      def this(data: Buffer) = this()
      def this(data: Buffer, name: String) = this()
      def this(data: Buffer, name: String, deprecateMsg: Boolean) = this()
      def this(data: Buffer, name: Unit, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node", "FileSystem.IsoFS")
    @js.native
    def IsoFS: TypeofIsoFS = js.native
    inline def IsoFS_=(x: TypeofIsoFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsoFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.LocalStorage")
    @js.native
    /**
      * Creates a new LocalStorage file system using the contents of `localStorage`.
      */
    open class LocalStorage ()
      extends typingsJapgolly.browserfs.distNodeBackendLocalStorageMod.default
    @JSImport("browserfs/dist/node", "FileSystem.LocalStorage")
    @js.native
    def LocalStorage: TypeofLocalStorage = js.native
    inline def LocalStorage_=(x: TypeofLocalStorage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalStorage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.MountableFileSystem")
    @js.native
    /**
      * Creates a new, empty MountableFileSystem.
      */
    open class MountableFileSystem ()
      extends typingsJapgolly.browserfs.distNodeBackendMountableFileSystemMod.default
    @JSImport("browserfs/dist/node", "FileSystem.MountableFileSystem")
    @js.native
    def MountableFileSystem: TypeofMountableFileSystem = js.native
    inline def MountableFileSystem_=(x: TypeofMountableFileSystem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MountableFileSystem")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.OverlayFS")
    @js.native
    open class OverlayFS protected ()
      extends typingsJapgolly.browserfs.distNodeBackendOverlayFSMod.default {
      /**
        * **Deprecated. Please use OverlayFS.Create() method instead.**
        * @param writable The file system to write modified files to.
        * @param readable The file system that initially populates this file system.
        */
      def this(
        writable: typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem,
        readable: typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem
      ) = this()
      def this(
        writable: typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem,
        readable: typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem,
        deprecateMsg: Boolean
      ) = this()
    }
    @JSImport("browserfs/dist/node", "FileSystem.OverlayFS")
    @js.native
    def OverlayFS: TypeofOverlayFS = js.native
    inline def OverlayFS_=(x: TypeofOverlayFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OverlayFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.WorkerFS")
    @js.native
    open class WorkerFS protected ()
      extends typingsJapgolly.browserfs.distNodeBackendWorkerFSMod.default {
      /**
        * **Deprecated. Please use WorkerFS.Create() method instead.**
        *
        * Constructs a new WorkerFS instance that connects with BrowserFS running on
        * the specified worker.
        */
      def this(worker: Worker) = this()
      def this(worker: Worker, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node", "FileSystem.WorkerFS")
    @js.native
    def WorkerFS: TypeofWorkerFS = js.native
    inline def WorkerFS_=(x: TypeofWorkerFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WorkerFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.XmlHttpRequest")
    @js.native
    open class XmlHttpRequest protected ()
      extends typingsJapgolly.browserfs.distNodeBackendXmlHttpRequestMod.default {
      /**
        * **Deprecated. Please use XmlHttpRequest.Create() method instead to construct XmlHttpRequest objects.**
        *
        * Constructs the file system. You must provide the directory listing as a JSON object
        * produced by the `make_xhrfs_index` script.
        *
        * **DEPRECATED:** You may pass a URL to the file index to the constructor, which will fetch the file index
        * *synchronously* and may freeze up the web page. This behavior will be removed in the next major version
        * of BrowserFS.
        *
        * @param listingUrlOrObj index object or the path to the JSON file index generated by
        *   `make_xhrfs_index`.
        * @param prefixUrl URL that is prepended to any file locations in the file index. e.g. if `prefixUrl = 'data/`, and the user wants to open the file `/foo.txt`,
        * the file system will fetch file `data/foo.txt`. The browser will access the file relative to the currrent webpage
        * URL.
        */
      def this(listingUrlOrObj: String) = this()
      def this(listingUrlOrObj: js.Object) = this()
      def this(listingUrlOrObj: String, prefixUrl: String) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: String) = this()
      def this(listingUrlOrObj: String, prefixUrl: String, deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: String, prefixUrl: Unit, deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: String, deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: Unit, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node", "FileSystem.XmlHttpRequest")
    @js.native
    def XmlHttpRequest: TypeofXmlHttpRequest = js.native
    inline def XmlHttpRequest_=(x: TypeofXmlHttpRequest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XmlHttpRequest")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node", "FileSystem.ZipFS")
    @js.native
    open class ZipFS protected ()
      extends typingsJapgolly.browserfs.distNodeBackendZipFSMod.default {
      def this(input: ZipTOC) = this()
      /**
        * **Deprecated. Please use ZipFS.Create() method to construct ZipFS objects.**
        */
      def this(input: Buffer) = this()
      def this(input: ZipTOC, name: String) = this()
      def this(input: Buffer, name: String) = this()
      def this(input: ZipTOC, name: String, deprecateMsg: Boolean) = this()
      def this(input: ZipTOC, name: Unit, deprecateMsg: Boolean) = this()
      def this(input: Buffer, name: String, deprecateMsg: Boolean) = this()
      def this(input: Buffer, name: Unit, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node", "FileSystem.ZipFS")
    @js.native
    def ZipFS: TypeofZipFS = js.native
    inline def ZipFS_=(x: TypeofZipFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZipFS")(x.asInstanceOf[js.Any])
  }
  
  inline def configure(config: FileSystemConfiguration, cb: BFSOneArgCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFileSystem(config: FileSystemConfiguration, cb: BFSCallback[FileSystem]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")(config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def initialize(rootfs: FileSystem): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(rootfs.asInstanceOf[js.Any]).asInstanceOf[FileSystem]
  
  inline def install(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerFileSystem(name: String, fs: FileSystemConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFileSystem")(name.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("browserfs/dist/node", "setImmediate")
  @js.native
  def setImmediate: js.Function1[/* cb */ js.Function, Any] = js.native
  inline def setImmediate_=(x: js.Function1[/* cb */ js.Function, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(x.asInstanceOf[js.Any])
}
