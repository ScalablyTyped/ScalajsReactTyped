package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BccEmailArchiveList extends StObject {
  
  /**
    * A list of  BCC email archive configurations.
    */
  var bccEmailArchives: js.UndefOr[js.Array[BccEmailArchive]] = js.undefined
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.undefined
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[String] = js.undefined
  
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[String] = js.undefined
}
object BccEmailArchiveList {
  
  inline def apply(): BccEmailArchiveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BccEmailArchiveList]
  }
  
  extension [Self <: BccEmailArchiveList](x: Self) {
    
    inline def setBccEmailArchives(value: js.Array[BccEmailArchive]): Self = StObject.set(x, "bccEmailArchives", value.asInstanceOf[js.Any])
    
    inline def setBccEmailArchivesUndefined: Self = StObject.set(x, "bccEmailArchives", js.undefined)
    
    inline def setBccEmailArchivesVarargs(value: BccEmailArchive*): Self = StObject.set(x, "bccEmailArchives", js.Array(value*))
    
    inline def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setNextUri(value: String): Self = StObject.set(x, "nextUri", value.asInstanceOf[js.Any])
    
    inline def setNextUriUndefined: Self = StObject.set(x, "nextUri", js.undefined)
    
    inline def setPreviousUri(value: String): Self = StObject.set(x, "previousUri", value.asInstanceOf[js.Any])
    
    inline def setPreviousUriUndefined: Self = StObject.set(x, "previousUri", js.undefined)
    
    inline def setResultSetSize(value: String): Self = StObject.set(x, "resultSetSize", value.asInstanceOf[js.Any])
    
    inline def setResultSetSizeUndefined: Self = StObject.set(x, "resultSetSize", js.undefined)
    
    inline def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    inline def setTotalSetSize(value: String): Self = StObject.set(x, "totalSetSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSetSizeUndefined: Self = StObject.set(x, "totalSetSize", js.undefined)
  }
}
