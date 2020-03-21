package typingsJapgolly.lunr.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lunr", "QueryParseError")
@js.native
class QueryParseError protected () extends Error {
  def this(message: String, start: String, end: String) = this()
  var end: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  var name_QueryParseError: typingsJapgolly.lunr.lunrStrings.QueryParseError = js.native
  var start: Double = js.native
}

