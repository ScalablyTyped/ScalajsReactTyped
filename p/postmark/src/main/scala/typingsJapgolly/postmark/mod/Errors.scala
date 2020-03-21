package typingsJapgolly.postmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Errors")
@js.native
object Errors extends js.Object {
  @js.native
  class ApiInputError protected ()
    extends typingsJapgolly.postmark.errorsMod.ApiInputError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class HttpError protected ()
    extends typingsJapgolly.postmark.errorsMod.HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class InternalServerError protected ()
    extends typingsJapgolly.postmark.errorsMod.InternalServerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class InvalidAPIKeyError protected ()
    extends typingsJapgolly.postmark.errorsMod.InvalidAPIKeyError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class PostmarkError protected ()
    extends typingsJapgolly.postmark.errorsMod.PostmarkError {
    def this(message: String) = this()
    def this(message: String, code: Double) = this()
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class ServiceUnavailablerError protected ()
    extends typingsJapgolly.postmark.errorsMod.ServiceUnavailablerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class UnknownError protected ()
    extends typingsJapgolly.postmark.errorsMod.UnknownError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
}

