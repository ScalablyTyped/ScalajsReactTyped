package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.ParagraphPropertiesChanged event.
  */
trait ASPxClientRichEditParagraphPropertiesChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the changed paragraph's index.
    */
  var paragraphIndex: Double
  
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double
}
object ASPxClientRichEditParagraphPropertiesChangedEventArgs {
  
  inline def apply(paragraphIndex: Double, subDocumentId: Double): ASPxClientRichEditParagraphPropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(paragraphIndex = paragraphIndex.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditParagraphPropertiesChangedEventArgs]
  }
  
  extension [Self <: ASPxClientRichEditParagraphPropertiesChangedEventArgs](x: Self) {
    
    inline def setParagraphIndex(value: Double): Self = StObject.set(x, "paragraphIndex", value.asInstanceOf[js.Any])
    
    inline def setSubDocumentId(value: Double): Self = StObject.set(x, "subDocumentId", value.asInstanceOf[js.Any])
  }
}
