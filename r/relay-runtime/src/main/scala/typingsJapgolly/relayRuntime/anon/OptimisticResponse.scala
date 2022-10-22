package typingsJapgolly.relayRuntime.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.UploadableMap
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimisticResponse extends StObject {
  
  var operation: OperationDescriptor
  
  var optimisticResponse: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  
  var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
}
object OptimisticResponse {
  
  inline def apply(operation: OperationDescriptor): OptimisticResponse = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticResponse]
  }
  
  extension [Self <: OptimisticResponse](x: Self) {
    
    inline def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOptimisticResponse(value: StringDictionary[Any]): Self = StObject.set(x, "optimisticResponse", value.asInstanceOf[js.Any])
    
    inline def setOptimisticResponseNull: Self = StObject.set(x, "optimisticResponse", null)
    
    inline def setOptimisticResponseUndefined: Self = StObject.set(x, "optimisticResponse", js.undefined)
    
    inline def setOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[js.Object], t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setOptimisticUpdaterNull: Self = StObject.set(x, "optimisticUpdater", null)
    
    inline def setOptimisticUpdaterUndefined: Self = StObject.set(x, "optimisticUpdater", js.undefined)
    
    inline def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback): Self = StObject.set(x, "updater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[js.Object], t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setUpdaterNull: Self = StObject.set(x, "updater", null)
    
    inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
    
    inline def setUploadables(value: UploadableMap): Self = StObject.set(x, "uploadables", value.asInstanceOf[js.Any])
    
    inline def setUploadablesNull: Self = StObject.set(x, "uploadables", null)
    
    inline def setUploadablesUndefined: Self = StObject.set(x, "uploadables", js.undefined)
  }
}
