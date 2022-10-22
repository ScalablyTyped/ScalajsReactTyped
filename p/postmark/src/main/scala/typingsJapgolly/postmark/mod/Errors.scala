package typingsJapgolly.postmark.mod

import typingsJapgolly.postmark.anon.InactiveRecipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Errors {
  
  @JSImport("postmark", "Errors.ApiInputError")
  @js.native
  open class ApiInputError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.ApiInputError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  /* static members */
  object ApiInputError {
    
    @JSImport("postmark", "Errors.ApiInputError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("postmark", "Errors.ApiInputError.ERROR_CODES")
    @js.native
    def ERROR_CODES: InactiveRecipient = js.native
    inline def ERROR_CODES_=(x: InactiveRecipient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODES")(x.asInstanceOf[js.Any])
    
    inline def buildSpecificError(message: String, code: Double, statusCode: Double): typingsJapgolly.postmark.distClientErrorsErrorsMod.ApiInputError = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSpecificError")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.postmark.distClientErrorsErrorsMod.ApiInputError]
  }
  
  @JSImport("postmark", "Errors.HttpError")
  @js.native
  open class HttpError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.InactiveRecipientsError")
  @js.native
  open class InactiveRecipientsError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.InactiveRecipientsError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  /* static members */
  object InactiveRecipientsError {
    
    @JSImport("postmark", "Errors.InactiveRecipientsError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("postmark", "Errors.InactiveRecipientsError.inactiveRecipientsPatterns")
    @js.native
    def inactiveRecipientsPatterns: js.Array[js.RegExp] = js.native
    inline def inactiveRecipientsPatterns_=(x: js.Array[js.RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveRecipientsPatterns")(x.asInstanceOf[js.Any])
    
    inline def parseInactiveRecipients(message: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInactiveRecipients")(message.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("postmark", "Errors.InternalServerError")
  @js.native
  open class InternalServerError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.InternalServerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.InvalidAPIKeyError")
  @js.native
  open class InvalidAPIKeyError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.InvalidAPIKeyError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.InvalidEmailRequestError")
  @js.native
  open class InvalidEmailRequestError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.InvalidEmailRequestError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.PostmarkError")
  @js.native
  open class PostmarkError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.PostmarkError {
    def this(message: String) = this()
    def this(message: String, code: Double) = this()
    def this(message: String, code: Double, statusCode: Double) = this()
    def this(message: String, code: Unit, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.RateLimitExceededError")
  @js.native
  open class RateLimitExceededError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.RateLimitExceededError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.ServiceUnavailablerError")
  @js.native
  open class ServiceUnavailablerError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.ServiceUnavailablerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.UnknownError")
  @js.native
  open class UnknownError protected ()
    extends typingsJapgolly.postmark.distClientErrorsErrorsMod.UnknownError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
}
