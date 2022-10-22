package typingsJapgolly.wicgFileSystemAccess.mod.global

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTransferItem extends StObject {
  
  def getAsFileSystemHandle(): js.Promise[FileSystemHandle | Null]
}
object DataTransferItem {
  
  inline def apply(getAsFileSystemHandle: CallbackTo[js.Promise[FileSystemHandle | Null]]): DataTransferItem = {
    val __obj = js.Dynamic.literal(getAsFileSystemHandle = getAsFileSystemHandle.toJsFn)
    __obj.asInstanceOf[DataTransferItem]
  }
  
  extension [Self <: DataTransferItem](x: Self) {
    
    inline def setGetAsFileSystemHandle(value: CallbackTo[js.Promise[FileSystemHandle | Null]]): Self = StObject.set(x, "getAsFileSystemHandle", value.toJsFn)
  }
}
