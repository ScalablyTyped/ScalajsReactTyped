package typingsJapgolly.angularDevkitCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var atime: js.Date
  
  var birthtime: js.Date
  
  var content: js.typedarray.ArrayBuffer
  
  var ctime: js.Date
  
  def inspect(): String
  
  def isDirectory(): Boolean
  
  def isFile(): Boolean
  
  var mtime: js.Date
  
  var size: Double
}
object Content {
  
  inline def apply(
    atime: js.Date,
    birthtime: js.Date,
    content: js.typedarray.ArrayBuffer,
    ctime: js.Date,
    inspect: CallbackTo[String],
    isDirectory: CallbackTo[Boolean],
    isFile: CallbackTo[Boolean],
    mtime: js.Date,
    size: Double
  ): Content = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], inspect = inspect.toJsFn, isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn, mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
    
    inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
    
    inline def setContent(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    inline def setInspect(value: CallbackTo[String]): Self = StObject.set(x, "inspect", value.toJsFn)
    
    inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
    
    inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
    
    inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
