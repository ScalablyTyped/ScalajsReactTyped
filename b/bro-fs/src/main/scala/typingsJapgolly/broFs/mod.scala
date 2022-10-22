package typingsJapgolly.broFs

import org.scalajs.dom.Blob
import org.scalajs.dom.File
import org.scalajs.dom.ReadableStream
import typingsJapgolly.broFs.anon.Create
import typingsJapgolly.broFs.anon.Deep
import typingsJapgolly.broFs.anon.Type
import typingsJapgolly.broFs.anon.`0`
import typingsJapgolly.broFs.anon.`1`
import typingsJapgolly.broFs.anon.`2`
import typingsJapgolly.filesystem.DirectoryEntry
import typingsJapgolly.filesystem.FileEntry
import typingsJapgolly.std.FileSystem
import typingsJapgolly.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bro-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendFile(path: String, data: String): js.Promise[FileSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystem]]
  inline def appendFile(path: String, data: js.typedarray.ArrayBuffer): js.Promise[FileSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystem]]
  inline def appendFile(path: String, data: Blob): js.Promise[FileSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystem]]
  inline def appendFile(path: String, data: File): js.Promise[FileSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystem]]
  inline def appendFile(path: FileEntry, data: String): js.Promise[FileSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystem]]
  inline def appendFile(path: FileEntry, data: js.typedarray.ArrayBuffer): js.Promise[FileSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystem]]
  inline def appendFile(path: FileEntry, data: Blob): js.Promise[FileSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystem]]
  inline def appendFile(path: FileEntry, data: File): js.Promise[FileSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileSystem]]
  
  inline def clear(): js.Promise[js.Array[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[js.Promise[js.Array[Unit]]]
  
  inline def copy(oldPath: String, newPath: String): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  inline def copy(oldPath: String, newPath: String, options: Create): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  inline def copy(oldPath: FileEntry, newPath: String): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  inline def copy(oldPath: FileEntry, newPath: String, options: Create): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  
  inline def createReadStream(): js.Promise[ReadableStream[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")().asInstanceOf[js.Promise[ReadableStream[Any]]]
  
  inline def createWriteStream(): js.Promise[WritableStream[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")().asInstanceOf[js.Promise[WritableStream[Any]]]
  
  inline def exists(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getEntry(path: FileEntry): js.Promise[FileEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntry")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileEntry]]
  
  inline def getRoot(): js.Promise[DirectoryEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoot")().asInstanceOf[js.Promise[DirectoryEntry]]
  
  inline def getUrl(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getUrl(path: FileEntry): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def init(): js.Promise[FileSystem] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[FileSystem]]
  inline def init(options: FSOptions): js.Promise[FileSystem] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileSystem]]
  
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  inline def mkdir(path: String): js.Promise[DirectoryEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DirectoryEntry]]
  
  inline def readFile(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def readFile(path: String, options: Type): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def readFile(path: String, options: `0`): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  inline def readFile(path: String, options: `1`): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  inline def readFile(path: String, options: `2`): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(path: FileEntry): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def readFile(path: FileEntry, options: Type): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def readFile(path: FileEntry, options: `0`): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  inline def readFile(path: FileEntry, options: `1`): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  inline def readFile(path: FileEntry, options: `2`): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def readdir(path: String): js.Promise[js.Array[FileEntry]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileEntry]]]
  inline def readdir(path: String, options: Deep): js.Promise[js.Array[FileEntry]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[FileEntry]]]
  inline def readdir(path: DirectoryEntry): js.Promise[js.Array[FileEntry]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileEntry]]]
  inline def readdir(path: DirectoryEntry, options: Deep): js.Promise[js.Array[FileEntry]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[FileEntry]]]
  
  inline def rename(oldPath: String, newPath: String): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  inline def rename(oldPath: String, newPath: String, options: Create): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  inline def rename(oldPath: FileEntry, newPath: String): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  inline def rename(oldPath: FileEntry, newPath: String, options: Create): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  
  inline def rmdir(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def rmdir(path: DirectoryEntry): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def stat(path: String): js.Promise[StatObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StatObject]]
  inline def stat(path: FileEntry): js.Promise[StatObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StatObject]]
  
  inline def unlink(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def unlink(path: FileEntry): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def usage(): js.Promise[UsageObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("usage")().asInstanceOf[js.Promise[UsageObject]]
  
  inline def writeFile(path: String, data: String): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  inline def writeFile(path: String, data: js.typedarray.ArrayBuffer): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  inline def writeFile(path: String, data: Blob): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  inline def writeFile(path: String, data: File): js.Promise[FileEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileEntry]]
  
  trait FSOptions extends StObject {
    
    var bytes: js.UndefOr[Double] = js.undefined
    
    /**
      * show request quota popup for PERSISTENT type
      * (for Chrome extensions with `unlimitedStorage` permission it is useful to pass `options.requestQuota = false`)
      */
    var requestQuota: js.UndefOr[Boolean] = js.undefined
    
    /** `window.PERSISTENT` | `window.TEMPORARY` */
    var `type`: js.UndefOr[Double] = js.undefined
  }
  object FSOptions {
    
    inline def apply(): FSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FSOptions]
    }
    
    extension [Self <: FSOptions](x: Self) {
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
      
      inline def setRequestQuota(value: Boolean): Self = StObject.set(x, "requestQuota", value.asInstanceOf[js.Any])
      
      inline def setRequestQuotaUndefined: Self = StObject.set(x, "requestQuota", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait StatObject extends StObject {
    
    var fullPath: String
    
    var isDirectory: Boolean
    
    var isFile: Boolean
    
    var modificationTime: js.Date
    
    var name: String
    
    var size: Double
  }
  object StatObject {
    
    inline def apply(
      fullPath: String,
      isDirectory: Boolean,
      isFile: Boolean,
      modificationTime: js.Date,
      name: String,
      size: Double
    ): StatObject = {
      val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatObject]
    }
    
    extension [Self <: StatObject](x: Self) {
      
      inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      inline def setModificationTime(value: js.Date): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.broFs.broFsStrings.Text
    - typingsJapgolly.broFs.broFsStrings.BinaryString
    - typingsJapgolly.broFs.broFsStrings.DataURL
  */
  trait TextType extends StObject
  object TextType {
    
    inline def BinaryString: typingsJapgolly.broFs.broFsStrings.BinaryString = "BinaryString".asInstanceOf[typingsJapgolly.broFs.broFsStrings.BinaryString]
    
    inline def DataURL: typingsJapgolly.broFs.broFsStrings.DataURL = "DataURL".asInstanceOf[typingsJapgolly.broFs.broFsStrings.DataURL]
    
    inline def Text: typingsJapgolly.broFs.broFsStrings.Text = "Text".asInstanceOf[typingsJapgolly.broFs.broFsStrings.Text]
  }
  
  trait UsageObject extends StObject {
    
    var grantedBytes: Double
    
    var usedBytes: Double
  }
  object UsageObject {
    
    inline def apply(grantedBytes: Double, usedBytes: Double): UsageObject = {
      val __obj = js.Dynamic.literal(grantedBytes = grantedBytes.asInstanceOf[js.Any], usedBytes = usedBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageObject]
    }
    
    extension [Self <: UsageObject](x: Self) {
      
      inline def setGrantedBytes(value: Double): Self = StObject.set(x, "grantedBytes", value.asInstanceOf[js.Any])
      
      inline def setUsedBytes(value: Double): Self = StObject.set(x, "usedBytes", value.asInstanceOf[js.Any])
    }
  }
}
