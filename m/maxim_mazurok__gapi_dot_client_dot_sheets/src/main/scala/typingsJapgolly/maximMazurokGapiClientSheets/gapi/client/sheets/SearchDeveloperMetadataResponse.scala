package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDeveloperMetadataResponse extends StObject {
  
  /** The metadata matching the criteria of the search request. */
  var matchedDeveloperMetadata: js.UndefOr[js.Array[MatchedDeveloperMetadata]] = js.undefined
}
object SearchDeveloperMetadataResponse {
  
  inline def apply(): SearchDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDeveloperMetadataResponse]
  }
  
  extension [Self <: SearchDeveloperMetadataResponse](x: Self) {
    
    inline def setMatchedDeveloperMetadata(value: js.Array[MatchedDeveloperMetadata]): Self = StObject.set(x, "matchedDeveloperMetadata", value.asInstanceOf[js.Any])
    
    inline def setMatchedDeveloperMetadataUndefined: Self = StObject.set(x, "matchedDeveloperMetadata", js.undefined)
    
    inline def setMatchedDeveloperMetadataVarargs(value: MatchedDeveloperMetadata*): Self = StObject.set(x, "matchedDeveloperMetadata", js.Array(value*))
  }
}
