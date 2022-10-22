package typingsJapgolly.wicgFileSystemAccess.mod.global

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageManager extends StObject {
  
  def getDirectory(): js.Promise[FileSystemDirectoryHandle]
}
object StorageManager {
  
  inline def apply(getDirectory: CallbackTo[js.Promise[FileSystemDirectoryHandle]]): StorageManager = {
    val __obj = js.Dynamic.literal(getDirectory = getDirectory.toJsFn)
    __obj.asInstanceOf[StorageManager]
  }
  
  extension [Self <: StorageManager](x: Self) {
    
    inline def setGetDirectory(value: CallbackTo[js.Promise[FileSystemDirectoryHandle]]): Self = StObject.set(x, "getDirectory", value.toJsFn)
  }
}
