package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslMultiMatchQuery
  extends StObject
     with QueryDslQueryBase {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var auto_generate_synonyms_phrase_query: js.UndefOr[Boolean] = js.undefined
  
  var cutoff_frequency: js.UndefOr[double] = js.undefined
  
  var fields: js.UndefOr[Fields] = js.undefined
  
  var fuzziness: js.UndefOr[Fuzziness] = js.undefined
  
  var fuzzy_rewrite: js.UndefOr[MultiTermQueryRewrite] = js.undefined
  
  var fuzzy_transpositions: js.UndefOr[Boolean] = js.undefined
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var max_expansions: js.UndefOr[integer] = js.undefined
  
  var minimum_should_match: js.UndefOr[MinimumShouldMatch] = js.undefined
  
  var operator: js.UndefOr[QueryDslOperator] = js.undefined
  
  var prefix_length: js.UndefOr[integer] = js.undefined
  
  var query: String
  
  var slop: js.UndefOr[integer] = js.undefined
  
  var tie_breaker: js.UndefOr[double] = js.undefined
  
  var `type`: js.UndefOr[QueryDslTextQueryType] = js.undefined
  
  var zero_terms_query: js.UndefOr[QueryDslZeroTermsQuery] = js.undefined
}
object QueryDslMultiMatchQuery {
  
  inline def apply(query: String): QueryDslMultiMatchQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslMultiMatchQuery]
  }
  
  extension [Self <: QueryDslMultiMatchQuery](x: Self) {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setAuto_generate_synonyms_phrase_query(value: Boolean): Self = StObject.set(x, "auto_generate_synonyms_phrase_query", value.asInstanceOf[js.Any])
    
    inline def setAuto_generate_synonyms_phrase_queryUndefined: Self = StObject.set(x, "auto_generate_synonyms_phrase_query", js.undefined)
    
    inline def setCutoff_frequency(value: double): Self = StObject.set(x, "cutoff_frequency", value.asInstanceOf[js.Any])
    
    inline def setCutoff_frequencyUndefined: Self = StObject.set(x, "cutoff_frequency", js.undefined)
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFuzziness(value: Fuzziness): Self = StObject.set(x, "fuzziness", value.asInstanceOf[js.Any])
    
    inline def setFuzzinessUndefined: Self = StObject.set(x, "fuzziness", js.undefined)
    
    inline def setFuzzy_rewrite(value: MultiTermQueryRewrite): Self = StObject.set(x, "fuzzy_rewrite", value.asInstanceOf[js.Any])
    
    inline def setFuzzy_rewriteUndefined: Self = StObject.set(x, "fuzzy_rewrite", js.undefined)
    
    inline def setFuzzy_transpositions(value: Boolean): Self = StObject.set(x, "fuzzy_transpositions", value.asInstanceOf[js.Any])
    
    inline def setFuzzy_transpositionsUndefined: Self = StObject.set(x, "fuzzy_transpositions", js.undefined)
    
    inline def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    inline def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    inline def setMax_expansions(value: integer): Self = StObject.set(x, "max_expansions", value.asInstanceOf[js.Any])
    
    inline def setMax_expansionsUndefined: Self = StObject.set(x, "max_expansions", js.undefined)
    
    inline def setMinimum_should_match(value: MinimumShouldMatch): Self = StObject.set(x, "minimum_should_match", value.asInstanceOf[js.Any])
    
    inline def setMinimum_should_matchUndefined: Self = StObject.set(x, "minimum_should_match", js.undefined)
    
    inline def setOperator(value: QueryDslOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setPrefix_length(value: integer): Self = StObject.set(x, "prefix_length", value.asInstanceOf[js.Any])
    
    inline def setPrefix_lengthUndefined: Self = StObject.set(x, "prefix_length", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setSlop(value: integer): Self = StObject.set(x, "slop", value.asInstanceOf[js.Any])
    
    inline def setSlopUndefined: Self = StObject.set(x, "slop", js.undefined)
    
    inline def setTie_breaker(value: double): Self = StObject.set(x, "tie_breaker", value.asInstanceOf[js.Any])
    
    inline def setTie_breakerUndefined: Self = StObject.set(x, "tie_breaker", js.undefined)
    
    inline def setType(value: QueryDslTextQueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setZero_terms_query(value: QueryDslZeroTermsQuery): Self = StObject.set(x, "zero_terms_query", value.asInstanceOf[js.Any])
    
    inline def setZero_terms_queryUndefined: Self = StObject.set(x, "zero_terms_query", js.undefined)
  }
}
