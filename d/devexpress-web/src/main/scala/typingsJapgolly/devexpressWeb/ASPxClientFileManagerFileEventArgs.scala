package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.SelectedFileChanged and ASPxClientFileManager.SelectedFileOpened events.
  */
trait ASPxClientFileManagerFileEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a file related to the event.
    */
  var file: ASPxClientFileManagerFile
}
object ASPxClientFileManagerFileEventArgs {
  
  inline def apply(file: ASPxClientFileManagerFile): ASPxClientFileManagerFileEventArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileEventArgs]
  }
  
  extension [Self <: ASPxClientFileManagerFileEventArgs](x: Self) {
    
    inline def setFile(value: ASPxClientFileManagerFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
