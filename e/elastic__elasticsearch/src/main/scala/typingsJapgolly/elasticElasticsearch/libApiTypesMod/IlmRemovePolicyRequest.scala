package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmRemovePolicyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: IndexName
}
object IlmRemovePolicyRequest {
  
  inline def apply(index: IndexName): IlmRemovePolicyRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmRemovePolicyRequest]
  }
  
  extension [Self <: IlmRemovePolicyRequest](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
