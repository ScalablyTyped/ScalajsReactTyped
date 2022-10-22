package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisFingerprintAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLanguageAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSimpleAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStandardAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStopAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWhitespaceAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSnowballAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDutchAnalyzer
*/
trait AnalysisAnalyzer extends StObject
object AnalysisAnalyzer {
  
  inline def AnalysisCustomAnalyzer(tokenizer: String): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomAnalyzer = {
    val __obj = js.Dynamic.literal(tokenizer = tokenizer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomAnalyzer]
  }
  
  inline def AnalysisDutchAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDutchAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dutch")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisDutchAnalyzer]
  }
  
  inline def AnalysisFingerprintAnalyzer(max_output_size: integer, preserve_original: Boolean, separator: String): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisFingerprintAnalyzer = {
    val __obj = js.Dynamic.literal(max_output_size = max_output_size.asInstanceOf[js.Any], preserve_original = preserve_original.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fingerprint")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisFingerprintAnalyzer]
  }
  
  inline def AnalysisIcuAnalyzer(method: AnalysisIcuNormalizationType, mode: AnalysisIcuNormalizationMode): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuAnalyzer = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_analyzer")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisIcuAnalyzer]
  }
  
  inline def AnalysisKeywordAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKeywordAnalyzer]
  }
  
  inline def AnalysisKuromojiAnalyzer(mode: AnalysisKuromojiTokenizationMode): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiAnalyzer = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisKuromojiAnalyzer]
  }
  
  inline def AnalysisLanguageAnalyzer(language: AnalysisLanguage, stem_exclusion: js.Array[String]): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLanguageAnalyzer = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], stem_exclusion = stem_exclusion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("language")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLanguageAnalyzer]
  }
  
  inline def AnalysisNoriAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisNoriAnalyzer]
  }
  
  inline def AnalysisPatternAnalyzer(pattern: String): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternAnalyzer = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisPatternAnalyzer]
  }
  
  inline def AnalysisSimpleAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSimpleAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("simple")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSimpleAnalyzer]
  }
  
  inline def AnalysisSnowballAnalyzer(language: AnalysisSnowballLanguage): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSnowballAnalyzer = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("snowball")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisSnowballAnalyzer]
  }
  
  inline def AnalysisStandardAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStandardAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("standard")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStandardAnalyzer]
  }
  
  inline def AnalysisStopAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStopAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stop")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisStopAnalyzer]
  }
  
  inline def AnalysisWhitespaceAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWhitespaceAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("whitespace")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisWhitespaceAnalyzer]
  }
}
