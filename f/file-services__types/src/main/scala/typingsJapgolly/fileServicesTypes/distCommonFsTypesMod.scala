package typingsJapgolly.fileServicesTypes

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonFsTypesMod {
  
  @js.native
  sealed trait FileSystemConstants extends StObject
  @JSImport("@file-services/types/dist/common-fs-types", "FileSystemConstants")
  @js.native
  object FileSystemConstants extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FileSystemConstants & Double] = js.native
    
    /**
      * When passed as a flag to `copyFile` or `copyFileSync`,
      * causes operation to fail if destination already exists.
      */
    @js.native
    sealed trait COPYFILE_EXCL
      extends StObject
         with FileSystemConstants
    /* 1 */ val COPYFILE_EXCL: typingsJapgolly.fileServicesTypes.distCommonFsTypesMod.FileSystemConstants.COPYFILE_EXCL & Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.ascii
    - typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.utf8
    - typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.`utf-8`
    - typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.utf16le
    - typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.ucs2
    - typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.`ucs-2`
    - typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.base64
    - typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.latin1
    - typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.binary
    - typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.hex
  */
  trait BufferEncoding
    extends StObject
       with _ReadFileOptions
       with _WriteFileOptions
  object BufferEncoding {
    
    inline def ascii: typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.ascii = "ascii".asInstanceOf[typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.ascii]
    
    inline def base64: typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.base64 = "base64".asInstanceOf[typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.base64]
    
    inline def binary: typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.binary = "binary".asInstanceOf[typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.binary]
    
    inline def hex: typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.hex = "hex".asInstanceOf[typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.hex]
    
    inline def latin1: typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.latin1 = "latin1".asInstanceOf[typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.latin1]
    
    inline def `ucs-2`: typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.`ucs-2` = "ucs-2".asInstanceOf[typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.`ucs-2`]
    
    inline def ucs2: typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.ucs2 = "ucs2".asInstanceOf[typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.ucs2]
    
    inline def `utf-8`: typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.`utf-8` = "utf-8".asInstanceOf[typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.`utf-8`]
    
    inline def utf16le: typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.utf16le = "utf16le".asInstanceOf[typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.utf16le]
    
    inline def utf8: typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.utf8 = "utf8".asInstanceOf[typingsJapgolly.fileServicesTypes.fileServicesTypesStrings.utf8]
  }
  
  type CallbackFn[T] = js.Function2[/* error */ js.Error | Null, /* value */ T, Unit]
  
  type CallbackFnVoid = js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  
  trait IDirectoryContents
    extends StObject
       with /* nodeName */ StringDictionary[String | IDirectoryContents]
  object IDirectoryContents {
    
    inline def apply(): IDirectoryContents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDirectoryContents]
    }
  }
  
  trait IDirectoryEntry extends StObject {
    
    /**
      * Whether the entry points to a directory.
      */
    def isDirectory(): Boolean
    
    /**
      * Whether the entry points to a file.
      */
    def isFile(): Boolean
    
    /**
      * Whether the entry is a symbolic link.
      */
    def isSymbolicLink(): Boolean
    
    /**
      * Base name of the entry.
      *
      * @example `package.json`
      */
    var name: String
  }
  object IDirectoryEntry {
    
    inline def apply(
      isDirectory: CallbackTo[Boolean],
      isFile: CallbackTo[Boolean],
      isSymbolicLink: CallbackTo[Boolean],
      name: String
    ): IDirectoryEntry = {
      val __obj = js.Dynamic.literal(isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn, isSymbolicLink = isSymbolicLink.toJsFn, name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDirectoryEntry]
    }
    
    extension [Self <: IDirectoryEntry](x: Self) {
      
      inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
      
      inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
      
      inline def setIsSymbolicLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSymbolicLink", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFileSystemDescriptor extends StObject {
    
    /**
      * Base name of the file system node.
      *
      * @example 'package.json'
      */
    var name: String
    
    /**
      * Absolute path to the file system node.
      *
      * @example '/path/to/package.json'
      */
    var path: String
  }
  object IFileSystemDescriptor {
    
    inline def apply(name: String, path: String): IFileSystemDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileSystemDescriptor]
    }
    
    extension [Self <: IFileSystemDescriptor](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFileSystemStats extends StObject {
    
    /**
      * Creation time
      */
    var birthtime: js.Date
    
    /**
      * is the path pointing to a directory
      */
    def isDirectory(): Boolean
    
    /**
      * is the path pointing to a file
      */
    def isFile(): Boolean
    
    /**
      * is the path pointing to a symbolic link
      */
    def isSymbolicLink(): Boolean
    
    /**
      * Modification time
      */
    var mtime: js.Date
  }
  object IFileSystemStats {
    
    inline def apply(
      birthtime: js.Date,
      isDirectory: CallbackTo[Boolean],
      isFile: CallbackTo[Boolean],
      isSymbolicLink: CallbackTo[Boolean],
      mtime: js.Date
    ): IFileSystemStats = {
      val __obj = js.Dynamic.literal(birthtime = birthtime.asInstanceOf[js.Any], isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn, isSymbolicLink = isSymbolicLink.toJsFn, mtime = mtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileSystemStats]
    }
    
    extension [Self <: IFileSystemStats](x: Self) {
      
      inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
      
      inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
      
      inline def setIsSymbolicLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSymbolicLink", value.toJsFn)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWalkOptions extends StObject {
    
    /**
      * Optional directory filtering function that receives a directory descriptor and returns
      * whether it should be walked into.
      *
      * @default true returned for all directories.
      */
    var filterDirectory: js.UndefOr[js.Function1[/* pathDesc */ IFileSystemDescriptor, Boolean]] = js.undefined
    
    /**
      * Optional file filtering function that receives a file descriptor and returns
      * whether it should be included in the result.
      *
      * @default true returned for all files.
      */
    var filterFile: js.UndefOr[js.Function1[/* pathDesc */ IFileSystemDescriptor, Boolean]] = js.undefined
  }
  object IWalkOptions {
    
    inline def apply(): IWalkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWalkOptions]
    }
    
    extension [Self <: IWalkOptions](x: Self) {
      
      inline def setFilterDirectory(value: /* pathDesc */ IFileSystemDescriptor => Boolean): Self = StObject.set(x, "filterDirectory", js.Any.fromFunction1(value))
      
      inline def setFilterDirectoryUndefined: Self = StObject.set(x, "filterDirectory", js.undefined)
      
      inline def setFilterFile(value: /* pathDesc */ IFileSystemDescriptor => Boolean): Self = StObject.set(x, "filterFile", js.Any.fromFunction1(value))
      
      inline def setFilterFileUndefined: Self = StObject.set(x, "filterFile", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fileServicesTypes.anon.EncodingFlag
    - typingsJapgolly.fileServicesTypes.distCommonFsTypesMod.BufferEncoding
    - scala.Null
  */
  type ReadFileOptions = _ReadFileOptions | Null
  
  trait RmOptions extends StObject {
    
    /**
      * When `true`, exceptions will be ignored if `path` does not exist.
      * @default false
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, perform a recursive directory removal.
      * @default false
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object RmOptions {
    
    inline def apply(): RmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RmOptions]
    }
    
    extension [Self <: RmOptions](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait StatSyncOptions extends StObject {
    
    /**
      * Whether an exception will be thrown if no file system entry exists, rather than returning `undefined`.
      * @default true
      */
    var throwIfNoEntry: js.UndefOr[Boolean] = js.undefined
  }
  object StatSyncOptions {
    
    inline def apply(): StatSyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatSyncOptions]
    }
    
    extension [Self <: StatSyncOptions](x: Self) {
      
      inline def setThrowIfNoEntry(value: Boolean): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
      
      inline def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fileServicesTypes.anon.Mode
    - typingsJapgolly.fileServicesTypes.distCommonFsTypesMod.BufferEncoding
    - scala.Null
  */
  type WriteFileOptions = _WriteFileOptions | Null
  
  trait _ReadFileOptions extends StObject
  
  trait _WriteFileOptions extends StObject
  
  object global {
    
    @js.native
    trait Buffer extends StObject {
      
      def toString(ecoding: BufferEncoding): String = js.native
    }
  }
}
