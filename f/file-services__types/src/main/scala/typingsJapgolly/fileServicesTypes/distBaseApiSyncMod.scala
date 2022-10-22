package typingsJapgolly.fileServicesTypes

import typingsJapgolly.fileServicesTypes.anon.Encoding
import typingsJapgolly.fileServicesTypes.anon.Flag
import typingsJapgolly.fileServicesTypes.anon.Recursive
import typingsJapgolly.fileServicesTypes.anon.StatSyncOptionsthrowIfNoE
import typingsJapgolly.fileServicesTypes.anon.StatSyncOptionsthrowIfNoEThrowIfNoEntry
import typingsJapgolly.fileServicesTypes.anon.WithFileTypes
import typingsJapgolly.fileServicesTypes.anon.`0`
import typingsJapgolly.fileServicesTypes.distCommonFsTypesMod.BufferEncoding
import typingsJapgolly.fileServicesTypes.distCommonFsTypesMod.IDirectoryEntry
import typingsJapgolly.fileServicesTypes.distCommonFsTypesMod.IFileSystemStats
import typingsJapgolly.fileServicesTypes.distCommonFsTypesMod.ReadFileOptions
import typingsJapgolly.fileServicesTypes.distCommonFsTypesMod.RmOptions
import typingsJapgolly.fileServicesTypes.distCommonFsTypesMod.StatSyncOptions
import typingsJapgolly.fileServicesTypes.distCommonFsTypesMod.WriteFileOptions
import typingsJapgolly.fileServicesTypes.distCommonFsTypesMod.global.Buffer
import typingsJapgolly.fileServicesTypes.distPathMod.IFileSystemPath
import typingsJapgolly.fileServicesTypes.distWatchApiMod.IWatchService
import typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.dir
import typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.file
import typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.junction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBaseApiSyncMod {
  
  @js.native
  trait IBaseFileSystemSync
    extends StObject
       with IBaseFileSystemSyncActions
       with IFileSystemPath {
    
    var caseSensitive: Boolean = js.native
    
    var watchService: IWatchService = js.native
  }
  
  @js.native
  trait IBaseFileSystemSyncActions extends StObject {
    
    /**
      * Change the working directory.
      *
      * @directoryPath path to the new working directory.
      */
    def chdir(directoryPath: String): Unit = js.native
    
    /**
      * Copy `sourcePath` to `destinationPath`.
      * By default, if destination already exists, it will be overwritten.
      *
      * @param flags passing `FileSystemConstants.COPYFILE_EXCL` will cause operation to fail if destination exists.
      */
    def copyFileSync(sourcePath: String, destinationPath: String): Unit = js.native
    def copyFileSync(sourcePath: String, destinationPath: String, flags: Double): Unit = js.native
    
    /**
      * Get the current working directory.
      * Non-absolute calls to any file system method are resolved using this path.
      *
      * @returns absolute path to the current working directory.
      */
    def cwd(): String = js.native
    
    /**
      * Check if a path points to an existing file/directory/link.
      *
      * @param path possible file path.
      * @param statFn optional custom stat function (e.g. lstat to detect links).
      */
    def existsSync(path: String): Boolean = js.native
    
    def lstatSync(path: String): js.UndefOr[IFileSystemStats] = js.native
    def lstatSync(path: String, options: StatSyncOptionsthrowIfNoE): IFileSystemStats = js.native
    def lstatSync(path: String, options: StatSyncOptionsthrowIfNoEThrowIfNoEntry): js.UndefOr[IFileSystemStats] = js.native
    def lstatSync(path: String, options: StatSyncOptions): js.UndefOr[IFileSystemStats] = js.native
    /**
      * Get path's `IFileSystemStats`. Does not dereference symbolic links.
      */
    @JSName("lstatSync")
    def lstatSync_IFileSystemStats(path: String): IFileSystemStats = js.native
    
    /**
      * Create a new directory.
      */
    def mkdirSync(directoryPath: String): js.UndefOr[String] = js.native
    def mkdirSync(directoryPath: String, options: Recursive): js.UndefOr[String] = js.native
    
    def readFileSync(path: String): String | Buffer = js.native
    def readFileSync(path: String, options: Encoding): Buffer = js.native
    def readFileSync(path: String, options: Flag): String = js.native
    def readFileSync(path: String, options: BufferEncoding): String = js.native
    def readFileSync(path: String, options: ReadFileOptions): String | Buffer = js.native
    /**
      * Read the entire contents of a file.
      */
    @JSName("readFileSync")
    def readFileSync_Buffer(path: String): Buffer = js.native
    
    /**
      * Read the names of items in a directory.
      */
    def readdirSync(directoryPath: String): js.Array[String] = js.native
    def readdirSync(directoryPath: String, options: WithFileTypes): js.Array[String] = js.native
    def readdirSync(directoryPath: String, options: `0`): js.Array[IDirectoryEntry] = js.native
    def readdirSync(directoryPath: String, options: BufferEncoding): js.Array[String] = js.native
    
    /**
      * Read value of a symbolic link.
      */
    def readlinkSync(path: String): String = js.native
    
    /**
      * Get the canonicalized absolute pathname.
      * If path is linked, returns the actual target path.
      */
    def realpathSync(path: String): String = js.native
    
    /**
      * Rename (move) a file or a directory
      */
    def renameSync(sourcePath: String, destinationPath: String): Unit = js.native
    
    /**
      * Removes files and directories.
      */
    def rmSync(path: String): Unit = js.native
    def rmSync(path: String, options: RmOptions): Unit = js.native
    
    /**
      * Delete an existing directory.
      */
    def rmdirSync(directoryPath: String): Unit = js.native
    
    def statSync(path: String): js.UndefOr[IFileSystemStats] = js.native
    def statSync(path: String, options: StatSyncOptionsthrowIfNoE): IFileSystemStats = js.native
    def statSync(path: String, options: StatSyncOptionsthrowIfNoEThrowIfNoEntry): js.UndefOr[IFileSystemStats] = js.native
    def statSync(path: String, options: StatSyncOptions): js.UndefOr[IFileSystemStats] = js.native
    /**
      * Get path's `IFileSystemStats`.
      */
    @JSName("statSync")
    def statSync_IFileSystemStats(path: String): IFileSystemStats = js.native
    
    /**
      * Creates a symbolic link for `target` at `path`. default type is 'file'.
      */
    def symlinkSync(target: String, path: String): Unit = js.native
    def symlinkSync(target: String, path: String, `type`: dir | file | junction): Unit = js.native
    
    /**
      * Delete a name and possibly the file it refers to.
      */
    def unlinkSync(filePath: String): Unit = js.native
    
    /**
      * Write data to a file, replacing the file if already exists.
      * `encoding` is used when a string `content` (not `Buffer`) was provided (with default 'utf8').
      */
    def writeFileSync(path: String, data: String): Unit = js.native
    def writeFileSync(path: String, data: String, options: WriteFileOptions): Unit = js.native
    def writeFileSync(path: String, data: js.typedarray.Uint8Array): Unit = js.native
    def writeFileSync(path: String, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
  }
}
