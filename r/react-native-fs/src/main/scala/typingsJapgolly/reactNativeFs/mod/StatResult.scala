package typingsJapgolly.reactNativeFs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatResult extends StObject {
  
  // UNIX file mode
  var ctime: Double
  
  // Is the file just a file?
  def isDirectory(): Boolean
  
  // In case of content uri this is the pointed file path, otherwise is the same as path
  def isFile(): Boolean
  
  // Size in bytes
  var mode: Double
  
  // Created date
  var mtime: Double
  
  var name: js.UndefOr[String] = js.undefined
  
  // Last modified date
  var originalFilepath: String
  
  // The name of the item TODO: why is this not documented?
  var path: String
  
  // The absolute path to the item
  var size: Double
}
object StatResult {
  
  inline def apply(
    ctime: Double,
    isDirectory: CallbackTo[Boolean],
    isFile: CallbackTo[Boolean],
    mode: Double,
    mtime: Double,
    originalFilepath: String,
    path: String,
    size: Double
  ): StatResult = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn, mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], originalFilepath = originalFilepath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatResult]
  }
  
  extension [Self <: StatResult](x: Self) {
    
    inline def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
    
    inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalFilepath(value: String): Self = StObject.set(x, "originalFilepath", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
