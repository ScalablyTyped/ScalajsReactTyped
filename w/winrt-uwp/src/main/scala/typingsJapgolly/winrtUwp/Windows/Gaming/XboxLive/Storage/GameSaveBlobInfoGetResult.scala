package typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
trait GameSaveBlobInfoGetResult extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: IVectorView[GameSaveBlobInfo]
}
object GameSaveBlobInfoGetResult {
  
  inline def apply(status: GameSaveErrorStatus, value: IVectorView[GameSaveBlobInfo]): GameSaveBlobInfoGetResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSaveBlobInfoGetResult]
  }
  
  extension [Self <: GameSaveBlobInfoGetResult](x: Self) {
    
    inline def setStatus(value: GameSaveErrorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: IVectorView[GameSaveBlobInfo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
