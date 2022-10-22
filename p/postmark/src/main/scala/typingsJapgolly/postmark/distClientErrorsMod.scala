package typingsJapgolly.postmark

import typingsJapgolly.postmark.anon.InactiveRecipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientErrorsMod {
  
  @JSImport("postmark/dist/client/errors", "ApiInputError")
  @js.native
  open class ApiInputError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.ApiInputError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  /* static members */
  object ApiInputError {
    
    @JSImport("postmark/dist/client/errors", "ApiInputError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("postmark/dist/client/errors", "ApiInputError.ERROR_CODES")
    @js.native
    def ERROR_CODES: InactiveRecipient = js.native
    inline def ERROR_CODES_=(x: InactiveRecipient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODES")(x.asInstanceOf[js.Any])
    
    inline def buildSpecificError(message: String, code: Double, statusCode: Double): typingsJapgolly.postmark.distClientErrorsErrorsMod.ApiInputError = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSpecificError")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.postmark.distClientErrorsErrorsMod.ApiInputError]
  }
  
  @JSImport("postmark/dist/client/errors", "ErrorHandler")
  @js.native
  open class ErrorHandler ()
    extends typingsJapgolly.postmark.distClientErrorsErrorHandlerMod.ErrorHandler
  
  @JSImport("postmark/dist/client/errors", "HttpError")
  @js.native
  open class HttpError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors", "InactiveRecipientsError")
  @js.native
  open class InactiveRecipientsError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.InactiveRecipientsError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  /* static members */
  object InactiveRecipientsError {
    
    @JSImport("postmark/dist/client/errors", "InactiveRecipientsError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("postmark/dist/client/errors", "InactiveRecipientsError.inactiveRecipientsPatterns")
    @js.native
    def inactiveRecipientsPatterns: js.Array[js.RegExp] = js.native
    inline def inactiveRecipientsPatterns_=(x: js.Array[js.RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveRecipientsPatterns")(x.asInstanceOf[js.Any])
    
    inline def parseInactiveRecipients(message: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInactiveRecipients")(message.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("postmark/dist/client/errors", "InternalServerError")
  @js.native
  open class InternalServerError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.InternalServerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors", "InvalidAPIKeyError")
  @js.native
  open class InvalidAPIKeyError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.InvalidAPIKeyError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors", "InvalidEmailRequestError")
  @js.native
  open class InvalidEmailRequestError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.InvalidEmailRequestError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors", "PostmarkError")
  @js.native
  open class PostmarkError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.PostmarkError {
    def this(message: String) = this()
    def this(message: String, code: Double) = this()
    def this(message: String, code: Double, statusCode: Double) = this()
    def this(message: String, code: Unit, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors", "RateLimitExceededError")
  @js.native
  open class RateLimitExceededError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.RateLimitExceededError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors", "ServiceUnavailablerError")
  @js.native
  open class ServiceUnavailablerError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.ServiceUnavailablerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors", "UnknownError")
  @js.native
  open class UnknownError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.UnknownError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
}
