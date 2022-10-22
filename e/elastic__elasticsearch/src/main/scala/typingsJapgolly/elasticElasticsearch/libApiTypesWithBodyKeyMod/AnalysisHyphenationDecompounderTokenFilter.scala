package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.hyphenation_decompounder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisHyphenationDecompounderTokenFilter
  extends StObject
     with AnalysisCompoundWordTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var `type`: hyphenation_decompounder
}
object AnalysisHyphenationDecompounderTokenFilter {
  
  inline def apply(): AnalysisHyphenationDecompounderTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("hyphenation_decompounder")
    __obj.asInstanceOf[AnalysisHyphenationDecompounderTokenFilter]
  }
  
  extension [Self <: AnalysisHyphenationDecompounderTokenFilter](x: Self) {
    
    inline def setType(value: hyphenation_decompounder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
