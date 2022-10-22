package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountstatusesCustomBatchResponse extends StObject {
  
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[AccountstatusesCustomBatchResponseEntry]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#accountstatusesCustomBatchResponse`". */
  var kind: js.UndefOr[String] = js.undefined
}
object AccountstatusesCustomBatchResponse {
  
  inline def apply(): AccountstatusesCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountstatusesCustomBatchResponse]
  }
  
  extension [Self <: AccountstatusesCustomBatchResponse](x: Self) {
    
    inline def setEntries(value: js.Array[AccountstatusesCustomBatchResponseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: AccountstatusesCustomBatchResponseEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
