package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmForceMergeConfiguration extends StObject {
  
  var max_num_segments: integer
}
object IlmForceMergeConfiguration {
  
  inline def apply(max_num_segments: integer): IlmForceMergeConfiguration = {
    val __obj = js.Dynamic.literal(max_num_segments = max_num_segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmForceMergeConfiguration]
  }
  
  extension [Self <: IlmForceMergeConfiguration](x: Self) {
    
    inline def setMax_num_segments(value: integer): Self = StObject.set(x, "max_num_segments", value.asInstanceOf[js.Any])
  }
}
