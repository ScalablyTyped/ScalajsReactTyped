package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentHtmlDefinitionOriginal extends StObject {
  
  /**
    * The `documentId` is set by the API client. It is an integer that falls between `1` and 2,147,483,647. The value is encoded as a string without commas.
    * The values `1`, `2`, `3`, and so on are typically used to identify the first few documents in an envelope. Tab definitions include a `documentId`
    * property that specifies the document on which to place the tab.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * The GUID of the document.
    */
  var documentIdGuid: js.UndefOr[String] = js.undefined
  
  var htmlDefinition: js.UndefOr[
    /* Holds the properties that define how to generate the responsive-formatted HTML for the document. */ DocumentHtmlDefinition
  ] = js.undefined
}
object DocumentHtmlDefinitionOriginal {
  
  inline def apply(): DocumentHtmlDefinitionOriginal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentHtmlDefinitionOriginal]
  }
  
  extension [Self <: DocumentHtmlDefinitionOriginal](x: Self) {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdGuid(value: String): Self = StObject.set(x, "documentIdGuid", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdGuidUndefined: Self = StObject.set(x, "documentIdGuid", js.undefined)
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setHtmlDefinition(
      value: /* Holds the properties that define how to generate the responsive-formatted HTML for the document. */ DocumentHtmlDefinition
    ): Self = StObject.set(x, "htmlDefinition", value.asInstanceOf[js.Any])
    
    inline def setHtmlDefinitionUndefined: Self = StObject.set(x, "htmlDefinition", js.undefined)
  }
}
