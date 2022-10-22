package typingsJapgolly.qIo

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//TODO add support for q-io/http-apps
//TODO add verified support for q-io/fs-mock
//TODO fix Readers/Writers properly
//TODO find solution for overloaded return types (QioFS.open/QioFS.read)
//     for some ideas see https://typescript.codeplex.com/discussions/461587#post1105930
object QioFS {
  
  trait NodeStats extends StObject {
    
    var atime: js.Date
    
    var blksize: Double
    
    var blocks: Double
    
    var ctime: js.Date
    
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
    
    var nlink: Double
    
    var node: NodeStats
    
    var rdev: Double
    
    var size: Double
    
    var uid: Double
  }
  object NodeStats {
    
    inline def apply(
      atime: js.Date,
      blksize: Double,
      blocks: Double,
      ctime: js.Date,
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
      nlink: Double,
      node: NodeStats,
      rdev: Double,
      size: Double,
      uid: Double
    ): NodeStats = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = isBlockDevice.toJsFn, isCharacterDevice = isCharacterDevice.toJsFn, isDirectory = isDirectory.toJsFn, isFIFO = isFIFO.toJsFn, isFile = isFile.toJsFn, isSocket = isSocket.toJsFn, isSymbolicLink = isSymbolicLink.toJsFn, mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeStats]
    }
    
    extension [Self <: NodeStats](x: Self) {
      
      inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
      
      inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
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
      
      inline def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
      
      inline def setNode(value: NodeStats): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  //listed but not implemented by Q-io
  //export function glob(pattern):Q.Promise<string[]>;
  //export function match(pattern, path:string):Q.Promise<string[]>;
  //TODO link this to node.js FS module (no lazy clones)
  trait Stats extends StObject {
    
    var node: NodeStats
    
    var size: Double
  }
  object Stats {
    
    inline def apply(node: NodeStats, size: Double): Stats = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setNode(value: NodeStats): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
