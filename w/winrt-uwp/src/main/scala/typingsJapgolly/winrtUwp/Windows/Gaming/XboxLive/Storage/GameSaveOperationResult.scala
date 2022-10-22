package typingsJapgolly.winrtUwp.Windows.Gaming.XboxLive.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
trait GameSaveOperationResult extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: GameSaveErrorStatus
}
object GameSaveOperationResult {
  
  inline def apply(status: GameSaveErrorStatus): GameSaveOperationResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSaveOperationResult]
  }
  
  extension [Self <: GameSaveOperationResult](x: Self) {
    
    inline def setStatus(value: GameSaveErrorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
