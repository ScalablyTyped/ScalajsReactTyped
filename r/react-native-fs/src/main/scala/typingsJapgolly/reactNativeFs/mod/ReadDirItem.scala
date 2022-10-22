package typingsJapgolly.reactNativeFs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadDirItem extends StObject {
  
  var ctime: js.UndefOr[js.Date] = js.undefined
  
  // Is the file just a file?
  def isDirectory(): Boolean
  
  // Size in bytes
  def isFile(): Boolean
  
  // The creation date of the file (iOS only)
  var mtime: js.UndefOr[js.Date] = js.undefined
  
  // The last modified date of the file
  var name: String
  
  // The name of the item
  var path: String
  
  // The absolute path to the item
  var size: Double
}
object ReadDirItem {
  
  inline def apply(
    isDirectory: CallbackTo[Boolean],
    isFile: CallbackTo[Boolean],
    name: String,
    path: String,
    size: Double
  ): ReadDirItem = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn, name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirItem]
  }
  
  extension [Self <: ReadDirItem](x: Self) {
    
    inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    inline def setCtimeUndefined: Self = StObject.set(x, "ctime", js.undefined)
    
    inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
    
    inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
    
    inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
