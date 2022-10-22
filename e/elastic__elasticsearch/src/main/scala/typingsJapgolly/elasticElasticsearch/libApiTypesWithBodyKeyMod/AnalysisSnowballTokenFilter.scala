package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.snowball
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSnowballTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var language: AnalysisSnowballLanguage
  
  var `type`: snowball
}
object AnalysisSnowballTokenFilter {
  
  inline def apply(language: AnalysisSnowballLanguage): AnalysisSnowballTokenFilter = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("snowball")
    __obj.asInstanceOf[AnalysisSnowballTokenFilter]
  }
  
  extension [Self <: AnalysisSnowballTokenFilter](x: Self) {
    
    inline def setLanguage(value: AnalysisSnowballLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setType(value: snowball): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
