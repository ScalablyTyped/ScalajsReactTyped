package typingsJapgolly.algoliaClientSearch.anon

import typingsJapgolly.algoliaClientSearch.algoliaClientSearchStrings.default
import typingsJapgolly.algoliaClientSearch.algoliaClientSearchStrings.facet
import typingsJapgolly.algoliaClientSearch.mod.MultipleQueriesQuery
import typingsJapgolly.algoliaClientSearch.mod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined { readonly type :'facet',  readonly facet :string,  readonly params :@algolia/client-search.@algolia/client-search.SharedMultipleQueriesQuery['params'] & { readonly facetQuery :string | undefined} | undefined} & @algolia/client-search.@algolia/client-search.SharedMultipleQueriesQuery */
trait readonlytypefacetreadonly
  extends StObject
     with MultipleQueriesQuery {
  
  /**
    * The facet name.
    */
  val facet: String
  
  /**
    * The index name.
    */
  val indexName: String
  
  /**
    * The search options.
    */
  val params: (js.UndefOr[js.UndefOr[SearchOptions] & FacetQuery]) & js.UndefOr[SearchOptions]
  
  /**
    * The query associated with the request.
    */
  val query: js.UndefOr[String] = js.undefined
  
  /**
    * The type of query to perform.
    *
    * @defaultValue "default"
    */
  val `type`: typingsJapgolly.algoliaClientSearch.algoliaClientSearchStrings.facet & (js.UndefOr[default | typingsJapgolly.algoliaClientSearch.algoliaClientSearchStrings.facet])
}
object readonlytypefacetreadonly {
  
  inline def apply(
    facet: String,
    indexName: String,
    params: (js.UndefOr[js.UndefOr[SearchOptions] & FacetQuery]) & js.UndefOr[SearchOptions],
    `type`: facet & (js.UndefOr[default | facet])
  ): readonlytypefacetreadonly = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[readonlytypefacetreadonly]
  }
  
  extension [Self <: readonlytypefacetreadonly](x: Self) {
    
    inline def setFacet(value: String): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setParams(value: (js.UndefOr[js.UndefOr[SearchOptions] & FacetQuery]) & js.UndefOr[SearchOptions]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setType(value: facet & (js.UndefOr[default | facet])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
