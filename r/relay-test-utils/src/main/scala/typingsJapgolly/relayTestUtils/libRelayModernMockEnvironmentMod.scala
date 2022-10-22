package typingsJapgolly.relayTestUtils

import japgolly.scalajs.react.Callback
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLSingularResponse
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typingsJapgolly.relayTestUtils.anon.PartialEnvironmentConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRelayModernMockEnvironmentMod {
  
  @JSImport("relay-test-utils/lib/RelayModernMockEnvironment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMockEnvironment(): RelayMockEnvironment = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockEnvironment")().asInstanceOf[RelayMockEnvironment]
  inline def createMockEnvironment(config: PartialEnvironmentConfig): RelayMockEnvironment = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockEnvironment")(config.asInstanceOf[js.Any]).asInstanceOf[RelayMockEnvironment]
  
  trait MockEnvironment extends StObject {
    
    var mock: MockFunctions
    
    def mockClear(): Unit
  }
  object MockEnvironment {
    
    inline def apply(mock: MockFunctions, mockClear: Callback): MockEnvironment = {
      val __obj = js.Dynamic.literal(mock = mock.asInstanceOf[js.Any], mockClear = mockClear.toJsFn)
      __obj.asInstanceOf[MockEnvironment]
    }
    
    extension [Self <: MockEnvironment](x: Self) {
      
      inline def setMock(value: MockFunctions): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setMockClear(value: Callback): Self = StObject.set(x, "mockClear", value.toJsFn)
    }
  }
  
  @js.native
  trait MockFunctions extends StObject {
    
    def cachePayload(request: OperationDescriptor, variables: Variables, payload: GraphQLSingularResponse): Unit = js.native
    def cachePayload(request: ConcreteRequest, variables: Variables, payload: GraphQLSingularResponse): Unit = js.native
    
    def clearCache(): Unit = js.native
    
    def complete(request: OperationDescriptor): Unit = js.native
    def complete(request: ConcreteRequest): Unit = js.native
    
    def findOperation(findFn: js.Function1[/* operation */ OperationDescriptor, Boolean]): OperationDescriptor = js.native
    
    def getAllOperations(): js.Array[OperationDescriptor] = js.native
    
    def getMostRecentOperation(): OperationDescriptor = js.native
    
    def isLoading(request: OperationDescriptor, variables: Variables): Boolean = js.native
    def isLoading(request: OperationDescriptor, variables: Variables, cacheConfig: CacheConfig): Boolean = js.native
    def isLoading(request: ConcreteRequest, variables: Variables): Boolean = js.native
    def isLoading(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): Boolean = js.native
    
    def nextValue(request: OperationDescriptor, payload: GraphQLSingularResponse): Unit = js.native
    def nextValue(request: ConcreteRequest, payload: GraphQLSingularResponse): Unit = js.native
    
    def queueOperationResolver(resolver: OperationMockResolver): Unit = js.native
    
    def queuePendingOperation(query: GraphQLTaggedNode, variables: Variables): Unit = js.native
    
    def reject(request: OperationDescriptor, error: String): Unit = js.native
    def reject(request: OperationDescriptor, error: js.Error): Unit = js.native
    def reject(request: ConcreteRequest, error: String): Unit = js.native
    def reject(request: ConcreteRequest, error: js.Error): Unit = js.native
    
    def rejectMostRecentOperation(error: js.Error): Unit = js.native
    def rejectMostRecentOperation(error: js.Function1[/* operation */ OperationDescriptor, js.Error]): Unit = js.native
    
    def resolve(request: OperationDescriptor, payload: GraphQLSingularResponse): Unit = js.native
    def resolve(request: ConcreteRequest, payload: GraphQLSingularResponse): Unit = js.native
    
    def resolveMostRecentOperation(payload: js.Function1[/* operation */ OperationDescriptor, GraphQLSingularResponse]): Unit = js.native
    def resolveMostRecentOperation(payload: GraphQLSingularResponse): Unit = js.native
  }
  
  type OperationMockResolver = js.Function1[/* operation */ OperationDescriptor, GraphQLResponse | js.Error | Null]
  
  @js.native
  trait RelayMockEnvironment
    extends StObject
       with MockEnvironment
       with Environment
}
