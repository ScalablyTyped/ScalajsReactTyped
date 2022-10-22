package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.libNetworkRelayObservableMod.RelayObservable
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libQueryFetchQueryInternalMod {
  
  @JSImport("relay-runtime/lib/query/fetchQueryInternal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchQuery(environment: Environment, operation: OperationDescriptor): RelayObservable[GraphQLResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[GraphQLResponse]]
  
  inline def fetchQueryDeduped(
    environment: Environment,
    request: RequestDescriptor,
    fetchFn: js.Function0[RelayObservable[GraphQLResponse]]
  ): RelayObservable[GraphQLResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQueryDeduped")(environment.asInstanceOf[js.Any], request.asInstanceOf[js.Any], fetchFn.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[GraphQLResponse]]
  
  inline def getObservableForActiveRequest(environment: Environment, request: RequestDescriptor): RelayObservable[Unit] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getObservableForActiveRequest")(environment.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[Unit] | Null]
  
  inline def getPromiseForActiveRequest(environment: Environment, request: RequestDescriptor): js.Promise[Unit] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPromiseForActiveRequest")(environment.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit] | Null]
}
