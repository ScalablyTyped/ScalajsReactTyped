package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemRenamed event.
  */
trait ASPxClientFileManagerItemRenamedEventArgs
  extends StObject
     with ASPxClientFileManagerActionEventArgsBase {
  
  /**
    * Gets the previous name of the renamed item.
    */
  var oldName: String
}
object ASPxClientFileManagerItemRenamedEventArgs {
  
  inline def apply(fullName: String, isFolder: Boolean, name: String, oldName: String): ASPxClientFileManagerItemRenamedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemRenamedEventArgs]
  }
  
  extension [Self <: ASPxClientFileManagerItemRenamedEventArgs](x: Self) {
    
    inline def setOldName(value: String): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
  }
}
