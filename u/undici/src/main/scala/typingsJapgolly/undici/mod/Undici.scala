package typingsJapgolly.undici.mod

import typingsJapgolly.undici.typesMockAgentMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Undici {
  
  /* was `typeof imported_agent` */
  type Agent = typingsJapgolly.undici.typesAgentMod.^
  
  /* was `typeof imported_balanced-pool` */
  type BalancedPool = typingsJapgolly.undici.typesBalancedPoolMod.^
  
  /** A basic HTTP/1.1 client, mapped on top a single TCP/TLS connection. Pipelining is disabled by default. */
  /* was `typeof imported_client` */
  type Client = typingsJapgolly.undici.typesClientMod.^
  
  /* was `typeof imported_handlers.DecoratorHandler` */
  type DecoratorHandler = typingsJapgolly.undici.typesHandlersMod.DecoratorHandler
  
  /** Dispatcher is the core API used to dispatch requests. */
  /* was `typeof imported_dispatcher` */
  type Dispatcher = typingsJapgolly.undici.typesDispatcherMod.^
  
  /** A mocked Agent class that implements the Agent API. It allows one to intercept HTTP requests made through undici and return mocked responses instead. */
  /* was `typeof imported_mock-agent` */
  type MockAgent[TMockAgentOptions /* <: Options */] = typingsJapgolly.undici.typesMockAgentMod.^[TMockAgentOptions]
  
  /** MockClient extends the Client API and allows one to mock requests. */
  /* was `typeof imported_mock-client` */
  type MockClient = typingsJapgolly.undici.typesMockClientMod.^
  
  /** MockPool extends the Pool API and allows one to mock requests. */
  /* was `typeof imported_mock-pool` */
  type MockPool = typingsJapgolly.undici.typesMockPoolMod.^
  
  /* was `typeof imported_pool` */
  type Pool = typingsJapgolly.undici.typesPoolMod.^
  
  /* was `typeof imported_handlers.RedirectHandler` */
  type RedirectHandler = typingsJapgolly.undici.typesHandlersMod.RedirectHandler
  
  /* was `typeof imported_errors` */
  object errors {
    
    type BodyTimeoutError = typingsJapgolly.undici.typesErrorsMod.BodyTimeoutError
    
    type ClientClosedError = typingsJapgolly.undici.typesErrorsMod.ClientClosedError
    
    type ClientDestroyedError = typingsJapgolly.undici.typesErrorsMod.ClientDestroyedError
    
    type HeadersTimeoutError = typingsJapgolly.undici.typesErrorsMod.HeadersTimeoutError
    
    type InformationalError = typingsJapgolly.undici.typesErrorsMod.InformationalError
    
    type InvalidArgumentError = typingsJapgolly.undici.typesErrorsMod.InvalidArgumentError
    
    type InvalidReturnError = typingsJapgolly.undici.typesErrorsMod.InvalidReturnError
    
    type NotSupportedError = typingsJapgolly.undici.typesErrorsMod.NotSupportedError
    
    type RequestAbortedError = typingsJapgolly.undici.typesErrorsMod.RequestAbortedError
    
    type RequestContentLengthMismatchError = typingsJapgolly.undici.typesErrorsMod.RequestContentLengthMismatchError
    
    type ResponseStatusCodeError = typingsJapgolly.undici.typesErrorsMod.ResponseStatusCodeError
    
    type SocketError = typingsJapgolly.undici.typesErrorsMod.SocketError
    
    type SocketTimeoutError = typingsJapgolly.undici.typesErrorsMod.SocketTimeoutError
    
    type UndiciError = typingsJapgolly.undici.typesErrorsMod.UndiciError
  }
  
  /* was `typeof imported_mock-errors` */
  object mockErrors {
    
    type MockNotMatchedError = typingsJapgolly.undici.typesMockErrorsMod.MockNotMatchedError
  }
}
