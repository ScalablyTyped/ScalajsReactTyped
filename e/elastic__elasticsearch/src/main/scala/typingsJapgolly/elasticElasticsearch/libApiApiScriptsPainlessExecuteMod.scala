package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.ScriptsPainlessExecuteRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.ScriptsPainlessExecuteResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiScriptsPainlessExecuteMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/scripts_painless_execute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TResult](): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](params: Unit, options: TransportRequestOptions): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](params: ScriptsPainlessExecuteRequest): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](params: ScriptsPainlessExecuteRequest, options: TransportRequestOptions): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest
  ): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest,
    options: TransportRequestOptions
  ): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    extension [Self <: That](x: Self) {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
