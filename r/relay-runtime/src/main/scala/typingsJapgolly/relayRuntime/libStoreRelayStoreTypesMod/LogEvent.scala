package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.RenderPolicy
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.anon.Readonlynamesuspensefragm
  - typingsJapgolly.relayRuntime.anon.Readonlynamesuspensequery
  - typingsJapgolly.relayRuntime.anon.Readonlynamequeryresource
  - typingsJapgolly.relayRuntime.anon.ReadonlynamequeryresourceName
  - typingsJapgolly.relayRuntime.anon.Readonlynamenetworkinfone
  - typingsJapgolly.relayRuntime.anon.Readonlynamenetworkstartn
  - typingsJapgolly.relayRuntime.anon.Readonlynamenetworknextne
  - typingsJapgolly.relayRuntime.anon.Readonlynamenetworkerrorn
  - typingsJapgolly.relayRuntime.anon.Readonlynamenetworkcomple
  - typingsJapgolly.relayRuntime.anon.Readonlynamenetworkunsubs
  - typingsJapgolly.relayRuntime.anon.Readonlynameexecutestarte
  - typingsJapgolly.relayRuntime.anon.Readonlynameexecutenextex
  - typingsJapgolly.relayRuntime.anon.Readonlynameexecuteasyncm
  - typingsJapgolly.relayRuntime.anon.Readonlynameexecuteflight
  - typingsJapgolly.relayRuntime.anon.Readonlynameexecuteerrore
  - typingsJapgolly.relayRuntime.anon.Readonlynameexecutecomple
  - typingsJapgolly.relayRuntime.anon.Readonlynamestorepublishs
  - typingsJapgolly.relayRuntime.anon.Readonlynamestoresnapshot
  - typingsJapgolly.relayRuntime.anon.Readonlynamestorerestore
  - typingsJapgolly.relayRuntime.anon.Readonlynamestoregcrefere
  - typingsJapgolly.relayRuntime.anon.Readonlynamestorenotifyst
  - typingsJapgolly.relayRuntime.anon.Readonlynamestorenotifyco
  - typingsJapgolly.relayRuntime.anon.Readonlynamestorenotifysu
  - typingsJapgolly.relayRuntime.anon.Readonlynameentrypointroo
*/
trait LogEvent extends StObject
object LogEvent {
  
  inline def Readonlynameentrypointroo(profilerContext: Any, rootModuleID: String): typingsJapgolly.relayRuntime.anon.Readonlynameentrypointroo = {
    val __obj = js.Dynamic.literal(name = "entrypoint.root.consume", profilerContext = profilerContext.asInstanceOf[js.Any], rootModuleID = rootModuleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynameentrypointroo]
  }
  
  inline def Readonlynameexecuteasyncm(duration: Double, executeId: Double, operationName: String): typingsJapgolly.relayRuntime.anon.Readonlynameexecuteasyncm = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.async.module", operationName = operationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynameexecuteasyncm]
  }
  
  inline def Readonlynameexecutecomple(executeId: Double): typingsJapgolly.relayRuntime.anon.Readonlynameexecutecomple = {
    val __obj = js.Dynamic.literal(executeId = executeId.asInstanceOf[js.Any], name = "execute.complete")
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynameexecutecomple]
  }
  
  inline def Readonlynameexecuteerrore(error: js.Error, executeId: Double): typingsJapgolly.relayRuntime.anon.Readonlynameexecuteerrore = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.error")
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynameexecuteerrore]
  }
  
  inline def Readonlynameexecuteflight(duration: Double, executeId: Double, operationName: String): typingsJapgolly.relayRuntime.anon.Readonlynameexecuteflight = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.flight.payload_deserialize", operationName = operationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynameexecuteflight]
  }
  
  inline def Readonlynameexecutenextex(duration: Double, executeId: Double, response: GraphQLResponse): typingsJapgolly.relayRuntime.anon.Readonlynameexecutenextex = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.next", response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynameexecutenextex]
  }
  
  inline def Readonlynameexecutestarte(cacheConfig: CacheConfig, executeId: Double, params: RequestParameters, variables: Variables): typingsJapgolly.relayRuntime.anon.Readonlynameexecutestarte = {
    val __obj = js.Dynamic.literal(cacheConfig = cacheConfig.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.start", params = params.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynameexecutestarte]
  }
  
  inline def Readonlynamenetworkcomple(networkRequestId: Double): typingsJapgolly.relayRuntime.anon.Readonlynamenetworkcomple = {
    val __obj = js.Dynamic.literal(name = "network.complete", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamenetworkcomple]
  }
  
  inline def Readonlynamenetworkerrorn(error: js.Error, networkRequestId: Double): typingsJapgolly.relayRuntime.anon.Readonlynamenetworkerrorn = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "network.error", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamenetworkerrorn]
  }
  
  inline def Readonlynamenetworkinfone(info: Any, networkRequestId: Double): typingsJapgolly.relayRuntime.anon.Readonlynamenetworkinfone = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = "network.info", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamenetworkinfone]
  }
  
  inline def Readonlynamenetworknextne(networkRequestId: Double, response: GraphQLResponse): typingsJapgolly.relayRuntime.anon.Readonlynamenetworknextne = {
    val __obj = js.Dynamic.literal(name = "network.next", networkRequestId = networkRequestId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamenetworknextne]
  }
  
  inline def Readonlynamenetworkstartn(
    cacheConfig: CacheConfig,
    networkRequestId: Double,
    params: RequestParameters,
    variables: Variables
  ): typingsJapgolly.relayRuntime.anon.Readonlynamenetworkstartn = {
    val __obj = js.Dynamic.literal(cacheConfig = cacheConfig.asInstanceOf[js.Any], name = "network.start", networkRequestId = networkRequestId.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamenetworkstartn]
  }
  
  inline def Readonlynamenetworkunsubs(networkRequestId: Double): typingsJapgolly.relayRuntime.anon.Readonlynamenetworkunsubs = {
    val __obj = js.Dynamic.literal(name = "network.unsubscribe", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamenetworkunsubs]
  }
  
  inline def Readonlynamequeryresource(
    fetchPolicy: FetchPolicy,
    operation: OperationDescriptor,
    profilerContext: Any,
    queryAvailability: OperationAvailability,
    renderPolicy: RenderPolicy,
    resourceID: Double,
    shouldFetch: Boolean
  ): typingsJapgolly.relayRuntime.anon.Readonlynamequeryresource = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = "queryresource.fetch", operation = operation.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamequeryresource]
  }
  
  inline def ReadonlynamequeryresourceName(profilerContext: Any, resourceID: Double): typingsJapgolly.relayRuntime.anon.ReadonlynamequeryresourceName = {
    val __obj = js.Dynamic.literal(name = "queryresource.retain", profilerContext = profilerContext.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.ReadonlynamequeryresourceName]
  }
  
  inline def Readonlynamestoregcrefere(references: DataIDSet): typingsJapgolly.relayRuntime.anon.Readonlynamestoregcrefere = {
    val __obj = js.Dynamic.literal(name = "store.gc", references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamestoregcrefere]
  }
  
  inline def Readonlynamestorenotifyco(invalidatedRecordIDs: DataIDSet, updatedRecordIDs: DataIDSet): typingsJapgolly.relayRuntime.anon.Readonlynamestorenotifyco = {
    val __obj = js.Dynamic.literal(invalidatedRecordIDs = invalidatedRecordIDs.asInstanceOf[js.Any], name = "store.notify.complete", updatedRecordIDs = updatedRecordIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamestorenotifyco]
  }
  
  inline def Readonlynamestorenotifyst(): typingsJapgolly.relayRuntime.anon.Readonlynamestorenotifyst = {
    val __obj = js.Dynamic.literal(name = "store.notify.start")
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamestorenotifyst]
  }
  
  inline def Readonlynamestorenotifysu(nextSnapshot: Snapshot, snapshot: Snapshot): typingsJapgolly.relayRuntime.anon.Readonlynamestorenotifysu = {
    val __obj = js.Dynamic.literal(name = "store.notify.subscription", nextSnapshot = nextSnapshot.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamestorenotifysu]
  }
  
  inline def Readonlynamestorepublishs(optimistic: Boolean, source: RecordSource): typingsJapgolly.relayRuntime.anon.Readonlynamestorepublishs = {
    val __obj = js.Dynamic.literal(name = "store.publish", optimistic = optimistic.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamestorepublishs]
  }
  
  inline def Readonlynamestorerestore(): typingsJapgolly.relayRuntime.anon.Readonlynamestorerestore = {
    val __obj = js.Dynamic.literal(name = "store.restore")
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamestorerestore]
  }
  
  inline def Readonlynamestoresnapshot(): typingsJapgolly.relayRuntime.anon.Readonlynamestoresnapshot = {
    val __obj = js.Dynamic.literal(name = "store.snapshot")
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamestoresnapshot]
  }
  
  inline def Readonlynamesuspensefragm(
    data: Any,
    fragment: ReaderFragment,
    isMissingData: Boolean,
    isPromiseCached: Boolean,
    isRelayHooks: Boolean,
    pendingOperations: js.Array[RequestDescriptor]
  ): typingsJapgolly.relayRuntime.anon.Readonlynamesuspensefragm = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], isMissingData = isMissingData.asInstanceOf[js.Any], isPromiseCached = isPromiseCached.asInstanceOf[js.Any], isRelayHooks = isRelayHooks.asInstanceOf[js.Any], name = "suspense.fragment", pendingOperations = pendingOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamesuspensefragm]
  }
  
  inline def Readonlynamesuspensequery(
    fetchPolicy: String,
    isPromiseCached: Boolean,
    operation: OperationDescriptor,
    renderPolicy: RenderPolicy
  ): typingsJapgolly.relayRuntime.anon.Readonlynamesuspensequery = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], isPromiseCached = isPromiseCached.asInstanceOf[js.Any], name = "suspense.query", operation = operation.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Readonlynamesuspensequery]
  }
}
