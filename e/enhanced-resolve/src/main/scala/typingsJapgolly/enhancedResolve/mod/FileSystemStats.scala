package typingsJapgolly.enhancedResolve.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemStats extends StObject {
  
  def isDirectory(): Boolean
  
  def isFile(): Boolean
}
object FileSystemStats {
  
  inline def apply(isDirectory: CallbackTo[Boolean], isFile: CallbackTo[Boolean]): FileSystemStats = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn)
    __obj.asInstanceOf[FileSystemStats]
  }
  
  extension [Self <: FileSystemStats](x: Self) {
    
    inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
    
    inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
  }
}
