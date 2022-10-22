package typingsJapgolly.browserfs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.browserfs.distNodeCoreNodeFsStatsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeGenericFileIndexMod {
  
  @JSImport("browserfs/dist/node/generic/file_index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("browserfs/dist/node/generic/file_index", "DirInode")
  @js.native
  /**
    * Constructs an inode for a directory.
    */
  open class DirInode[T] ()
    extends StObject
       with Inode {
    def this(data: T) = this()
    
    /* private */ var _ls: Any = js.native
    
    /**
      * Add the given item to the directory listing. Note that the given inode is
      * not copied, and will be mutated by the DirInode if it is a DirInode.
      * @param p Item name to add to the directory listing.
      * @param inode The inode for the
      *   item to add to the directory inode.
      * @return True if it was added, false if it already existed.
      */
    def addItem(p: String, inode: Inode): Boolean = js.native
    
    /* private */ var data: Any = js.native
    
    def getData(): T | Null = js.native
    
    /**
      * Returns the inode for the indicated item, or null if it does not exist.
      * @param p Name of item in this directory.
      */
    def getItem(p: String): Inode | Null = js.native
    
    /**
      * Returns the directory listing for this directory. Paths in the directory are
      * relative to the directory's path.
      * @return The directory listing for this directory.
      */
    def getListing(): js.Array[String] = js.native
    
    /**
      * Return a Stats object for this inode.
      * @todo Should probably remove this at some point. This isn't the
      *       responsibility of the FileIndex.
      */
    def getStats(): default = js.native
    
    /* CompleteClass */
    override def isDir(): Boolean = js.native
    
    /* CompleteClass */
    override def isFile(): Boolean = js.native
    
    /**
      * Removes the given item from the directory listing.
      * @param p Name of item to remove from the directory listing.
      * @return Returns the item
      *   removed, or null if the item did not exist.
      */
    def remItem(p: String): Inode | Null = js.native
  }
  
  @JSImport("browserfs/dist/node/generic/file_index", "FileIndex")
  @js.native
  /**
    * Constructs a new FileIndex.
    */
  open class FileIndex[T] () extends StObject {
    
    /* private */ var _index: Any = js.native
    
    /**
      * Split into a (directory path, item name) pair
      */
    /* private */ def _split_path(p: Any): Any = js.native
    
    /**
      * Adds the given absolute path to the index if it is not already in the index.
      * Creates any needed parent directories.
      * @param path The path to add to the index.
      * @param inode The inode for the
      *   path to add.
      * @return 'True' if it was added or already exists, 'false' if there
      *   was an issue adding it (e.g. item in path is a file, item exists but is
      *   different).
      * @todo If adding fails and implicitly creates directories, we do not clean up
      *   the new empty directories.
      */
    def addPath(path: String, inode: Inode): Boolean = js.native
    
    /**
      * Adds the given absolute path to the index if it is not already in the index.
      * The path is added without special treatment (no joining of adjacent separators, etc).
      * Creates any needed parent directories.
      * @param path The path to add to the index.
      * @param inode The inode for the
      *   path to add.
      * @return 'True' if it was added or already exists, 'false' if there
      *   was an issue adding it (e.g. item in path is a file, item exists but is
      *   different).
      * @todo If adding fails and implicitly creates directories, we do not clean up
      *   the new empty directories.
      */
    def addPathFast(path: String, inode: Inode): Boolean = js.native
    
    /**
      * Runs the given function over all files in the index.
      */
    def fileIterator[T](cb: js.Function1[/* file */ T | Null, Unit]): Unit = js.native
    
    /**
      * Returns the inode of the given item.
      * @return Returns null if the item does not exist.
      */
    def getInode(path: String): Inode | Null = js.native
    
    /**
      * Retrieves the directory listing of the given path.
      * @return An array of files in the given path, or 'null' if it does not exist.
      */
    def ls(path: String): js.Array[String] | Null = js.native
    
    /**
      * Removes the given path. Can be a file or a directory.
      * @return The removed item,
      *   or null if it did not exist.
      */
    def removePath(path: String): Inode | Null = js.native
  }
  /* static members */
  object FileIndex {
    
    @JSImport("browserfs/dist/node/generic/file_index", "FileIndex")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Static method for constructing indices from a JSON listing.
      * @param listing Directory listing generated by tools/XHRIndexer.coffee
      * @return A new FileIndex object.
      */
    inline def fromListing[T](listing: Any): FileIndex[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromListing")(listing.asInstanceOf[js.Any]).asInstanceOf[FileIndex[T]]
  }
  
  @JSImport("browserfs/dist/node/generic/file_index", "FileInode")
  @js.native
  open class FileInode[T] protected ()
    extends StObject
       with Inode {
    def this(data: T) = this()
    
    /* private */ var data: Any = js.native
    
    def getData(): T = js.native
    
    /* CompleteClass */
    override def isDir(): Boolean = js.native
    
    /* CompleteClass */
    override def isFile(): Boolean = js.native
    
    def setData(data: T): Unit = js.native
  }
  
  inline def isDirInode[T](): /* is browserfs.browserfs/dist/node/generic/file_index.DirInode<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirInode")().asInstanceOf[/* is browserfs.browserfs/dist/node/generic/file_index.DirInode<T> */ Boolean]
  inline def isDirInode[T](inode: Inode): /* is browserfs.browserfs/dist/node/generic/file_index.DirInode<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirInode")(inode.asInstanceOf[js.Any]).asInstanceOf[/* is browserfs.browserfs/dist/node/generic/file_index.DirInode<T> */ Boolean]
  
  inline def isFileInode[T](): /* is browserfs.browserfs/dist/node/generic/file_index.FileInode<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileInode")().asInstanceOf[/* is browserfs.browserfs/dist/node/generic/file_index.FileInode<T> */ Boolean]
  inline def isFileInode[T](inode: Inode): /* is browserfs.browserfs/dist/node/generic/file_index.FileInode<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileInode")(inode.asInstanceOf[js.Any]).asInstanceOf[/* is browserfs.browserfs/dist/node/generic/file_index.FileInode<T> */ Boolean]
  
  trait Inode extends StObject {
    
    def isDir(): Boolean
    
    def isFile(): Boolean
  }
  object Inode {
    
    inline def apply(isDir: CallbackTo[Boolean], isFile: CallbackTo[Boolean]): Inode = {
      val __obj = js.Dynamic.literal(isDir = isDir.toJsFn, isFile = isFile.toJsFn)
      __obj.asInstanceOf[Inode]
    }
    
    extension [Self <: Inode](x: Self) {
      
      inline def setIsDir(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDir", value.toJsFn)
      
      inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
    }
  }
}
