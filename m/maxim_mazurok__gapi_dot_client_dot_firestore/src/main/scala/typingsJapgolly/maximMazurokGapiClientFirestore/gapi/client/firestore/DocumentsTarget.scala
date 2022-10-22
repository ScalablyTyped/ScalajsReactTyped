package typingsJapgolly.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentsTarget extends StObject {
  
  /**
    * The names of the documents to retrieve. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. The request will fail if any of the document is not
    * a child resource of the given `database`. Duplicate names will be elided.
    */
  var documents: js.UndefOr[js.Array[String]] = js.undefined
}
object DocumentsTarget {
  
  inline def apply(): DocumentsTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentsTarget]
  }
  
  extension [Self <: DocumentsTarget](x: Self) {
    
    inline def setDocuments(value: js.Array[String]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: String*): Self = StObject.set(x, "documents", js.Array(value*))
  }
}
