package typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeList extends StObject {
  
  /** The list of changes. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var changes: js.UndefOr[js.Array[Change]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#changeList". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The starting page token for future changes. This will be present only if the end of the current changes list has been reached. */
  var newStartPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The page token for the next page of changes. This will be absent if the end of the changes list has been reached. If the token is rejected for any reason, it should be discarded,
    * and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ChangeList {
  
  inline def apply(): ChangeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeList]
  }
  
  extension [Self <: ChangeList](x: Self) {
    
    inline def setChanges(value: js.Array[Change]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setChangesVarargs(value: Change*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNewStartPageToken(value: String): Self = StObject.set(x, "newStartPageToken", value.asInstanceOf[js.Any])
    
    inline def setNewStartPageTokenUndefined: Self = StObject.set(x, "newStartPageToken", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
