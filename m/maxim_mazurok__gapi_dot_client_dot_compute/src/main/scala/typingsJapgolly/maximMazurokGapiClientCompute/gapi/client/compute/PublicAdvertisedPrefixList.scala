package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicAdvertisedPrefixList extends StObject {
  
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** A list of PublicAdvertisedPrefix resources. */
  var items: js.UndefOr[js.Array[PublicAdvertisedPrefix]] = js.undefined
  
  /** [Output Only] Type of the resource. Always compute#publicAdvertisedPrefix for public advertised prefixes. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the
    * query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Server-defined URL for this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Informational warning message. */
  var warning: js.UndefOr[Code] = js.undefined
}
object PublicAdvertisedPrefixList {
  
  inline def apply(): PublicAdvertisedPrefixList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicAdvertisedPrefixList]
  }
  
  extension [Self <: PublicAdvertisedPrefixList](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItems(value: js.Array[PublicAdvertisedPrefix]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PublicAdvertisedPrefix*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
