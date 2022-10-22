package typingsJapgolly.scErrors

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sc-errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sc-errors", "AuthTokenError")
  @js.native
  open class AuthTokenError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "AuthTokenExpiredError")
  @js.native
  open class AuthTokenExpiredError protected ()
    extends StObject
       with Error {
    def this(message: String, expiry: js.Date) = this()
    
    var expiry: js.Date = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "AuthTokenInvalidError")
  @js.native
  open class AuthTokenInvalidError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "AuthTokenNotBeforeError")
  @js.native
  open class AuthTokenNotBeforeError protected ()
    extends StObject
       with Error {
    def this(message: String, date: js.Date) = this()
    
    var date: js.Date = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "BadConnectionError")
  @js.native
  open class BadConnectionError protected ()
    extends StObject
       with Error {
    def this(message: String, `type`: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("sc-errors", "BrokerError")
  @js.native
  open class BrokerError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "HTTPServerError")
  @js.native
  open class HTTPServerError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "InvalidActionError")
  @js.native
  open class InvalidActionError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "InvalidArgumentsError")
  @js.native
  open class InvalidArgumentsError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "InvalidMessageError")
  @js.native
  open class InvalidMessageError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "InvalidOptionsError")
  @js.native
  open class InvalidOptionsError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "ProcessExitError")
  @js.native
  open class ProcessExitError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, code: Double) = this()
    
    var code: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "ResourceLimitError")
  @js.native
  open class ResourceLimitError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "ServerProtocolError")
  @js.native
  open class ServerProtocolError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "SilentMiddlewareBlockedError")
  @js.native
  open class SilentMiddlewareBlockedError protected ()
    extends StObject
       with Error {
    def this(message: String, `type`: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("sc-errors", "SocketProtocolError")
  @js.native
  open class SocketProtocolError protected ()
    extends StObject
       with Error {
    def this(message: String, code: Double) = this()
    
    var code: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "TimeoutError")
  @js.native
  open class TimeoutError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sc-errors", "UnknownError")
  @js.native
  open class UnknownError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def decycle(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decycle")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def dehydrateError(error: Any): DehydratedError = ^.asInstanceOf[js.Dynamic].applyDynamic("dehydrateError")(error.asInstanceOf[js.Any]).asInstanceOf[DehydratedError]
  inline def dehydrateError(error: Any, includeStackTrace: Boolean): DehydratedError = (^.asInstanceOf[js.Dynamic].applyDynamic("dehydrateError")(error.asInstanceOf[js.Any], includeStackTrace.asInstanceOf[js.Any])).asInstanceOf[DehydratedError]
  
  inline def hydrateError(error: DehydratedError): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrateError")(error.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("sc-errors", "socketProtocolErrorStatuses")
  @js.native
  val socketProtocolErrorStatuses: SocketProtocolErrorStatuses_ = js.native
  
  @JSImport("sc-errors", "socketProtocolIgnoreStatuses")
  @js.native
  val socketProtocolIgnoreStatuses: SocketProtocolIgnoreStatuses_ = js.native
  
  type DehydratedError = Any
  
  trait SocketProtocolErrorStatuses_ extends StObject {
    
    var `1001`: String
    
    var `1002`: String
    
    var `1003`: String
    
    var `1005`: String
    
    var `1006`: String
    
    var `1007`: String
    
    var `1008`: String
    
    var `1009`: String
    
    var `1010`: String
    
    var `1011`: String
    
    var `4000`: String
    
    var `4001`: String
    
    var `4002`: String
    
    var `4003`: String
    
    var `4004`: String
    
    var `4005`: String
    
    var `4006`: String
    
    var `4007`: String
    
    var `4008`: String
  }
  object SocketProtocolErrorStatuses_ {
    
    inline def apply(
      `1001`: String,
      `1002`: String,
      `1003`: String,
      `1005`: String,
      `1006`: String,
      `1007`: String,
      `1008`: String,
      `1009`: String,
      `1010`: String,
      `1011`: String,
      `4000`: String,
      `4001`: String,
      `4002`: String,
      `4003`: String,
      `4004`: String,
      `4005`: String,
      `4006`: String,
      `4007`: String,
      `4008`: String
    ): SocketProtocolErrorStatuses_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1001")(`1001`.asInstanceOf[js.Any])
      __obj.updateDynamic("1002")(`1002`.asInstanceOf[js.Any])
      __obj.updateDynamic("1003")(`1003`.asInstanceOf[js.Any])
      __obj.updateDynamic("1005")(`1005`.asInstanceOf[js.Any])
      __obj.updateDynamic("1006")(`1006`.asInstanceOf[js.Any])
      __obj.updateDynamic("1007")(`1007`.asInstanceOf[js.Any])
      __obj.updateDynamic("1008")(`1008`.asInstanceOf[js.Any])
      __obj.updateDynamic("1009")(`1009`.asInstanceOf[js.Any])
      __obj.updateDynamic("1010")(`1010`.asInstanceOf[js.Any])
      __obj.updateDynamic("1011")(`1011`.asInstanceOf[js.Any])
      __obj.updateDynamic("4000")(`4000`.asInstanceOf[js.Any])
      __obj.updateDynamic("4001")(`4001`.asInstanceOf[js.Any])
      __obj.updateDynamic("4002")(`4002`.asInstanceOf[js.Any])
      __obj.updateDynamic("4003")(`4003`.asInstanceOf[js.Any])
      __obj.updateDynamic("4004")(`4004`.asInstanceOf[js.Any])
      __obj.updateDynamic("4005")(`4005`.asInstanceOf[js.Any])
      __obj.updateDynamic("4006")(`4006`.asInstanceOf[js.Any])
      __obj.updateDynamic("4007")(`4007`.asInstanceOf[js.Any])
      __obj.updateDynamic("4008")(`4008`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketProtocolErrorStatuses_]
    }
    
    extension [Self <: SocketProtocolErrorStatuses_](x: Self) {
      
      inline def set1001(value: String): Self = StObject.set(x, "1001", value.asInstanceOf[js.Any])
      
      inline def set1002(value: String): Self = StObject.set(x, "1002", value.asInstanceOf[js.Any])
      
      inline def set1003(value: String): Self = StObject.set(x, "1003", value.asInstanceOf[js.Any])
      
      inline def set1005(value: String): Self = StObject.set(x, "1005", value.asInstanceOf[js.Any])
      
      inline def set1006(value: String): Self = StObject.set(x, "1006", value.asInstanceOf[js.Any])
      
      inline def set1007(value: String): Self = StObject.set(x, "1007", value.asInstanceOf[js.Any])
      
      inline def set1008(value: String): Self = StObject.set(x, "1008", value.asInstanceOf[js.Any])
      
      inline def set1009(value: String): Self = StObject.set(x, "1009", value.asInstanceOf[js.Any])
      
      inline def set1010(value: String): Self = StObject.set(x, "1010", value.asInstanceOf[js.Any])
      
      inline def set1011(value: String): Self = StObject.set(x, "1011", value.asInstanceOf[js.Any])
      
      inline def set4000(value: String): Self = StObject.set(x, "4000", value.asInstanceOf[js.Any])
      
      inline def set4001(value: String): Self = StObject.set(x, "4001", value.asInstanceOf[js.Any])
      
      inline def set4002(value: String): Self = StObject.set(x, "4002", value.asInstanceOf[js.Any])
      
      inline def set4003(value: String): Self = StObject.set(x, "4003", value.asInstanceOf[js.Any])
      
      inline def set4004(value: String): Self = StObject.set(x, "4004", value.asInstanceOf[js.Any])
      
      inline def set4005(value: String): Self = StObject.set(x, "4005", value.asInstanceOf[js.Any])
      
      inline def set4006(value: String): Self = StObject.set(x, "4006", value.asInstanceOf[js.Any])
      
      inline def set4007(value: String): Self = StObject.set(x, "4007", value.asInstanceOf[js.Any])
      
      inline def set4008(value: String): Self = StObject.set(x, "4008", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketProtocolIgnoreStatuses_ extends StObject {
    
    var `1000`: String
    
    var `1001`: String
  }
  object SocketProtocolIgnoreStatuses_ {
    
    inline def apply(`1000`: String, `1001`: String): SocketProtocolIgnoreStatuses_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1000")(`1000`.asInstanceOf[js.Any])
      __obj.updateDynamic("1001")(`1001`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketProtocolIgnoreStatuses_]
    }
    
    extension [Self <: SocketProtocolIgnoreStatuses_](x: Self) {
      
      inline def set1000(value: String): Self = StObject.set(x, "1000", value.asInstanceOf[js.Any])
      
      inline def set1001(value: String): Self = StObject.set(x, "1001", value.asInstanceOf[js.Any])
    }
  }
}
