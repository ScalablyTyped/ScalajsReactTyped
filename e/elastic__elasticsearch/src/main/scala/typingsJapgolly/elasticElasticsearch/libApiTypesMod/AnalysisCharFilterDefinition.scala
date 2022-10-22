package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisHtmlStripCharFilter
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisMappingCharFilter
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPatternReplaceCharFilter
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisIcuNormalizationCharFilter
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiIterationMarkCharFilter
*/
trait AnalysisCharFilterDefinition extends StObject
object AnalysisCharFilterDefinition {
  
  inline def AnalysisHtmlStripCharFilter(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisHtmlStripCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("html_strip")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisHtmlStripCharFilter]
  }
  
  inline def AnalysisIcuNormalizationCharFilter(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisIcuNormalizationCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("icu_normalizer")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisIcuNormalizationCharFilter]
  }
  
  inline def AnalysisKuromojiIterationMarkCharFilter(normalize_kana: Boolean, normalize_kanji: Boolean): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiIterationMarkCharFilter = {
    val __obj = js.Dynamic.literal(normalize_kana = normalize_kana.asInstanceOf[js.Any], normalize_kanji = normalize_kanji.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_iteration_mark")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiIterationMarkCharFilter]
  }
  
  inline def AnalysisMappingCharFilter(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisMappingCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("mapping")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisMappingCharFilter]
  }
  
  inline def AnalysisPatternReplaceCharFilter(pattern: String): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPatternReplaceCharFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern_replace")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPatternReplaceCharFilter]
  }
}
