package typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationMetadata extends StObject {
  
  /** The time when the batch request was received. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Current state of the batch operation. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The time when the operation result was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object OperationMetadata {
  
  inline def apply(): OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadata]
  }
  
  extension [Self <: OperationMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
