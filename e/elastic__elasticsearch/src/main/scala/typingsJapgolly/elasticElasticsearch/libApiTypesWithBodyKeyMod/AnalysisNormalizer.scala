package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseNormalizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomNormalizer
*/
trait AnalysisNormalizer extends StObject
object AnalysisNormalizer {
  
  inline def AnalysisCustomNormalizer(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomNormalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomNormalizer]
  }
  
  inline def AnalysisLowercaseNormalizer(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseNormalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseNormalizer]
  }
}
