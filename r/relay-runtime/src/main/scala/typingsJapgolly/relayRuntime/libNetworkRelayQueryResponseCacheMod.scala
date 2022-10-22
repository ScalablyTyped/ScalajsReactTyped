package typingsJapgolly.relayRuntime

import japgolly.scalajs.react.Callback
import typingsJapgolly.relayRuntime.anon.Size
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetworkRelayQueryResponseCacheMod {
  
  @JSImport("relay-runtime/lib/network/RelayQueryResponseCache", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RelayQueryResponseCache {
    def this(config: Size) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(queryID: String, variables: Variables): GraphQLResponse | Null = js.native
    
    /* CompleteClass */
    override def set(queryID: String, variables: Variables, payload: GraphQLResponse): Unit = js.native
  }
  
  trait RelayQueryResponseCache extends StObject {
    
    def clear(): Unit
    
    def get(queryID: String, variables: Variables): GraphQLResponse | Null
    
    def set(queryID: String, variables: Variables, payload: GraphQLResponse): Unit
  }
  object RelayQueryResponseCache {
    
    inline def apply(
      clear: Callback,
      get: (String, Variables) => GraphQLResponse | Null,
      set: (String, Variables, GraphQLResponse) => Callback
    ): RelayQueryResponseCache = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, get = js.Any.fromFunction2(get), set = js.Any.fromFunction3((t0: String, t1: Variables, t2: GraphQLResponse) => (set(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[RelayQueryResponseCache]
    }
    
    extension [Self <: RelayQueryResponseCache](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setGet(value: (String, Variables) => GraphQLResponse | Null): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setSet(value: (String, Variables, GraphQLResponse) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction3((t0: String, t1: Variables, t2: GraphQLResponse) => (value(t0, t1, t2)).runNow()))
    }
  }
}
