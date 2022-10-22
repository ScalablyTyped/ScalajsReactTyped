package typingsJapgolly.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllSearchResults[TDoc]
  extends StObject
     with SearchResults[TDoc]
     with /* index */ StringDictionary[SearchResults[TDoc]]
object AllSearchResults {
  
  inline def apply[TDoc](
    disjunctiveFacets: js.Array[Any],
    exhaustiveNbHits: Boolean,
    facets: js.Array[Any],
    hierarchicalFacets: js.Array[Any],
    hits: js.Array[Hit[TDoc]],
    hitsPerPage: Double,
    index: String,
    nbHits: Double,
    nbPages: Double,
    page: Double,
    processingTimeMS: Double,
    query: String
  ): AllSearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(disjunctiveFacets = disjunctiveFacets.asInstanceOf[js.Any], exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], hierarchicalFacets = hierarchicalFacets.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllSearchResults[TDoc]]
  }
}
