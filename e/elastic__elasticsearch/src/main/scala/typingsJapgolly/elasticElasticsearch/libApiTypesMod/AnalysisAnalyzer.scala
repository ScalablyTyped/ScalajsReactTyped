package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisCustomAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisFingerprintAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKeywordAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLanguageAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisNoriAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPatternAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisSimpleAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisStandardAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisStopAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisIcuAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisSnowballAnalyzer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisDutchAnalyzer
*/
trait AnalysisAnalyzer extends StObject
object AnalysisAnalyzer {
  
  inline def AnalysisCustomAnalyzer(tokenizer: String): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisCustomAnalyzer = {
    val __obj = js.Dynamic.literal(tokenizer = tokenizer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisCustomAnalyzer]
  }
  
  inline def AnalysisDutchAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisDutchAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dutch")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisDutchAnalyzer]
  }
  
  inline def AnalysisFingerprintAnalyzer(max_output_size: integer, preserve_original: Boolean, separator: String): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisFingerprintAnalyzer = {
    val __obj = js.Dynamic.literal(max_output_size = max_output_size.asInstanceOf[js.Any], preserve_original = preserve_original.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fingerprint")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisFingerprintAnalyzer]
  }
  
  inline def AnalysisIcuAnalyzer(method: AnalysisIcuNormalizationType, mode: AnalysisIcuNormalizationMode): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisIcuAnalyzer = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_analyzer")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisIcuAnalyzer]
  }
  
  inline def AnalysisKeywordAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKeywordAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKeywordAnalyzer]
  }
  
  inline def AnalysisKuromojiAnalyzer(mode: AnalysisKuromojiTokenizationMode): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiAnalyzer = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiAnalyzer]
  }
  
  inline def AnalysisLanguageAnalyzer(language: AnalysisLanguage, stem_exclusion: js.Array[String]): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLanguageAnalyzer = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], stem_exclusion = stem_exclusion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("language")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLanguageAnalyzer]
  }
  
  inline def AnalysisNoriAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisNoriAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisNoriAnalyzer]
  }
  
  inline def AnalysisPatternAnalyzer(pattern: String): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPatternAnalyzer = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPatternAnalyzer]
  }
  
  inline def AnalysisSimpleAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisSimpleAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("simple")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisSimpleAnalyzer]
  }
  
  inline def AnalysisSnowballAnalyzer(language: AnalysisSnowballLanguage): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisSnowballAnalyzer = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("snowball")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisSnowballAnalyzer]
  }
  
  inline def AnalysisStandardAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisStandardAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("standard")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisStandardAnalyzer]
  }
  
  inline def AnalysisStopAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisStopAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stop")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisStopAnalyzer]
  }
  
  inline def AnalysisWhitespaceAnalyzer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("whitespace")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceAnalyzer]
  }
}
