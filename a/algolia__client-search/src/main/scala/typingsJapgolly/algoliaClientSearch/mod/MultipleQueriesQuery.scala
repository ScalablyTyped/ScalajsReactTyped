package typingsJapgolly.algoliaClientSearch.mod

import typingsJapgolly.algoliaClientSearch.algoliaClientSearchStrings.default
import typingsJapgolly.algoliaClientSearch.algoliaClientSearchStrings.facet
import typingsJapgolly.algoliaClientSearch.anon.FacetQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.algoliaClientSearch.anon.readonlytypedefaultundefi
  - typingsJapgolly.algoliaClientSearch.anon.readonlytypefacetreadonly
*/
trait MultipleQueriesQuery extends StObject
object MultipleQueriesQuery {
  
  inline def readonlytypedefaultundefi(indexName: String, `type`: js.UndefOr[default] & (js.UndefOr[default | facet])): typingsJapgolly.algoliaClientSearch.anon.readonlytypedefaultundefi = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.algoliaClientSearch.anon.readonlytypedefaultundefi]
  }
  
  inline def readonlytypefacetreadonly(
    facet: String,
    indexName: String,
    params: (js.UndefOr[js.UndefOr[SearchOptions] & FacetQuery]) & js.UndefOr[SearchOptions],
    `type`: facet & (js.UndefOr[default | facet])
  ): typingsJapgolly.algoliaClientSearch.anon.readonlytypefacetreadonly = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.algoliaClientSearch.anon.readonlytypefacetreadonly]
  }
}
