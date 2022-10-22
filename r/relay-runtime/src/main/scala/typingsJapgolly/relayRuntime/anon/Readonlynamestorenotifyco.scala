package typingsJapgolly.relayRuntime.anon

import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.DataIDSet
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typingsJapgolly.relayRuntime.relayRuntimeStrings.storeDotnotifyDotcomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.notify.complete',   sourceOperation :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.OperationDescriptor | undefined,   updatedRecordIDs :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.DataIDSet,   invalidatedRecordIDs :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.DataIDSet}> */
trait Readonlynamestorenotifyco
  extends StObject
     with LogEvent {
  
  val invalidatedRecordIDs: DataIDSet
  
  val name: storeDotnotifyDotcomplete
  
  val sourceOperation: js.UndefOr[OperationDescriptor] = js.undefined
  
  val updatedRecordIDs: DataIDSet
}
object Readonlynamestorenotifyco {
  
  inline def apply(invalidatedRecordIDs: DataIDSet, updatedRecordIDs: DataIDSet): Readonlynamestorenotifyco = {
    val __obj = js.Dynamic.literal(invalidatedRecordIDs = invalidatedRecordIDs.asInstanceOf[js.Any], name = "store.notify.complete", updatedRecordIDs = updatedRecordIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestorenotifyco]
  }
  
  extension [Self <: Readonlynamestorenotifyco](x: Self) {
    
    inline def setInvalidatedRecordIDs(value: DataIDSet): Self = StObject.set(x, "invalidatedRecordIDs", value.asInstanceOf[js.Any])
    
    inline def setName(value: storeDotnotifyDotcomplete): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSourceOperation(value: OperationDescriptor): Self = StObject.set(x, "sourceOperation", value.asInstanceOf[js.Any])
    
    inline def setSourceOperationUndefined: Self = StObject.set(x, "sourceOperation", js.undefined)
    
    inline def setUpdatedRecordIDs(value: DataIDSet): Self = StObject.set(x, "updatedRecordIDs", value.asInstanceOf[js.Any])
  }
}
