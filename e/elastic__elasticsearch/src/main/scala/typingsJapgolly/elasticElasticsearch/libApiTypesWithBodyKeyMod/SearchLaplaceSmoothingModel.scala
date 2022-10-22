package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchLaplaceSmoothingModel extends StObject {
  
  var alpha: double
}
object SearchLaplaceSmoothingModel {
  
  inline def apply(alpha: double): SearchLaplaceSmoothingModel = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLaplaceSmoothingModel]
  }
  
  extension [Self <: SearchLaplaceSmoothingModel](x: Self) {
    
    inline def setAlpha(value: double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
  }
}
