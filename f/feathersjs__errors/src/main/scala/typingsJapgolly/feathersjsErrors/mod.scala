package typingsJapgolly.feathersjsErrors

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@feathersjs/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@feathersjs/errors", "BadGateway")
  @js.native
  open class BadGateway () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "BadRequest")
  @js.native
  open class BadRequest () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "Conflict")
  @js.native
  open class Conflict () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "FeathersError")
  @js.native
  open class FeathersError protected ()
    extends StObject
       with Error {
    def this(msg: String, name: String, code: Double, className: String, data: Any) = this()
    def this(msg: js.Error, name: String, code: Double, className: String, data: Any) = this()
    
    val className: String = js.native
    
    val code: Double = js.native
    
    val data: Any = js.native
    
    val errors: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    def toJSON(): FeathersErrorJSON = js.native
  }
  
  @JSImport("@feathersjs/errors", "Forbidden")
  @js.native
  open class Forbidden () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "GeneralError")
  @js.native
  open class GeneralError () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "LengthRequired")
  @js.native
  open class LengthRequired () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "MethodNotAllowed")
  @js.native
  open class MethodNotAllowed () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "NotAcceptable")
  @js.native
  open class NotAcceptable () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "NotAuthenticated")
  @js.native
  open class NotAuthenticated () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "NotFound")
  @js.native
  open class NotFound () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "NotImplemented")
  @js.native
  open class NotImplemented () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "PaymentError")
  @js.native
  open class PaymentError () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "Timeout")
  @js.native
  open class Timeout () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "TooManyRequests")
  @js.native
  open class TooManyRequests () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "Unavailable")
  @js.native
  open class Unavailable () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  @JSImport("@feathersjs/errors", "Unprocessable")
  @js.native
  open class Unprocessable () extends FeathersError {
    def this(msg: String) = this()
    def this(msg: js.Error) = this()
    def this(msg: String, data: Any) = this()
    def this(msg: js.Error, data: Any) = this()
    def this(msg: Unit, data: Any) = this()
  }
  
  inline def convert(error: Any): FeathersError = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(error.asInstanceOf[js.Any]).asInstanceOf[FeathersError]
  
  @JSImport("@feathersjs/errors", "errors")
  @js.native
  val errors: Errors_ = js.native
  
  @JSImport("@feathersjs/errors", "types")
  @js.native
  val types: Errors_ = js.native
  
  trait Errors_ extends StObject {
    
    var BadGateway: typingsJapgolly.feathersjsErrors.mod.BadGateway
    
    var BadRequest: typingsJapgolly.feathersjsErrors.mod.BadRequest
    
    var Conflict: typingsJapgolly.feathersjsErrors.mod.Conflict
    
    var FeathersError: typingsJapgolly.feathersjsErrors.mod.FeathersError
    
    var Forbidden: typingsJapgolly.feathersjsErrors.mod.Forbidden
    
    var GeneralError: typingsJapgolly.feathersjsErrors.mod.GeneralError
    
    var LengthRequired: typingsJapgolly.feathersjsErrors.mod.LengthRequired
    
    var MethodNotAllowed: typingsJapgolly.feathersjsErrors.mod.MethodNotAllowed
    
    var NotAcceptable: typingsJapgolly.feathersjsErrors.mod.NotAcceptable
    
    var NotAuthenticated: typingsJapgolly.feathersjsErrors.mod.NotAuthenticated
    
    var NotFound: typingsJapgolly.feathersjsErrors.mod.NotFound
    
    var NotImplemented: typingsJapgolly.feathersjsErrors.mod.NotImplemented
    
    var PaymentError: typingsJapgolly.feathersjsErrors.mod.PaymentError
    
    var Timeout: typingsJapgolly.feathersjsErrors.mod.Timeout
    
    var TooManyRequests: typingsJapgolly.feathersjsErrors.mod.TooManyRequests
    
    var Unavailable: typingsJapgolly.feathersjsErrors.mod.Unavailable
    
    var Unprocessable: typingsJapgolly.feathersjsErrors.mod.Unprocessable
  }
  object Errors_ {
    
    inline def apply(
      BadGateway: BadGateway,
      BadRequest: BadRequest,
      Conflict: Conflict,
      FeathersError: FeathersError,
      Forbidden: Forbidden,
      GeneralError: GeneralError,
      LengthRequired: LengthRequired,
      MethodNotAllowed: MethodNotAllowed,
      NotAcceptable: NotAcceptable,
      NotAuthenticated: NotAuthenticated,
      NotFound: NotFound,
      NotImplemented: NotImplemented,
      PaymentError: PaymentError,
      Timeout: Timeout,
      TooManyRequests: TooManyRequests,
      Unavailable: Unavailable,
      Unprocessable: Unprocessable
    ): Errors_ = {
      val __obj = js.Dynamic.literal(BadGateway = BadGateway.asInstanceOf[js.Any], BadRequest = BadRequest.asInstanceOf[js.Any], Conflict = Conflict.asInstanceOf[js.Any], FeathersError = FeathersError.asInstanceOf[js.Any], Forbidden = Forbidden.asInstanceOf[js.Any], GeneralError = GeneralError.asInstanceOf[js.Any], LengthRequired = LengthRequired.asInstanceOf[js.Any], MethodNotAllowed = MethodNotAllowed.asInstanceOf[js.Any], NotAcceptable = NotAcceptable.asInstanceOf[js.Any], NotAuthenticated = NotAuthenticated.asInstanceOf[js.Any], NotFound = NotFound.asInstanceOf[js.Any], NotImplemented = NotImplemented.asInstanceOf[js.Any], PaymentError = PaymentError.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], TooManyRequests = TooManyRequests.asInstanceOf[js.Any], Unavailable = Unavailable.asInstanceOf[js.Any], Unprocessable = Unprocessable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors_]
    }
    
    extension [Self <: Errors_](x: Self) {
      
      inline def setBadGateway(value: BadGateway): Self = StObject.set(x, "BadGateway", value.asInstanceOf[js.Any])
      
      inline def setBadRequest(value: BadRequest): Self = StObject.set(x, "BadRequest", value.asInstanceOf[js.Any])
      
      inline def setConflict(value: Conflict): Self = StObject.set(x, "Conflict", value.asInstanceOf[js.Any])
      
      inline def setFeathersError(value: FeathersError): Self = StObject.set(x, "FeathersError", value.asInstanceOf[js.Any])
      
      inline def setForbidden(value: Forbidden): Self = StObject.set(x, "Forbidden", value.asInstanceOf[js.Any])
      
      inline def setGeneralError(value: GeneralError): Self = StObject.set(x, "GeneralError", value.asInstanceOf[js.Any])
      
      inline def setLengthRequired(value: LengthRequired): Self = StObject.set(x, "LengthRequired", value.asInstanceOf[js.Any])
      
      inline def setMethodNotAllowed(value: MethodNotAllowed): Self = StObject.set(x, "MethodNotAllowed", value.asInstanceOf[js.Any])
      
      inline def setNotAcceptable(value: NotAcceptable): Self = StObject.set(x, "NotAcceptable", value.asInstanceOf[js.Any])
      
      inline def setNotAuthenticated(value: NotAuthenticated): Self = StObject.set(x, "NotAuthenticated", value.asInstanceOf[js.Any])
      
      inline def setNotFound(value: NotFound): Self = StObject.set(x, "NotFound", value.asInstanceOf[js.Any])
      
      inline def setNotImplemented(value: NotImplemented): Self = StObject.set(x, "NotImplemented", value.asInstanceOf[js.Any])
      
      inline def setPaymentError(value: PaymentError): Self = StObject.set(x, "PaymentError", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
      
      inline def setTooManyRequests(value: TooManyRequests): Self = StObject.set(x, "TooManyRequests", value.asInstanceOf[js.Any])
      
      inline def setUnavailable(value: Unavailable): Self = StObject.set(x, "Unavailable", value.asInstanceOf[js.Any])
      
      inline def setUnprocessable(value: Unprocessable): Self = StObject.set(x, "Unprocessable", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeathersErrorJSON extends StObject {
    
    val className: String
    
    val code: Double
    
    val data: Any
    
    val errors: Any
    
    val message: String
    
    val name: String
  }
  object FeathersErrorJSON {
    
    inline def apply(className: String, code: Double, data: Any, errors: Any, message: String, name: String): FeathersErrorJSON = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeathersErrorJSON]
    }
    
    extension [Self <: FeathersErrorJSON](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
