package typingsJapgolly.sharepoint.SP.JsGrid.EventArgs

import typingsJapgolly.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEndRenameColumn
  extends StObject
     with IEventArgs {
  
  var columnKey: String
  
  var newColumnTitle: String
  
  var originalColumnTitle: String
}
object OnEndRenameColumn {
  
  inline def apply(columnKey: String, newColumnTitle: String, originalColumnTitle: String): OnEndRenameColumn = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], newColumnTitle = newColumnTitle.asInstanceOf[js.Any], originalColumnTitle = originalColumnTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEndRenameColumn]
  }
  
  extension [Self <: OnEndRenameColumn](x: Self) {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setNewColumnTitle(value: String): Self = StObject.set(x, "newColumnTitle", value.asInstanceOf[js.Any])
    
    inline def setOriginalColumnTitle(value: String): Self = StObject.set(x, "originalColumnTitle", value.asInstanceOf[js.Any])
  }
}
