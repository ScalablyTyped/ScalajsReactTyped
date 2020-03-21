package typingsJapgolly.hyperlorisTyson

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson/dist/types/exceptions/deserializationError", JSImport.Namespace)
@js.native
object deserializationErrorMod extends js.Object {
  @js.native
  class DeserializationError () extends Error {
    def this(message: String) = this()
    def this(message: String, json: String) = this()
    var _json: js.Any = js.native
    val json: js.UndefOr[String] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

