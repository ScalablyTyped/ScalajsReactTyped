package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHtmlStripCharFilter
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisMappingCharFilter
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternReplaceCharFilter
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuNormalizationCharFilter
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiIterationMarkCharFilter
*/
trait AnalysisCharFilterDefinition extends StObject
object AnalysisCharFilterDefinition {
  
  inline def AnalysisHtmlStripCharFilter(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHtmlStripCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("html_strip")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisHtmlStripCharFilter]
  }
  
  inline def AnalysisIcuNormalizationCharFilter(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuNormalizationCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("icu_normalizer")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuNormalizationCharFilter]
  }
  
  inline def AnalysisKuromojiIterationMarkCharFilter(normalize_kana: Boolean, normalize_kanji: Boolean): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiIterationMarkCharFilter = {
    val __obj = js.Dynamic.literal(normalize_kana = normalize_kana.asInstanceOf[js.Any], normalize_kanji = normalize_kanji.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_iteration_mark")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiIterationMarkCharFilter]
  }
  
  inline def AnalysisMappingCharFilter(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisMappingCharFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("mapping")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisMappingCharFilter]
  }
  
  inline def AnalysisPatternReplaceCharFilter(pattern: String): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternReplaceCharFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern_replace")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternReplaceCharFilter]
  }
}
