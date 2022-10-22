package typingsJapgolly.parcelFs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.parcelFs.anon.WithFileTypes
import typingsJapgolly.parcelFs.anon.`0`
import typingsJapgolly.parcelTypes.mod.FilePath
import typingsJapgolly.parcelWatcher.mod.AsyncSubscription
import typingsJapgolly.parcelWatcher.mod.Event
import typingsJapgolly.parcelWatcher.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait Dirent extends StObject {
    
    def isBlockDevice(): Boolean
    
    def isCharacterDevice(): Boolean
    
    def isDirectory(): Boolean
    
    def isFIFO(): Boolean
    
    def isFile(): Boolean
    
    def isSocket(): Boolean
    
    def isSymbolicLink(): Boolean
    
    val name: String
  }
  object Dirent {
    
    inline def apply(
      isBlockDevice: CallbackTo[Boolean],
      isCharacterDevice: CallbackTo[Boolean],
      isDirectory: CallbackTo[Boolean],
      isFIFO: CallbackTo[Boolean],
      isFile: CallbackTo[Boolean],
      isSocket: CallbackTo[Boolean],
      isSymbolicLink: CallbackTo[Boolean],
      name: String
    ): Dirent = {
      val __obj = js.Dynamic.literal(isBlockDevice = isBlockDevice.toJsFn, isCharacterDevice = isCharacterDevice.toJsFn, isDirectory = isDirectory.toJsFn, isFIFO = isFIFO.toJsFn, isFile = isFile.toJsFn, isSocket = isSocket.toJsFn, isSymbolicLink = isSymbolicLink.toJsFn, name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dirent]
    }
    
    extension [Self <: Dirent](x: Self) {
      
      inline def setIsBlockDevice(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBlockDevice", value.toJsFn)
      
      inline def setIsCharacterDevice(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCharacterDevice", value.toJsFn)
      
      inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
      
      inline def setIsFIFO(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFIFO", value.toJsFn)
      
      inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
      
      inline def setIsSocket(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSocket", value.toJsFn)
      
      inline def setIsSymbolicLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSymbolicLink", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.parcelFs.parcelFsStrings.hex
    - typingsJapgolly.parcelFs.parcelFsStrings.utf8
    - typingsJapgolly.parcelFs.parcelFsStrings.`utf-8`
    - typingsJapgolly.parcelFs.parcelFsStrings.ascii
    - typingsJapgolly.parcelFs.parcelFsStrings.binary
    - typingsJapgolly.parcelFs.parcelFsStrings.base64
    - typingsJapgolly.parcelFs.parcelFsStrings.ucs2
    - typingsJapgolly.parcelFs.parcelFsStrings.`ucs-2`
    - typingsJapgolly.parcelFs.parcelFsStrings.utf16le
    - typingsJapgolly.parcelFs.parcelFsStrings.latin1
  */
  trait Encoding extends StObject
  object Encoding {
    
    inline def ascii: typingsJapgolly.parcelFs.parcelFsStrings.ascii = "ascii".asInstanceOf[typingsJapgolly.parcelFs.parcelFsStrings.ascii]
    
    inline def base64: typingsJapgolly.parcelFs.parcelFsStrings.base64 = "base64".asInstanceOf[typingsJapgolly.parcelFs.parcelFsStrings.base64]
    
    inline def binary: typingsJapgolly.parcelFs.parcelFsStrings.binary = "binary".asInstanceOf[typingsJapgolly.parcelFs.parcelFsStrings.binary]
    
    inline def hex: typingsJapgolly.parcelFs.parcelFsStrings.hex = "hex".asInstanceOf[typingsJapgolly.parcelFs.parcelFsStrings.hex]
    
    inline def latin1: typingsJapgolly.parcelFs.parcelFsStrings.latin1 = "latin1".asInstanceOf[typingsJapgolly.parcelFs.parcelFsStrings.latin1]
    
    inline def `ucs-2`: typingsJapgolly.parcelFs.parcelFsStrings.`ucs-2` = "ucs-2".asInstanceOf[typingsJapgolly.parcelFs.parcelFsStrings.`ucs-2`]
    
    inline def ucs2: typingsJapgolly.parcelFs.parcelFsStrings.ucs2 = "ucs2".asInstanceOf[typingsJapgolly.parcelFs.parcelFsStrings.ucs2]
    
    inline def `utf-8`: typingsJapgolly.parcelFs.parcelFsStrings.`utf-8` = "utf-8".asInstanceOf[typingsJapgolly.parcelFs.parcelFsStrings.`utf-8`]
    
    inline def utf16le: typingsJapgolly.parcelFs.parcelFsStrings.utf16le = "utf16le".asInstanceOf[typingsJapgolly.parcelFs.parcelFsStrings.utf16le]
    
    inline def utf8: typingsJapgolly.parcelFs.parcelFsStrings.utf8 = "utf8".asInstanceOf[typingsJapgolly.parcelFs.parcelFsStrings.utf8]
  }
  
  trait FileOptions extends StObject {
    
    var mode: js.UndefOr[Double] = js.undefined
  }
  object FileOptions {
    
    inline def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    extension [Self <: FileOptions](x: Self) {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait FileSystem extends StObject {
    
    def chdir(dir: FilePath): Unit = js.native
    
    def copyFile(source: FilePath, destination: FilePath): js.Promise[Unit] = js.native
    def copyFile(source: FilePath, destination: FilePath, flags: Double): js.Promise[Unit] = js.native
    
    def createReadStream(path: FilePath): Readable = js.native
    def createReadStream(path: FilePath, options: FileOptions): Readable = js.native
    
    def createWriteStream(path: FilePath): Writable = js.native
    def createWriteStream(path: FilePath, options: FileOptions): Writable = js.native
    
    def cwd(): FilePath = js.native
    
    def exists(path: FilePath): js.Promise[Boolean] = js.native
    
    def existsSync(path: FilePath): Boolean = js.native
    
    def findAncestorFile(fileNames: js.Array[String], fromDir: FilePath, root: FilePath): js.UndefOr[FilePath | Null] = js.native
    
    def findFirstFile(filePaths: js.Array[FilePath]): js.UndefOr[FilePath | Null] = js.native
    
    def findNodeModule(moduleName: String, fromDir: FilePath): js.UndefOr[FilePath | Null] = js.native
    
    def getEventsSince(dir: FilePath, snapshot: FilePath, opts: Options): js.Promise[js.Array[Event]] = js.native
    
    def mkdirp(path: FilePath): js.Promise[Unit] = js.native
    
    def ncp(source: FilePath, destination: FilePath): js.Promise[Unit] = js.native
    
    def readFile(filePath: FilePath): js.Promise[Buffer] = js.native
    def readFile(filePath: FilePath, encoding: Encoding): js.Promise[String] = js.native
    
    def readFileSync(filePath: FilePath): Buffer = js.native
    def readFileSync(filePath: FilePath, encoding: Encoding): String = js.native
    
    def readdir(path: FilePath): js.Promise[js.Array[FilePath]] = js.native
    def readdir(path: FilePath, opts: WithFileTypes): js.Promise[js.Array[FilePath]] = js.native
    def readdir(path: FilePath, opts: `0`): js.Promise[js.Array[Dirent]] = js.native
    
    def readdirSync(path: FilePath): js.Array[FilePath] = js.native
    def readdirSync(path: FilePath, opts: WithFileTypes): js.Array[FilePath] = js.native
    def readdirSync(path: FilePath, opts: `0`): js.Array[Dirent] = js.native
    
    def realpath(path: FilePath): js.Promise[FilePath] = js.native
    
    def realpathSync(path: FilePath): FilePath = js.native
    
    def rimraf(path: FilePath): js.Promise[Unit] = js.native
    
    def stat(filePath: FilePath): js.Promise[Stats] = js.native
    
    def statSync(filePath: FilePath): Stats = js.native
    
    def unlink(path: FilePath): js.Promise[Unit] = js.native
    
    def watch(
      dir: FilePath,
      fn: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* events */ js.Array[Event], Any],
      opts: Options
    ): js.Promise[AsyncSubscription] = js.native
    
    def writeFile(filePath: FilePath, contents: String): js.Promise[Unit] = js.native
    def writeFile(filePath: FilePath, contents: String, options: FileOptions): js.Promise[Unit] = js.native
    def writeFile(filePath: FilePath, contents: Buffer): js.Promise[Unit] = js.native
    def writeFile(filePath: FilePath, contents: Buffer, options: FileOptions): js.Promise[Unit] = js.native
    
    def writeSnapshot(dir: FilePath, snapshot: FilePath, opts: Options): js.Promise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.parcelFs.anon.WithFileTypes
    - typingsJapgolly.parcelFs.anon.`0`
  */
  trait ReaddirOptions extends StObject
  object ReaddirOptions {
    
    inline def `0`(): typingsJapgolly.parcelFs.anon.`0` = {
      val __obj = js.Dynamic.literal(withFileTypes = true)
      __obj.asInstanceOf[typingsJapgolly.parcelFs.anon.`0`]
    }
    
    inline def WithFileTypes(): typingsJapgolly.parcelFs.anon.WithFileTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.parcelFs.anon.WithFileTypes]
    }
  }
  
  trait Stats extends StObject {
    
    var atime: js.Date
    
    var atimeMs: Double
    
    var birthtime: js.Date
    
    var birthtimeMs: Double
    
    var blksize: Double
    
    var blocks: Double
    
    var ctime: js.Date
    
    var ctimeMs: Double
    
    var dev: Double
    
    var gid: Double
    
    var ino: Double
    
    def isBlockDevice(): Boolean
    
    def isCharacterDevice(): Boolean
    
    def isDirectory(): Boolean
    
    def isFIFO(): Boolean
    
    def isFile(): Boolean
    
    def isSocket(): Boolean
    
    def isSymbolicLink(): Boolean
    
    var mode: Double
    
    var mtime: js.Date
    
    var mtimeMs: Double
    
    var nlink: Double
    
    var rdev: Double
    
    var size: Double
    
    var uid: Double
  }
  object Stats {
    
    inline def apply(
      atime: js.Date,
      atimeMs: Double,
      birthtime: js.Date,
      birthtimeMs: Double,
      blksize: Double,
      blocks: Double,
      ctime: js.Date,
      ctimeMs: Double,
      dev: Double,
      gid: Double,
      ino: Double,
      isBlockDevice: CallbackTo[Boolean],
      isCharacterDevice: CallbackTo[Boolean],
      isDirectory: CallbackTo[Boolean],
      isFIFO: CallbackTo[Boolean],
      isFile: CallbackTo[Boolean],
      isSocket: CallbackTo[Boolean],
      isSymbolicLink: CallbackTo[Boolean],
      mode: Double,
      mtime: js.Date,
      mtimeMs: Double,
      nlink: Double,
      rdev: Double,
      size: Double,
      uid: Double
    ): Stats = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = isBlockDevice.toJsFn, isCharacterDevice = isCharacterDevice.toJsFn, isDirectory = isDirectory.toJsFn, isFIFO = isFIFO.toJsFn, isFile = isFile.toJsFn, isSocket = isSocket.toJsFn, isSymbolicLink = isSymbolicLink.toJsFn, mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setAtimeMs(value: Double): Self = StObject.set(x, "atimeMs", value.asInstanceOf[js.Any])
      
      inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
      
      inline def setBirthtimeMs(value: Double): Self = StObject.set(x, "birthtimeMs", value.asInstanceOf[js.Any])
      
      inline def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
      
      inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setCtimeMs(value: Double): Self = StObject.set(x, "ctimeMs", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      inline def setIsBlockDevice(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBlockDevice", value.toJsFn)
      
      inline def setIsCharacterDevice(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCharacterDevice", value.toJsFn)
      
      inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
      
      inline def setIsFIFO(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFIFO", value.toJsFn)
      
      inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
      
      inline def setIsSocket(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSocket", value.toJsFn)
      
      inline def setIsSymbolicLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSymbolicLink", value.toJsFn)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeMs(value: Double): Self = StObject.set(x, "mtimeMs", value.asInstanceOf[js.Any])
      
      inline def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
      
      inline def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
