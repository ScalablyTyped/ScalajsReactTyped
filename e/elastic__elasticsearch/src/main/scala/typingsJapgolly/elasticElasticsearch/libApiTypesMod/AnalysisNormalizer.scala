package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseNormalizer
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisCustomNormalizer
*/
trait AnalysisNormalizer extends StObject
object AnalysisNormalizer {
  
  inline def AnalysisCustomNormalizer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisCustomNormalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisCustomNormalizer]
  }
  
  inline def AnalysisLowercaseNormalizer(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseNormalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseNormalizer]
  }
}
