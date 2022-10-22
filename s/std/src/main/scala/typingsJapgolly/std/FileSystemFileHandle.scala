package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.stdStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait FileSystemFileHandle
  extends StObject
     with FileSystemHandle {
  
  /* standard dom */
  def getFile(): js.Promise[org.scalajs.dom.File]
  
  /* standard dom */
  @JSName("kind")
  val kind_FileSystemFileHandle: file
}
object FileSystemFileHandle {
  
  inline def apply(
    getFile: CallbackTo[js.Promise[org.scalajs.dom.File]],
    isSameEntry: FileSystemHandle => js.Promise[scala.Boolean],
    name: java.lang.String
  ): FileSystemFileHandle = {
    val __obj = js.Dynamic.literal(getFile = getFile.toJsFn, isSameEntry = js.Any.fromFunction1(isSameEntry), kind = "file", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemFileHandle]
  }
  
  extension [Self <: FileSystemFileHandle](x: Self) {
    
    inline def setGetFile(value: CallbackTo[js.Promise[org.scalajs.dom.File]]): Self = StObject.set(x, "getFile", value.toJsFn)
    
    inline def setKind(value: file): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
