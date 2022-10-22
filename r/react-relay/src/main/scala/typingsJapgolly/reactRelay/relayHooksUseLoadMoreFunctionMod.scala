package typingsJapgolly.reactRelay

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactRelay.anon.Cursor
import typingsJapgolly.reactRelay.anon.OnComplete
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.libNetworkRelayObservableMod.Observer
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderPaginationMetadata
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DisposeFn
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseLoadMoreFunctionMod {
  
  @JSImport("react-relay/relay-hooks/useLoadMoreFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConnectionState(
    direction: Direction,
    fragmentNode: ReaderFragment,
    fragmentData: Any,
    connectionPathInFragmentData: js.Array[String | Double]
  ): Cursor = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionState")(direction.asInstanceOf[js.Any], fragmentNode.asInstanceOf[js.Any], fragmentData.asInstanceOf[js.Any], connectionPathInFragmentData.asInstanceOf[js.Any])).asInstanceOf[Cursor]
  
  inline def useLoadMoreFunction[TQuery /* <: OperationType */](args: UseLoadMoreFunctionArgs): js.Tuple3[LoadMoreFn[TQuery], Boolean, DisposeFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLoadMoreFunction")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[LoadMoreFn[TQuery], Boolean, DisposeFn]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactRelay.reactRelayStrings.forward
    - typingsJapgolly.reactRelay.reactRelayStrings.backward
  */
  trait Direction extends StObject
  object Direction {
    
    inline def backward: typingsJapgolly.reactRelay.reactRelayStrings.backward = "backward".asInstanceOf[typingsJapgolly.reactRelay.reactRelayStrings.backward]
    
    inline def forward: typingsJapgolly.reactRelay.reactRelayStrings.forward = "forward".asInstanceOf[typingsJapgolly.reactRelay.reactRelayStrings.forward]
  }
  
  type LoadMoreFn[TQuery /* <: OperationType */] = js.Function2[/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]], Disposable]
  
  trait UseLoadMoreFunctionArgs extends StObject {
    
    var componentDisplayName: String
    
    var connectionPathInFragmentData: js.Array[String | Double]
    
    var direction: Direction
    
    var fragmentData: Any
    
    var fragmentIdentifier: String
    
    var fragmentNode: ReaderFragment
    
    var fragmentRef: Any
    
    var identifierField: js.UndefOr[String | Null] = js.undefined
    
    var observer: Observer[GraphQLResponse]
    
    def onReset(): Unit
    
    var paginationMetadata: ReaderPaginationMetadata
    
    var paginationRequest: ConcreteRequest
  }
  object UseLoadMoreFunctionArgs {
    
    inline def apply(
      componentDisplayName: String,
      connectionPathInFragmentData: js.Array[String | Double],
      direction: Direction,
      fragmentData: Any,
      fragmentIdentifier: String,
      fragmentNode: ReaderFragment,
      fragmentRef: Any,
      observer: Observer[GraphQLResponse],
      onReset: Callback,
      paginationMetadata: ReaderPaginationMetadata,
      paginationRequest: ConcreteRequest
    ): UseLoadMoreFunctionArgs = {
      val __obj = js.Dynamic.literal(componentDisplayName = componentDisplayName.asInstanceOf[js.Any], connectionPathInFragmentData = connectionPathInFragmentData.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fragmentData = fragmentData.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any], fragmentNode = fragmentNode.asInstanceOf[js.Any], fragmentRef = fragmentRef.asInstanceOf[js.Any], observer = observer.asInstanceOf[js.Any], onReset = onReset.toJsFn, paginationMetadata = paginationMetadata.asInstanceOf[js.Any], paginationRequest = paginationRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseLoadMoreFunctionArgs]
    }
    
    extension [Self <: UseLoadMoreFunctionArgs](x: Self) {
      
      inline def setComponentDisplayName(value: String): Self = StObject.set(x, "componentDisplayName", value.asInstanceOf[js.Any])
      
      inline def setConnectionPathInFragmentData(value: js.Array[String | Double]): Self = StObject.set(x, "connectionPathInFragmentData", value.asInstanceOf[js.Any])
      
      inline def setConnectionPathInFragmentDataVarargs(value: (String | Double)*): Self = StObject.set(x, "connectionPathInFragmentData", js.Array(value*))
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setFragmentData(value: Any): Self = StObject.set(x, "fragmentData", value.asInstanceOf[js.Any])
      
      inline def setFragmentIdentifier(value: String): Self = StObject.set(x, "fragmentIdentifier", value.asInstanceOf[js.Any])
      
      inline def setFragmentNode(value: ReaderFragment): Self = StObject.set(x, "fragmentNode", value.asInstanceOf[js.Any])
      
      inline def setFragmentRef(value: Any): Self = StObject.set(x, "fragmentRef", value.asInstanceOf[js.Any])
      
      inline def setIdentifierField(value: String): Self = StObject.set(x, "identifierField", value.asInstanceOf[js.Any])
      
      inline def setIdentifierFieldNull: Self = StObject.set(x, "identifierField", null)
      
      inline def setIdentifierFieldUndefined: Self = StObject.set(x, "identifierField", js.undefined)
      
      inline def setObserver(value: Observer[GraphQLResponse]): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setOnReset(value: Callback): Self = StObject.set(x, "onReset", value.toJsFn)
      
      inline def setPaginationMetadata(value: ReaderPaginationMetadata): Self = StObject.set(x, "paginationMetadata", value.asInstanceOf[js.Any])
      
      inline def setPaginationRequest(value: ConcreteRequest): Self = StObject.set(x, "paginationRequest", value.asInstanceOf[js.Any])
    }
  }
}
