package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageItem extends StObject {
  
  /**
    * A hint for modal dialogs that the item should be triggered
    * when the user cancels the dialog (e.g. by pressing the ESC
    * key).
    *
    * Note: this option is ignored for non-modal messages.
    */
  var isCloseAffordance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A short title like 'Retry', 'Open Log' etc.
    */
  var title: String
}
object MessageItem {
  
  inline def apply(title: String): MessageItem = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageItem]
  }
  
  extension [Self <: MessageItem](x: Self) {
    
    inline def setIsCloseAffordance(value: Boolean): Self = StObject.set(x, "isCloseAffordance", value.asInstanceOf[js.Any])
    
    inline def setIsCloseAffordanceUndefined: Self = StObject.set(x, "isCloseAffordance", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
