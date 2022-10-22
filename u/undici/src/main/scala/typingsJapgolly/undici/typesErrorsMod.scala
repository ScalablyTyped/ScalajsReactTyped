package typingsJapgolly.undici

import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.std.Error
import typingsJapgolly.std.Record
import typingsJapgolly.undici.typesClientMod.SocketInfo
import typingsJapgolly.undici.undiciStrings.UND_ERR_ABORTED
import typingsJapgolly.undici.undiciStrings.UND_ERR_BODY_TIMEOUT
import typingsJapgolly.undici.undiciStrings.UND_ERR_CLOSED
import typingsJapgolly.undici.undiciStrings.UND_ERR_DESTROYED
import typingsJapgolly.undici.undiciStrings.UND_ERR_HEADERS_TIMEOUT
import typingsJapgolly.undici.undiciStrings.UND_ERR_INFO
import typingsJapgolly.undici.undiciStrings.UND_ERR_INVALID_ARG
import typingsJapgolly.undici.undiciStrings.UND_ERR_INVALID_RETURN_VALUE
import typingsJapgolly.undici.undiciStrings.UND_ERR_NOT_SUPPORTED
import typingsJapgolly.undici.undiciStrings.UND_ERR_REQ_CONTENT_LENGTH_MISMATCH
import typingsJapgolly.undici.undiciStrings.UND_ERR_RESPONSE_STATUS_CODE
import typingsJapgolly.undici.undiciStrings.UND_ERR_SOCKET
import typingsJapgolly.undici.undiciStrings.UND_ERR_SOCKET_TIMEOUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesErrorsMod {
  
  @JSImport("undici/types/errors", "BodyTimeoutError")
  @js.native
  open class BodyTimeoutError () extends UndiciError {
    
    var code: UND_ERR_BODY_TIMEOUT = js.native
    
    @JSName("name")
    var name_BodyTimeoutError: typingsJapgolly.undici.undiciStrings.BodyTimeoutError = js.native
  }
  
  @JSImport("undici/types/errors", "ClientClosedError")
  @js.native
  open class ClientClosedError () extends UndiciError {
    
    var code: UND_ERR_CLOSED = js.native
    
    @JSName("name")
    var name_ClientClosedError: typingsJapgolly.undici.undiciStrings.ClientClosedError = js.native
  }
  
  @JSImport("undici/types/errors", "ClientDestroyedError")
  @js.native
  open class ClientDestroyedError () extends UndiciError {
    
    var code: UND_ERR_DESTROYED = js.native
    
    @JSName("name")
    var name_ClientDestroyedError: typingsJapgolly.undici.undiciStrings.ClientDestroyedError = js.native
  }
  
  @JSImport("undici/types/errors", "HeadersTimeoutError")
  @js.native
  open class HeadersTimeoutError () extends UndiciError {
    
    var code: UND_ERR_HEADERS_TIMEOUT = js.native
    
    @JSName("name")
    var name_HeadersTimeoutError: typingsJapgolly.undici.undiciStrings.HeadersTimeoutError = js.native
  }
  
  @JSImport("undici/types/errors", "InformationalError")
  @js.native
  open class InformationalError () extends UndiciError {
    
    var code: UND_ERR_INFO = js.native
    
    @JSName("name")
    var name_InformationalError: typingsJapgolly.undici.undiciStrings.InformationalError = js.native
  }
  
  @JSImport("undici/types/errors", "InvalidArgumentError")
  @js.native
  open class InvalidArgumentError () extends UndiciError {
    
    var code: UND_ERR_INVALID_ARG = js.native
    
    @JSName("name")
    var name_InvalidArgumentError: typingsJapgolly.undici.undiciStrings.InvalidArgumentError = js.native
  }
  
  @JSImport("undici/types/errors", "InvalidReturnError")
  @js.native
  open class InvalidReturnError () extends UndiciError {
    
    var code: UND_ERR_INVALID_RETURN_VALUE = js.native
    
    @JSName("name")
    var name_InvalidReturnError: typingsJapgolly.undici.undiciStrings.InvalidReturnError = js.native
  }
  
  @JSImport("undici/types/errors", "NotSupportedError")
  @js.native
  open class NotSupportedError () extends UndiciError {
    
    var code: UND_ERR_NOT_SUPPORTED = js.native
    
    @JSName("name")
    var name_NotSupportedError: typingsJapgolly.undici.undiciStrings.NotSupportedError = js.native
  }
  
  @JSImport("undici/types/errors", "RequestAbortedError")
  @js.native
  open class RequestAbortedError () extends UndiciError {
    
    var code: UND_ERR_ABORTED = js.native
    
    @JSName("name")
    var name_RequestAbortedError: typingsJapgolly.undici.undiciStrings.RequestAbortedError = js.native
  }
  
  @JSImport("undici/types/errors", "RequestContentLengthMismatchError")
  @js.native
  open class RequestContentLengthMismatchError () extends UndiciError {
    
    var code: UND_ERR_REQ_CONTENT_LENGTH_MISMATCH = js.native
    
    @JSName("name")
    var name_RequestContentLengthMismatchError: typingsJapgolly.undici.undiciStrings.RequestContentLengthMismatchError = js.native
  }
  
  @JSImport("undici/types/errors", "ResponseStatusCodeError")
  @js.native
  open class ResponseStatusCodeError () extends UndiciError {
    
    var body: Null | (Record[String, Any]) | String = js.native
    
    var code: UND_ERR_RESPONSE_STATUS_CODE = js.native
    
    var headers: IncomingHttpHeaders | js.Array[String] | Null = js.native
    
    @JSName("name")
    var name_ResponseStatusCodeError: typingsJapgolly.undici.undiciStrings.ResponseStatusCodeError = js.native
    
    var status: Double = js.native
    
    var statusCode: Double = js.native
  }
  
  @JSImport("undici/types/errors", "SocketError")
  @js.native
  open class SocketError () extends UndiciError {
    
    var code: UND_ERR_SOCKET = js.native
    
    @JSName("name")
    var name_SocketError: typingsJapgolly.undici.undiciStrings.SocketError = js.native
    
    var socket: SocketInfo | Null = js.native
  }
  
  @JSImport("undici/types/errors", "SocketTimeoutError")
  @js.native
  open class SocketTimeoutError () extends UndiciError {
    
    var code: UND_ERR_SOCKET_TIMEOUT = js.native
    
    @JSName("name")
    var name_SocketTimeoutError: typingsJapgolly.undici.undiciStrings.SocketTimeoutError = js.native
  }
  
  @JSImport("undici/types/errors", "UndiciError")
  @js.native
  open class UndiciError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
