package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import typingsJapgolly.relayRuntime.relayRuntimeStrings.aborted
import typingsJapgolly.relayRuntime.relayRuntimeStrings.complete
import typingsJapgolly.relayRuntime.relayRuntimeStrings.error_
import typingsJapgolly.relayRuntime.relayRuntimeStrings.missing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingState extends StObject {
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var status: aborted | complete | error_ | missing
}
object LoadingState {
  
  inline def apply(status: aborted | complete | error_ | missing): LoadingState = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingState]
  }
  
  extension [Self <: LoadingState](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setStatus(value: aborted | complete | error_ | missing): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
