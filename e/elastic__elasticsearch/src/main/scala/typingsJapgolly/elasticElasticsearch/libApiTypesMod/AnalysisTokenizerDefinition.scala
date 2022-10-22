package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisCharGroupTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisEdgeNGramTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKeywordTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLetterTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisNGramTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisNoriTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPathHierarchyTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisStandardTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisUaxEmailUrlTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPatternTokenizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisIcuTokenizer
*/
trait AnalysisTokenizerDefinition extends StObject
object AnalysisTokenizerDefinition {
  
  inline def AnalysisCharGroupTokenizer(tokenize_on_chars: js.Array[String]): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisCharGroupTokenizer = {
    val __obj = js.Dynamic.literal(tokenize_on_chars = tokenize_on_chars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("char_group")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisCharGroupTokenizer]
  }
  
  inline def AnalysisEdgeNGramTokenizer(max_gram: integer, min_gram: integer, token_chars: js.Array[AnalysisTokenChar]): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisEdgeNGramTokenizer = {
    val __obj = js.Dynamic.literal(max_gram = max_gram.asInstanceOf[js.Any], min_gram = min_gram.asInstanceOf[js.Any], token_chars = token_chars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("edge_ngram")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisEdgeNGramTokenizer]
  }
  
  inline def AnalysisIcuTokenizer(rule_files: String): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisIcuTokenizer = {
    val __obj = js.Dynamic.literal(rule_files = rule_files.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_tokenizer")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisIcuTokenizer]
  }
  
  inline def AnalysisKeywordTokenizer(buffer_size: integer): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKeywordTokenizer = {
    val __obj = js.Dynamic.literal(buffer_size = buffer_size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKeywordTokenizer]
  }
  
  inline def AnalysisKuromojiTokenizer(mode: AnalysisKuromojiTokenizationMode): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiTokenizer = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kuromoji_tokenizer")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisKuromojiTokenizer]
  }
  
  inline def AnalysisLetterTokenizer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLetterTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("letter")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLetterTokenizer]
  }
  
  inline def AnalysisLowercaseTokenizer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseTokenizer]
  }
  
  inline def AnalysisNGramTokenizer(max_gram: integer, min_gram: integer, token_chars: js.Array[AnalysisTokenChar]): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisNGramTokenizer = {
    val __obj = js.Dynamic.literal(max_gram = max_gram.asInstanceOf[js.Any], min_gram = min_gram.asInstanceOf[js.Any], token_chars = token_chars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ngram")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisNGramTokenizer]
  }
  
  inline def AnalysisNoriTokenizer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisNoriTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nori_tokenizer")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisNoriTokenizer]
  }
  
  inline def AnalysisPathHierarchyTokenizer(buffer_size: integer, delimiter: String, replacement: String, reverse: Boolean, skip: integer): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPathHierarchyTokenizer = {
    val __obj = js.Dynamic.literal(buffer_size = buffer_size.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("path_hierarchy")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPathHierarchyTokenizer]
  }
  
  inline def AnalysisPatternTokenizer(flags: String, group: integer, pattern: String): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPatternTokenizer = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisPatternTokenizer]
  }
  
  inline def AnalysisStandardTokenizer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisStandardTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("standard")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisStandardTokenizer]
  }
  
  inline def AnalysisUaxEmailUrlTokenizer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisUaxEmailUrlTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("uax_url_email")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisUaxEmailUrlTokenizer]
  }
  
  inline def AnalysisWhitespaceTokenizer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("whitespace")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisWhitespaceTokenizer]
  }
}
