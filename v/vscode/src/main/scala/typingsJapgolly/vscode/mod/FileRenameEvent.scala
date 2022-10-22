package typingsJapgolly.vscode.mod

import typingsJapgolly.vscode.anon.NewUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileRenameEvent extends StObject {
  
  /**
    * The files that got renamed.
    */
  val files: js.Array[NewUri]
}
object FileRenameEvent {
  
  inline def apply(files: js.Array[NewUri]): FileRenameEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRenameEvent]
  }
  
  extension [Self <: FileRenameEvent](x: Self) {
    
    inline def setFiles(value: js.Array[NewUri]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: NewUri*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
