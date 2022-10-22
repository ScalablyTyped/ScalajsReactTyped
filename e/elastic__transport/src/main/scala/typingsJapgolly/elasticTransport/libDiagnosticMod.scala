package typingsJapgolly.elasticTransport

import typingsJapgolly.elasticTransport.elasticTransportStrings.deserialization
import typingsJapgolly.elasticTransport.elasticTransportStrings.request
import typingsJapgolly.elasticTransport.elasticTransportStrings.response
import typingsJapgolly.elasticTransport.elasticTransportStrings.resurrect
import typingsJapgolly.elasticTransport.elasticTransportStrings.serialization
import typingsJapgolly.elasticTransport.elasticTransportStrings.sniff
import typingsJapgolly.elasticTransport.libConnectionBaseConnectionMod.ConnectionRequestOptions
import typingsJapgolly.elasticTransport.libErrorsMod.ElasticsearchClientError
import typingsJapgolly.elasticTransport.libPoolClusterConnectionPoolMod.ResurrectEvent
import typingsJapgolly.elasticTransport.libTypesMod.DiagnosticResult
import typingsJapgolly.elasticTransport.libTypesMod.DiagnosticResultResponse
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDiagnosticMod {
  
  @JSImport("@elastic/transport/lib/Diagnostic", JSImport.Default)
  @js.native
  open class default () extends Diagnostic
  
  @js.native
  sealed trait events extends StObject
  @JSImport("@elastic/transport/lib/Diagnostic", "events")
  @js.native
  object events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[events & String] = js.native
    
    @js.native
    sealed trait DESERIALIZATION
      extends StObject
         with events
    /* "deserialization" */ val DESERIALIZATION: typingsJapgolly.elasticTransport.libDiagnosticMod.events.DESERIALIZATION & String = js.native
    
    @js.native
    sealed trait REQUEST
      extends StObject
         with events
    /* "request" */ val REQUEST: typingsJapgolly.elasticTransport.libDiagnosticMod.events.REQUEST & String = js.native
    
    @js.native
    sealed trait RESPONSE
      extends StObject
         with events
    /* "response" */ val RESPONSE: typingsJapgolly.elasticTransport.libDiagnosticMod.events.RESPONSE & String = js.native
    
    @js.native
    sealed trait RESURRECT
      extends StObject
         with events
    /* "resurrect" */ val RESURRECT: typingsJapgolly.elasticTransport.libDiagnosticMod.events.RESURRECT & String = js.native
    
    @js.native
    sealed trait SERIALIZATION
      extends StObject
         with events
    /* "serialization" */ val SERIALIZATION: typingsJapgolly.elasticTransport.libDiagnosticMod.events.SERIALIZATION & String = js.native
    
    @js.native
    sealed trait SNIFF
      extends StObject
         with events
    /* "sniff" */ val SNIFF: typingsJapgolly.elasticTransport.libDiagnosticMod.events.SNIFF & String = js.native
  }
  
  @js.native
  trait Diagnostic extends EventEmitter {
    
    def off(event: String, listener: DiagnosticListener): this.type = js.native
    
    @JSName("on")
    def on_deserialization(event: deserialization, listener: DiagnosticListenerLight): this.type = js.native
    @JSName("on")
    def on_request(event: request, listener: DiagnosticListenerFull): this.type = js.native
    @JSName("on")
    def on_response(event: response, listener: DiagnosticListenerFullResponse): this.type = js.native
    @JSName("on")
    def on_resurrect(event: resurrect, listener: DiagnosticListenerResurrect): this.type = js.native
    @JSName("on")
    def on_serialization(event: serialization, listener: DiagnosticListenerFull): this.type = js.native
    @JSName("on")
    def on_sniff(event: sniff, listener: DiagnosticListenerFull): this.type = js.native
    
    @JSName("once")
    def once_deserialization(event: deserialization, listener: DiagnosticListenerLight): this.type = js.native
    @JSName("once")
    def once_request(event: request, listener: DiagnosticListenerFull): this.type = js.native
    @JSName("once")
    def once_response(event: response, listener: DiagnosticListenerFullResponse): this.type = js.native
    @JSName("once")
    def once_resurrect(event: resurrect, listener: DiagnosticListenerResurrect): this.type = js.native
    @JSName("once")
    def once_serialization(event: serialization, listener: DiagnosticListenerFull): this.type = js.native
    @JSName("once")
    def once_sniff(event: sniff, listener: DiagnosticListenerFull): this.type = js.native
  }
  
  type DiagnosticListener = js.Function2[/* err */ ElasticsearchClientError | Null, /* meta */ Any | Null, Unit]
  
  type DiagnosticListenerFull = js.Function2[
    /* err */ ElasticsearchClientError | Null, 
    /* meta */ (DiagnosticResult[Any, Any]) | Null, 
    Unit
  ]
  
  type DiagnosticListenerFullResponse = js.Function2[
    /* err */ ElasticsearchClientError | Null, 
    /* meta */ (DiagnosticResultResponse[Any, Any]) | Null, 
    Unit
  ]
  
  type DiagnosticListenerLight = js.Function2[
    /* err */ ElasticsearchClientError | Null, 
    /* meta */ ConnectionRequestOptions | Null, 
    Unit
  ]
  
  type DiagnosticListenerResurrect = js.Function2[/* err */ ElasticsearchClientError | Null, /* meta */ ResurrectEvent | Null, Unit]
}
