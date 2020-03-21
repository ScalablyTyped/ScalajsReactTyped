package typingsJapgolly.hapiJoi.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends Error {
  var _object: js.Any = js.native
  /**
    * array of errors.
    */
  var details: js.Array[ValidationErrorItem] = js.native
  var isJoi: Boolean = js.native
  @JSName("name")
  var name_ValidationError: typingsJapgolly.hapiJoi.hapiJoiStrings.ValidationError = js.native
  /**
    * function that returns a string with an annotated version of the object pointing at the places where errors occurred.
    * @param stripColors - if truthy, will strip the colors out of the output.
    */
  def annotate(): String = js.native
  def annotate(stripColors: Boolean): String = js.native
}

