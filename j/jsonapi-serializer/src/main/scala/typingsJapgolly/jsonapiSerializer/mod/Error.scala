package typingsJapgolly.jsonapiSerializer.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonapi-serializer", "Error")
@js.native
class Error protected () extends JSONAPIError {
  def this(opts: js.Array[JSONAPIErrorOptions]) = this()
  def this(opts: JSONAPIErrorOptions) = this()
  /* CompleteClass */
  override var errors: js.Array[_] = js.native
}

@JSImport("jsonapi-serializer", "Error")
@js.native
object Error extends TopLevel[ErrorConstructor]

