package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmGetStatusResponse extends StObject {
  
  var operation_mode: LifecycleOperationMode
}
object IlmGetStatusResponse {
  
  inline def apply(operation_mode: LifecycleOperationMode): IlmGetStatusResponse = {
    val __obj = js.Dynamic.literal(operation_mode = operation_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmGetStatusResponse]
  }
  
  extension [Self <: IlmGetStatusResponse](x: Self) {
    
    inline def setOperation_mode(value: LifecycleOperationMode): Self = StObject.set(x, "operation_mode", value.asInstanceOf[js.Any])
  }
}
