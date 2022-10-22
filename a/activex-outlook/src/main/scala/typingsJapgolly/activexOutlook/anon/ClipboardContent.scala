package typingsJapgolly.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipboardContent extends StObject {
  
  var Cancel: Boolean
  
  val ClipboardContent: Any
  
  val Target: typingsJapgolly.activexOutlook.Outlook.Folder
}
object ClipboardContent {
  
  inline def apply(Cancel: Boolean, ClipboardContent: Any, Target: typingsJapgolly.activexOutlook.Outlook.Folder): ClipboardContent = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ClipboardContent = ClipboardContent.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardContent]
  }
  
  extension [Self <: ClipboardContent](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setClipboardContent(value: Any): Self = StObject.set(x, "ClipboardContent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: typingsJapgolly.activexOutlook.Outlook.Folder): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
