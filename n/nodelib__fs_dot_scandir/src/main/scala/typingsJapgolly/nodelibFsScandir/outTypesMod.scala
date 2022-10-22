package typingsJapgolly.nodelibFsScandir

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTypesMod {
  
  trait Dirent extends StObject {
    
    def isBlockDevice(): Boolean
    
    def isCharacterDevice(): Boolean
    
    def isDirectory(): Boolean
    
    def isFIFO(): Boolean
    
    def isFile(): Boolean
    
    def isSocket(): Boolean
    
    def isSymbolicLink(): Boolean
    
    var name: String
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
  
  trait Entry extends StObject {
    
    var dirent: Dirent
    
    var name: String
    
    var path: String
    
    var stats: js.UndefOr[Stats] = js.undefined
  }
  object Entry {
    
    inline def apply(dirent: Dirent, name: String, path: String): Entry = {
      val __obj = js.Dynamic.literal(dirent = dirent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setDirent(value: Dirent): Self = StObject.set(x, "dirent", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  type ErrnoException = typingsJapgolly.node.NodeJS.ErrnoException
  
  type Stats = typingsJapgolly.node.fsMod.Stats
}
