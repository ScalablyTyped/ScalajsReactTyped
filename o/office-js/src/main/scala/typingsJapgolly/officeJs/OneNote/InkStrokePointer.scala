package typingsJapgolly.officeJs.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Weak reference to an ink stroke object and its content parent.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait InkStrokePointer extends StObject {
  
  /**
    * Represents the id of the page content object corresponding to this stroke
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var contentId: String
  
  /**
    * Represents the id of the ink stroke
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokeId: String
}
object InkStrokePointer {
  
  inline def apply(contentId: String, inkStrokeId: String): InkStrokePointer = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], inkStrokeId = inkStrokeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkStrokePointer]
  }
  
  extension [Self <: InkStrokePointer](x: Self) {
    
    inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setInkStrokeId(value: String): Self = StObject.set(x, "inkStrokeId", value.asInstanceOf[js.Any])
  }
}
