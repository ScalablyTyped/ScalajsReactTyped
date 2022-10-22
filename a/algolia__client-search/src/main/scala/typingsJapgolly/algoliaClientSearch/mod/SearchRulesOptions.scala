package typingsJapgolly.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRulesOptions extends StObject {
  
  /**
    * When specified, restricts matches to rules with a specific anchoring type. When omitted, all anchoring types may match.
    */
  val anchoring: js.UndefOr[String] = js.undefined
  
  /**
    * Restricts matches to contextual rules with a specific context (exact match).
    */
  val context: js.UndefOr[String] = js.undefined
  
  /**
    * When specified, restricts matches to rules with a specific enabled status.
    * When absent (default), all rules are retrieved, regardless of their enabled status.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of hits in a page. Minimum is 1, maximum is 1000.
    */
  val hitsPerPage: js.UndefOr[Double] = js.undefined
  
  /**
    * Requested page (zero-based).
    */
  val page: js.UndefOr[Double] = js.undefined
  
  /**
    * Full text query.
    */
  val query: js.UndefOr[String] = js.undefined
}
object SearchRulesOptions {
  
  inline def apply(): SearchRulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRulesOptions]
  }
  
  extension [Self <: SearchRulesOptions](x: Self) {
    
    inline def setAnchoring(value: String): Self = StObject.set(x, "anchoring", value.asInstanceOf[js.Any])
    
    inline def setAnchoringUndefined: Self = StObject.set(x, "anchoring", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    inline def setHitsPerPageUndefined: Self = StObject.set(x, "hitsPerPage", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
