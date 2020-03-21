package typingsJapgolly.stellarSdk

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class BadRequestError protected () extends NetworkError {
    def this(message: String, response: js.Any) = this()
  }
  
  @js.native
  class BadResponseError protected () extends NetworkError {
    def this(message: String, response: js.Any) = this()
  }
  
  @js.native
  class InvalidSep10ChallengeError protected () extends Error {
    def this(message: String) = this()
    var __proto__ : InvalidSep10ChallengeError = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class NetworkError protected () extends Error {
    def this(message: String, response: js.Any) = this()
    var __proto__ : NetworkError = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var response: AnonData = js.native
    def getResponse(): AnonStatus = js.native
  }
  
  @js.native
  class NotFoundError protected () extends NetworkError {
    def this(message: String, response: js.Any) = this()
  }
  
}

