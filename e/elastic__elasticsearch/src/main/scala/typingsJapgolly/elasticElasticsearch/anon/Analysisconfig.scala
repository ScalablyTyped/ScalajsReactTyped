package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Field
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlAnalysisConfig
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.long
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analysisconfig extends StObject {
  
  var analysis_config: js.UndefOr[MlAnalysisConfig] = js.undefined
  
  var max_bucket_cardinality: js.UndefOr[Record[Field, long]] = js.undefined
  
  var overall_cardinality: js.UndefOr[Record[Field, long]] = js.undefined
}
object Analysisconfig {
  
  inline def apply(): Analysisconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analysisconfig]
  }
  
  extension [Self <: Analysisconfig](x: Self) {
    
    inline def setAnalysis_config(value: MlAnalysisConfig): Self = StObject.set(x, "analysis_config", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_configUndefined: Self = StObject.set(x, "analysis_config", js.undefined)
    
    inline def setMax_bucket_cardinality(value: Record[Field, long]): Self = StObject.set(x, "max_bucket_cardinality", value.asInstanceOf[js.Any])
    
    inline def setMax_bucket_cardinalityUndefined: Self = StObject.set(x, "max_bucket_cardinality", js.undefined)
    
    inline def setOverall_cardinality(value: Record[Field, long]): Self = StObject.set(x, "overall_cardinality", value.asInstanceOf[js.Any])
    
    inline def setOverall_cardinalityUndefined: Self = StObject.set(x, "overall_cardinality", js.undefined)
  }
}
