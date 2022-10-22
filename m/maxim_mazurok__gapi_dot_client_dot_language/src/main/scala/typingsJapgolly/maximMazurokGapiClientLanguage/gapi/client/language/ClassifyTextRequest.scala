package typingsJapgolly.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifyTextRequest extends StObject {
  
  /** Required. Input document. */
  var document: js.UndefOr[Document] = js.undefined
}
object ClassifyTextRequest {
  
  inline def apply(): ClassifyTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyTextRequest]
  }
  
  extension [Self <: ClassifyTextRequest](x: Self) {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}
