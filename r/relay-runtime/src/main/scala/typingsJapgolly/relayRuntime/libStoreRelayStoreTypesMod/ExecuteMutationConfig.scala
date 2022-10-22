package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.libMutationsCommitMutationMod.MutationParameters
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.UploadableMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteMutationConfig[TMutation /* <: MutationParameters */] extends StObject {
  
  var operation: OperationDescriptor
  
  var optimisticResponse: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  var optimisticUpdater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
    ]) | Null
  ] = js.undefined
  
  var updater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
    ]) | Null
  ] = js.undefined
  
  var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
}
object ExecuteMutationConfig {
  
  inline def apply[TMutation /* <: MutationParameters */](operation: OperationDescriptor): ExecuteMutationConfig[TMutation] = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteMutationConfig[TMutation]]
  }
  
  extension [Self <: ExecuteMutationConfig[?], TMutation /* <: MutationParameters */](x: Self & ExecuteMutationConfig[TMutation]) {
    
    inline def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOptimisticResponse(value: StringDictionary[Any]): Self = StObject.set(x, "optimisticResponse", value.asInstanceOf[js.Any])
    
    inline def setOptimisticResponseNull: Self = StObject.set(x, "optimisticResponse", null)
    
    inline def setOptimisticResponseUndefined: Self = StObject.set(x, "optimisticResponse", js.undefined)
    
    inline def setOptimisticUpdater(
      value: (/* store */ RecordSourceSelectorProxy[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
        ], /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any) => Callback
    ): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
        ], t1: /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any) => (value(t0, t1)).runNow()))
    
    inline def setOptimisticUpdaterNull: Self = StObject.set(x, "optimisticUpdater", null)
    
    inline def setOptimisticUpdaterUndefined: Self = StObject.set(x, "optimisticUpdater", js.undefined)
    
    inline def setUpdater(
      value: (/* store */ RecordSourceSelectorProxy[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
        ], /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any) => Callback
    ): Self = StObject.set(x, "updater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
        ], t1: /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any) => (value(t0, t1)).runNow()))
    
    inline def setUpdaterNull: Self = StObject.set(x, "updater", null)
    
    inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
    
    inline def setUploadables(value: UploadableMap): Self = StObject.set(x, "uploadables", value.asInstanceOf[js.Any])
    
    inline def setUploadablesNull: Self = StObject.set(x, "uploadables", null)
    
    inline def setUploadablesUndefined: Self = StObject.set(x, "uploadables", js.undefined)
  }
}
