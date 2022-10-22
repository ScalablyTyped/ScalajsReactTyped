package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisStandardTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var max_token_length: js.UndefOr[integer] = js.undefined
  
  var `type`: standard
}
object AnalysisStandardTokenizer {
  
  inline def apply(): AnalysisStandardTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("standard")
    __obj.asInstanceOf[AnalysisStandardTokenizer]
  }
  
  extension [Self <: AnalysisStandardTokenizer](x: Self) {
    
    inline def setMax_token_length(value: integer): Self = StObject.set(x, "max_token_length", value.asInstanceOf[js.Any])
    
    inline def setMax_token_lengthUndefined: Self = StObject.set(x, "max_token_length", js.undefined)
    
    inline def setType(value: standard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
