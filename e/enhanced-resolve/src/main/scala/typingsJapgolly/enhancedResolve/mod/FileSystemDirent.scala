package typingsJapgolly.enhancedResolve.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemDirent extends StObject {
  
  def isDirectory(): Boolean
  
  def isFile(): Boolean
  
  var name: String | Buffer
}
object FileSystemDirent {
  
  inline def apply(isDirectory: CallbackTo[Boolean], isFile: CallbackTo[Boolean], name: String | Buffer): FileSystemDirent = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemDirent]
  }
  
  extension [Self <: FileSystemDirent](x: Self) {
    
    inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
    
    inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
    
    inline def setName(value: String | Buffer): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
