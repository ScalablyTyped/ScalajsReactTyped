package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.tsCustomError.mod.CustomError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-client.error", JSImport.Namespace)
@js.native
object igClientErrorMod extends js.Object {
  @js.native
  class IgClientError () extends CustomError {
    def this(message: String) = this()
  }
  
}

