package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FileUploaded event.
  */
trait ASPxClientFileManagerFileUploadedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the name of the uploaded file.
    */
  var fileName: String
  
  /**
    * Gets the path to the folder where a file is uploaded.
    */
  var folder: String
}
object ASPxClientFileManagerFileUploadedEventArgs {
  
  inline def apply(fileName: String, folder: String): ASPxClientFileManagerFileUploadedEventArgs = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileUploadedEventArgs]
  }
  
  extension [Self <: ASPxClientFileManagerFileUploadedEventArgs](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
  }
}
